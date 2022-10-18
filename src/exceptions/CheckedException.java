package exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {

	public static void main(String[] args) {
		
		String fileName = "blake-crouch-novels.txt";

        try {
            printFileToConsole(fileName);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Please check the name of the file you want to print. " + e.getCause());
            e.printStackTrace();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null,
                    "Unexpected error. Please contact support. " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("With or without exceptions, the program keeps on going...");
    }

	    public static void printFileToConsole(String fileName) throws IOException {
	        File file = new File(fileName);
	
	        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
	        String line = br.readLine();
	
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	        do {
	            bw.write(line);
	            bw.newLine();
	            line=br.readLine();
	        } while (line != null);
	        
	        bw.flush();
	        br.close();

	}

}
