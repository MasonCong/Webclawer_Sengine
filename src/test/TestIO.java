package test;
import java.io.*;
import java.util.*;

public class TestIO {
	   public static void main(String args[]) throws IOException{
		   String filename = "com/File0.txt";
		   FileReader fr = new FileReader(filename);
		   BufferedReader br=new BufferedReader(fr);
		   char buff[]= new char[6763];
		   br.skip(3492630 );
		   br.read(buff,0,6763);
		   System.out.println(buff);
	   }
	
	   public static void main2(String args[]) throws IOException
	   {
		  String filename = "output.txt";
		  FileWriter fw = new FileWriter(filename,true); 
	      BufferedWriter bw=new BufferedWriter(fw);
		  String str1="The First Line";
		  System.out.println(str1.length());
		  int l1=str1.length();
		  bw.write(str1);
		  
		  String str2="The second Line";
		  System.out.println(str2.length());
		  int l2=str2.length();
		  bw.write(str2);
		  
		  String str3="The Third Line";
		  System.out.println(str3.length());
		  int l3=str3.length();
		  bw.write(str3);
		  
		  String str4="The Fourth Line";
		  System.out.println(str4.length());
		  int l4=str4.length();
		  bw.write(str4);
		  
		  
		  bw.close();
		      
		  FileReader fr=new FileReader(filename);
		  BufferedReader br=new BufferedReader(fr);
		  char[] buff = new char[l1];
		  br.read(buff,0,l1);
		  System.out.println(buff);
		  buff = new char[l2];
		  br.read(buff,0,l2);
		  System.out.println(buff);
		  buff = new char[l3];
		  br.read(buff,0,l3);
		  System.out.println(buff);
		  buff = new char[l4];
		  br.read(buff,0,l4);
		  System.out.println(buff);
 
		   
	   }
	
	   public static void main1(String args[]) throws IOException
	   {
	      String filename = "output.txt";
	      FileWriter fw = new FileWriter(filename,true);
	      BufferedWriter br=new BufferedWriter(fw);
	      br.newLine();
	      br.write("The Fourth Line");
	      br.close();
	   }
	   
}
