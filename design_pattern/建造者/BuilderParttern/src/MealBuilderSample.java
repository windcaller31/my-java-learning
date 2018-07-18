
public class MealBuilderSample {
	public static void main(String args[]){
		MealBuilder mealBuilder = new MealBuilder();
		Meal beefMeal = mealBuilder.prepareBeefMeal();
		System.out.println("beef meal start");
		beefMeal.showItems();
		System.out.println("beef meal cost"+beefMeal.getCost());
		Meal chickenMeal = mealBuilder.prepareChickenVegMeal();
		System.out.println("chicken meal start");
		chickenMeal.showItems();
		System.out.println("chicken meal cost"+chickenMeal.getCost());
	}
}
