public class Product {
    private String productName;
    private Double producPrice;

    public Product (String productName, Double producPrice){
        this.productName = productName;
        this.producPrice = producPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProducPrice(){
        return producPrice;
    }

    public void setProducPrice(Double producPrice) {
        this.producPrice = producPrice;
    }
}
