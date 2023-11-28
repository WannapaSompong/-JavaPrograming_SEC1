import java.util.*;

public class Eample01_Lab4 {

	public static void main(String[] args) {
		//define object for input data from keyboard or console 
		Scanner scan = new Scanner(System.in);
		
		//display message and input data
		System.out.print("Input a number : ");
		int previosNumber = scan.nextInt();
		
		int currentNumber;
		
		//loop for input next number
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previosNumber) {
				System.out.println("\nBye Bye");
				break;
			}
			
			previosNumber=currentNumber;
			
		}
	}

}
