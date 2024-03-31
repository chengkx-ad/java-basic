package ckx.demo;

// javabean类  用来描述一类事物的类
// 在javabean类中不写main方法
// 前面写main方法的类都是测试类
// 可以在测试类中创建javabean类的对象，并进行调用和赋值
// 类名注意事项：见名知意  驼峰形式
// 一个java文件中必须有多个class类，但是只能有一个类是public修饰的，而且public修饰的类名必须成为代码文件名
// 实际开发中一个java文件中定义一个类

/*标准的javabean类
* 类名：见名知意
* 成员变量使用private修饰
* 至少提供两种构造方法：带参  不带参
* set和get
* 快捷生成标准javabean： alt + insert   、  插件ptg
* */

// private是一个权限修饰符，可以修饰成员，被private修饰的成员只能在本类中才能访问。

/* 区分成员变量和局部变量
 就近原则  不加this
 加上this关键字意思是使用成员变量*/

//构造方法
/*构造方法的作用和格式
*  方法名与类名一致，大小写也要一致
*  没有返回值类型，连void也没有
*  没有具体的返回值，不能写return
*  构造方法不能手动调用，只能由虚拟机调用
*  每创建一次对象，就会调用一次构造方法
* */

/*
* 构造方法注意事项
* 如果自己定义构造方法，那么系统就不会再给我们定义无参的构造方法了
* 构造方法可以重载
* 带参和不带参的构造方法，名字可以相同不影响使用-----重载
* 无论什么情况，都要把无参和有参的构造写上
* */

// 对象内存图







public class p1 {
}
