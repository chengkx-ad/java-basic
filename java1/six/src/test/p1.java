package test;

//键盘录入一个大于等于2的数，计算并返回x的平方根，结果只保留整数部分，小数部分不留

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数");
        int num1 = sc.nextInt();

        int num2 = (int)Math.sqrt(num1);
        System.out.println(num2);
    }
}
