package demo3;

public abstract class coach extends person{

    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

}
