import java.util.*;
import java.io.*;
import java.*;

class Wel extends ExamTest
{   
	//String name;
	public void pas(String a,String b,String name)
	{
		String USER_NAME,PASSWORD;
            
            try {
         
         BufferedReader in = new BufferedReader (new FileReader("password.txt"));
         String str;
         String []cpy=new String[2];
         int j=0;
         while ((str = in.readLine()) != null) {
         	cpy[j]=str;
         	//System.out.println(str);
             j++;

            }
         //System.out.println("-------*****///"+cpy[0]+cpy[1]);
         USER_NAME=cpy[0];
         PASSWORD=cpy[1];
         if(a.equals(USER_NAME)&&b.equals(PASSWORD))
		{
			System.out.println("Student Authenticated .. ");
			// start exam
			System.out.println("START EXAM");
			System.out.println("----------------------------------------------------------");
            System.out.println("Rules:: \n Should answer after only displaying its corresponding question");
			ExamTest k = new ExamTest();
			k.exam(name);
			
		}
		
		else
		{
			System.out.println("Authenticated  Failed..!");
		}
         }
         catch (IOException e) {
         }


		
	}
   public void pas(String a,String b)
	    {
		if(a.equals("sir")&&b.equals("sir"))
		{
			System.out.println("FACULTY Authenticated .. ");
			Faculty f = new Faculty();
			f.Fac();
        }
		else
			System.out.println(" FACULTY  Authenticated  Failed..!");
	   }	
}
class Welcome extends Wel
{  
    Welcome()
    {
    	System.out.println("Welcome");
    }

   public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String username,password;
		System.out.println("LOGIN PAGE");

		int op,l;
		System.out.println("1->STUDENT   2->FACULTY 3->Results");
		op=input.nextInt();
		switch(op)
		{
			case 1 :{
				System.out.println("enter your name:");
			    String name;
			    name=input.nextLine();
			    name=input.nextLine();
				System.out.print("USERNAME :");
		        username=input.nextLine();
		       
		        System.out.print("PASSWORD :");
		        password=input.nextLine();

		        Welcome w = new Welcome();
		        w.pas(username,password,name);
			}break;
			case 2 :{

				System.out.print("USERNAME :");
               // l=input.nextInt();
               // System.out.println("chek122");
		        username=input.nextLine();
		        username=input.nextLine();
		        
		        System.out.print("PASSWORD :");
		        password=input.nextLine();

		        Welcome ww = new Welcome();
		        ww.pas(username,password);
			}break;
			case 3 :{
				try {
                BufferedReader in = new BufferedReader (new FileReader("results.txt"));
                String str;
                while ((str = in.readLine()) != null) {
                	System.out.println(str);
                }
            }

                 catch (IOException e) {
                        }

			}break;
			default:System.out.println("CHOOSE THE CORRECT OPTION");

		}
	}	
}    
		