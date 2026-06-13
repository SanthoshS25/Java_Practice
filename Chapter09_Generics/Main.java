package Chapter09_Generics;

public class Main {
    public static void main(String[] args) {
        DeliveryBox <String> obj1 = new DeliveryBox<>("Pizza");
        DeliveryBox <Integer> obj2 = new DeliveryBox<Integer>(5000);
        DeliveryBox <Double> obj3 = new DeliveryBox<Double>(99.99);
        obj1.showItem();
        obj2.showItem();
        obj3.showItem();

    }
}
