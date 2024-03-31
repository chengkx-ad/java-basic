package test;

// 随机生成数字,猜这个数

import java.util.Random;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);


        Scanner sc = new Scanner(System.in);
        System.out.println("输入猜测的数字");
        int num2 = sc.nextInt();

        if(num == num2){
            System.out.println("猜对了");
        }else{
            System.out.println("猜错了");
        }

    }
}
