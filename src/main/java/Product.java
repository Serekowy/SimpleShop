public class Product {
    final String name;
    final String category;
    final float price;
    final float tax;
    final boolean discount;
    final int id;

    public Product(String name, String category, float price, float tax, boolean discount, int id) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
        this.id = id;
    }

    public float getFinalPrice() {
        return 0; //obliczenie ceny z podatkiem
    }

}
