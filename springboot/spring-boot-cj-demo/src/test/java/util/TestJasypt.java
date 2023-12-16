package util;

import org.jasypt.util.text.BasicTextEncryptor;

public class TestJasypt {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");  // 加盐，类似于一把钥匙

        String username = encryptor.encrypt("admin");
        String password = encryptor.encrypt("123456");

        System.out.println(username);
        System.out.println(password);

        /**
         * 第一次输出结果
         * KrrYt8mJhlmjq4jjV5WxhQ==
         * iQ45AY3/JT4/FONq5zPAew==
         *
         *
         * 第二次输出结果
         * KJrlFzrbrNFtntxnj0oNig==
         * yTuS0mYDo7VHF9pe+TA/mw==
         */
    }
}
