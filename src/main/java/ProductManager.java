import java.util.ArrayList;

public class ProductManager extends Product {

    public ProductManager(String name, String category, double price, double tax, double discount) {
        super(name, category, price, tax, discount);
    }

    public ProductManager() {

    }

    public void showProduct() {
        System.out.println("Nazwa produktu: "
                + getName() + "\n"
                + "Kategoria: "
                + getCategory() + "\n"
                + "Cena netto: "
                + getPrice() + "\n"
                + "Rabat: "
                + getDiscount() + "\n"
                + "Podatek: "
                + getTax() + "\n"
                + "ID produktu: "
                + getId() + "\n"
        );
    }
}
