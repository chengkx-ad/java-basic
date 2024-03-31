package test;


// 求数组的最大值
public class p3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

