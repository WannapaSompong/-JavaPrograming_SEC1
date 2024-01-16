import java.util.*;
public class Bookdemo {

	public static void main(String[] args) {
		Book b1 = new Book();
		Scanner scan = new Scanner(System.in);

		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book price : ");
		float price = scan.nextFloat();
		System.out.print("Input book title : ");
		int pulish = scan.nextInt();
		
		b1.setTitle(title);
		b1.setPulishyear(pulish);
		b1.setPrice(price);
		
		System.out.println();
		System.out.println(b1);
		
	}

}
