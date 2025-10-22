public class OrdemItem {
    private int quantity;
    private double itemPrice;
    private Product product;

    public OrdemItem(int quantity, double itemPrice, Product product){
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.product = product;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public Product getProduct(){
        return this.product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public double subTotal() {
        return this.quantity * this.itemPrice;
    }

    @Override
    public String toString(){
        return product.getProductName() + ", $"
        + itemPrice + ", Quantity: " + quantity
        + ", Subtotal: $"+subTotal();
    }
}
