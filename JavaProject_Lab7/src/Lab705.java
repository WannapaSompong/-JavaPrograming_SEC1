import java.util.*;
import javax.swing.*;
public class Lab705 {
	static String odd="",even="";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		for(int i=0;i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog
					("imput number "+(i+1) + " : "));
        }
        showEven(number);
        showOdd(number);
			
	}
	
	public static void showEven(int[] nums) {
		for(int _nums:nums) {
        	if(_nums %2==0) {
        		even=even+" "+_nums;
        		//System.out.print("List of Even number :" + _nums);
        	}
		}
		JOptionPane.showMessageDialog(null, "List of Even number :\n" + even);
		
	}
	
	public static void showOdd(int[] nums) {
		for(int _nums:nums) {
        	if(_nums %2!=0) {
        		odd=odd+" "+_nums;
        		//System.out.print("List of Even number :" + _nums);
        	}
		}
		JOptionPane.showMessageDialog(null, "List of Even number :\n" + odd);
	}
	
}
