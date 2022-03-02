public class Item {
    private String name;
    private int point;
    private int stock;

    public Item(String name, int point, int stock) {
        this.name = name;
        this.point = point;
        this.stock = stock;
    }

    public int getPoint() { return point; }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return this.name + ", stock: " + this.stock + ", point needed: " + this.point;
    }

}
