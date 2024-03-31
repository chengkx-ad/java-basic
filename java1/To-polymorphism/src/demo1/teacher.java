package demo1;

public class teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师信息为：" + getName() + ", " + getAge());
    }
}
