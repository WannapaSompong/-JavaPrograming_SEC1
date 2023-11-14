import java.text.*;//1.import for input data from keyboard
import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.create class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//3.display and input data
		System.out.print("Input product name : ");
		String prductName = input.nextLine();
		System.out.print("Input product unit :");
		int productUnit = input.nextInt();
		System.out.print("Input product per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();//enter 1 line
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+ frm.format(totalPrice)+" baht");
		float vat = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(vat)+" baht");

	}

}
