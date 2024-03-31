package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        // 键盘录入学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            //键盘录入
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("输入学生的年龄");
            int age = sc.nextInt();

            // 将录入的信息加入到学生对象中
            s.setName(name);
            s.setAge(age);

            // 再把学生对象加到集合中
            list.add(s);

        }



        /*//   直接添加  创建学生对象
        Student s1 = new Student("chengkaixuan", 23);
        Student s2 = new Student("zhangjiahui", 22);
        Student s3 = new Student("zhengxutao", 22);*/

       /* // 将学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);*/

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," +  stu.getAge());
        }



    }
}
