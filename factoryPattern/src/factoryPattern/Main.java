package factoryPattern;

public class Main {
	public static void main(String args[]) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape=factory.getShape("Rectange");
		shape.draw();
	}
}
