package statements;

import java.util.*;

public class Names_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur name");

		int i = 1;
//		while (true) {
//			String str = sc.nextLine();
//			if (str != "") {
//				System.out.println(i + "." + str);
//				i++;
//			}
//		}
		while (sc.hasNext()) {
			String str = sc.nextLine();

			System.out.println(i++ + "." + str);

		}
	}

}
