package org.example.objectCreation.builder;
import static org.example.objectCreation.builder.NyPizza.Size.*;
import static org.example.objectCreation.builder.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(100).fat(10).sodium(50).carbohydrate(5).build();
        System.out.println(nutritionFacts);
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        System.out.println(nyPizza);
        CalZone calZone = new CalZone.Builder().addTopping(HAM).sauceInside().build();
        System.out.println(calZone);

    }

}

