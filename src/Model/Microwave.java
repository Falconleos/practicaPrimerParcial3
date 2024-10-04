package Model;

public class Microwave extends Product{
    private Double capacity;

    public Microwave() {
    }

    public Microwave(String name, Integer stock, Double price, Double capacity) {
        super(name, stock, price);
        this.capacity = capacity;
    }

    public Double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Microwave{" +
                "capacity=" + capacity +
                '}';
    }

    public Double calculatePrice(Double percentage){
        return getPrice()*percentage;
    }

}
