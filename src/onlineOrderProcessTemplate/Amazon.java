package onlineOrderProcessTemplate;

public class Amazon extends OnlineOrderProcessTemplate {

    @Override
    public void selectItem() {
        System.out.println("Added Amazon Items");
    }

    @Override
    public void selectDeliveryAddress() {
        System.out.println("Added Delivery Address to Korea");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment via paypal (Friends and Families)");
    }

    @Override
    public void doDelivery() {
        System.out.println("Items are on their way to their destination.");
    }
}
