package src;

import src.humanParts.*;

public class Human {
    private String name;
    private byte skinColor; // от -128 (белый) до 127 (чёрный)
    private int height;
    private int weight;
    private boolean sex;    // 0 - женщина, 1 - мужчина
    private Arm arm1, arm2;
    private Head head;
    private Leg leg1, leg2;

    public Human(String name, byte skinColor, int height, int weight, boolean sex, Arm arm1, Arm arm2, Head head, Leg leg1, Leg leg2) {
        this.name = name;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.arm1 = arm1;
        this.arm2 = arm2;
        this.head = head;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public byte getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(byte skinColor) {
        this.skinColor = skinColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public Arm getArm1() {
        return arm1;
    }

    public void setArm1(Arm arm1) {
        this.arm1 = arm1;
    }

    public Arm getArm2() {
        return arm2;
    }

    public void setArm2(Arm arm2) {
        this.arm2 = arm2;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg1() {
        return leg1;
    }

    public void setLeg1(Leg leg1) {
        this.leg1 = leg1;
    }

    public Leg getLeg2() {
        return leg2;
    }

    public void setLeg2(Leg leg2) {
        this.leg2 = leg2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", skinColor=" + skinColor +
                ", height=" + height +
                ", weight=" + weight +
                ", sex=" + sex +
                ", arm1=" + arm1 +
                ", arm2=" + arm2 +
                ", head=" + head +
                ", leg1=" + leg1 +
                ", leg2=" + leg2 +
                '}';
    }
}
