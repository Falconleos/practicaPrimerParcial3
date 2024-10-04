package Model;

public abstract class Appliance extends Product{

    public Appliance() {
    }

    public Appliance(String name, Integer stock, Double price) {
        super(name, stock, price);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Appliance{}";
    }

}
