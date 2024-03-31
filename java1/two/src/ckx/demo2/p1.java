package ckx.demo2;

import java.util.Scanner;

// 流程控制语句
// 顺序
// if语句
public class p1 {
    // 如果酒量超过2斤，对方回应，反之不回
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的酒量");
        int wine = sc.nextInt();
        if(wine > 2){
            System.out.println("小伙子，不错！！！");
        }
    }
}
