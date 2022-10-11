package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MeanTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Double> temps = new ArrayList<>();
		
		int i = 1;
		while (true) {
			if (i == 7) {
				break;
			}
			System.out.print("Input temperature " + i + ": ");
			double temp = Double.valueOf(scanner.nextLine());
			temps.add(temp);
			i++;
		}
		
		Iterator<Double> iterator = temps.iterator();
		double sum = 0.0;
		while (iterator.hasNext()) {
			double nextTemp = iterator.next();
			sum += nextTemp;
		}
		
		double meanTemp = sum / temps.size();
		System.out.println("Mean temperature: " + meanTemp);
		
		// Shows which months had above mean temperature, if any.
		Iterator <Double> iterator1 = temps.iterator();
		System.out.println("Months with above mean temperature:");
		int counter = 0;
		while (iterator1.hasNext()) {
			int counterNoMean = 0;
			double temp = iterator1.next();
			if (temp > meanTemp) {
				if (counter == 0) {
					System.out.println("January: " + temp);
					counterNoMean++;
				} else if (counter == 1) {
					System.out.println("February: " + temp);
					counterNoMean++;
				} else if (counter == 2) {
					System.out.println("March: " + temp);
					counterNoMean++;
				} else if (counter == 3) {
					System.out.println("April: " + temp);
					counterNoMean++;
				} else if (counter == 4) {
					System.out.println("May: " + temp);
					counterNoMean++;
				} else if (counter == 5) {
					System.out.println("June: " + temp);
					counterNoMean++;
				}
			}
			
			counter++;
			
			if (counter == 6 && counterNoMean == 0) {
				System.out.println("No months with above mean temperature.");
			}
		}
		
		scanner.close();
	}
}
