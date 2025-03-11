class Product {

    private String name;
    private Integer price;

    public Product(String p_name, Integer p_price) {
        this.name = p_name;
        this.price = p_price;
    }

    public Integer getPrice() {
        return this.price;
    }
}
