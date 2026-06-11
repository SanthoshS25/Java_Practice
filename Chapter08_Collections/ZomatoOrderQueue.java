/* Practice Problem 🧪
Real World — Zomato Order Queue 🍕
Create ZomatoOrderQueue.java in Ch8 folder.
Do these operations —

Create order queue → add 3 orders at end
New urgent order → add at beginning
Print first order in queue
Process first order → remove it
Print current queue
Print total orders
Add 2 more orders
Print last order
Print final queue
 */

package Chapter08_Collections;

import java.util.LinkedList;

public class ZomatoOrderQueue {
    public static void main(String[] args) {
        LinkedList <String> order = new LinkedList<>();
        String[] arr = {"Order1" , "Order2" , "Order3"};
        for (String ele : arr) {
            order.add(ele);
        }
        order.addFirst("Urgent_Order");
        System.out.println("First Order : " + order.getFirst());
        System.out.println(order.poll());
        System.out.println("Current Queue : " + order);
        System.out.println("Total Number of Orders : " + order.size());
        order.add("Order4");
        order.add("Order5");
        System.out.println("The last order : " + order.getLast());
        System.out.println("Final Orders : " + order);
    }
}
