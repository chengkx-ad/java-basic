package test;

// 旋转字符串

public class spin {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "dasdd";

        boolean flag = compare(str1, str2);
        System.out.println(flag);

    }

    public static boolean compare(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        int num = sb.length();
        while (true) {
            if(sb.toString().equalsIgnoreCase(str2)){
                return true;
            }
            // 取出第一位加到最后一位
            char c = sb.charAt(0);
            sb.append(c);
            sb.deleteCharAt(0);
            // 循环结束的条件
            if(num-- <= 0){
                break;
            }
        }
        return false;
    }
}
