package sample;
//import java.util.Scanner;

public class Methods {
	private String colour;
	static int age = 28;
	
	public String getColour(){
		return colour;
	}

	private static void helloWorld(String name){
//		System.out.println("Name ;");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		sc.close();
		System.out.println("Hello " + name);
	}
	public static void getHelloWorld(String name){
		helloWorld(name);
	}
	public static void main(String[] args) {
		Methods.helloWorld("David");
		getHelloWorld("Jebin");
	}	
	
}
