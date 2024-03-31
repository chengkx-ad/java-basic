package ckx.demo;



public class p1 {
    public static void main(String[] args) {
        /*
        * 两部分参数
        * 1、要输出的内容 %s（占位）
        * 2、填充的数据
        * */
        System.out.printf("你好啊%s", "张三");
        System.out.println();  // 换行
        // 如果是两个占位%s  那么需要设置两个参数来进行填充 不然会报错
        System.out.printf("%s你好啊%s", "张三", "lisa");
    }
}
