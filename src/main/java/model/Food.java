package model;
import model.constants.Discount;

public abstract class Food implements Discountable {
     int amount;
     double price;
     boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // Дефолтная скидка 0 для всех продуктов
    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }
}