public class Product extends PriceManager {
    final String name;
    final String category;
    final double price;
    final double tax;
    final double discount;
    int id = 0;

    public Product(String name, String category, double price, double tax, double discount) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
        id++;
    }
    public Product() {
        name = null;
        category = null;
        price = 0;
        tax = 0;
        discount = 0;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public int getId() {
        return id;
    }

    public double getNetPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalPrice() {
        double finalPrice = 0;

        if (discount > 0) {
            finalPrice = calcGrossPrice(price, tax);
            finalPrice = calcDiscountPrice(finalPrice, discount);
        } else {
            finalPrice = calcGrossPrice(price, tax);
        }

        return finalPrice;
    }
}
