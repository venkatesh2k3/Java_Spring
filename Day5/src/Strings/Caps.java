package Strings;

public class Caps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="venkatesh is a intern ";
		System.out.print(s.toUpperCase().charAt(0));
		for (int i=1;i<s.length()-1;i++)
		{ 
				if (s.charAt(i)==' ')
				{
					System.out.print(" ");
					System.out.print(s.toUpperCase().charAt(i=i+1));
				}
				else
				{
					System.out.print(s.charAt(i));
				}
		}
			
		}
	}


