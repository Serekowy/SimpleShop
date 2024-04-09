public class Main {
    public static void main(String[] args) {
        BackOffice backOffice = new BackOffice();

        ProductManager mleko = new ProductManager("mleko", "spożywcze", 10.50, 23, 0);
        ProductManager platki = new ProductManager("płatki", "spożywcze", 10.50, 23, 0);
        ProductManager rodzynki = new ProductManager("rodzynki", "spożywcze", 50, 23, 0);

        Cart cart1 = new Cart();
        cart1.addToCart(mleko);
        backOffice.finishCart(0);
        cart1.addToCart(mleko);

        System.out.println(cart1.finalPrice());

        backOffice.addProduct(mleko);
        backOffice.addProduct(platki);
        backOffice.addProduct(rodzynki);

//        System.out.println(PriceManager.calcGrossPrice(50, 23.0));
//        System.out.println(PriceManager.calcNetPrice(61.5, 23.0));

//        backOffice.showAllProducts();
    }

}