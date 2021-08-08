package onlineOrderProcessTemplate;

public class Main {

    public static void main(String[] args) {
        OnlineOrderProcessTemplate amazon = new Amazon();
        amazon.processOrder();

        System.out.println();

        OnlineOrderProcessTemplate lazada = new Lazada();
        lazada.processOrder();
    }

}
