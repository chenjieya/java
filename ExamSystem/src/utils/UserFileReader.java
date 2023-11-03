package utils;

import domain.User;

import java.io.*;
import java.util.HashMap;

/**
 * 读取文件缓存数据
 */
public class UserFileReader {

    public static HashMap<String, User> userBoxMap = new HashMap<>();

    static {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            File file = new File("src\\dbfile\\user.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String message = br.readLine();
            while (message != null) {
                String[] userInfo = message.split("-");
                userBoxMap.put(userInfo[0], new User(userInfo[0], userInfo[1]));
                message = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
