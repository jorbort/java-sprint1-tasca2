class Main {

    public static void main(String[] argv) {
        try {
            Product p1 = new Product("shampoo", 10);
            Product p2 = new Product("soap", 2);
            Product p3 = new Product("tooth-paste", 4);
            Sale sale1 = new Sale();
            Sale sale2 = new Sale();
            sale2.addProduct(p1);
            sale2.addProduct(p3);
            sale2.addProduct(p2);
            sale2.calculateTotal();
            System.out.println("The total price is: " + sale2.getTotalPrice());
            sale1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] array = { 1, 2, 3 };
            array[6] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
