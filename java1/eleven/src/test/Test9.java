package test;

// 敏感词屏蔽


public class Test9 {
    public static void main(String[] args) {
        String sentence = "你真菜，TMD";

        // 定义一个敏感词库
        String[] arr = {"TMD", "TMD", "TMD", "TMD"};

        // 循环替换每一个敏感词
        for (int i = 0; i < arr.length; i++) {
            sentence = sentence.replace(arr[i], "***");
        }
        System.out.println(sentence);

    }
}
