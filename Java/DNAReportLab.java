/*DNA Report Lab
By Andrew Taylor*/

//import java
import java.util.*;
public class DNAReportLab
{
   public static void main (String[]args)
   {
   //Declare a scanner for processing the data
   Scanner read= new Scanner (System.in);
   Random random= new Random();
   DecimalFormat percent= new DecimalFormat("#0%");
   DecimalFormat decimalPer= new DecimalFormat("#0.000");
   String ScientistName;
   int IDNumber;
   String DNA_Strand;
   char initialF;
   
   //Ask the User for their first and last names
   System.out.println("Scientist first and last names:");
   ScientistName= read.nextLine();
   System.out.println("Scientist ID:");
   IDNumber= read.nextInt();
   System.out.println("Please enter the DNA sequence for the report:");
   DNA_Strand= read.next();
   System.out.println("----------------");
   int anIndex= ScientistName.indexOf(' ');
   int len= DNA_Strand.length();
   DNA_Strand= DNA_Strand.toUpperCase();
   String last =ScientistName.substring(anIndex+1);
   System.out.println("Scientist: "+ScientistName.charAt(0)+", " +last);
   System.out.println("ReportID: "+last.charAt(0)+ScientistName.charAt(0)+IDNumber*2);
   System.out.println(last);
   DNA_Strand= DNA_Strand.toUpperCase();
   System.out.println("DNA Sequence: "+DNA_Strand);
   String RNA_Strand=DNA_Strand.replace("T","U");
   System.out.println("RNA Sequence; "+RNA_Strand);
   System.out.println("Stop Codon UGA found at location: "+RNA_Strand.indexOf("UGA"));
   System.out.println("Stop Codon UAG found at location: "+RNA_Strand.indexOf("UAG"));
   System.out.println("Stop Codon UAA found at location: "+RNA_Strand.indexOf("UAA"));
   System.out.println("**Note: location of -1 means codon not found");
   int num1=random.nextInt(5);
   int num2=random.nextInt(len-5)+5;
   String DNA_Sub = DNA_Strand.substring(num1,num2);
   String RNA_Sub = DNA_Sub.replace("T","U");
   System.out.println("The random DNA subsequence is" +DNA_Sub
   +"and the corresponding RNA subsequence is" +RNA_Sub);
   int lenSub=DNA_Sub.length();
   int DNAPercentage = (lenSub/len)*100;
   double DecimalPer=(lenSub/len);
  
   
   System.out.println("This subsequence is "+percentage.format(DNAPercentage)+" of the original");
   System.out.println("In numbers only, this is only "+DecimalPer);
   
   }
}