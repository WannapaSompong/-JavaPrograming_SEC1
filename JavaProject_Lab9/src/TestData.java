
public class TestData {

	public static void main(String[] args) {
		Data d1 = new Data(2023,2,8);
		System.out.print(d1);
		
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		
		System.out.println(d1);
		System.out.println("Year is : "+d1.getYear());
		System.out.println("Month is : "+d1.getMonth());
		System.out.println("Day is : "+d1.getDay());
		
		d1.setData(2024,1,16);
		System.out.println(d1);
	}

}
