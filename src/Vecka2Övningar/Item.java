package Vecka2Övningar;

public class Item {

   private String name;
   private int price;

    public Item(String myName, int myPrice) {
        this.name = myName;
        this.price = myPrice;

    }

    public void applyDiscount (int procent) {
        price = price - (price*procent/100);
    }

    public void getPrice(){
        System.out.println(name + "kostar " + price + "kr.");

    }
}
