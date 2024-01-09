
public class TestCircle {
	public static void main(String[] args) {
		Circle_1 c1 = new Circle_1();
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		c1.setRadius(2.0);
		c1.setColor("blue");
		System.out.println("The area of object c1 is "+c1.getArea());
		System.out.println(",and color is "+c1.getColor());
		
		c2.setRadius(2.0);
		c2.setColor("red");
		System.out.println("The area of object c2 is "+c2.getArea());
		System.out.println(",and color is "+c2.getColor());
		
		c3.setRadius(1.0);
		c3.setColor("red");
		System.out.println("The area of object c3 is "+c3.getArea());
		
		
		/*c1.radius = 12.5;
		System.out.println("The area of object c1 is "+c1.getArea());
		
		c2.radius = 5.5;
		System.out.println("The area of object c1 is "+c2.getArea());
		
		//call static  method
		System.out.println(showColor("red"));*/

	}
	public static String showColor(String color) {
		return "The color is "+color;
	}
}
