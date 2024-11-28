public class Notebook extends Items implements Discountable {
    private int pages;

    // Constructor
    public Notebook(String id, String name, double price, int pages) {
        super(id, name, price);
        this.pages = pages;
    }

    // Getter
    public int getPages() {
        return pages;
    }

    // Setters
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Notebook ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
    }

    @Override
    public void applyDiscount() {
        System.out.println("Discount available to notebook!");
    }
}
