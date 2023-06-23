package Strings;

public class Replacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="venkatesh is a intern ";
		//System.out.print(s.toUpperCase().charAt(0));
		for (int i=0;i<s.length()-1;i++)
		{ 
				if (s.charAt(i)==' ')
				{
//					s.replace(s.charAt(i=i+1),s.charAt(i=i-1));
					System.out.print(" "+s.charAt(i=i+1));
//					System.out.print(s);
//					s.charAt(i=i-1);
					
				}
				
//				else
//				{
//					System.out.print(s.charAt(i));
//				}
				
		}
	}
}
