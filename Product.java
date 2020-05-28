public class Product {
    private String name, price, productCode;
    private int numberOfItems;


    public Product(String name, String price, String productCode, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
