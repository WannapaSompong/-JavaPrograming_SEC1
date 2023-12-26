import java.util.Scanner;
public final class Lab603 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by space. : ");
		String fullname = scan.nextLine();
		abbreviatName(fullname);
	
	}
	public static String abbreviatName(String name) {
		String firstName,lastName,secondName;
		
		int space=name.indexOf(' ');
		firstName = name;
		secondName =name.charAt(space+1);
		int last = name.indexOf(' ',space+1);
		lastName = name.substring(last+1);
		System.out.print(secondName+"."+lastName+"."+firstName);
		
		
	}

}
