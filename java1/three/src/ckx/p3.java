package ckx;

// if的第三种格式以及switch的应用
// 范围判断用if，如果是固定数值的比较用switch

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期几");
        int week = sc.nextInt();

        switch (week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
