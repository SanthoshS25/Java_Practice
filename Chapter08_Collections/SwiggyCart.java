/*
Practice Problem 🧪
Real World — Swiggy Cart 🍕
*/

package Chapter08_Collections;

import java.util.ArrayList;

public class SwiggyCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Burger");
        cart.add("Pizza");
        cart.add("Dosa");
        System.out.println("The cart contains : " + cart);
        cart.add(0, "Briyani");
        System.out.println("Cart size is:  " + cart.size());
        System.out.println((cart.contains("Burger")) ? "It contains Burger" : "It doesn't contains Burger");
        cart.remove(2);
        cart.set(1, "Pizza");
        System.out.println("The final Cart : " + cart);

    }
}
