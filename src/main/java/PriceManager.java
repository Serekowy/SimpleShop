public class PriceManager {
    public static double calcDiscountPrice (double price, double discount) {
        double finalPrice;
        discount = price/100 * discount;
        finalPrice =  price - discount;
        return Math.round(finalPrice * 100.0)/100.0;
    }

    public static double calcGrossPrice(double netPrice, double tax) {
        double grossPrice;
        tax = tax/100+1;
        grossPrice = tax * netPrice;
        return Math.round(grossPrice * 100.0)/100.0;
    }

    public static double calcNetPrice(double grossPrice, double tax) {
        return grossPrice/1.23;
    }
}
