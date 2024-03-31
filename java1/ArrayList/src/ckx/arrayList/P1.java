package ckx.arrayList;

/*
* 集合的长度是可变的，添加元素后，自动扩容
* 数组可以存储基本数据类型和引用数据类型，但是集合只能存储引用数据类型，如果要存基本数据类型，要将其转换为对应的包装类才能存储。
*
*
* */

/*
* 基本数据类型对应的包装类：
* byte-----Byte
* short-----Short
* char-----Character
* int------Integer
* long-----Long
* float-----Float
* double------Double
* boolean------Boolean
* */


import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {
        // 1、创建集合的对象
        // 泛型：限定集合中存储数据的类型
        // ArrayList<String> arr = new ArrayList<String>(); // 创建了一个字符串类型的集合  // jdk7以前的写法
        ArrayList<String> arr = new ArrayList<>(); // 可以省略后面的
        // 因为创建的是arraylist对象，java对其做了一些底层处理：打印对象不是地址值，而是集合中存储的内容；；在输出时，会用[]将数据包裹
       //  System.out.println(arr);  // 输出为[]

        // 添加元素
        boolean aaa = arr.add("aaa");  // 肯定成功，所以一定返回true
        arr.add("bbb");
        arr.add("bbb");
        arr.add("bbb");
        System.out.println(aaa);
        System.out.println(arr);

        // 删除元素
        // 如果要删除的元素不存在，就会返回false
        arr.remove("aaa");
        System.out.println(arr);

        String str = arr.remove(2); //  返回的是被删除的元素
        System.out.println(str);

        // 修改元素
        // 返回被覆盖的旧值
        String res = arr.set(1,"mmm");
        System.out.println(res);
        System.out.println(arr);

        // 查询元素
        String s = arr.get(0);
        System.out.println(s);

        // 遍历
        for (int i = 0; i < arr.size(); i++) {
            String str2 = arr.get(i);
            System.out.println(str2);
        }

    }



}
