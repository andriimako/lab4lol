public class Product {
    private String name, price, productCode;
    private int numberOfItems;

    public Product(String name, String price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = 0;
    }


    public Product(String name, String price, String productCode, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        if(numberOfItems >= 0) {
            this.numberOfItems = numberOfItems;
        }else{
            throw new IllegalArgumentException("The number of items cannot be negative");
        }
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
