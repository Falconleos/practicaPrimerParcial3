package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduct {

    private List<Product> inventary;

    public ServiceProduct() {
        this.inventary = new ArrayList<>();
    }

    public void addProduct(Product p){
        inventary.add(p);
    }

    public void showData(){
        for(Product p:inventary){
            System.out.println(p);
            System.out.println("De la clase: " + p.getClass());
        }
    }

    public void applyOffer(Double percentage){

        for(Product p : inventary){

            Double priceWithDiscount = 0d;

            if(p instanceof Knife){
                priceWithDiscount = ((Knife) p).offer(percentage);
                System.out.println("el precio de oferta de " + p.getName() + " es: " + priceWithDiscount);
            }if(p instanceof Mixer){
                priceWithDiscount = ((Mixer) p).offer(percentage);
                System.out.println("el precio de oferta de " + p.getName() + " es: " + priceWithDiscount);
            }

        }

    }

    public void newPrice(){

        for(Product p : inventary){
            Double percentage = 0d;
            Double oldPrice = 0d;

            if (p instanceof Mixer){
                percentage = 1.07;
                oldPrice = p.getPrice();
            }if (p instanceof Microwave){
                percentage = 1.12;
                oldPrice = p.getPrice();
            }if (p instanceof Knife){
                percentage = 1.06;
                oldPrice = p.getPrice();
            }if (p instanceof Pan){
                percentage = 1.09;
                oldPrice = p.getPrice();
            }
            p.setPrice(p.calculatePrice(percentage));
            System.out.println("Precio anterior de "+p.getName()+": "+oldPrice+", precio con aumento: "+ p.getPrice());
        }

    }

}
