import javax.swing.*;
import java.util.*;
import java.text.*;

public class JavaPractice1_Lab3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;

		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balauce : "+frm.format(balance)
				+"\nInput money to withdraw : "));
		
		int withdraw1000=withdrawMoney/1000 ;
		int withdraw500=(withdrawMoney-(withdraw1000*1000))/500 ;
		int withdraw100=((withdrawMoney-withdraw1000*1000)-withdraw500*500)/100 ;
		
		if(withdrawMoney>20000)
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000"
					,"Message",JOptionPane.ERROR_MESSAGE);	
		}
		else if(withdrawMoney%100!=0)
		{
			int withdraw10=withdrawMoney%100;
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "
		+withdraw10 ,"Message",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney>balance)
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance"
					,"Message",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your withdraw "+frm.format(balance)
			+"\n1,000 = "+withdraw1000
			+"\n500   = "+withdraw500
			+"\n100   = "+withdraw100
			);
		}
		
		
	}

}
