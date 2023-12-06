package dao;

import domain.Dept;
import domain.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface EmpDao {
    @Select("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where empno = #{empno}")
    @Results(
            id = "selectOne",
            value = {
                    @Result(property = "empno", column = "empno", id = true),
                    @Result(property = "ename", column = "ename"),
                    @Result(property = "job", column = "job"),
                    @Result(property = "mgr", column = "mgr"),
                    @Result(property = "hiredate", column = "hiredate"),
                    @Result(property = "sal", column = "sal"),
                    @Result(property = "comm", column = "comm"),
                    @Result(property = "deptno", column = "deptno", javaType = Dept.class, one = @One(select = "selectByDept", fetchType = FetchType.LAZY)),
            }
    )
    public Emp selectOne(Integer empno);

    // 辅助函数
    @Select("select deptno,dname,loc from dept where deptno = #{deptno}")
    public Dept selectByDept(Integer deptno);


    // 查询全部
    @Select("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp")
    @ResultMap("selectOne")
    public List<Emp> selectAll();
}
