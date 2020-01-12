package basic;
import java.lang.Math;
import java.util.Scanner;

public class Power {
	public static void main(String args[]) {
		int n,p;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		System.out.println("Enter power: ");
		p = sc.nextInt();
		res = Math.pow(n, p);
		System.out.println(n+"^"+p+": "+res);
	}
}
