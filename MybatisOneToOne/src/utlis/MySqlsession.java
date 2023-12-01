package utlis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlsession {

    private static SqlSessionFactory factory;

    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        MySqlsession.factory = builder.build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
    }

    public static SqlSession getSqlSession() {
        return MySqlsession.getSqlSession(false);
    }

    public static SqlSession getSqlSession(boolean autoCommit) {
        return MySqlsession.factory.openSession(autoCommit);
    }

}
