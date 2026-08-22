package HW_7.Task1;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Warehouse<String> warehouse = new Warehouse<>();
        System.out.println("Empty? " + warehouse.isEmpty());
        warehouse.addItem("Laptop");
        warehouse.addItem("Mouse");
        warehouse.addItem("Monitor");
        warehouse.addItem("Keyboard");
        warehouse.addItem("Headphone");
        System.out.println("Quantity " + warehouse.getItemCount());
        System.out.println("Revision " + warehouse.viewItems());
        System.out.println("Quantity after review " + warehouse.getItemCount());
        List<String> retrieved = warehouse.retrieveAll();
        System.out.println("sold items " + retrieved);
        System.out.println("Quantity after get everything " + warehouse.getItemCount());
        warehouse.addItem("Bag");
        warehouse.addItem("Charger");
        System.out.println("Quantity before clear: " + warehouse.getItemCount());
        warehouse.clear();
        System.out.println("Quantity after clear: " + warehouse.getItemCount());
        System.out.println("Empty after clear? " + warehouse.isEmpty());
    }
}
