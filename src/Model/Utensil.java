package Model;

public abstract class Utensil extends Product {

    public Utensil() {
    }

    public Utensil(String name, Integer stock, Double price) {
        super(name, stock, price);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Utensil{}";
    }


}
