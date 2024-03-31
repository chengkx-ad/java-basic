package test;


import java.util.Scanner;

// 判断正整数x是否为一个质数
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个自然数");
        int num = sc.nextInt();

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("不是");
            }else{
                System.out.println("是");
            }
        }
    }
}
