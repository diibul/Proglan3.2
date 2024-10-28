public class OrderItem {
    private MenuItem menuItem;
    private int quantity;
    private int total;

    public OrderItem(MenuItem menuItem, int quantity, int total) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        this.total = total;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        return total;
    }
}
