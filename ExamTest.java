import java.io.*;
import java.util.*;

class Results{
  Results()
  {}
    void Answers(char a[],int count,String name){
      char[] arr=new char[100];
      int c=count;
      int marks=0;
      

      for(int i=0;i<c;i++)
      {
         arr[i]=a[i];
      }
       try {
         
         BufferedReader in = new BufferedReader (new FileReader("answers.txt"));
         String str;
         int j=0;
         while ((str = in.readLine()) != null) {
            char p=str.charAt(0);
            if(p==arr[j])
                    marks++;
            
            j++;
         }
          String k=("results of" + name + "::" + marks + "/" + c);
          System.out.println(k);
          File results = new File("results.txt");
           try {
         BufferedWriter output = new BufferedWriter(new FileWriter(results,true));
         output.write(k);
         output.newLine();
         //output.flush();
          output.close();
         }
         catch (IOException e) {
           }
          
         }
         catch (IOException e) {
         }
   }
}

public class ExamTest extends Results {
   ExamTest(){
   }
   public static void exam(String name)  {
     // String name=name;
      char[] ans = new char[100];
      int i=0,count=0;
      Scanner input = new Scanner(System.in);
      

      try {
         BufferedReader in = new BufferedReader (new FileReader("questions.txt"));
         String str;
         while ((str = in.readLine()) != null) {
            if(str.equals("end")){
                   ans[i]=input.next().charAt(0);
                    i++;
                    count++;
            }
               
           else{
              System.out.println(str);
            }
           // else
            //System.out.println("+");
         }

         System.out.print("answers.............!");
         for(i=0;i<10;i++)
            System.out.print( ans[i]);
            System.out.print("\n");
         ExamTest e=new ExamTest();
         e.Answers(ans,count,name);

         
         
            
         
         //System.out.pri  ntln(str);
         }
         catch (IOException e) {
         }
      }

   
}