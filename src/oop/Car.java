package oop;

public class Car {
	
	private String maker;
	private String model;
	private String color;
	private int tankCapacity;
	
	public Car() {}
	
	public Car(String maker, String model, String color, int tankCapacity) {
		this.maker = maker; 
		this.model = model;
		this.color = color;
		this.tankCapacity = tankCapacity;
	}
	
	public double fillTank(double gasPrice) {
		return tankCapacity * gasPrice;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	public int getTankCapacity() {
		return tankCapacity;
	}
	
}
