package test;


// 金额转换

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
         // 键盘录入金额
        Scanner sc = new Scanner(System.in);
        System.out.println("输入金额");
        int num = sc.nextInt();
        while (true) {
            if(num > 0 && num <= 9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }

        //
        String newStr = "";

        // 拿到金额的每一位数,转换中文
        while (true) {
            int ge = num % 10;
            String c = getChar(ge);
            newStr = c + newStr;
            num = num / 10;
            if(num == 0){
                break;
            }

        }

        // 补零
        int count = 7 - newStr.length();
        for (int i = 0; i < count; i++) {
            newStr = "零" + newStr;
        }

        //
        String[] str2 = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String res = "";
        for (int i = 0; i < newStr.length(); i++) {
            char c = newStr.charAt(i);
            res = res + c + str2[i];
        }
        System.out.println(res);

    }
    // 数字转换
    public static String getChar(int number){
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[number];
    }
}
