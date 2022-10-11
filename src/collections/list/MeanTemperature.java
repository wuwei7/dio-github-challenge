package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MeanTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Double> temps = new ArrayList<>();
		
		int i = 0;
		while (true) {
			if (i == 2) {
				break;
			}
			System.out.print("Input temperature: ");
			double temp = Double.valueOf(scanner.nextLine());
			temps.add(temp);
			i++;
		}
		
		Iterator<Double> iterator = temps.iterator();
		double next = 0.0;
		double sum = 0.0;
		while (iterator.hasNext()) {
			next = iterator.next();
			sum += next;
		}
		
		double meanTemp = sum / temps.size();
		System.out.println("Mean temperature: " + meanTemp);
		if (next > meanTemp) {
			System.out.println("Temperature above mean: " + next);
		}
		
		
		System.out.println("Temperatures: " + temps);

	}

}
