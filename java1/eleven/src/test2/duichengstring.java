package test2;

// 对称字符串

import java.util.Scanner;

public class duichengstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str1 = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.reverse();
        String str2 = sb.toString();
        if (str2.equalsIgnoreCase(str1)){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }
    }
}
