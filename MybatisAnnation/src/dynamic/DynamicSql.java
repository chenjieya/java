package dynamic;

import org.apache.ibatis.annotations.Param;

public class DynamicSql {


    // 默认方法
    // 动态sql默认方法
    public String provideSql(@Param("job") String job, @Param("comm") Float comm) {

        StringBuilder builder = new StringBuilder("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where 1 = 1");

        // 判断job是否存在
        if (job != null && !"".equals(job)) {
            builder.append(" and job = #{job}");
        }

        // 判断comm是否为空
        if (comm != null) {
            builder.append(" and comm = #{comm}");
        }

        return builder.toString();
    }


    public String selectBySearchEmpNo(@Param("empnos") Integer ...empnos) {

        StringBuilder builder = new StringBuilder("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where empno in ");
        builder.append("(");
        for (int i = 0; i < empnos.length; i++) {
            builder.append(empnos[i]);
            if (i == empnos.length-1) break;
            builder.append(",");
        }
        builder.append(")");

        System.out.println(builder.toString());

        return builder.toString();
    }

}
