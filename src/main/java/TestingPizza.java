import pizza.Pizza;
import pizzastore.ChicagoPizzaStore;
import pizzastore.NYPizzaStore;
import pizzastore.PizzaStore;

import java.util.Scanner;

public class TestingPizza {
    public static void main(String[] args) {

        PizzaStore nyPizza = new NYPizzaStore();
        PizzaStore chPizza = new ChicagoPizzaStore();

       Pizza pizza = nyPizza.orderPizza("chees");
        System.out.println(pizza.getName());
    }
}
