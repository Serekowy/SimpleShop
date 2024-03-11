import java.util.ArrayList;

public class Cart {
    final int id;
    ArrayList<Product> productList;
    final float discount;

    public Cart(int id, float discount) {
        this.id = id;
        this.discount = discount;
        this.productList = new ArrayList<>();
    }

    public float finalPrice() {
        return 0; //obliczyc cene koszyka z produktami i podatkami netto i z vat
    }
}
