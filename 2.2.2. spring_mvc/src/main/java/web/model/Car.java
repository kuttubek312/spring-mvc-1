package web.model;

public class Car {

    private int id;
    private String name;

    private String stamp;
    private String color;
    private int price;

    public Car(){
    }

    public Car(int id, String name, String stamp, String color, int price) {
        this.id = id;
        this.name = name;
        this.stamp = stamp;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stamp='" + stamp + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
