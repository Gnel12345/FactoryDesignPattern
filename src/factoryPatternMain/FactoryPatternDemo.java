package factoryPatternMain;


public class FactoryPatternDemo {

	public static void main(String[] args){
		
		FactoryPattern shapeFactory = new FactoryPattern();
			
		Shape shape1 = shapeFactory.getShape("Circle");	
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("Rectangle");
		
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("Square");
		
		shape3.draw();
		

	}

}
