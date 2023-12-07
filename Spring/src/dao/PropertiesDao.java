package dao;

import java.util.Properties;

public class PropertiesDao {

    private Properties properties;

    public PropertiesDao(Properties properties) {
        this.properties = properties;
    }

    public PropertiesDao() {
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
