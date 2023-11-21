import javax.swing.*;
import java.text.*;
public class Example1_Lab3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//รับข้อมูลทางDialogbox และแปลงข้อมูลให้เป็นเลขจำนวนเต็ม
		int numberofCustomer = Integer.parseInt(
		JOptionPane.showInputDialog("How many customer per bill"));
		double discount,totalPrice=0;
		//calculate total price of buffet 
		totalPrice = BUFFET * numberofCustomer;
		//using Confirm dialog box
		int member;
		
		do {
			member = JOptionPane.showConfirmDialog(null, "Total Price is "
				+totalPrice+" Baht."+"\nDo you have a member card?");	
		}while(member == JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION)
		{
		discount = totalPrice * 90/100;
		JOptionPane.showMessageDialog(null,"Amount to be paid is "
		+ frm.format(discount)+" Baht.");
		}
		else if(member == JOptionPane.NO_OPTION)
		{
		discount = totalPrice * 90/100;
		JOptionPane.showMessageDialog(null,"Amount to be paid is "
		+frm.format(totalPrice)+" Baht.");
		}
		
		
		
	}

}
