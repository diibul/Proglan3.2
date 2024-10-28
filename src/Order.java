// Class untuk mengelola pesanan
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    // Menambah item ke dalam pesanan
    public void addItem(MenuItem menuItem, int quantity) {
        int total = menuItem.getPrice() * quantity; // Perhitungan total untuk item ini
        items.add(new OrderItem(menuItem, quantity, total));
        System.out.println("Added " + quantity + "x " + menuItem.getName() + " to the order.");
    }

    // Menghitung total keseluruhan pesanan
    public int calculateTotal() {
        int sum = 0;
        for (OrderItem item : items) {
            sum += item.getTotal();
        }
        return sum;
    }

    // Menampilkan nota
    public void displayReceipt() {
        System.out.println("\n--- Nota Pemesanan ---");
        for (OrderItem item : items) {
            System.out.println(item.getMenuItem().getName() + " (Rp" + item.getMenuItem().getPrice() + " x " 
                               + item.getQuantity() + ") = Rp" + item.getTotal());
        }
        System.out.println("Total Harga: Rp" + calculateTotal());
        System.out.println("----------------------\n");
    }
}