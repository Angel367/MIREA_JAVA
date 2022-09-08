class Shape {
    private String name;
    private int radius;

    Shape(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String toString () {
        return "Shape{"
                + "name='" + name + '\''
                + ", radius=" + radius
                + '}';
    }
}