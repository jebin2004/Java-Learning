package classesAndObjects;

import java.util.Scanner;

public class Methods {
	
	static void helloworld(String name){
		System.out.println("Hello " + name);
	}
	public static void main(String[] args){
		Scanner jj = new Scanner(System.in);
		String name = jj.nextLine();
		jj.close();
		helloworld("Jebin");
		helloworld(name);

	}
	
	
}
