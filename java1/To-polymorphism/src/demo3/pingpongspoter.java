package demo3;

public class pingpongspoter extends spoter implements English{


    public pingpongspoter() {
    }

    public pingpongspoter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }
}
