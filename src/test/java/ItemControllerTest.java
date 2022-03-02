import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ItemControllerTest {

    @Test
    @DisplayName("Test Manage Item")
    void manageItem() {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Bag", 100, 10));
        items.add(new Item("Hat", 50, 15));
        items.add(new Item("Watch", 500, 5));

        ItemController.manageItem(items.get(0), "Supreme Bag", 250);
        ItemController.manageItem(items.get(2), "Smart Watch", 600);
        String expectedNewItemName = "Supreme Bag";
        int expectedNewPoint = 250;

        assertAll(
                () -> assertEquals(expectedNewItemName, items.get(0).getName()),
                () -> assertEquals(expectedNewPoint, items.get(0).getPoint()),
                () -> assertEquals("Smart Watch", items.get(2).getName()),
                () -> assertEquals(600, items.get(2).getPoint()),
                () -> assertNotSame(items.get(1), items.get(2)),
                () -> assertNotNull(items.get(0)),
                () -> assertNotNull(items.get(1)),
                () -> assertNotNull(items.get(2))
        );
    }
}