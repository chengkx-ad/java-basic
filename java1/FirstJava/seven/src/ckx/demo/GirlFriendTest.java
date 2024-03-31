package ckx.demo;

public class GirlFriendTest {
    public static void main(String[] args) {
        girlfriend gir1 = new girlfriend();
        // 赋值
        gir1.setName("事实");
        gir1.setGender("女");
        gir1.setAge(20);

        String s1 = gir1.getName();
        String s2 = gir1.getGender();
        int s3 = gir1.getAge();

        gir1.eat();
        gir1.sleep();
        System.out.println("===============");
        girlfriend gir2 = new girlfriend();
        // 赋值
        gir2.setName("事实2");
        gir2.setGender("女");
        gir2.setAge(20);
        String s4 = gir1.getName();
        String s5 = gir1.getGender();
        int s6 = gir1.getAge();

        gir2.eat();
        gir2.sleep();
    }
}
