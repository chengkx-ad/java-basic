package demo1;

public class car {

    String carName;

    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName + carAge + carColor);
        engine e = new engine();
        e.engnieName = "caren";
        System.out.println(e.engnieName);
    }



    class engine{

        String engnieName;
        int engineAge;

        public void show(){
            System.out.println(carName);
        }

    }



}
