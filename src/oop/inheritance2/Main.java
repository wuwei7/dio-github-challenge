package oop.inheritance2;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		// Upcasting
		Employee cleaner = new Cleaner();
		Employee salesperson = new Salesperson();
		Employee manager = new Manager();
		
		// Downcasting
		Salesperson salesperson_ = (Salesperson) new Employee();
	}

}
