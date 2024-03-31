package test;

// 回文数

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();

        int temp = num;
        int res = 0;
        while(num != 0){
            int ge = num % 10;
            num = num / 10;
            res = res * 10 + ge;
        }
        System.out.println(res == temp);

    }
}
