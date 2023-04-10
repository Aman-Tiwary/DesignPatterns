public class PaymentByPaypal implements PaymentStrategy{
    private String userName;
    private String password;
    public PaymentByPaypal(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid "+amount+" by Paypal");
    }
    
}
