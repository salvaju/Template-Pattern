package onlineOrderProcessTemplate;

public class Lazada extends OnlineOrderProcessTemplate {

    @Override
    public void selectItem() {
        System.out.println("Added Lazada Lazmall Items ");
    }

    @Override
    public void selectDeliveryAddress() {
        System.out.println("Added Delivery Address to Philippines");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment via GCash");
    }

    @Override
    public void doDelivery() {
        System.out.println("Items are on its way.");
    }

}
