package onlineOrderProcessTemplate;

public abstract class OnlineOrderProcessTemplate {

    public abstract void selectItem();
    public abstract void selectDeliveryAddress();
    public abstract void doPayment();
    public abstract void doDelivery();

    public final void processOrder() {
        selectItem();
        selectDeliveryAddress();
        doPayment();
        doDelivery();
    }


}
