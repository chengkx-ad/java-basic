package ckx;

// switch新特性

public class p2 {
    public static void main(String[] args) {
        int nmuber = 1;
        /*
        switch (nmuber){
            case 1 :
                System.out.println("一");
                break;
            case 2 :
                System.out.println("二");
                break;
            case 3 :
                System.out.println("三");
                break;
            case 4 :
                System.out.println("四");
                break;
            default:
                System.out.println("无");
                break;
        */
        switch (nmuber) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            case 4 -> System.out.println("四");
            default -> System.out.println("无");
        }
    }
}

