public class Main {
    public static void main(String[] args) {
        PriceManager priceManager = new PriceManager();

        ProductView pv =  new ProductView();

        Product mleko = new Product("mleko", "spożywcze", 10.50, 23, 0);
        Product mleko1 = new Product("mleko1", "spożywcze", 10.50, 23, 0);

        pv.showProduct(mleko);
        pv.showProduct(mleko1);
    }

}