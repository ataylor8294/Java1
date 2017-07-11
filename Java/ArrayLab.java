/*Array Lab
By Andrew Taylor*/

import java.util.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ArrayLab extends JFrame 
{
ArrayLab(String title)
	{
	   super(title);
	   setSize(400,400);
	   setVisible(true);
	   
	}
int count;
int countA;
int countT;
int countG;
int countC;
public static void main(String[]args) throws IOException  
   {
   String inputString=JOptionPane.showInputDialog( null,"From which file would you like to read you DNA strand?");
   File inputFile=new File(inputString);
   Scanner read=new Scanner(inputFile);
   int count=0;
   int countA=0;
   int countT=0;
   int countG=0;
   int countC=0;
   while( read.hasNext())
   {
   count++;
   }
   char[]array=new char[count];
   while (read.hasNext())
   {
   for (int i=0;i<count;i++)
   {
   if (array[i]=='A'||array[i]=='a')
   {
   countA++;
   }
   else if(array[i]=='T'||array[i]=='t')
   {
   countT++;
   }
   else if(array[i]=='G'||array[i]=='g')
   {
   countG++;
   }
   else if(array[i]=='C'||array[i]=='c')
   {
   countC++;
   }
   }
   }
   }
public void paint (Graphics g)
	{
	 super.paint( g);
    g.drawLine(30, 250, 399, 250);
    g.drawLine(30, 250, 30, 0);
    g.drawString("80", 10,10);
    g.drawString("70", 10,40);
    g.drawString("60", 10,70);
    g.drawString("50", 10,100);
    g.drawString("40", 10, 130);
    g.drawString("30", 10, 160);
    g.drawString("20", 10, 190);
    g.drawString("10", 10, 220);
    g.drawString("0", 10, 250);
    double APerc=(countA/count)*100;
   }
}
