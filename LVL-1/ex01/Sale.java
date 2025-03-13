import java.util.ArrayList;

class Sale {

    private ArrayList<Product> products = new ArrayList<>();
    private Integer totalPrice = 0;

    public Sale() {}

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) throw new EmptySaleException(
            "To make a sale firt you must add a product."
        );
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }
}
