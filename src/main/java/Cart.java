import java.util.ArrayList;

public class Cart {
    private final int id;
    private static int nextID = 0;
    private final ArrayList<Product> productList;
    private final float discount;

    public Cart(int id, float discount) {
        this.id = nextID++;
        this.discount = discount;
        this.productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        productList.add(product);
    }

    public double finalPrice() {
        double costOfGoods = 0;

        for (Product item : productList) {
            costOfGoods += item.getFinalPrice();
        }

        return costOfGoods; //obliczyc cene koszyka z produktami i podatkami netto i z vat
    }
}
