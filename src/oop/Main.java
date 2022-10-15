package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Object created with a no-argument constructor
		Car car1 = new Car();
		
		car1.setMaker("Fiat");
		car1.setModel("Uno");
		car1.setColor("black");
		car1.setTankCapacity(48);
		
		System.out.println("Maker: " + car1.getMaker());
		System.out.println("Model: " + car1.getModel());
		System.out.println("Color: " + car1.getColor());
		System.out.println("Tank capacity: " + car1.getTankCapacity() + "L");
		
		System.out.print("How much does a liter of gas cost? ");
		double gasPrice = Double.valueOf(scanner.nextLine());
		double fullTankPrice = car1.fillTank(gasPrice);
		System.out.println("It costs $" + fullTankPrice + " to fill up a " + car1.getMaker() + " " + car1.getModel() + ".");
		
		// Object created with a parameterized constructor
		Car car2 = new Car("BMW", "M5", "red", 76);
		
		fullTankPrice = car2.fillTank(gasPrice);
		System.out.println("It costs $" + fullTankPrice + " to fill up a " + car2.getMaker() + " " + car2.getModel() + ".");

		scanner.close();
	}

}
