package test;

// 随机生成10个1-100的随机数
// 求和   求平均   计算比平均值小的数字有几个

import java.util.Random;

public class p4 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 求和
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
            num1 = num1 + arr[i];
        }
        System.out.println(num1);

        // 求平均值
        int num2 = 0;
        num2 = num1 / 10;
        System.out.println(num2);

        // 计算比平均值小的值的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num2){
                count++;
            }
        }
        System.out.println(count);
    }
}
