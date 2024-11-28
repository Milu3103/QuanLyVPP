public class Pen extends Items implements Discountable {
    private String color;

    // Constructor
    public Pen(String id, String name, double price, String color) {
        super(id, name, price);
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor (String color) {
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pen ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }

    @Override
    public void applyDiscount() {
        System.out.println("Discount applied to pen");
    }
}
