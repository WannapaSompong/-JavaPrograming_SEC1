import java.util.Scanner;
public final class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static String fullName;

	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by space. : ");
		String fullname = scan.nextLine();
		abbreviatName(fullname);
	
	}
	public static String abbreviatName(String fullname) {
		
		int space=fullname.indexOf(' ');
		String  name= fullname.charAt(0)+".";
		name = name+fullname.charAt(space+1)+".";
		int last = fullname.indexOf(' ',space+1);
		name = name+fullname.substring(last+1);
		System.out.print(name);
		return name;
	}

}
