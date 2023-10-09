import java.util.Random;
import java.util.Scanner;
class Task1
{
   public static void main(String args[])
    {
         Random r=new Random();
         Scanner sc=new Scanner(System.in);
         int result=r.nextInt(100)+1;
         int score=0;
         for(int i=0;i<2;i++)
         {
         System.out.println("Enter the Number from 1-100: ");
         int num=sc.nextInt();
         if(num>result)
         { 
            System.out.println("Number Entered by user is High");
            score++;
         }
         else if(num<result)
         {
            System.out.println("Number Entered by user is Low");
             
         }
         else
         {
             System.out.println("Entered Number Matched");
             
         }
         //System.out.println(result);
         
         }
          System.out.println("Score: "+score);
    }
}
      



