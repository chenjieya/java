package utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSession {

    private static SqlSessionFactory factory = null;

    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
    }

    public static SqlSession getSqlSession() {
        return getSqlSession(false);
    }

    public static SqlSession getSqlSession(boolean autoCommit) {
        return factory.openSession(autoCommit);
    }

}
