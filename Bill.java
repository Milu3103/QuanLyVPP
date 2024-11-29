public class Bill {
    private Customer customer; // Thông tin khách hàng
    private ArrayList<Items> items; // Danh sách sản phẩm
    private double totalAmount; // Tổng tiền hóa đơn
    private static final String CURRENT_BILL_FILE = "current_bill.txt"; // File lưu hóa đơn

    // Constructor
    public Bill(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Thêm sản phẩm vào hóa đơn
    public void addItem(Items item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.items.add(item);
            this.totalAmount += item.getPrice();
        }
    }

    // Hiển thị hóa đơn
    public void displayBill() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Items:");
        for (Items it : items) {
            System.out.println("- " + it.getName() + ": $" + it.getPrice());
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    // Lấy tổng số tiền hóa đơn
    public double getTotalAmount() {
        return totalAmount;
    }

    // Lưu hóa đơn vào file
    public void saveBillToFile(ArrayList<Bill> bills) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CURRENT_BILL_FILE))) {
            for (Bill bill : bills) {
                writer.write("Customer Name: " + bill.customer.getName() + "\n");
                writer.write("Address: " + bill.customer.getAddress() + "\n");
                writer.write("Items:\n");
                for (Items it : bill.items) {
                    writer.write("- " + it.getName() + ": $" + it.getPrice() + "\n");
                }
                writer.write("Total Amount: $" + bill.getTotalAmount() + "\n");
                writer.write("-----------------------------\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Phương thức append lịch sử hóa đơn (private)
    private void appendToHistory(ArrayList<Bill> bills) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bill_history.txt", true))) {
            for (Bill bill : bills) {
                writer.write("Customer Name: " + bill.customer.getName() + "\n");
                writer.write("Address: " + bill.customer.getAddress() + "\n");
                writer.write("Items:\n");
                for (Items it : bill.items) {
                    writer.write("- " + it.getName() + ": $" + it.getPrice() + "\n");
                }
                writer.write("Total Amount: $" + bill.getTotalAmount() + "\n");
                writer.write("-----------------------------\n");
            }
        } catch (IOException e) {
            System.err.println("Error appending to history: " + e.getMessage());
        }
    }

    // Đọc hóa đơn từ file
    public void readBillFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CURRENT_BILL_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Đọc lịch sử hóa đơn
    public void readBillHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader("bill_history.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading history: " + e.getMessage());
        }
    }
}

