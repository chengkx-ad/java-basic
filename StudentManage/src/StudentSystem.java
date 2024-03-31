import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StartStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("---------------------欢迎来到ccc学生系统---------------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStu(list);
                case "2" -> deleteStu(list);
                case "3" -> changeStu(list);
                case "4" -> queryStu(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop; // 给循环起个名字来退出
                    // System.exit(0) 停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void addStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String id;
        while (true) {
            System.out.println("输入学生id");
            id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                System.out.println("id已经存在，请重新录入");
                continue;
            }else{
                stu.setId(id);
                break;
            }
        }

        System.out.println("输入学生姓名");
        String name = sc.next();
        System.out.println("输入学生年龄");
        int age = sc.nextInt();
        System.out.println("输入学生的家庭住址");
        String address = sc.next();

        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        list.add(stu);
        System.out.println("学生信息，添加成功");
    }
    public static void deleteStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的id");
        String sid = sc.next();

        int index = getIndex(list, sid);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为" + sid + "的学生信息已经删除");
        }else {
            System.out.println("该id不存在，请重新输入");
        }
    }
    public static void changeStu(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改信息的学生的id");
        String sid = sc.next();

        int index = getIndex(list, sid);
        if(index >= 0){
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            System.out.println("请输入要修改的学生住址");
            String newAddress = sc.next();

            Student stu = list.get(index);
            stu.setName(newName);
            stu.setAge(newAge);
            stu.setAddress(newAddress);
            System.out.println("信息修改成功");
        }else {
            System.out.println("id" + sid + "不存在，请重新输入");
        }
    }
    public static void queryStu(ArrayList<Student> list){
         if(list.isEmpty()){
             System.out.println("当前无学生信息，请添加后再查询");
             return;
         }
        System.out.println("id\t\t姓名\t年龄\t家庭地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    // 添加学生时判断id是否已经存在
    public static boolean contains(ArrayList<Student> list, String id){
        return getIndex(list, id) >= 0;
    }

    // 找索引
    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if(stu.getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }
}
