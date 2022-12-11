package pizzaStore;

import baseClass.BasePizza;
import baseClass.Margherita;
import decorator.Cheese;
import decorator.Mushroom;

public class Main {

	public static void main(String[] args) {
		
		BasePizza pizza= new Margherita();
		System.out.println(pizza.cost());
		BasePizza newPizza=new Mushroom(new Cheese(new Margherita()));  // wrapping the decorator
		System.out.println(newPizza.cost());

	}

}
