package ckx.demo;

public class student {
    private String name;
    private int age;
    /*如果我们自己没有写任何构造方法
    那么虚拟机会自动为我们加一个空参构造方法
*/
    public student(){
        System.out.println("看看我执行了吗？");
    }
    public student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }





}
