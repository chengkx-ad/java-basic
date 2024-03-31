package ckx.demo;

// 数组的定义
  // 数组的初始化   静态初始化和动态初始化

public class p1 {
    public static void main(String[] args) {
        // 静态初始化
        int[] array = new int[] {1,2,3,4,5,6};
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);



        // 直接打印出的是地址值   （数组在内存中的位置）
        System.out.println(array);
        // 打印出的结果[I@8efb846
        // [ :表示数组   I表示数组中数据的数据类型，此时为整形int，@ ：间隔符号 固定符号  8efb846：数组真正的地址值

        }
    }
}
