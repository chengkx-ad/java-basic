import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1、登录 2、注册 3、忘记密码 4、退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> Login(list);
                case "2" -> SignIn(list);
                case "3" -> ChangePassWord(list);
                case "4" -> {
                    System.out.println("退出");
                    break loop; // 给循环起个名字来退出
                    // System.exit(0) 停止虚拟机运行
                }
                case "5" -> CatUserInfor(list);
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void CatUserInfor(ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            System.out.println(u.getUsername() + u.getPassword() + u.getIdCard() + u.getPhoneNumber());
        }
    }

    // 登录方法
    public static void Login(ArrayList<user> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的用户名");
            String username = sc.next();
            boolean flag = contain(list, username);
            if (!flag){
                System.out.println("用户名" + username + "未注册，请先注册");
                return; // 判断未注册，直接结束方法
            }

            System.out.println("请输入密码");
            String password = sc.next();


            while (true) {
                String str = getCode();
                System.out.println("验证码：" + str);
                System.out.println("请输入验证码");
                String str2 = sc.next();
                if(str2.equalsIgnoreCase(str)){
                    System.out.println("验证码正确");
                    break;
                }else{
                    System.out.println("验证码错误,请重新输入");
                }
            }

            // 验证用户名和密码是否正确
            // 封装思想
            user u2 = new user(username, password,null, null);
            boolean flag3 = checkUserInfor(list, u2);
            if (flag3){
                System.out.println("登录成功，可以开始使用ccc学生管理系统");
                // 创建对象，调用方法
                StudentSystem studentSystem = new StudentSystem();
                studentSystem.StartStudentSystem();
                break;
            }else{
                System.out.println("登录失败，请重新输入用户名和密码");
                if(i == 2){
                    System.out.println("用户" + username + "被锁定，请联系管理员");
                }else {
                    System.out.println("用户名或密码错误，您还剩下" + (2-i) + "次机会");
                }
            }
        }
        /*System.out.println("请输入您的用户名");
        String username = sc.next();
        boolean flag1 = contain(list, username);
        if(flag1){
            System.out.println("请输入您的密码");
            String password = sc.next();
            boolean flag2 = contain2(list,username,password);
            if (flag2){
                String s = "XDF16";
                System.out.println("验证码：" + s);
                System.out.println("请输入验证码");
                String Str = sc.next();
                if (Str.equalsIgnoreCase(s)){
                    System.out.println("登录成功");
                        // 创建对象，调用方法
                    StudentSystem studentSystem = new StudentSystem();
                    studentSystem.StartStudentSystem();
                    break;
                }
            }else {
                System.out.println("密码错误，还剩" + i + "次机会");
                if(i == 0){
                    System.out.println("密码输入次数超出3次，自动退出系统");
                    System.exit(0);
                }
            }
        }*/
    }
    // 忘记密码方法
    private static void ChangePassWord(ArrayList<user> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contain(list, username);
        if (!flag){
            System.out.println("用户名" + username + "未注册，请先注册");
            return; // 判断未注册，直接结束方法
        }

        System.out.println("请输入您的身份证号码");
        String IdCard = sc.next();
        System.out.println("请输入您的手机号码");
        String PhoneNumber = sc.next();

        int index = findIndex(list, username);
        user u = list.get(index);
        if (!(u.getIdCard().equalsIgnoreCase(IdCard) && u.getPhoneNumber().equalsIgnoreCase(PhoneNumber))){
            System.out.println("身份证或手机号码输入有误，无法修改密码");
            return;
        }

        while (true) {
            System.out.println("请输入新密码");
            String newPassword = sc.next();
            System.out.println("请再次输入密码");
            String againNewPassword = sc.next();
            if(againNewPassword.equals(newPassword)){
                u.setPassword(newPassword);
                System.out.println("恭喜您，密码修改成功");
                break;
            }else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
    }

    private static int findIndex(ArrayList<user> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            if(u.getUsername().equals(username)){
                return i;
            }
        }
        return -1;
    }

    // 注册方法
    public static void SignIn(ArrayList<user> list) {
        Scanner sc = new Scanner(System.in);
        user u = new user();
        // 验证规则
        // 一般先验证格式是否正确
        // 再去验证是否唯一
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();

            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("输入格式错误，请重新输入");
                continue;
            }
            // 判断用户名是否唯一
            boolean flag2 = contain(list, username);
            if (flag2) {
                System.out.println("用户名" + username + "已注册，请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                u.setUsername(username);
                break;
            }
            /*int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    count1++;
                }else if(c >= 'A' && c <= 'Z'){
                    count2++;
                }else if(c >= '0' && c <= '9') {
                    count3++;
                }else{
                    System.out.println("该用户名不符合规定，请重新输入");
                }
            }
            boolean flag = contain(list, username);
            if(flag){
                System.out.println("该用户名已注册，请重新输入");
            }else if(username.length() >= 3 && username.length() <= 15){
                    if(count1 > 0 || count2 > 0){
                        u1.setUsername(username);
                        break;
                    }else {
                        System.out.println("该用户名不符合规定，请重新输入");
                    }
            }else{
                System.out.println("该用户名长度不符合规定，请重新输入");
            }*/
        }

        while (true) {
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("再次输入密码");
            String password2 = sc.next();
            if (!(password2.equals(password1))) {
                System.out.println("两次输入的密码不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码输入一致");
                u.setPassword(password2);
                break;
            }
        }

        while (true) {
            System.out.println("请输入身份证号码");
            String IdCard = sc.next();
            boolean flag3 = checkIdCard(IdCard);
            if (flag3) {
                System.out.println("身份证号码满足要求");
                u.setIdCard(IdCard);
                break;
            } else {
                System.out.println("格式有误，请重新输入");
            }
        }
        /*while (true) {
            System.out.println("请输入身份证号码");
            String IdCard = sc.next();
            boolean flag = method1(IdCard);
            if (flag) {
                if(IdCard.length() == 18){
                    char cc = IdCard.charAt(17);
                    if(IdCard.charAt(0) != 0){
                        if (cc == 'x' || cc == 'X'|| (cc >= '0' && cc <= '9')) {
                            u1.setIdCard(IdCard);
                            break;
                        } else {
                            System.out.println("输入格式错误，请重新输入正确的身份证号码");
                        }
                    }else{
                        System.out.println("输入格式错误，请重新输入正确的身份证号码");
                    }
                }else{
                    System.out.println("输入格式错误，请重新输入正确的身份证号码");
                }
            }else{
                System.out.println("输入格式错误，请重新输入正确的身份证号码");
            }
        }*/

        while (true) {
            System.out.println("请输入手机号码");
            String PhoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(PhoneNumber);
            if (flag4){
                System.out.println("手机号码输入格式正确");
                u.setPhoneNumber(PhoneNumber);
                break;
            }else {
                System.out.println("手机号码格式有误，请重新输入");
            }
        }
         /*boolean flag = method2(PhoneNumber);
            if(flag){
                if(PhoneNumber.length() == 11 && PhoneNumber.charAt(0) != 0){
                    u1.setPhoneNumber(PhoneNumber);
                    break;
                }else {
                    System.out.println("输入格式错误，请重新输入正确的手机");
                }
            }else {
                System.out.println("输入格式错误，请重新输入正确的手机");
            }
        }
        list.add(u1);
        System.out.println("恭喜您，注册成功，请跳转登录");*/
        list.add(u);
        System.out.println("恭喜您，注册成功");
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 11){
            return false;
        }
        boolean flag = phoneNumber.startsWith("0");
        if(flag){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIdCard(String idCard) {
        if(idCard.length() != 18){
            return false;
        }
        /*char c = idCard.charAt(0);
        if(c == 0){
            return false;
        }*/
        boolean flag1 = idCard.startsWith("0");
        if (flag1){
            return false;
        }
        for (int i = 0; i < idCard.length()-1; i++) {
            char c = idCard.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        char cc = idCard.charAt(idCard.length() - 1);
        if ((cc == 'x' || cc == 'X'|| (cc >= '0' && cc <= '9'))){
            return true;
        }else {
            return false;
        }
    }

    private static boolean checkUsername(String username) {
        // 用户名的长度必须是3-15
        int len = username.length();
        if(len < 3 || len > 15){
            return false;
        }
        // 必须是字母和数字组成，不可以只有数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))){
                return false;
            }
        }
        //
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count++;
                break;
            }
        }
        return count > 0;
    }

    // 判断用户名是否存在（登录和注册都需要判断）
    public static boolean contain(ArrayList<user> list, String username){
        for (user user2 : list) {
            if (user2.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

    // 判断用户名的密码和list中该用户名的密码是否相同
    public static boolean checkUserInfor(ArrayList<user> list, user user){
        for (user u : list) {
            if ((u.getUsername().equals(user.getUsername())) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    // 生成验证码
    public static String getCode(){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }

        int num = r.nextInt(10);
        sb.append(num);

        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);

        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

}
