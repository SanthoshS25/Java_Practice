package Chapter08_Collections;

import java.util.HashMap;

public class ZomatoRatings {
    public static void main(String[] args) {
        HashMap<String, Integer> restaurant = new HashMap<>();
        restaurant.put("KFC", 4);
        restaurant.put("Dominos", 5);
        restaurant.put("McDonald's", 3);
        restaurant.put("Subway", 4);
        for (String hotel : restaurant.keySet()) {
            System.out.println(hotel + " - " + restaurant.get(hotel));
        }
        System.out.println(restaurant.get("KFC"));
        restaurant.put("McDonald's", 4);
        System.out.println((restaurant.containsKey("Burger King") ? "Yes, it contains Burger King"
                : "No, it not contains Burger King"));
        restaurant.remove("Subway");
        for (String hotel : restaurant.keySet()) {
            System.out.println(hotel);
        }
        System.out.println("Size of the Restaurant - " + restaurant.size());
    }
}
