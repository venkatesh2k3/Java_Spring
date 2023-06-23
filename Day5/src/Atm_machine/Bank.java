package Atm_machine;

import java.util.Scanner;

class Atm
{
    int bal=1000,wd,dp, opt;
    String str="";
    
    void atm() throws ArithmeticException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1-Deposit");
        System.out.println("2-Withdraw");
        System.out.println("3-Balance Enquiry ");
        System.out.println("4-exit");
        opt=sc.nextInt();
        switch(opt)
        {
            case 1:
 
                System.out.println("Please Enter Amount to deposit");
                dp=sc.nextInt();
                if (dp<500)
                {
                    System.out.println("Please enter more than 500");
                    throw new ArithmeticException ("invalid input");
                }
                else
                {
                bal+=dp;
                System.out.println("Account Balance \n"+bal+"\n");
                //System.out.println();
                }
                //atm();

            case 2:
                    System.out.println("Please Enter Amount to withdraw");
                    wd=sc.nextInt();
                    if(wd>bal) 
                    { System.out.println("insufficient balance ");
                    throw new ArithmeticException ("invalid amount");
                        
                    }
                    else
                    {
                        bal-=wd;
                         System.out.println("Please collect your amount");
                    }
                    //atm();

            case 3:
            	Scanner sc1 = new Scanner(System.in);
                    	System.out.println("enter your password ");
                    	str= sc1.nextLine();
                    	String s1 ="1234";
                        
                        if (str.equals(s1))
                        {
                         System.out.println("Account Balance is  "+bal);   
                        }
                        else {
                            System.out.println("Incorrect Password");
                            throw new ArithmeticException ("invalid password");
                        }
                        sc1.close();
                       // atm();
            case 4:
                System.out.println("Thank you for visiting");
                 System.exit(0);
                break;
           default :
                System.out.println("Invalid input, Please select between 1-4");
                atm();
             
            
        }
   sc.close();
  
    }
}

public class Bank {

	public static void main(String[] args) {
Atm at= new Atm();
at.atm();
	}
}

