import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		int x,y,sum=0 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		while(y<x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		sum = x+x+1;
		int i = x+2;
		System.out.println(x+"+"+(x+1)+"="+sum);
		while(i<=y) {
			System.out.println(sum+"+"+(i)+"="+(sum+i));
			sum +=i;
			i++;
		}
	}

}
