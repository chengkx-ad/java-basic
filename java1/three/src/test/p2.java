package test;


import java.util.Scanner;

public class p2 {
    // 输入两个数字表示一个范围，在这个范围中，有多少个能被3和5整除的数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数字");
        int num2 = sc.nextInt();

        int res = 0;
        for(int i = num1;  i <= num2; i++){
            if(i % 3 == 0 && i % 5 == 0){
                res++;
            }
        }
        System.out.println(res);
    }
}
