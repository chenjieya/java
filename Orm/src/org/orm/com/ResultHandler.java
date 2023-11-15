package org.orm.com;

import org.orm.com.annotations.Column;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultHandler {

    /**
     * 将结果集数据转换成java类型对应的数据
     * @param res 结果集
     * @param rowType 在ArrayList中每一项以什么类型存储
     * @return  ArrayList<T>
     * @param <T> 泛型
     */
    public <T> ArrayList<T> handler(ResultSet res, Class<T> rowType) {
        ArrayList<T> list = new ArrayList<>();  // 存储结果集

        try {
            while (res.next()) {
                // 处理每一行数据
                Object item = handleResultSet(res, rowType);
                list.add((T) item);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


        return list;
    }

    private Object handleResultSet(ResultSet res, Class rowType) throws SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {

        // 说明只有一个值
        // select count(*) from 表;
        if (rowType == Integer.class || rowType == int.class) {
            return res.getInt(1);
        }

        if (rowType == Double.class || rowType == double.class) {
            return res.getDouble(1);
        }

        if (rowType == Float.class || rowType == float.class) {
            return res.getFloat(1);
        }

        if (rowType == Long.class || rowType == long.class) {
            return res.getLong(1);
        }

        if (rowType == Date.class || rowType == LocalDate.class) {
            return res.getDate(1);
        }


        // 处理map
        // true: 说明rowType都是Map的子类（Map、HashMap、TreeMap、自定义Map extends Map）
        // select count(*),Max(price),min(price) from 表;
        if (Map.class.isAssignableFrom(rowType)) {
            HashMap<String,Object> row = new HashMap<>();

            ResultSetMetaData sourceData = res.getMetaData();
            for (int i = 1; i <= sourceData.getColumnCount(); i++) {
                String key = sourceData.getColumnLabel(i);
                Object value = res.getObject(i);
                row.put(key,value);
            }

            return row;
        }

        // 走到此处，说明是domain
        Object obj = rowType.newInstance();
        Method[] methods = rowType.getMethods();  // 获取到当前类（domain）中的所有方法

        for (Method method : methods) {
            // 寻找set开头的方法，进行赋值操作
            if (method.getName().startsWith("set")){

                // 结果集字段和方法名进行匹配
                String columnName;

                Column annotation = method.getAnnotation(Column.class);

                if (annotation != null) {
                    // 表示在set方法使用了column注解，制定了对应的字段名
                    columnName = annotation.value();
                } else {

                    // 通过方法获得
                    columnName = method.getName().substring(3);
                    columnName = columnName.substring(0,1).toLowerCase() + columnName.substring(1);

                    // 代码至此就已经从set方法中获取到对应的列名了 setCno -> cno
                    Field field = rowType.getDeclaredField(columnName);
                    annotation = field.getAnnotation(Column.class);

                    if (annotation != null) {
                        // 表示在属性上使用了注解
                        columnName = annotation.value();
                    }
                }

                // 根据表格中的字段获取到对应的值
                Object value = getValueByType(res, columnName,  method.getParameterTypes()[0]);

                if (value != null) {
                    // 执行方法(参数需要从结果集中获取)
                    method.invoke(obj, value);
                }

            }
        }


        return obj;
    }

    private Object getValueByType(ResultSet res, String columnName, Class<?> type) throws SQLException {

        try{
            if (type == int.class || type == Integer.class) {
                return res.getInt(columnName);
            }

            if (type == String.class) {
                return res.getString(columnName);
            }

            if (type == double.class || type == Double.class) {
                return res.getDouble(columnName);
            }

            if (type == long.class || type == Long.class) {
                return res.getLong(columnName);
            }

            if (type == boolean.class || type == Boolean.class) {
                return res.getBoolean(columnName);
            }

            if (type == Date.class) {
                return res.getDate(columnName);
            }
        } catch(SQLException e) {
            System.out.println("[warning] Column '" + columnName + "' is not exist'");
        }


        return null;
    }

}
