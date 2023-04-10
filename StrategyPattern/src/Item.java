public class Item {
    private String itemCode;
    private float price;
    
    public Item(String itemCode,float price){
        this.itemCode=itemCode;
        this.price=price;
    }

    public String getItemCode(){
        return this.itemCode;
    }
    public float getItemPrice(){
        return this.price;
    }
}
