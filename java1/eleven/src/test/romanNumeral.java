package test;

// 转换罗马数字

import java.util.Scanner;

public class romanNumeral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        while (true) {
            System.out.println("输入一个字符串");
            str1 = sc.next();
            boolean s = checkStr(str1);
            if(s){
                break;
            }else{
                System.out.println("当前字符串不符合规则，请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            // int number = c - 48;
            String s = roman(c);
            sb.append(s);
        }
        String s = sb.toString();
        System.out.println(s);
    }

    // 判断是否满足要求
    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
    // 定义一个能将数字转换为罗马数字的方法
    /*public static String roman(int number){
        String[] str = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return str[number];
    }*/
    // 改为switch方法
    public static String roman(char number){
        String str = switch (number){
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            case '0' -> "";
            default -> " ";
        };
        return str;
    }
}
