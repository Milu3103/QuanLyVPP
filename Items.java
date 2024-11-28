public abstract class Items {
    protected String id;
    protected String name;
    protected double price;
    protected static int itemCount = 0;

    // Constructor
    public Items(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        itemCount++;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    // Static method
    public static int getItemCount() {
        return itemCount;
    }

    // Abstract method
    public abstract void displayInfo();
}
