package HW_05_1;

public class Beverages {
    private String name;
    private Double price;

    public Beverages() {
    }

    public Beverages(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
