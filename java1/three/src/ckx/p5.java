package ckx;

// 循环for


public class p5 {
    public static void main(String[] args) {
        // 获取1-100之间的偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
