package test3;

import java.util.Scanner;

/*键盘录入
方法一：
nextint 接受整数 其他会报错
next 接受字符串
nextDouble 接受小数
遇到空格 制表符 回车停止接收
这些符号后面的东西会被自动赋给下一个变量

方法二：
nextline() 接收字符串
遇到回车才停止
*/
/*
* 混用的弊端
* 先用nextint在用nextline会导致nextline接收不到数据
*
*
* */

public class CarTest {
    public static void main(String[] args) {
        car[] arr = new car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            car c = new car();
            System.out.println("输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("输入汽车的价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            System.out.println("输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            //
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }

    }
}
