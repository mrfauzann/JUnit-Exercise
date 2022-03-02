import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<SoldItem> soldItems = new ArrayList<>();

        items.add(new Item("Bag", 100, 10));
        items.add(new Item("Hat", 50, 15));
        items.add(new Item("Watch", 500, 5));

        ItemController.printItem(items);

        PurchaseController.buyItem(items.get(1), 25, soldItems);
        PurchaseController.buyItem(items.get(2), 1, soldItems);
        ItemController.manageItem(items.get(0), "Supreme Bag", 1000);

        System.out.println("----After Purchase and Update----");

        ItemController.printItem(items);

        System.out.println("----Purchase History----");

        PurchaseController.printHistory(soldItems);
    }
}
