package org.orm.com;

import org.orm.com.exception.ConfigFileNotFoundException;

import java.io.*;
import java.util.Properties;

public class Configuration {

    /**
     * 读取src目录下面的配置文件
     * @param classPathFile  路径
     */
    public Configuration(String classPathFile) {
        InputStream io = Thread.currentThread().getContextClassLoader().getResourceAsStream(classPathFile);
        readConfig(io);
        if (io == null) {
            throw new ConfigFileNotFoundException("文件路径错误");
        }
    }

    /**
     * 支持任意路径下的文件
     * @param file 文件
     */
    public Configuration(File file) {
        try {
            if (file.exists() == false) {
                throw new ConfigFileNotFoundException("文件不存在");
            }

            FileInputStream io = new FileInputStream(file);
            readConfig(io);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void readConfig(InputStream io) {
        try {
            Properties map = new Properties();
            map.load(io);
            System.out.println(map);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
