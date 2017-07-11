/* While Loop and Animation lab 
By Andrew Taylor*/

import java.util.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;


public class WhileAnimationLab extends JFrame
{
int X;
int Y; 
int IDIAMETER;
int Spacer;
int Spacer2;
int DIAMETER;
int radius;
int color;
Color COLOR;


WhileAnimationLab(String title)
	{
	   super(title);
	   setSize(400,400);
	   setVisible(true);
	   
	}
   {
   Scanner read=new Scanner(System.in);
   System.out.println("Please enter a interger for a radius of a baloon between 20 and 50");
   radius=read.nextInt();
   while (radius<20||radius>50)
   {
   System.out.println("The radius must be between 20 and 50. Please enter a correct radius");
   radius=read.nextInt();
   }
   Random random=new Random();
	color=random.nextInt(5-1+1)+1;
   IDIAMETER=2*radius;
	}
	public void paint (Graphics g)
	{
	super.paint(g);
   switch (color)
   {
   case 1:
   COLOR=Color.BLUE;
   break;
   case 2:
   COLOR=Color.GREEN;
   break;
   case 3:
   COLOR=Color.ORANGE;
   break;
   case 4:
   COLOR=Color.RED;
   break;
   case 5:
   COLOR=Color.MAGENTA;
   break;
   }
   
   DIAMETER=IDIAMETER;
   while(DIAMETER<(3*IDIAMETER))
   { 
   Spacer=5;
   Spacer2=10;
   g.fillOval((100-(radius/2)),((100-(radius/2))+(radius/14)),radius,radius);
	g.setColor(COLOR);
   radius=radius+2;
   DIAMETER=DIAMETER+4;
	 try
     {
       Thread.sleep( (int)( .05 * 1000 ) );
		 
     }
     catch ( InterruptedException e )
     {
       e.printStackTrace( );
     }
   
   }
   g.fillOval((100-(radius/2)),((100-(radius/2))+(radius/14)),radius,radius);

   }
public static void main(String[] args)
	{
	WhileAnimationLab Animation = new WhileAnimationLab("WhileAnimationLab");
	Animation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}