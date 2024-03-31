package test;

// 判断数组中是否存在某个数

public class p4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 9};
        System.out.println(have(100,arr));


    }
    public static boolean have(int num, int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
