package Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(123, "safira", "Ayam Ricis");
        order.registerObserver(new Customer("safira", "safiradara292705@gmail.com"));
        order.registerObserver(new LogisticsSystem());

        order.updateStatus(OrderStatus.PROCESSING);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
}
}