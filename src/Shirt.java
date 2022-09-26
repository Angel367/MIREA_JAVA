public class Shirt {
    public String serialNumber, type, color, size;
    public Shirt (String shirtSpecifications) {
        String[] strings = shirtSpecifications.split(",");
        this.serialNumber = strings[0];
        this.type = strings[1];
        this.color = strings[2];
        this.size = strings[3];
    }
    @Override
    public String toString() {
        return "Shirt{" +
                "serialNumber='" + serialNumber + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
