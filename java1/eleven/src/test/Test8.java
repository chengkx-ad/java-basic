package test;

// 身份证信息查看

public class Test8 {
    public static void main(String[] args) {
        String information = "142322199904301016";

        String year = information.substring(6, 10);
        String month = information.substring(10, 12);
        String day = information.substring(12, 14);

        System.out.println("人物信息为：");
        System.out.println("出生年月日为：" + year + "年" + month + "月" + day + "日");

        char c = information.charAt(16);
        int num = c - 48;
        if(num % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }

    }
}
