package Model;

public abstract class Product {
    protected static Integer counter = 0;

    private Integer id;
    private String name;
    private Integer stock;
    private Double price;

    public Product() {
        this.id = counter++;
    }

    public Product(String name, Integer stock, Double price) {
        this.id = counter++;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    public abstract Double calculatePrice(Double percentage);


}
