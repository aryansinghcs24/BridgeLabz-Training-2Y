import java.util.ArrayList;
import java.util.List;

interface MealPlan { String name(); }
class VegetarianMeal implements MealPlan { public String name() { return "Vegetarian"; } }
class VeganMeal implements MealPlan { public String name() { return "Vegan"; } }
class KetoMeal implements MealPlan { public String name() { return "Keto"; } }
class HighProteinMeal implements MealPlan { public String name() { return "High-Protein"; } }

class Meal<T extends MealPlan> {
    private final List<T> items = new ArrayList<>();
    public void add(T meal) { items.add(meal); }
    public List<T> getPlans() { return items; }
}

public class MealPlanSystem {
    public static <T extends MealPlan> Meal<T> generatePlan(T plan) {
        Meal<T> meal = new Meal<>();
        meal.add(plan);
        return meal;
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = generatePlan(new VegetarianMeal());
        for (VegetarianMeal m : veg.getPlans()) System.out.println(m.name());
        Meal<VeganMeal> vegan = generatePlan(new VeganMeal());
        for (VeganMeal m : vegan.getPlans()) System.out.println(m.name());
    }
}
