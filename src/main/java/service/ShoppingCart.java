package service;
import model.Food;
import java.util.Arrays;

public class ShoppingCart {
    private Food[] products;
    double sum = 0;
    public ShoppingCart(Food[] cartItem) {
        this.products = Arrays.copyOf(cartItem, cartItem.length);
    }

    public double getTotalWithoutDiscount() {

        for (Food product : products){
            sum += product.getAmount() * product.getPrice();
        }
        return sum;
    }

    public double getTotalWithDiscount() {
        double sum = 0;
        for (Food product : products) {
            double itemTotal = product.getAmount() * product.getPrice();
            sum += itemTotal - (itemTotal * product.getDiscount());
        }
        return sum;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                sum += (product.getAmount() * product.getPrice());
            }
        }
        return sum;
    }
}