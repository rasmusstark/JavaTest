package Vecka2Övningar;

public class ItemObject {
    static void main(String[] args) {
        Item item1 = new Item (" golfklubban ", 200);
        Item item2 = new Item (" piké ", 100);

        item1.applyDiscount(10);
        item1.getPrice();
        item2.applyDiscount(10);
        item2.getPrice();



    }
}
