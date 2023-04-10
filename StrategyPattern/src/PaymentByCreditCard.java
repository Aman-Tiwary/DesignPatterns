public class PaymentByCreditCard implements PaymentStrategy{
    private String cardNo;
    private int pin;
    private int cvv;
    public PaymentByCreditCard(String cardNo,int pin,int cvv){
        this.cardNo=cardNo;
        this.pin=pin;
        this.cvv=cvv;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid "+amount+" Credit Card");
    }
}
