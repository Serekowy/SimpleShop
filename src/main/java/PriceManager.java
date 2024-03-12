public class PriceManager {
    public double calcDiscountPrice (double price, double discount) {
        double finalPrice = (price*discount/100);
        finalPrice = price - discount;
        return Math.round(price * 100.0)/100.0;
    }

    public double calcPriceTax(double netPrice, double tax) {
        double grossPrice = 0;
        tax = tax/100+1;
        grossPrice = tax * netPrice;
        return Math.round(grossPrice * 100.0)/100.0;
    }
}
