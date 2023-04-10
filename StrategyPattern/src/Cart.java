import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;

    public Cart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }

    public float calculateTotalPrice(){
        float sum = 0.0f;
        for(Item it : items){
            sum=sum+it.getItemPrice();
        }
        return sum;
    }

    public void payment(PaymentStrategy paymentMethod){
        float totalAmount = calculateTotalPrice();
        paymentMethod.pay(totalAmount);
    }
}
