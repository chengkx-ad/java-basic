package GirlFriend;

public class GrilFriendTest {
    public static void main(String[] args) {
        // 定义数组存入女朋友的信息
        GirlFriend[] arr = new GirlFriend[4];

        // 创建女朋友对象
        GirlFriend gl1 = new GirlFriend("aaa", 21, '女', "看书1");
        GirlFriend gl2 = new GirlFriend("bbb", 22, '女', "看书2");
        GirlFriend gl3 = new GirlFriend("ccc", 23, '女', "看书3");
        GirlFriend gl4 = new GirlFriend("ddd", 24, '女', "看书4");

        // 把对象添加到数组中
        arr[0] = gl1;
        arr[1] = gl2;
        arr[2] = gl3;
        arr[3] = gl4;

        // 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avg){
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHabit());

            }
        }
        System.out.println(count);

    }
}
