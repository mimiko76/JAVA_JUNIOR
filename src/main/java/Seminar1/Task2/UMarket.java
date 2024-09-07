package Seminar1.Task2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UMarket {

    //region методы

    public <T extends Thing> void printThings(Class<T> clazz){
        /**int index = 1;
        for(var thing : things){
            if(clazz.isInstance(thing)){
                if(Food.class.isAssignableFrom(thing.getClass())){
                    System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n", index ++,
                            thing.getName(),((Food) thing).getProteins()?  "Да" : "Нет",((Food) thing).getCarbohydrates()?  "Да" : "Нет",
                            ((Food) thing).getFats() ?  "Да" : "Нет", ((Food) thing).getCarbohydrates() ? "Да" : "Нет");
                }
                else {
                    System.out.printf("[%d] %s\n", index++,thing.getName() );
                }
            }
        }*/
        int[] counter = {1};
        things.stream()
                .filter(clazz::isInstance)
                .forEach(thing -> {
                    if (Food.class.isAssignableFrom((thing.getClass()))) {
                        Food foodThing = (Food) thing;
                        System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s\n",
                                counter[0]++, thing.getName() ,
                                foodThing.getProteins() ? "Да" : "Нет",
                                foodThing.getFats() ? "Нет" : "Да",
                                foodThing.getCarbohydrates() ? "Да" : "Нет");
                    }
                    else {
                        System.out.printf("[%d] %s\n",counter[0]++, thing.getName());
                    }
                });
    }
    private void initializeThings(){
        things.add(new Pen());
        things.add(new Notebook());

        things.add(new Cheburek());
        things.add(new Chicken());

        things.add(new ChocolateBar());
        things.add(new Crisps());
        things.add(new DumpLingsBerries());

        things.add(new Fruits());
        things.add(new OliveOil());
        things.add(new BalykCheese());
    }

    //endregion
    //region Конструкторы
    public UMarket() {
        things = new ArrayList<>();
        initializeThings();
    }
    //endregion
    // region поля
    private final Collection<Thing> things;
    //endregion
}
