public class PriceManager {
    public double calcDiscountPrice (double price, double discount) {
        double finalPrice = 0;
        discount = price/100 * discount;
        finalPrice =  price - discount;
        return Math.round(finalPrice * 100.0)/100.0;
    }

    public double calcGrossPrice(double netPrice, double tax) {
        double grossPrice = 0;
        tax = tax/100+1;
        grossPrice = tax * netPrice;
        return Math.round(grossPrice * 100.0)/100.0;
    }
}
