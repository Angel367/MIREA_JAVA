package src;

public abstract class Dog {
    protected String nickname;
    protected String color;
    protected int weight;
    protected boolean sex;  // 0 - сука
    protected int age;
    protected int iq;

    public Dog(String nickname, String color, int weight, boolean sex, int age) {
        this.nickname = nickname;
        this.color = color;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", sex=" + sex +
                '}';
    }

    public abstract void sayYourBreedAndName();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
