package demo2;

public class outer {

    private int a = 10;

    class inner{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(outer.this.a);



        }


    }

}
