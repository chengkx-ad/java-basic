package test;

//

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票原价");
        int num1 = sc.nextInt();
        System.out.println("输入月份");
        int num2 = sc.nextInt();
        System.out.println("经济艙输入1，头等舱输入2");
        int num3 = sc.nextInt();

        if(num2 >= 5 && num2 <= 10){
            if(num3 == 1){
                double ticket = num1 * 0.85;
                System.out.println(ticket);
            }else if(num3 == 2){
                double ticket = num1 * 0.9;
                System.out.println(ticket);
            }else{
                System.out.println("没有这个舱位");
            }
        } else if (num2 >=11 && num2 <=12 || num2 >=1 && num2 <= 4) {
            if(num3 == 1){
                double ticket = num1 * 0.65;
                System.out.println(ticket);
            }else if(num3 == 2){
                double ticket = num1 * 0.7;
                System.out.println(ticket);
            }else{
                System.out.println("没有这个舱位");
            }
        }else{
            System.out.println("输入的月份不合理");
        }
    }
}
