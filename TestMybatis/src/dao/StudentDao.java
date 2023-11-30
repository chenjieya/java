package dao;

import domain.StudentClass;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class StudentDao {

    public void updateMap(Map<String, Object> student) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = build.openSession(true);

        sqlSession.update("updateMap", student);
    }

    public void update(StudentClass student) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = build.openSession(true);

        /**
         * 将对象传递进去
         *  sql： #{s_name}形式
         *  底层通过反射找到对象的类，然后找到对象的属性值
         */
        sqlSession.update("update", student);
    }

    // 设计一个方法，返回值类型是List<Map>
    public List<Map<String, Object>> selectSexCount() {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = build.openSession(true);

        List<Map<String, Object>> result = sqlSession.selectList("selectSexCount");

        return result;
    }


    // 设计一个方法，返回值类型是String类型
    public void selectNameById(int id) {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = build.openSession(true);

        String result = sqlSession.selectOne("selectNameById", id);
        System.out.println(result);  //陈文杰
    }

    // 设计一个方法，返回值是基本数据类型
    public int selectCount() {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = build.openSession(true);

        int result = sqlSession.selectOne("selectCount");

        System.out.println(result);

        return result;
    }


    // 设计一个方法，返回值是所有的数据
    public List<StudentClass> selectAll() {

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
        SqlSession sqlSession = factory.openSession(true);

        // 此处只能写List。不能写ArrayList
        List<StudentClass> result = sqlSession.selectList("selectAll");

        return result;
    }


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
