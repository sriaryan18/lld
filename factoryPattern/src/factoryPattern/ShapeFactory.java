package factoryPattern;

public class ShapeFactory {
	public Shape getShape(String name) {
		switch(name) {
			case "Circle" : return new Circle();
			case "Rectange" : return new Rectangle();
		}
		return null;
	}
}
