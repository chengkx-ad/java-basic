package test3;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("ccc1", "cc", "111");
        User u2 = new User("ccc2", "kk", "222");
        User u3 = new User("ccc3", "xx", "333");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        /*boolean flag = Search("ccc1", list);
        System.out.println(flag);*/

        int num = getIndex("ccc5", list);
        System.out.println(num);
    }

    // 定义一个方法 根据用户id查找对应的用户信息
    /*public static boolean Search(String id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }*/

    // 如果存在返回索引，如果不存在，返回-1
    public static int getIndex(String id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }

}
