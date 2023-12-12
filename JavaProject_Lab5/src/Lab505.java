import java.util.*;
public final class Lab505 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input your name: ");
		String name = scan.nextLine();
		
		int space=name.indexOf(' ');
		String sh = name.charAt(0)+".";
		sh = sh+name.charAt(space+1)+".";
		int last = name.indexOf(' ',space+1);
		sh = sh+name.substring(last+1);
		System.out.print(sh);
	}

}
