package decorator;

import baseClass.BasePizza;

public class Mushroom extends Toppings{
	BasePizza bp;
	public Mushroom(BasePizza bp){this.bp=bp;}
	@Override
	public int cost() {
		return bp.cost()+15;
	}
	

}
