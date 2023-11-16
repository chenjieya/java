package org.orm.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlHandler {
    private  String oldSql;
    private ArrayList<String> paramsKeys;
    private Object[] paramsValues;

    /**
     * insert into table values(null, #{cname}, #{color}, #{price})
     * -> insert into table values(null, ?,?,?)
     * @param sql sql
     */
    public void handleSql(String sql) {
        this.paramsKeys = new ArrayList<>();
        Pattern pattern = Pattern.compile("#\\{\\w+\\}");
        Matcher matcher = pattern.matcher(sql);
        while (matcher.find()) {
            String key = matcher.group().replaceAll("[#\\{\\}]", "");
            this.paramsKeys.add(key);
        }

        this.oldSql = matcher.replaceAll("?");

        System.out.println("oldSql:" + this.oldSql);
        System.out.println("paramsKeys:" + this.paramsKeys);
    }

    /**
     * 将参数和sql对比，参数的value整理成数组
     * @param params 参数
     */
    public void handleParams(Object params) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        this.paramsValues = new Object[this.paramsKeys.size()];


        if (this.issimple(params.getClass())) {
            for(int i = 0; i < this.paramsKeys.size(); i++) {
                // 基本数据类型
                this.paramsValues[i] = params;
            }
        } else if (params instanceof Map) {
            for(int i = 0; i < this.paramsKeys.size(); i++) {
                // Map类型
                this.paramsValues[i] = ((Map) params).get(this.paramsKeys.get(i));
            }
        } else{
            for(int i = 0; i < this.paramsKeys.size(); i++) {
                // domain
                // 执行传递进来的domain中的get方法

                String key = this.paramsKeys.get(i);
                StringBuilder builder = new StringBuilder("get");
                builder.append(key.substring(0, 1).toUpperCase());
                builder.append(key.substring(1));

                Method method = params.getClass().getMethod(builder.toString());
                // 执行get方法
                Object val = method.invoke(params);
                this.paramsValues[i] = val;
            }
        }

        System.out.println("paramsValues:" + this.paramsValues);
    }

    private boolean issimple(Class type) {
        return (type == int.class || type == Integer.class || type == long.class || type == Long.class || type == float.class || type == Float.class || type == double.class || type == Double.class || type == short.class || type == Short.class || type == byte.class || type == Byte.class || type == boolean.class || type == Boolean.class);
    }


    public String getOldSql() {
        return oldSql;
    }

    public ArrayList<String> getParamsKeys() {
        return paramsKeys;
    }

    public Object[] getParamsValues() {
        return paramsValues;
    }
}
