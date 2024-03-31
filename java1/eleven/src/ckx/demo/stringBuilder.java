package ckx.demo;

// 字符串拼接

// 它是一个容器，里面的内容是可变的
// 提高字符串操作的效率

/*
* 构造方法
* 1、空参构造
* 2、有参构造
* */
/*
* 常用方法
* append：添加数据，并返回对象本身
* reverse：反转容器中的内容
* length(): 返回长度
* tostring(): 将stringBuilder转化为string
* */


public class stringBuilder {
    public static void main(String[] args) {
        //stringbuilder是一个java已经写好的类
        // 打印对象不是地址值而是属性值
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);// 打印出来是空的

        // 添加元素
        sb.append(1);
        sb.append('a');
        sb.append(2.3);
        System.out.println(sb);

        // 反转
        sb.reverse();
        System.out.println(sb);

        // 获取长度
        int n = sb.length();




    }
}
