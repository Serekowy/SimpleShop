public class Product {
    final String name;
    final String category;
    final double price;
    final int tax;
    final int discount;
    final int id;

    public Product(String name, String category, double price, int tax, int discount, int id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalPrice() {

        return 0; //obliczenie ceny z podatkiem
    }

}
