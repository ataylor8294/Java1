/*Password lab (If-else)
By Andrew Taylor*/

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class PasswordLab
{
   public static void main( String[]args)
   {
   System.out.println("What strength would you like your password?");
   System.out.println("5-6: recommended for online purchase accounts");
   System.out.println("7-8: recommended for social media");
   System.out.println("9-10: recommended for banks, credit cards");
   Scanner read=new Scanner(System.in);
   Random random= new Random();
   int passwordStrength= read.nextInt();
   if (passwordStrength<5||passwordStrength>10)
      {
      passwordStrength= random.nextInt(10-5+1)+5;
      System.out.println("Your choice was out of bounds, strength has been set to "+passwordStrength);
      }
   System.out.println("What is your username (it must be an email address)");
   String username= read.next();   
   int addressIndex= username.indexOf('@')+1;
   int perIndex= username.indexOf('.')+1;
   int len= username.length();
   if (addressIndex>1&&perIndex-addressIndex>1&&len-perIndex==3)
      {
      System.out.println("Thank you. Please enter your password");
      String password=read.next();
      int passlen= password.length();
      int dIndex= password.indexOf('0','1','2','3','4','5','6','7','8','9');
      }
   else 
      {
      System.out.println("Account creation not completed. Error in username");
      }
   
   
   }
}