package ckx;

// 无限循环
// 循环控制语句 continue和break

public class p7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue; // 结束本次循环，继续进行下一次循环
                // break为结束整个循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
