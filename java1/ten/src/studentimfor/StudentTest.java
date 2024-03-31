 package studentimfor;

public class StudentTest {
    public static void main(String[]   args) {
        // 创建数组存储学生对象
        student[] arr = new student[3];

        // 创建学生对象并添加到数组中
        student s1 = new student(1, "张三", 23);
        student s2 = new student(2, "张四", 24);
        student s3 = new student(3, "张五", 25);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // 要求一：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        student s4 = new student(4, "赵四", 25);

        // 唯一性判断
        // 已存在
        // 不存在
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("当前id重复，修改id后添加");
        } else {
            // 把s4添加到数组中
            // 若数组已经满了： 只能创建一个新数组，新数组的长度等于老数组的长度 + 1
            // 数组没满  直接添加即可
            int count = GetContain(arr);

            if (count == arr.length) {
                // 存满
                student[] Arr = CreateArr(arr);
                // 添加s4
                Arr[count] = s4;
                printArr(Arr);
            }  else {
                // 未存满
                // 索引   getcount就是
                arr[count] = s4;
                printArr(arr);
             }
        }
        /*要求3：通过id删除学生信息，如果存在，删除；如果不存在，输出删除失败*//**/
        int index = getIndex(arr,2);
        if(index >=0){
            arr[index] = null;
            printArr(arr);  //要求4
            /*student stu = arr[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);*/
        }else{
            System.out.println("当前id不存在，删除失败");
            // System.out.println("当前id不存在，修改失败");
        }

        // 要求5


    }

    // 唯一性判断
    public static boolean contains(student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            student s = arr[i];
            int sid = s.getId();
            if(sid == id){
                return true;
            }
        }
        return false;
    }

    // 定义一个方法判断数组中已经存了几个数据
    public static int GetContain(student[] arr){
        // 如果没存  数组中为null
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    // 创建一个新数组  长度为老数组长度 + 1
    // 将元素全部复制到新数组中
    public static student[] CreateArr(student[] arr){
        student[] Arr = new student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            Arr[i] = arr[i];
        }
        return Arr;
    }

    // 要求2 ： 遍历所有学生信息
    // 但是也分情况讨论 新数组还是旧数组  故通过定义方法来解决
    public static void printArr(student[] arr){
        for (int i = 0; i < arr.length; i++) {
            student s = arr[i];
            if(s != null){
                System.out.println(s.getId() + "," + s.getName() + "," + s.getAge());
            }
        }
    }

    // 要求3：通过id删除学生信息，如果存在，删除；如果不存在，输出删除失败
    // 1、通过id找到数组中对应的索引
    public static int getIndex(student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            //
            student s = arr[i];
            if(s != null){
                int sid = s.getId();
                if(sid == id){
                    return i;
                }
            }
        }
        return -1;

    }

    // 要求4：删除完毕后遍历所有学生信息


    // 要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
    // id为2的学生的索引
    // 判断索引>=0,存在 将年龄+1
    // else 提示




}
