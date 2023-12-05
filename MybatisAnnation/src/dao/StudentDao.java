package dao;

import domain.StudentClass;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface StudentDao {

//    @Insert("insert into student values (#{sid},#{sname})")
//    public void insert(StudentClass student);

//    @Insert("insert into student values (#{sid},#{sname})")
//    public void insert(Map map);

//    @Insert("insert into student values (#{sid},#{sname})")
//    public void insert(@Param("sid") Integer sid, @Param("sname") String sname);

    @Insert("insert into student values (#{param1},#{param2})")
    public void insert(Integer sid, String sname);

    @Update("update student set sname=#{sname} where sid=#{sid}")
    public void update(StudentClass student);

    @Delete("delete from student where sid = #{sid}")
    public void delete(Integer sid);

    @Select("select sid, sname from student where sid = #{sid}")
    public StudentClass selecta(Integer sid);

    @Select("select sid,sname from student")
    public List<StudentClass> selectAll();

    @Select("select count(*) from student")
    public Map selectCount();

}
