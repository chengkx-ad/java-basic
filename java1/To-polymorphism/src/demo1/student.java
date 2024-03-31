package demo1;

public class student extends Person{

    @Override
    public void show() {
        System.out.println("学生信息为：" + getName() + ", " + getAge());
    }
}
