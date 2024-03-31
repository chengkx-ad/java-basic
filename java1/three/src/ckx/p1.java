package ckx;

// default的位置和省略
// 省略不会有语法错误
// 位置不一定在最下面，习惯而已

// case穿透
/*
    switch中没有写break导致的
    执行流程：
    拿小括号中的表达式的值与下面的每一个case比较，通过就执行其中的语句
    直到发现break，停止整个switch
    如果一直没有break，顺序执行每个case，执行到遇到右大括号
*/
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天星期几");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 7:
                System.out.println(7);
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}