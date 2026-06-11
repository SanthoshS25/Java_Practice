/* Problem — Amazon Recently Viewed 🛒
Create AmazonRecentlyViewed.java in Ch8 folder.
Do these operations —

Create LinkedHashMap → productName → price
Add 5 products in this order →
"iPhone"→80000, "Headphones"→2000,
"Laptop"→60000, "Watch"→5000, "Charger"→1000
Print all products in order
Check if "Laptop" exists
User views "iPhone" again →
remove and re-add at end
Print final viewed order
Print total viewed products */

package Chapter08_Collections;

import java.util.LinkedHashMap;

public class AmazonRecentlyViewed {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("iPhone", 80000);
        map.put("Headphones", 2000);
        map.put("Laptop", 60000);
        map.put("Watch", 5000);
        map.put("Charger", 1000);
        System.out.println("All the products - " + map);
        System.out.println((map.containsKey("Laptop")) ? "It contains Laptop" : "It doesn't contains laptop");
        map.remove("iPhone");
        map.put("iPhone", 80000);
        System.out.println("All the Viewed products : " + map);
        System.out.println("Total sixe of the products : " + map.size());
    }
}
