package test;

// 复制数组的特定部分

public class p5 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,11};
        int arr2[] = copyOfRange(arr1, 2, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] copyOfRange(int arr1[], int from, int to){
        int arr2[] = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            arr2[index] = arr1[i];
            index++;
        }
        return arr2;
    }
}
