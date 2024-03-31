package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // 练习
        // 键盘录入一个三位数，将其拆分为个位、十位、百位后，打印出结果。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        //获取个、十、百
        int ge = number % 10;
        int shi = number /10 % 10;
        int bai = number /100 % 10;
        System.out.println("个位是:" + ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
