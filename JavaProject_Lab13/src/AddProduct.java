import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		/*FileWriter filename = new FileWriter("D:\\\\textFile\\\\product.txt");
		PrintWriter writeFile = new PrintWriter(filename);*/
	
		PrintWriter writeFile = new PrintWriter
				(new FileWriter("D:\\txtFile\\product.txt"));
	
		System.out.print("Product Id : ");
		String productId = input.next();
		System.out.print("Product Name : ");
		String productName = input.next();
		System.out.print("Product Unit : ");
		int productUnit = input.nextInt();
		System.out.print("Product Pricwe : ");
		float productPrice = input.nextFloat();
	
		writeFile.println(productId+","+productName
				+","+productUnit+","+productPrice);
		System.out.println("White file aleady...");
	
	 writeFile.close();
	}
	
	

}
