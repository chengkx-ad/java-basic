package demo2;

public class Test {
    public static void main(String[] args) {

        dog d = new dog("guguo", 23);
        System.out.println(d.getName() + d.getAge() + "岁");

        d.swim();
        d.eat();

        rabbit r = new rabbit("小尼",2);

        r.eat();


    }
}
