package pizzastore;

import pizza.NYStyleCheesPizza;
import pizza.NYStylePepperoniPizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("chees")) {
            return new NYStyleCheesPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }else {
            return null;
        }
    }
}
