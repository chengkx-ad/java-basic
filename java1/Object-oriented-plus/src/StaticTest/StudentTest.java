package StaticTest;

public class StudentTest {
    public static void main(String[] args) {
        student.teacherName = "王老师";  // 直接调用，不需要set
        student stu1 = new student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.setGender("男");

        stu1.study();
        stu1.show();

        student stu2 = new student();
        stu2.setName("李四");
        stu2.setAge(22);
        stu2.setGender("女");

        stu2.study();
        stu2.show();



    }

}
