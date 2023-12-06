package dao;

import domain.Dept;
import domain.Emp;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface DeptDao {

    @Select("select deptno,dname,loc from dept where deptno=#{deptno}")
    @Results(
            id = "selectOneByDept",
            value = {
                    @Result(property = "deptno", column = "deptno", id = true),
                    @Result(property = "dname", column = "dname"),
                    @Result(property = "loc", column = "loc"),
                    @Result(property = "emplist", column = "deptno", javaType = List.class, many = @Many(select = "selectManyByDept", fetchType = FetchType.LAZY))
            }
    )
    public Dept selectOne(Integer deptno);


    // 辅助函数
    @Select("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp where deptno = #{deptno}")
    public Emp selectManyByDept(Integer deptno);


    // 查询所有部门
    @Select("select deptno,dname,loc from dept")
    @ResultMap("selectOneByDept")
    public List<Dept> selectAll();

}
