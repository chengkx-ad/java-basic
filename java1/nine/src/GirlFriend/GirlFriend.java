package GirlFriend;

public class GirlFriend {
    private String name;
    private int age;
    private char gender;
    private String habit;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, char gender, String habit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.habit = habit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }
}
