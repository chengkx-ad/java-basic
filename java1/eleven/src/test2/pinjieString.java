package test2;

// 拼接字符串

public class pinjieString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]);
                sb.append(',');
            }
        }
        sb.append(']');
        String str = sb.toString();
        return str;

    }


}
