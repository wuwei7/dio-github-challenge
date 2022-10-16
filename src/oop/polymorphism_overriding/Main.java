package oop.polymorphism_overriding;

public class Main {

	public static void main(String[] args) {
		
		ParentClass[] classes = new ParentClass[] {new ParentClass(), new ChildClass1(), new ChildClass2()};

		for (ParentClass class_ : classes) {
			class_.method1();
		}
		
		System.out.println("");
		
		for (ParentClass class_ : classes) {
			class_.method2();
		}
		
		System.out.println("");
		
		ChildClass2 childClass2 = new ChildClass2();
		childClass2.method2();
	}

}
