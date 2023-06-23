package Strings;

public class Occurrenc {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s = "venkatesh is a intern zs sz dszensv";

		for (int i = 0; i <s.length(); i++) {
			int count = 1;
			for (int j = i; j < s.length(); j++) {
				
				if (s.charAt(i) == s.charAt(j) && i != j && s.charAt(i) != ' ') {			
					count++;

				}
			}
			if (count==2) {
				System.out.print(s.charAt(i));
			}
			

		}

	}

}
