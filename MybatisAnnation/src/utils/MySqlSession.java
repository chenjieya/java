package utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSession {

    private static SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));



    public static SqlSession getSqlSession() {
        return getSqlSession(false);
    }

    public static SqlSession getSqlSession(boolean autoCommit) {
        return factory.openSession(autoCommit);
    }

    public static <T>T getMapper(Class clazz) {
        return (T) getSqlSession().getMapper(clazz);
    }

    public static <T>T getMapper(Class clazz, boolean autoCommit) {
        return (T) getSqlSession(autoCommit).getMapper(clazz);
    }

}
