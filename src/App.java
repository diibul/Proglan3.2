public class App {
    public static void main(String[] args) {
        // Membuat daftar menu
        MenuItem geprekPecel = new MenuItem("Geprek Pecel", 19500);
        MenuItem rujakBuah = new MenuItem("Rujak Buah", 15000);
        MenuItem esDegan = new MenuItem("Es Degan", 7000);

        // Membuat pesanan baru
        Order order = new Order();
        order.addItem(geprekPecel, 2); // Menambahkan 2 geprek pecel
        order.addItem(rujakBuah, 1);  // Menambahkan 1 rujak buah
        order.addItem(esDegan, 3);      // Menambahkan 3 es degan

        // Menampilkan nota
        order.displayReceipt();
    }
}
