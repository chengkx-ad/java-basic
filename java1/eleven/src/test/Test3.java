package test;

// 统计字符

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String stu = sc.next();

        // 大写   小写   数字
        int bigcoubt = 0;
        int smallcount = 0;
        int numcount = 0;
        for (int i = 0; i < stu.length(); i++) {
            char c = stu.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallcount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigcoubt++;
            }else if(c >= '0' && c <= '9'){
                numcount++;
            }else{
                System.out.println("该字符不是上述三种字符");
            }

        }
        System.out.println("大写字母有" + bigcoubt + "小写字母有" + smallcount + "数字字母有" + numcount);


    }
}
