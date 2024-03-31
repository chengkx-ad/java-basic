package ckx.demo1;

public class YunSuAnFu2 {
    public static void main(String[] args) {
        // 除
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

        // 取摸
        System.out.println(10 % 3);
        System.out.println(10 % 2);
        // 应用场景

        // 运算符的高级运用
        // 不同类型不能进行计算，所以要类型转换
        // 隐式转换 把一个取值范围小的数据转换为取值范围大的数据
        // byte、short、int、long、float、double
        // byte、short、char在进行运算时，都会先提升为int，

        // 强制转换
        // 将取值范围大的数值转换为取值范围小的数值
        // 例子
        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte)(b1 + b2);
        System.out.println(result);

    }
}


