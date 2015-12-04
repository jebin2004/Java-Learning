package app;

import sample.MyClass;

public class Application {
	public static void main(String[] args) {
		MyClass.printHelloWorld();
		MyClass sample = new MyClass();
		sample.buildApps();
		
		MyClass sample2 = new MyClass(4,5,"jebin");
		sample2.buildApps();
	}
}
