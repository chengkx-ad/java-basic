package demo3;

public class pingpongcoach extends coach implements English{

    public pingpongcoach() {
    }

    public pingpongcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }
}
