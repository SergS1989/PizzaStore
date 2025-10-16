package pizza;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza(){
        name = "NY Style Deep Dish Peperoni Pizza";
        dough = "Extra Fat Crust Dough";
        souce = "Plum no Tomato Sauce";
        toppings.add("Shredded Peperoni Cheese");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official PizzaStore packege");
    }
}
