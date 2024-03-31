package demo3;

public class basketballspoter extends spoter{

    public basketballspoter() {
    }

    public basketballspoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
