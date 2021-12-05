import java.io.*;
import java.util.*;

 class Ans{
  public void Answ()
   {
      System.out.println("enter the answers and end at last");
      try {
         BufferedWriter output = new BufferedWriter(new FileWriter("answers.txt"));
         String answers="";
         int n=0;
         String op="";
         Scanner qs=new Scanner(System.in);
            while(!(answers.equals("end")))
            {
               answers=qs.nextLine();
              output.write(answers);
              output.newLine();
            } 
         output.close();
         System.out.println("Answers File created successfully");
      
     }
      catch (IOException e) {
      }
      
   }

   
}
 //abstract public void Answ();

public class Faculty {
   public static void Fac()  {
      int o,count=0;
      Scanner input = new Scanner(System.in);
      System.out.println("-------------------------------------------------------------");
      System.out.println("Rules");
      System.out.println("Can Write the questions or Upload the File with file name <questions.txt>");
      System.out.println("After entry of every question,Should enter Word <end>");
      System.out.println("Answers should be entered by the faculty");
      System.out.println("Answers should set the username and password for examination");
      System.out.println("-------------------------------------------------------------");
      System.out.println("enter 1->enter questions 2->enter answers to uploaded file\n 3->set the password for exam");
      o=input.nextInt();
     if(o==1)
     {
          try {
         BufferedWriter output = new BufferedWriter(new FileWriter("questions.txt"));
        //System.out.println("hello");
         String questions="";
         int n=0;
         String op="";
         Scanner qstn=new Scanner(System.in);
         while(!(op.equals("n")||op.equals("N"))){
            while(!(questions.equals("end")))
            {
               questions=qstn.nextLine();
              // questions=output.writeline();

              output.write(questions);
              output.newLine();
            }
            questions="";
              //output.write("\n");
              System.out.println("enter another question NO->n/N ");
              op=qstn.nextLine();
              count++;
         }
         output.close();
         System.out.println("QUESTIONS File created successfully");
         o=2;

      }
      catch (IOException e) {
      }
     }
     if(o==2)
     {
      Ans aa = new Ans();
      aa.Answ();
     }
     if(o==3)
     {
      Scanner q=new Scanner(System.in);
       System.out.println("enter the username");
       String username=q.nextLine();
       System.out.println("enter the password");
       String password=q.nextLine();
      try {
         BufferedWriter output = new BufferedWriter(new FileWriter("password.txt"));
    
              output.write(username);
              output.newLine();
              output.write(password);
         output.close();
         System.out.println("password File created successfully");
      
     }
      catch (IOException e) {
      }
     }
}
}