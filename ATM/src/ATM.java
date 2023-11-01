import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class ATM {
    // 银行业务系统：**登录**、**查询余额**、**存款**、**取款**、**转账**、**开户**、**销户**、*记录银行得用户信息:*  **账号--密码--余额**

    private HashMap<String, User> userMap = new HashMap<>();
    // 读取文件，将信息存储到集合中
    {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            File file = new File("src/userinfo.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String str = br.readLine();
            while (str != null) {
                String[] info = str.split("-");
                userMap.put(info[0], new User(info[0], info[1], Float.parseFloat(info[2])));
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String loginATM(String name, String password) {
        User user = userMap.get(name);
        if (user != null && user.getName().equals(name) && user.getPassword().equals(password)) {
            return "登录成功";
        }

        return "用户名或密码错误";
    }

    private boolean writeFile() {
//        Iterator<String> keys = userMap.keySet().iterator();
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File file = new File("src/userinfo.txt");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (User user : userMap.values()) {
                StringBuilder sb = new StringBuilder(user.getName());
                sb.append("-");
                sb.append(user.getPassword());
                sb.append("-");
                sb.append(user.getPrice());

                bw.write(sb.toString());
                bw.newLine();
                bw.flush();
            }

            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 查询余额
    public Float searchPrice(String name) {
        return userMap.get(name).getPrice();
    }

    // 存款
    public void setPrice(String name, Float price) {
        // 更改集合
        User user = userMap.get(name);
        Float pr = user.getPrice()+price;
        user.setPrice(pr);

        // 更改文件
        boolean flag = this.writeFile();
        if (flag) {
            System.out.println("存款成功");
        } else {
            user.setPrice(user.getPrice()-price);
            System.out.println("存款失败");
        }
    }

    // 取钱
    public void getMoney(String name, Float price) {
        User user = userMap.get(name);
        if (price > user.getPrice()) {
            System.out.println("当前余额不足");
        } else{
            // 重新计算钱
            user.setPrice(user.getPrice() - price);

            // 更改文件
            boolean flag = this.writeFile();
            if (flag) {
                System.out.println("取款成功");
            } else {
                user.setPrice(user.getPrice() + price);
                System.out.println("取款失败");
            }
        }

    }
}
