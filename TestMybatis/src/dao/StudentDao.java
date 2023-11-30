package dao;

import domain.StudentClass;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class StudentDao {

    public void selectOne() {

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        SqlSessionFactory build = builder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);

        // 会根据xml配置文件，存到对应的domain实体类中
        StudentClass stu = sqlSession.selectOne("selectOne");

        System.out.println(stu);
    }

    public void insert() {

        // 创建工厂的工人
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 创建SqlSession对象的工厂(工厂是通过工人构建出来的)
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(resourceAsStream);

        // 创建sqlSession对象(通过一个工厂创建出来的)
        SqlSession sqlSession = factory.openSession();

        // 新增
        sqlSession.insert("insertStudent");

        // 手动提交事务
        sqlSession.commit();

    }

}
