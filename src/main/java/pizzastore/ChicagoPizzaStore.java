package pizzastore;

import pizza.ChicagoStyleCheesePizza;
import pizza.ChicagoStylePepperoniPizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("chees")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
