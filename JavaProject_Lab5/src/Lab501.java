import java.util.Scanner;

public final class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullName,firstName,lastName;
		System.out.print("Full Name : ");
		fullName = scan.nextLine();
		int space = fullName.trim().indexOf(" ");
		if(space!=-1) {
			 firstName = fullName.substring(0,space);
			 lastName = fullName.substring(space+1);
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("First Name: "+lastName);
		}
		else {
			System.out.print("Incorrect Name");
		}
	}

}
