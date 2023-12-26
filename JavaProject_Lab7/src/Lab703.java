import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = {78,36,58,41,25,92,75};
		
		System.out.print("Input index of array : ");
		int index =scan.nextInt();
		while(index<0||index>num.length-1) {
			System.out.print("Input index of array, again: ");
			index =scan.nextInt();
			}
		
		System.out.println();
			System.out.println("Value in current index is "+num[index]);
		if(index==num.length-1) {
			System.out.print("Sorry, "+index+" is the last index in array.");
		}
		else{
			System.out.print("Value in next    index is "+num[index+1]);
		}
		
		}
	}

