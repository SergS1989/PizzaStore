package pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class NYStyleCheesPizza extends Pizza {
    public ArrayList<String> addToPpings(){
        ArrayList<String> s = new ArrayList<>();
        System.out.println("Выбирете ингридиенты!");
        Scanner sc = new Scanner(System.in);
        s.add(sc.nextLine());
        return s;
    }
    public NYStyleCheesPizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        souce = "Marinara Sauce";
        toppings = addToPpings();
    }
}
