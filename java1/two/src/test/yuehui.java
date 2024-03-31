package test;

import java.util.Scanner;

public class yuehui {
    public static void main(String[] args) {
        /*
        约会，比较两个人的时髦程度，当你的时髦程度大于对方时，相亲成功，时髦程度是1-10的整数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-10之间的整数,表示自己的时髦程度");
        int myfashion = sc.nextInt();
        System.out.println("请输入一个1-10之间的整数,表示对方的时髦程度");
        int grilfashion = sc.nextInt();

        boolean resoult = myfashion > grilfashion;
        System.out.println(resoult);

    }
}
