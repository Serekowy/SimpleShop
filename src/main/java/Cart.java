import java.util.ArrayList;

public class Cart {
    private static int nextID = 0;
    private final ArrayList<Product> products;
    private double allDiscounts;
    private boolean orderDone = false;

    public Cart() {
        int id = nextID++;
        this.products = new ArrayList<>();
        this.allDiscounts = 0;
    }

    public void addToCart(Product product) {
        if(!orderDone) {
            products.add(product);
        } else {
            System.out.println("Koszyk został wcześniej sfinalizowany i nie można dodać nowych produktów");
        }
    }

    public void setAllDiscounts(double discounts) {
        this.allDiscounts = discounts;
    }
    public void finishOrder() {
        orderDone = true;
    }
    public boolean getOrderStatus() {
        return orderDone;
    }
    public int getCartID() {
        return nextID;
    }
    public double finalPrice() {
        double costOfGoods = 0;

        for (Product item : products) {
            costOfGoods += item.getFinalPrice();
        }

        return costOfGoods; //obliczyc cene koszyka z produktami i podatkami netto i z vat
    }
}
