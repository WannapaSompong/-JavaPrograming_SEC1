import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.00");
		Scanner scan = new Scanner(System.in);
		double[] score =new double[5];
		double sum=0,average=0;
		//for input 5 data to array score
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i]=scan.nextDouble();
			sum = sum + score[i];
		}
		
		System.out.println();
		//find average score
		average = sum/(score.length);
		System.out.println("Average of "+score.length+" student is "+frm.format(average));
		int j =0;
		for(double _score:score) {
			if(_score>average) {
				System.out.println("> Student "+(j+1)+" "+"("+frm.format(score[j])+")");
				
			}
			j++;
		}

}
}