package src;

public class Dog {
    private String nickname;
    private int age;
    Dog (String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int convertToHuman() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
