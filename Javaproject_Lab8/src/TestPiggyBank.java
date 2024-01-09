import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		inputCoin();
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of Piggybank : ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu() {
		while(true) {
			System.out.println("============================");
			System.out.println("Menu of PiggyBank");
			System.out.println("============================");
			System.out.println("[1] one  baht.");
			System.out.println("[2] two  baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten  baht.");
			System.out.println("[5] Exist");
			System.out.println("============================");
			System.out.print("Please Select Menu[1-5] : ");
			int menuChoice = scan.nextInt();
			int insert;
			 if (menuChoice==1) {
				 System.out.print("Insert  1 Baht Money : ");
				 insert = scan.nextInt();
				 pb.addOne(insert);
				 System.out.println("Money Total : "+pb.getTotal());
			 }
			 else if (menuChoice==2) {
				 System.out.print("Insert  2 Baht Money : ");
				 insert = scan.nextInt();
				 pb.addTwo(insert);
				 System.out.println("Money Total : "+pb.getTotal());
			 }
			 else if (menuChoice==3) {
				 System.out.print("Insert  5 Baht Money : ");
				 insert = scan.nextInt();
				 pb.addFive(insert);
				 System.out.println("Money Total : "+pb.getTotal());
			 }
			 else if (menuChoice==4) {
				 System.out.print("Insert 10 Baht Money : ");
				 insert = scan.nextInt();
				 pb.addTen(insert);
				 System.out.println("Money Total : "+pb.getTotal());
			 }
			 else {
				 System.out.print("Bye Bye");
				 break;
			 }
			 
		}
	}
}
