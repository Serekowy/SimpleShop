import java.util.ArrayList;
import java.util.List;

public class BackOffice{
    private final ArrayList<ProductManager> products;
    private final ArrayList<List> discounts;
    private final ArrayList<Cart> finishedCarts;

    public BackOffice() {
        this.products = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.finishedCarts = new ArrayList<>();
    }

    public void addProduct(ProductManager product) {
        products.add(product);
    }

    public void showAllProducts() {
        for(ProductManager product : products) {
            product.showProduct();
        }
    }

    public void finishOrder() {
        //zakonczenie zamowienia
    }
}
