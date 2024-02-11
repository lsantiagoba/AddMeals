package mealplanner;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    //Import a Scanner class for input values
    Scanner scanner = new Scanner(System.in);

    //Declare the variables where we go to input
    String meal;
    String mealName;
    String ingredients;

    //input the values
    System.out.println("Which meal do you want to add (breakfast, lunch, dinner)?");
    meal = scanner.nextLine();

    System.out.println("Input the meal's name:");
    mealName = scanner.nextLine();

    System.out.println("Input the ingredients:");
    ingredients = scanner.nextLine();

    scanner.close();

    //Storage the ingredients into an array
    String[] ingredientesArray = ingredients.split(",");

    //Iterate the array for order the data
    for(int x = 0; x < ingredientesArray.length; x++){
      ingredientesArray[x] = ingredientesArray[x].trim();
    }

    showMeal(meal, mealName, ingredientesArray);

  }

  //Output the meal information
  public static void showMeal(String _category, String _name, String[] _ingredients){

    System.out.println("Category: "+ _category);
    System.out.println("Name: " + _name);
    System.out.println("Ingredients:");
    for(int x = 0; x < _ingredients.length; x++){
      System.out.println(_ingredients[x]);
    }

    System.out.println("The meal has been added!");

  }
}