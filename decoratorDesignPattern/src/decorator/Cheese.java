package decorator;

import baseClass.BasePizza;

public class Cheese extends Toppings{
	BasePizza bp;
	public Cheese(BasePizza bp){
		this.bp=bp;
	}
	public int cost() {
		return bp.cost()+10;
	}
}
