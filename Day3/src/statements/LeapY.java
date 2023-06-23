package statements;

import java.util.Scanner;

public class LeapY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		n=sc.nextInt();
		if (((n%400==0)||(n%4==0)&&(n%100!=0)))
			System.out.println("yeap year");
		else 
			System.out.println("not a leap year");
	}

}
