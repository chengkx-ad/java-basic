package ckx.demo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "华为";
        p.price = 2000.00;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.PlayGame();

    }
}
