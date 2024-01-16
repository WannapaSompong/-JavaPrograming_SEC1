
public class TestCircle {

	public static void main(String[] args) {
		//Test all constructors and toString()
		Circle c1 = new Circle(1.1,"blue");
		System.out.print(c1);//call toString() method
		
		Circle c2 = new Circle(2.2);
		System.out.print(c2);
		
		Circle c3 = new Circle();//call default constructors
		System.out.print(c3);
		System.out.println();
		
		//Test Setters and Getters method
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println("The radius is : "+c1.getRadius());
		System.out.println("The color is : "+c1.getColor());
		
		//Test getArea() and getCircumference()
		System.out.printf("The area is : %.2f"+c1.getArea());
		System.out.printf("The circumference is : %.2f"+c1.getCircumference());
		
		
	}

}
