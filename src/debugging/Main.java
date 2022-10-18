package debugging;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Started main method.");
        a();
        System.out.println("Finished main method.");

	}
	
	static void a() {
        System.out.println("Entered method a.");
        b();
        System.out.println("Finished method a.");
    }

    static void b() {
        System.out.println("Entered method b.");
        for (int i = 0; i <= 4; i++) {
        	System.out.println(i);
        }
        c();
        System.out.println("Finished method b.");
    }

    static void c(){
        System.out.println("Entered method c.");
        Thread.dumpStack();
        System.out.println("Finished method c.");
    }

}
