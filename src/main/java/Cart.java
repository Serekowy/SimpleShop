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
