package basic;
import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		int yr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		yr = sc.nextInt();
		if(yr%4==0) {
			if(yr%100==0) {
				if(yr%400==0) {
					System.out.println("Leap year");
				}
				else {
					System.out.println("Non leap year");
				}
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("Non leap year");
		}
	}
}
