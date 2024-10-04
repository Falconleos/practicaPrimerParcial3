package Model;

import Interface.OfferProduct;

public class Mixer extends Product implements OfferProduct {

    private Integer speed;

    public Mixer() {
    }

    public Mixer(String name, Integer stock, Double price, Integer speed) {
        super(name, stock, price);
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Mixer{" +
                "speed=" + speed +
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
