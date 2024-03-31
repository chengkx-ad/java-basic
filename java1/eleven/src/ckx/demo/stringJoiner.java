package ckx.demo;

// stringjoiner

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        // 也可以看成容器，创建之后里面的内容是可变的
        // 提高字符串的操作效率，代码编写简洁，用的人很少
        /*
        * 构造方法
        * 1、stringJoiner(间隔符号)：创建一个stringjoiner对象，指定拼接时的间隔符号
        * 2、stringjoiner(间隔符号、开始符号、结束符号)：指定拼接时的间隔符号、开始符号、结束符号
        * */
        /*
        * 成员方法
        * 1、add():添加内容，并返回对象本身
        * 2、length()：返回长度
        * 3、tostring：返回一个字符串
        * */
        StringJoiner sj = new StringJoiner("---", "{", "}");

        // 添加符号  只能是字符
        String str = sj.add("aaa").add("ccc").add("mmm").toString();


        int len = sj.length();

        System.out.println(len);

        System.out.println(str);











    }
}
