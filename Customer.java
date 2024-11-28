public class Customer {
    private String name;
    private String phone;

    // Constructor
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Display customer information
    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone: " + phone);
    }   
}
