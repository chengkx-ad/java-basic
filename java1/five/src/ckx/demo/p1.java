package ckx.demo;

// 方法  什么是方法？？？
// 方法是程序中最小的执行单元
// 方法的定义格式：  最简单的定义、带参数的定义、带返回值的定义 以及它们各自的调用方式

// 方法定义：两步：第一步：要干什么（方法体）  第二步：用什么干（形参）
// 方法的重载：在一个类中，同种作用的方法可以用相同的方法名，但是参数不能一样，与返回值无关。参数个数不同，类型不同，顺序不同（不建议这种）


public class p1 {
    public static void main(String[] args) {
        // 调用方法
        playGame(3.1, 3.2);
                


    }

    // 最简单的方法定义
    public static void playGame(int num1, int num2){
        if(num1 == num2){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }

    }
    public static void playGame(long num1, long num2){
        if(num1 == num2){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }

    }
    public static void playGame(double num1, double num2){
        if(num1 == num2){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }

    }
    public static void playGame(byte num1, byte num2){
        if(num1 == num2){
            System.out.println("相同");
        }else{
            System.out.println("不同");
        }

    }

}
