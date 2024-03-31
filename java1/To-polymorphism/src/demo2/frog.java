package demo2;

public class frog extends Animal implements Swim{


    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }


    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
