package demo3;

public class basketcoach extends coach{

    public basketcoach() {

    }

    public basketcoach(String name, int age) {
        super(name, age);
    }  

    @Override
    public void teach() {
        System.out.println("篮球教练在教篮球");
    }
}
