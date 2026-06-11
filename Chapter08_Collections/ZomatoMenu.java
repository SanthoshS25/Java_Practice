package Chapter08_Collections;

import java.util.TreeMap;

public class ZomatoMenu {
    public static void main(String[] args) {
        TreeMap <String,Integer> order = new TreeMap<>();
        order.put("Pizza",200);
        order.put("Burger",100);
        order.put("Dosa",50);
        order.put("Noodles",150);
        order.put("Roti",30);
        System.out.println("List of Order : " + order);
        order.put("Briyani", 250);
        System.out.println("First Order : " + order.firstKey());
        System.out.println("Last Order : " + order.lastKey());
        order.remove("Roti");
        System.out.println("List of Order : " + order);
    }
}
