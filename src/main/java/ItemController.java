import java.time.LocalDate;
import java.util.ArrayList;

public class ItemController {
    public static void manageItem(Item items, String newName, int newPoint){
        items.setPoint(newPoint);
        items.setName(newName);
    }

    public static void printItem(ArrayList<Item> items){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
