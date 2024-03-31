package test;

// 开发验证码
// 在一堆没有规律的数据中随机抽取，可以先将数据放到数组中，然后随机抽取数组中的一个索引

import java.util.Random;

public class p7 {
    public static void main(String[] args) {
        char arr[] = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i < 25){
                arr[i] = (char)(97 + i);
            }else{
                arr[i] = (char)(65 + i - 26);
            }
        }

        String res = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int RandomIndex = r.nextInt(arr.length);
            // System.out.println(RandomIndex);
            res = res + arr[RandomIndex];
        }
        int num = r.nextInt(10);
        res = res + num;
        System.out.println(res);
    }
}
