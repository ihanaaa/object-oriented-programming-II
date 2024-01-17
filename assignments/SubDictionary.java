import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SubDictionary {

	public static void main(String[] args) {
		Scanner sc = null;
		Scanner answer = new Scanner(System.in);
		PrintWriter pw = null; 
		String output = "Sub3Dictionary.txt";
		
		System.out.println("Enter the name of the file to open: ");
		String file = answer.nextLine();
		
		try {
			sc = new Scanner(new FileInputStream(file));
			pw = new PrintWriter(new FileOutputStream(output));
		}
		catch (FileNotFoundException e) {
			System.out.println("\nCould not open input file " + file + " for reading. \r\n"
					+ "Please check that the file exists and is readable. This program will terminate after closing any opened files");
		}
		
		convertDictionary(sc,pw);
		
		answer.close();
	}
	
	
	public static void convertDictionary(Scanner s, PrintWriter p) {
		
		ArrayList<String> words = new ArrayList<String>(10);
		String w = null;
		String temp = null;
		
		while (s.hasNextLine()) {
			while (s.hasNext()) {
				
				w = s.next().toUpperCase();
				
				if (w.contains("?") || w.contains(";") || w.contains(",") || w.contains("!") || w.contains(".") || w.contains(":")) {
					w = w.substring(0, w.length()-1);
					
				}
				
				if (w.contains("=") || w.matches(".*\\d.*") || w.matches("[^aAiI]")) {
					continue;
				}
						
				if (w.contains("’")) {
					w = w.substring(0,w.indexOf('’'));
				}
				
				words.add(w);
				
				}	
		}
		
		for (int i = 0; i < words.size(); i++) {
			for(int j = i+1; j < words.size(); j++) {
				
				if (words.get(i).compareTo(words.get(j)) == 0) {
					words.remove(j);
				}
				
				if (words.get(i).compareTo(words.get(j)) > 0) {
					temp = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		
		p.println("The document produced this sub-dictionary, which includes " + words.size() + " entries." + "\n\n");
		
		for (char c = 'A'; c <= 'Z'; c++) {
			p.println(c + "\n==");
			
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).charAt(0) == c){
				p.println(words.get(i));	
			}
			else {
				continue;
			}
		}
		p.println();
		}
		
		
		s.close();
		p.close();
	}

}

