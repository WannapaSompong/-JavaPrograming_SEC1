import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums=new int[7];
		int odd=0;
		for(int i=0;i<nums.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			nums[i]=scan.nextInt();
			if(nums[i]%2!=0) {
				odd++;
			}	
		}

		System.out.println();
		System.out.println("There are "+odd+" of odd number.");
		System.out.print("List of odd number :");
        for(int _nums:nums) {
        	if(_nums %2!=0) {
        		System.out.print(" " + _nums);
        	}
        }
		
	}

}
