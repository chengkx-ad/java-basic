package test4;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1000.0);
        Phone p2 = new Phone("苹果", 8000.0);
        Phone p3 = new Phone("锤子", 2999.0);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> PhoneInfor = Search(list);
        for (int i = 0; i < PhoneInfor.size(); i++) {
            Phone phone = PhoneInfor.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());
        }
    }

    // 定义一个方法，将价格低于3000的手机信息返回
    // 技巧
    // 返回多个数据的话，可以将这些数据放到容器中，再返回容器
    // 可以是数组，可以是集合
    public static ArrayList<Phone> Search(ArrayList<Phone> list){
        ArrayList<Phone> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < 3000){
                res.add(list.get(i));
            }
        }
        return res;
    }


}
