package test;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        // 1、定义两个变量记录正确的用户名和密码
        String rightusername = "chengkx";
        String rightpassword = "769997";

        // 2、模拟用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            // 3、比较
            if(rightusername.equalsIgnoreCase(username) && rightpassword.equalsIgnoreCase(password)){
                System.out.println("登录成功");
                break;
            } else if (i == 2) {
                System.out.println("账号" + username + "被锁定，请联系...");
            }else {
                System.out.println("用户登录失败，用户名或者密码有误，您还剩下" + (2 - i) + "次机会");
            }
        }


    }
}
