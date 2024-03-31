package ckx.demo;

// 字符串
// 在开发中的应用场景：登录、字符串铭感词替换、自动转换、
// 1、相关的API----掌握字符串的一些常规操作
// 2、案例----分析问题、解决问题
// 3、字符串的相关底层原理----应对面试、处理开发中的一些复杂问题


    /*1、API
    * string是定义在java.lang包中的类，是java的一个核心类，使用的时候不需要导入
    * java中的所有字符串文字都视为此类的对象。
    * 字符串的内容是不能更改的，他的对象在创建后是不能更改的，作了一些操作后也会变成新的字符串
    * */


import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // 创建string的两种方法
        /*
         * 直接赋值
         * new---构造方法
         * */
        String s1 = "abc";
        System.out.println(s1);

        // 使用new方法
        String s2 = new String(); // 空参构造，获取一个空字符串
        System.out.println("@" + s2 + "#");

        // 传递一个字符串，根据传递的字符串再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        // 传递一个字符数组，根据传递的字符数组再创建一个新的字符串对象
        // 需求：修改字符串的内容（字符串是不能改变的）
        // 但是可以将字符串变成字符数组  在进行变换
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        // // 传递一个字节数组，根据传递的字节数组再创建一个新的字符串对象


        // 当使用双引号直接赋值时，系统会检查该字符串是否在串池中，在--复用  不在---创建新的

        // java的常用方法（比较）
        /*
        * ==号比较的是什么？？？？
        * 分两种情况讨论
        * 1、基本数据类型----比较具体的值
        * 2、引用数据类型----比较地址值
        * boolean equals()方法----完全一样才对
        * boolean equalslgnoreCase()方法----忽略大小写
        * */
        String s5 = new String("abc");
        String s7 = "abc";
        String s6 = new String("ABC");

        boolean res1 = s5.equals(s6);
        boolean res2 = s5.equalsIgnoreCase(s6);
        System.out.println(res1);
        System.out.println(res2);

        // 扩展
        // 键盘录入的是new出来的
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();


        String str2 = "abc";
        System.out.println(str1 == str2);

    }
}
