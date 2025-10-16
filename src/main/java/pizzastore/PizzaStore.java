package pizzastore;

import pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String name){
        Pizza pizza = createPizza(name);

        pizza.prepea();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
