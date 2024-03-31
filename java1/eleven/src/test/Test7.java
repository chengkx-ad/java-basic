package test;

// 手机号屏蔽
// substring的应用

public class Test7 {
    public static void main(String[] args) {
        String phoneNumber = "17636050460";

        // 两个数字表示起始结束位置，但是包左不包右
        String start = phoneNumber.substring(0, 3);
        // 单数字表示从这一位置取到末尾
        String end = phoneNumber.substring(7);

        String res = "";
        res = start + "****" + end;
        System.out.println(res);
    }
}
