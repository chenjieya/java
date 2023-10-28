package Login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Login {
//    public String LoginMethod(String userName, String password) {
//        String[] user = new String[]{"chenjie", "alvis"};
//        Integer[] pwd = new Integer[]{123, 666};
//
//        for (int i = 0; i < user.length; i++){
//            if (user[i].equals(userName) && pwd[i].equals(Integer.parseInt(password))) {
//                return "登录成功";
//            }
//        }
//
//        return "用户名和密码不正确";
//    }

//    private ArrayList<String> user = new ArrayList<>();
//
//    {
//        user.add("chenjie-123");
//        user.add("alvis-666");
//    }
//
//    public String LoginMethod(String userName, String password) {
//        for (int i = 0; i < user.size(); i++){
//            String[] val = user.get(i).split("-");
//            if (val[0].equals(userName) && val[1].equals(password)) {
//                return "登录成功";
//            }
//        }
//        return "用户名和密码不正确";
//    }


//    private HashSet<String> user = new HashSet<>();
//
//    {
//        user.add("chenjie-123");
//        user.add("alvis-666");
//    }
//
//    public String LoginMethod(String userName, String password) {
//        for (String val : user) {
//            String[] valArr = val.split("-");
//            if (valArr[0].equals(userName) && valArr[1].equals(password)) {
//                return "登录成功";
//            }
//        }
//        return "用户名和密码不正确";
//    }

    private HashMap<String, Integer> user = new HashMap<>();

    {
        user.put("chenjie", 123);
        user.put("alvis", 666);
    }

    public String LoginMethod(String userName, String password) {
        if(user.get(userName) != null && user.get(userName).equals(Integer.parseInt(password))) {
            return "登录成功";
        }
        return "用户名和密码不正确";
    }

}
