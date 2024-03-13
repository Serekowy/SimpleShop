public class Main {
    public static void main(String[] args) {
        BackOffice backOffice = new BackOffice();

        ProductManager mleko = new ProductManager("mleko", "spożywcze", 10.50, 23, 0);
        ProductManager platki = new ProductManager("płatki", "spożywcze", 10.50, 23, 0);
        ProductManager rodzynki = new ProductManager("rodzynki", "spożywcze", 50, 23, 0);

        backOffice.addProduct(mleko);
        backOffice.addProduct(platki);
        backOffice.addProduct(rodzynki);

        backOffice.showAllProducts();
    }

}