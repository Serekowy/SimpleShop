public class ProductView extends Product {

    public ProductView() {
    }

    public ProductView(String name, String category, double price, double tax, double discount, int id) {
        super(name, category, price, tax, discount);
    }

    public void showProduct(Product product) {
        System.out.println(
                "Nazwa produktu: "
                + product.getName() + "\n"
                + "Kategoria: "
                + product.getCategory() + "\n"
                + "Cena netto: "
                + product.getPrice() + "\n"
                + "Rabat: "
                + product.getDiscount() + "\n"
                + "ID produktu: "
                + product.getId()
        );
    }
}
