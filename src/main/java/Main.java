import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] products = {
                new Meat(5, 100),
                new Apple(10, 50, Colour.RED),
                new Apple(8, 60, Colour.GREEN)
        };

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки, " + (int)cart.getTotalWithoutDiscount() + "руб.");
        System.out.println("Общая сумма товаров со скидкой, " + (int)cart.getTotalWithDiscount() + "руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки, " + (int)cart.getVegetarianTotalWithoutDiscount() + "руб.");
    }
}