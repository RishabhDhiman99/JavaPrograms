package basic;
import java.util.Scanner;

public class AddNumber {
	public static void main(String args[]) {
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		a = sc.nextFloat();
		System.out.println("Enter number 2: ");
		b = sc.nextFloat();
		c = a+b;
		System.out.println("Addition is: "+c);
	}
}
