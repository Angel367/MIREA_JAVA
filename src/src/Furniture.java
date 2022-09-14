package src;

public abstract class Furniture {
    protected String material;
    protected int age;
    protected boolean isFlammable;
    protected boolean isDamaged;

    public Furniture(String material, int age, boolean isFlammable, boolean isDamaged) {
        this.material = material;
        this.age = age;
        this.isFlammable = isFlammable;
        this.isDamaged = isDamaged;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlammable() {
        return isFlammable;
    }

    public void setFlammable(boolean flammable) {
        isFlammable = flammable;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    @Override
    public abstract String toString();
}
