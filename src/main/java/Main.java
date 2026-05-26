import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] products = {
                new Meat(5, 100),
                new Apple(10, 50, "Красные"),
                new Apple(8, 60, "Зелёные")
        };

        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки %.2f руб. %n" +
                        "Общая сумма товаров со скидкой %.2f руб. %n" +
                        "Сумма вегетарианских продуктов без скидки %.2f руб.",
                cart.getTotalWithoutDiscount(), cart.getTotalWithDiscount(), cart.getVegetarianTotalWithoutDiscount());
    }
}