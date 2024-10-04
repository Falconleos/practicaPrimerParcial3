package Model;

import Interface.OfferProduct;

public class Knife extends Product implements OfferProduct {

    private String typeSheet;

    public Knife() {
    }

    public Knife(String name, Integer stock, Double price, String typeSheet) {
        super(name, stock, price);
        this.typeSheet = typeSheet;
    }

    public String getTypeSheet() {
        return typeSheet;
    }

    public void setTypeSheet(String typeSheet) {
        this.typeSheet = typeSheet;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Knife{" +
                "typeSheet='" + typeSheet + '\'' +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice()*percentage;
    }
    @Override
    public Double offer(Double percentage){
        return getPrice()*(1-percentage/100);
    }

}
