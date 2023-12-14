package dao;

import domain.Car;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDao extends SqlSessionDaoSupport {

    @Autowired
    public void setFactory(SqlSessionFactory factory) {
        super.setSqlSessionFactory(factory);
    }

    public void addCar(Car car) {
        SqlSession sqlSession = super.getSqlSession();
        sqlSession.insert("insertCar", car);
    }

    public List<Car> findAll() {
        SqlSession sqlSession = super.getSqlSession();
        List<Car> selectCar = sqlSession.selectList("selectCar");
        return selectCar;
    }

}
