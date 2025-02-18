import java.util.*;
interface MealPlan {
    String getMealPlanType();
}
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealPlanType() {
        return "Vegetarian";
    }
}
class VeganMeal implements MealPlan {
    @Override
    public String getMealPlanType() {
        return "Vegan";
    }
}
class KetoMeal implements MealPlan {
    @Override
    public String getMealPlanType() {
        return "Keto";
    }
}
class HighProteinMeal implements MealPlan {
    @Override
    public String getMealPlanType() {
        return "High-Protein";
    }
}
class Meal<T extends MealPlan> {
    private T mealPlan;
    private List<String> meals = new ArrayList<>();

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
    public T getMealPlan() {
        return mealPlan;
    }
    public void addMeal(String meal) {
        meals.add(meal);
    }
    public List<String> getMeals() {
        return meals;
    }
}
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        Meal<T> meal = new Meal<>(mealPlan);
        if (mealPlan.getMealPlanType().equals("Vegetarian")) {
            meal.addMeal("Vegetable Stir-Fry");
            meal.addMeal("Vegetarian Pizza");
        } else if (mealPlan.getMealPlanType().equals("Vegan")) {
            meal.addMeal("Vegan Salad");
            meal.addMeal("Vegan Burger");
        } else if (mealPlan.getMealPlanType().equals("Keto")) {
            meal.addMeal("Keto Chicken Salad");
            meal.addMeal("Keto Steak");
        } else if (mealPlan.getMealPlanType().equals("High-Protein")) {
            meal.addMeal("Grilled Chicken Breast");
            meal.addMeal("Protein Smoothie");
        }
        return meal;
    }
}
public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMealPlan = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMealPlan = MealPlanGenerator.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMealPlan = MealPlanGenerator.generateMealPlan(new KetoMeal());

        System.out.println("Vegetarian Meal Plan: " + vegetarianMealPlan.getMeals());
        System.out.println("Vegan Meal Plan: " + veganMealPlan.getMeals());
        System.out.println("Keto Meal Plan: " + ketoMealPlan.getMeals());
    }
}
