import Model.*;
import Service.ServiceProduct;

import java.awt.geom.Point2D;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServiceProduct serviceProduct = new ServiceProduct();

        Product mixer = new Mixer("Atma",12,100.0,5);
        Product microwave = new Microwave("Phillip",14,200.0,20.0);
        Product knife = new Knife("Tramontina",32,70.0,"acero");
        Product pan = new Pan("Casorla",23,40.0,"aluminio");

        serviceProduct.addProduct(mixer);
        serviceProduct.addProduct(microwave);
        serviceProduct.addProduct(knife);
        serviceProduct.addProduct(pan);

        serviceProduct.showData();

        serviceProduct.applyOffer(15.0);

        serviceProduct.newPrice();


    }
}