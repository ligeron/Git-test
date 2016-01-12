import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileRead {
	static String[][] m = new String[6][3]; 
	static Scanner scn;
	
	static Formatter frm ;
	static Scanner scnIn ;
	
	public static void main(String args[]) {
		openFile();
		readFile();
		out();
		formater();
		
	}

	private static void formater() {
		try {
		 frm = new Formatter("res//1.txt");
		 scnIn = new Scanner(System.in);
		System.out.println("Add new friend name?");
		String s  = scnIn.next();
		frm.format("%s", s);
		frm.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void out() {
		
		for(int row=0;row<m.length;row++)
		{
			for (int col = 0; col < m[row].length; col++) {
				System.out.print(m[row][col]+"  ");
			}
			System.out.println();
		}
	}

	private static void readFile() {
		
		for(int row=0;row<m.length;row++)
		{
			for (int col = 0; col < m[row].length; col++) {
				if(scn.hasNext())
				{
					m[row][col] =scn.next();
				}
			}
		}
	}

	private static void openFile() {
		try {
			scn = new Scanner(new File("res//1.txt"));
		} catch (FileNotFoundException e) {JOptionPane.showMessageDialog(null, "File not found");}
		
	}

}
