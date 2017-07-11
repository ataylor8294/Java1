/*Array Lab
By Andrew Taylor*/

import java.util.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;

public class ArrayLab 
{
String dnasequence;
ArrayLab(String title)
	{
	   super(title);
	   setSize(400,400);
	   setVisible(true);
	   
	}
public static void main(String[]args)  
   {
   Scanner read=new Scanner(System.in);
   System.out.println("What is the size of your array?");
   int arraysize= read.nextInt();
   System.out.println("Please enter your numbers");
   int[]array=new int[arraysize];
   int[]doublearray=new int[arraysize];
   for (int i=0;i<arraysize;i++)
   {
   array[i]=read.nextInt();
   doublearray[i]=array[i]*2;
   System.out.println(+array[i]+"   "+doublearray[i]);
   }
   }
}