package test;

// 遍历集合

import java.util.ArrayList;

public class Ergodic {
    public static void main(String[] args) {
        // 添加整数
        // 不能写int，要写它对应的包装类
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(12);
        arr.add(154);
        arr.add(144);
        arr.add(148465);



        /*ArrayList<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");*/


        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            if(i == arr.size() - 1){
                System.out.print(arr.get(i));
            }else {
                System.out.print(arr.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
