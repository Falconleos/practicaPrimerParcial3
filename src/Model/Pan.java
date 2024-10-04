package Model;

public class Pan extends Product{
    private String material;

    public Pan(){
    }

    public Pan(String name, Integer stock, Double price, String material) {
        super(name, stock, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Pan{" +
                "material='" + material + '\'' +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice()*percentage;
    }

}
