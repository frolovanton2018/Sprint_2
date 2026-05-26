package model;

import model.constants.*;

import java.util.Objects;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return (Objects.equals(colour, Colour.RED)) ? Discount.RED_APPLE_DISCOUNT : Discount.NO_DISCOUNT;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian = true;
    }
}