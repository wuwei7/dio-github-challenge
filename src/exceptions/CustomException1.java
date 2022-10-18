package exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CustomException1 {

	public static void main(String[] args) {
		
		String fileName = JOptionPane.showInputDialog("Name of the file: ");

		printFileToConsole(fileName);
        System.out.println("With or without exceptions, the program keeps on going...");
    }

    public static void printFileToConsole(String fileName) {

        try {
            BufferedReader br = readFile(fileName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossibleToOpenFileException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Unexpected error. Please contact support." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader readFile(String fileName) throws ImpossibleToOpenFileException {

        File file = new File(fileName);
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new ImpossibleToOpenFileException(file.getName(), file.getPath());
        }
    }
}

class ImpossibleToOpenFileException extends Exception {

	private String fileName;
    private String directory;

    public ImpossibleToOpenFileException(String fileName, String directory) {
        super("The file " + fileName + " cannot be found in " + directory);
        this.fileName = fileName;
        this.directory = directory;
    }

    /*@Override
    public String toString() {
        return "ImpossibleToOpenFileException {" +
                "fileName='" + fileName + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }*/
}

