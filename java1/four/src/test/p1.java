package test;

// 统计数组1-10中有多少能被3整除的数字

public class p1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
            if(arr[i] % 3 == 0){
                res++;
            }
        }
        System.out.println("能被3整除的数字有" + res + "个");
    }
}
