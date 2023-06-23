package statements;

import java.util.Scanner;

public class ErO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		n=sc.nextInt();
		if (n%2==0)
			System.out.println("even");
		else 
			System.out.println("odd");
sc.close();
	}

}
