package dao;

import domain.StudentClass;

import java.util.List;

public interface StudentDao {

    public void insert(StudentClass student);

    public void delete(Integer sid);

    public void update(StudentClass student);

    public StudentClass selectOne(Integer sid);

    public List<StudentClass> selectAll();


}
