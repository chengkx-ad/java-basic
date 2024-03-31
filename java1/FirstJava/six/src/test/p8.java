package test;

import java.util.Random;

public class p8 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(101);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max || arr[i] == min){
                arr[i] = 0;
            }
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i];
        }
        int res = 0;
        res = num / 4;
        System.out.println(res);

    }
}
