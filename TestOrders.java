import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        
        Item item1 = new Item("Mocha", 4.25);
        Item item2 = new Item("Latte", 4.5);
        Item item3 = new Item("Drip Coffee", 2.5);
        Item item4 = new Item("Cappuccino", 3.75);
        // System.out.println(item1.getName() + " " + item1.getPrice());
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.setName("Cindhuri");
        Order order2 = new Order();
        order2.setName("Jimmy");
        Order order3 = new Order();
        order3.setName("Noah");
        Order order4 = new Order();
        order4.setName("Sam");

        order2.items.add(item1);
        order2.setTotal(item1.getPrice());
        
        order3.items.add(item4);
        order3.setTotal(item4.getPrice());

        order4.items.add(item2);
        order4.setTotal(item2.getPrice());

        order1.setReady(true);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.setTotal(item2.getPrice());
        order4.setTotal(item2.getPrice());

        order2.setReady(true);


    
        // Application Simulations
        
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.getReady());

        System.out.printf("Name: %s\n", order2.getName());
        System.out.printf("Total: %s\n", order2.getTotal());
        System.out.printf("Ready: %s\n", order2.getReady());

        System.out.printf("Name: %s\n", order3.getName());
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Ready: %s\n", order3.getReady());

        System.out.printf("Name: %s\n", order4.getName());
        System.out.printf("Total: %s\n", order4.getTotal());
        System.out.printf("Ready: %s\n", order4.getReady());
    }
}