package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.*;

public class TextfromURL {
	
	public static void WriteURLtoFile(String filename, String content)
		throws IOException{
		PrintWriter out = new PrintWriter(filename);
		out.println(content);
		out.close();
	}
	
	public static void main(String args[]) throws IOException{
		URL url = new URL("http://www.math.com/students/calculators/source/basic.htm");
		Document doc = Jsoup.connect(url.toString()).get();
		String title = doc.title();
		String text = doc.text();
		System.out.println(text);
		WriteURLtoFile("NYT.txt",doc.text());
	}
	
}
