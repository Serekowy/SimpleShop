public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PriceManager priceManager = new PriceManager();

        System.out.println(priceManager.calcPriceTax(152.43, 23));
    }

}