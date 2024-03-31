package test;

import java.util.Scanner;

public class luojiyunsuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入一个整数");
        int number2 = sc.nextInt();

        boolean res = number1 == 6 || number2 == 6 || (number1 + number1) % 6 == 0;
        System.out.println(res);
    }
}
