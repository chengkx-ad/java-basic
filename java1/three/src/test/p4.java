package test;

// 给两个整数，一个是除数一个是被除数，要求不使用除，取余，乘得到商和余数


import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数作为被除数");
        int num1 = sc.nextInt();
        System.out.println("输入第二个整数作为除数");
        int num2 = sc.nextInt();

        int i = 0;
        while(num1 >= num2){
            num1 = num1 - num2;
            i++;
        }
        System.out.println("商为：" + i);
        System.out.println("余为：" + num1);

    }
}
