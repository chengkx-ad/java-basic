package test;

// 反转字符串

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();

        String newStr = returnStr(str);
        System.out.println(newStr);

    }
    public static String returnStr(String str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            res += c;
        }

        return res;
    }
}
