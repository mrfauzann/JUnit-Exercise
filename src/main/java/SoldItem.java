import java.time.LocalDate;

public class SoldItem {
    private Item item;
    private int qtySold;
    private LocalDate date;

    public SoldItem(Item item, int qtySold, LocalDate date) {
        this.item = item;
        this.qtySold = qtySold;
        this.date = date;
    }

    @Override
    public String toString(){
        return this.item.getName() + ", sold: " + this.qtySold + " on " + this.date;
    }

}
