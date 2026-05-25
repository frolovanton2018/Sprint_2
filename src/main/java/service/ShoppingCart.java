package service;
import model.Food;

public class ShoppingCart {
    private Food[] products;
    double sum = 0;
    public ShoppingCart(Food[] cartItem) {
        this.products = cartItem;
    }

    public double getTotalWithoutDiscount() {

        for (int i = 0; i < products.length; i++) {
            sum += products[i].getAmount() * products[i].getPrice();
        }
        return sum;
    }

    public double getTotalWithDiscount() {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            double itemTotal = products[i].getAmount() * products[i].getPrice();
            sum += itemTotal - (itemTotal * products[i].getDiscount());
        }
        return sum;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].isVegetarian()) {
                sum += (products[i].getAmount() * products[i].getPrice());
            }
        }
        return sum;
    }
}