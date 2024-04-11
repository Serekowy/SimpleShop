import java.util.ArrayList;
import java.util.List;

public class BackOffice {
    private final ArrayList<ProductManager> products;
    private final ArrayList<List> discounts;
    private final ArrayList<Cart> startedCarts;
    private final ArrayList<Cart> finishedCarts;

    public BackOffice() {
        this.products = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.startedCarts = new ArrayList<>();
        this.finishedCarts = new ArrayList<>();
    }

    public void addProduct(ProductManager product) {
        products.add(product);
    }

    public void addNewCart(Cart cart) {
        startedCarts.add(cart);
    }

    public void showAllProducts() {
        for (ProductManager product : products) {
            product.showProduct();
        }
    }

    public void finishCart(int cartId) {
        if (checkCartIsStarted(cartId)) {
            Cart cart = startedCarts.get(findStartedCartInList(cartId));
            finishedCarts.add(cart);
            cart.finishCart();
            startedCarts.remove(cart);
            System.out.println("wykonalem sje");
        }
        //zakonczenie zamowienia
    }

    private int findStartedCartInList(int cartId) {
        int i = 0;
        for (Cart cart : startedCarts) {
            if (cart.getCartID() == cartId) {
                return i;
            }
            i++;
        }
        return i;
    }
    private boolean checkCartIsStarted(int cartId) {
        return startedCarts.stream().anyMatch(cart -> cart.getCartID() == cartId);
    }
}
