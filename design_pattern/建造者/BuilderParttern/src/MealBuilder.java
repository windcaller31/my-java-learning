
public class MealBuilder {
	public Meal prepareBeefMeal() {
		Meal meal = new Meal();
		meal.addItems(new BeefBurger());
		meal.addItems(new Coke());
		return meal;
	}

	public Meal prepareChickenVegMeal() {
		Meal meal = new Meal();
		meal.addItems(new ChickenBurger());
		return meal;
	}
}
