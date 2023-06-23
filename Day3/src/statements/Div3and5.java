package statements;

import java.util.Scanner;

public class Div3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		n=sc.nextInt();
		if((n%3==0)&&(n%5==0))
			System.out.println("div by 3 & 5");
		else
			System.out.println("not div");
sc.close();
	}

}
