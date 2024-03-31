package test;

// 拼接字符串

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String str = arrToString(arr);
        System.out.println(str);

    }

    //
    @SuppressWarnings({"all"})
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                res = res + arr[i];
            }else {
                res = res + arr[i] + ", ";
            }
        }
        res = res + "]";

        return res;


    }

}
