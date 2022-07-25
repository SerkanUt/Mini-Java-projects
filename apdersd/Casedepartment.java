package apdersd;
import java.util.Scanner;
// Asks your department and Salary. Increases your salary accordingly.
public class Casedepartment {
	
	public static int manufacturing(int a) {
		int t = a+((a*20)/100);
		return t;
	}
	public static int planning(int a) {
		int t = a+((a*30)/100);
		return t;
	}
	public static int sales(int a) {
		int t = a+((a*10)/100);
		return t;
	}
	public static int delivery(int a) {
		int t = a+((a*15)/100);
		return t;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name of your department: ");
		String x = scan.nextLine();
		System.out.println("Your Salary: ");
		int y = scan.nextInt();
		switch(x){
			case "manufacturing" : 
				
				System.out.println(manufacturing(y));
				break;
			case "planning" : 
				
				System.out.println(planning(y));
				break;
			case "sales" :
				
				System.out.println(sales(y));
				break;
			case "delivery" :
				
				System.out.println(delivery(y));
				break;
		}
	}
}
