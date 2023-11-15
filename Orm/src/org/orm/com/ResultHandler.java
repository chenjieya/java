package org.orm.com;

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
        }



        return list;
    }

    private Object handleResultSet(ResultSet res, Class rowType) throws SQLException {

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

        return null;
    }

}
