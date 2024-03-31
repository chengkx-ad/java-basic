package demo1;


// 多态
// 多态的前提：有继承关系  父类引用指向子类对象  有方法的重写
// 




public class p1 {
    public static void main(String[] args) {
        Person s = new student();
        s.setName("张三");
        s.setAge("23");
        s.show();

        Person t = new teacher();
        t.setName("李四");
        t.setAge("24");
        t.show();
    }
}
