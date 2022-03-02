import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.print;
import static org.junit.jupiter.api.Assertions.*;

class PurchaseControllerTest {

    @Test
    void buyItem() {
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<SoldItem> soldItems = new ArrayList<>();

        items.add(new Item("Bag", 100, 10));
        items.add(new Item("Hat", 50, 15));
        items.add(new Item("Watch", 500, 5));



        assertNotNull(PurchaseController.buyItem(items.get(1), 3, soldItems));
    }

    @Test
    void printHistory() {

    }
}