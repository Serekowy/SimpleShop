import java.util.ArrayList;
import java.util.List;

public class BackOffice {
    final ArrayList<List> products;
    final ArrayList<List> discounts;
    final ArrayList<Cart> finishedCarts;

    public BackOffice(ArrayList<List> products, ArrayList<List> discounts, ArrayList<Cart> finishedCarts) {
        this.products = products;
        this.discounts = discounts;
        this.finishedCarts = finishedCarts;
    }

    public void finishOrder() {
        //zakonczenie zamowienia
    }
}
