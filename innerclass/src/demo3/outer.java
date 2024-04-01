package demo3;

public class outer {

    int a = 10;
    static int b = 20;


    static class inner {

        public void show1(){
            outer o = new outer();
            System.out.println(o.a);
            System.out.println(b);
        }

        public static void show2(){
            outer o = new outer();
            System.out.println(o.a);
            System.out.println(b);


        }


    }

}
