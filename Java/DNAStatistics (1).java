/* DNA Stats Lab
By Andrew Taylor*/

//import java 
import java.util.*;
public class DNAStatistics
{
	public static void main (String[]args)
	{
	//Declare a scanner for processing data 
	Scanner read= new Scanner (System.in);
	//Enter a String to hold the DNA Sequence
	String DNA_Strand;
	
	
	
	//Ask for a DNA strand from the user and input the data
	System.out.println("Please enter the DNA strand you wish to analyze");
	DNA_Strand= read.next();
	
	//Make the strand so that all values are uppercase
	DNA_Strand= DNA_Strand.toUpperCase();
	
	//Allow the program to create a length for the inputted DNA strand
	int len= DNA_Strand.length();
	
	//Print out the inputted sequnce along with the length of the sequence
	System.out.println("Thank you. I have" +DNA_Strand + "with a length of"+len);
	
	
	
	//Find the first value of each letter in the sequence
	//Find first value at A and Print
	int indexA=DNA_Strand.indexOf('A');
	System.out.println("The first A is at index"+indexA);
	
	//Find first value of T and Print
	int indexT=DNA_Strand.indexOf('T');
	System.out.println("The first T is at index"+indexT);
	
	//Find first value of C and Print
	int indexC=DNA_Strand.indexOf('C');
	System.out.println("The first C is at index"+indexC);
	
	//Find first value of G and Print
	int indexG=DNA_Strand.indexOf('G');
	System.out.println("The first G is at index"+indexG);
	
	
	
	// Creatte input identifiers for the amoumt of each letter in the sequence
	int DNA_A, DNA_G, DNA_C, DNA_T;
	//Ask for the amount of As and read
	System.out.println("Please enter the number of As");
	DNA_A= read.nextInt();
	
	//Ask for the amount of Gs and read
	System.out.println("Please enter the number of Gs");
	DNA_G= read.nextInt();
	
	//Ask for the amount of Cs and read
	System.out.println("Please enter the number of Cs");
	DNA_C= read.nextInt();
	
	//Ask for the amount of Ts and read
	System.out.println("Please enter the number of Ts");
	DNA_T= read.nextInt();
	
	
	
	//Find the percentage of each letter in the DNA sequence
	double BaseA=(double)100*DNA_A/len;
	double BaseB=(double)100*DNA_G/len;
	double BaseC=(double)100*DNA_C/len;
	double BaseD=(double)100*DNA_T/len;
	
	// Print out the percentage of representation of each Base
	System.out.println("Base          %Representation");
	System.out.println("----          ---------------");
	System.out.println("A:"+          BaseA);
	System.out.println("B:"+          BaseB);
	System.out.println("C:"+          BaseC);
	System.out.println("D:"+		    BaseD);
	
	
	
	
	}
}











