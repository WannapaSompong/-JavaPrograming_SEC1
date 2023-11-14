import javax.swing.*;//1.import library for input data from dialog box
public class example4 {
	public static void main(String[] args) {
		//2.input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		//input unit price from dialog
		String strUnit = JOptionPane.showInputDialog("Input porduct unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);
		
		
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Inpit price per unit : ");
		float priceperUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * priceperUnit;
		float vat =  totalPrice+ (totalPrice*7/100);
		//display data to dialog box
		JOptionPane.showMessageDialog(null,"Total Price is " + totalPrice
				+"\nAdd VAT 7% is "+vat);

		
	}

}
