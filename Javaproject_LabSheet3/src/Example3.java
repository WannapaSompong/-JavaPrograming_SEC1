import java.text.DecimalFormat;

import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm = new DecimalFormat("##.0");
		//input and convert weight and height from string to double 
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input weight : "));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input height : "));
		//convert height from cm. to m
		height = height/100;
		//calculate BMI
		double bmi = weight/(height*height); 
		String bmiCategory;
		if(bmi<18.5)bmiCategory = "Underweight";
		if(bmi<25)bmiCategory = "Normal-weight";
		if(bmi<30)bmiCategory = "Over-weight";
		else bmiCategory = "Obesity";
		//display BMI from Dialog Box
		/*JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)
		+"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);*/
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",bmi)
		+"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
		
		
		

	}

}
