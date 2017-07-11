/* Bar Chart Lab
By Andrew Taylor*/

import java.util.*;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class BarChartLab extends JApplet
{
   public void paint(Graphics g)
   {
    super.paint(g);
    //Declare a scanner for imputting the data
    Scanner read=new Scanner(System.in);
      
    //Ask for five daily temperature for the five weekdays
    System.out.println("Please enter the ice cream sales for the Monday");
    int mon;
    mon= read.nextInt();
    System.out.println("Please enter the ice cream sales for the Tuesday");
    int tue;
    tue=read.nextInt();
    System.out.println("Please enter the ice cream sales for the Wednesday");
    int wed;
    wed=read.nextInt();
    System.out.println("Please enter the ice cream sales for the Thursday");
    int thu;
    thu=read.nextInt();
    System.out.println("Please enter the ice cream sales for the Friday");
    int fri;
    fri=read.nextInt();
    
    //Create the x and y axis
    g.drawLine(30, 250, 399, 250);
    g.drawLine(30, 250, 30, 0);
    //Create the variable of temperature along the y axis
    g.drawString("80", 10,10);
    g.drawString("70", 10,40);
    g.drawString("60", 10,70);
    g.drawString("50", 10,100);
    g.drawString("40", 10, 130);
    g.drawString("30", 10, 160);
    g.drawString("20", 10, 190);
    g.drawString("10", 10, 220);
    g.drawString("0", 10, 250);
    //Create the varible of Days along the x axis
    g.drawString("Mon", 33,280);
    g.drawString("Tue", 100,280);
    g.drawString("Wed", 170,280);
    g.drawString("Thu", 240,280);
    g.drawString("Fri", 310,280);
    //Set the graph for monday
    Color Icecream=new Color(0,125,255);
    g.setColor(Color.YELLOW);
    g.fillRect(33,250-mon*3,30,mon*3);
    //Set the graph for tuesday
    g.setColor(Color.BLUE);
    g.fillRect(80,250-tue*3,30,tue*3);
    //set the bar graph for wednesday
    g.setColor(Color.GREEN);
    g.fillRect(150,250-wed*3,30,wed*3);
    //set the bar graph for thursday
    g.setColor(Color.RED);
    g.fillRect(220,250-thu*3,30,thu*3);
    // set the bar graph for Friday
    g.setColor(Color.ORANGE);
    g.fillRect(290,250-3*fri,30,fri*3);
    
    //Create illustration for ice cream cone
    Polygon triangle=new Polygon();
    triangle.addPoint(360,200);
    triangle.addPoint(370,170);
    triangle.addPoint(350,170);
    g.setColor(Color.ORANGE);
    g.fillPolygon(triangle);
    //Create illustration for ice cream on the cone
    Polygon pentagon=new Polygon();
    pentagon.addPoint(350,170);
    pentagon.addPoint(370,170);
    pentagon.addPoint(370,130);
    pentagon.addPoint(360,125);
    pentagon.addPoint(350,130);
    g.setColor(Icecream);
    g.fillPolygon(pentagon);
    //Create spoon
    Polygon heptagon=new Polygon();
    heptagon.addPoint(360,125);
    heptagon.addPoint(370,120);
    heptagon.addPoint(365,115);
    heptagon.addPoint(365,80);
    heptagon.addPoint(355,80);
    heptagon.addPoint(355,115);
    heptagon.addPoint(350,120);
    g.drawPolygon(heptagon);
    
     
    
    
   
   
   }
}