public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        PaymentByPaypal paypal = new PaymentByPaypal("xyz@gmail","pass");
        PaymentByCreditCard creditCard = new PaymentByCreditCard("456732342324", 02345,923);

        Item Item1 = new Item("A234",36.02f);
        Item Item2 = new Item("D695",100.92f);
        Item Item3 = new Item("G678",50.24f);

        cart.addItem(Item1);
        cart.addItem(Item2);
        cart.addItem(Item3);

        cart.payment(creditCard);
        cart.payment(paypal);
    }
}
