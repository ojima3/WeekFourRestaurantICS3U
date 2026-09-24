import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int burger = 10;
		int fries = 5;
		int pizza = 12;
		int chicken = 15;
		int drink = 3;

		System.out.print("How many burgers?");
		int burgers = in.nextInt ();
		
		System.out.print("How many fries? ");
		int friesAmount = in.nextInt();
		
		System.out.print("How many pieces of chicken? ");
		int chickens = in.nextInt();
		
		System.out.print("How many drinks?");
		int drinks = in.nextInt();
		
		System.out.print("How much Pizza?");
		int pizzas = in.nextInt();
	
		int total = (burger * burgers + (pizza * pizzas) + (fries * friesAmount) + (chicken * chickens) + (drink * drinks));
		System.out.println("Total: $" + total);
		
		int discount = 0;
		
		if (total > 50) {
			discount = total * 20 / 100;
		}
		else if (total > 30 ) {
			discount = total * 10 / 100;
		}
		
		int newTotal = total - discount;
		int tax = newTotal * 13 / 100;
		int finalTotal = newTotal + tax;
		
		System.out.println("Discount: $" + discount);
		System.out.println("Tax: $" + tax);
		System.out.println("Final total: $" + finalTotal);
		
		System.out.println("Enter payment: $");
		int payment = in.nextInt();
		
		int change = payment - finalTotal;
		
		System.out.println("Change: $" + change);
	}

}