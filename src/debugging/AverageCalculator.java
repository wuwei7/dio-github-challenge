package debugging;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String[] students = {"Camila", "Lucas", "Bruna", "Pedro"};

        double average = calculateClassAverage(students, scan);

        System.out.printf("Class average %.1f", average);

	}
	
	public static double calculateClassAverage(String[] students, Scanner scanner) {

        double sum = 0;
        for (String student : students) {
            System.out.printf("Student grade %s: ", student);
            double grade = scanner.nextDouble();
            sum += grade;
        }

        return sum / students.length;
    }

}
