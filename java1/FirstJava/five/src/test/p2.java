package test;


// 数组遍历
public class p2 {
    public static void main(String[] args) {
        int array[] = {11, 22, 33, 44, 55};

        print(array);
    }

    public static void print(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.print("]");

    }
}
