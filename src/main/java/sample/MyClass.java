package sample;

public class MyClass {
	public int length = 7;
	public int width;
	public String name;
	
	public MyClass(){
		
	}
	public MyClass(int length){
		this.length = length;
	}
	
	public MyClass(int length, int width, String val){
		this.length = length;
		this.width = width;
		this.name = val;
	}

	public static void printHelloWorld(){
		System.out.println("Hello World 1gd23");
	}
	
	public void buildApps(){
		System.out.println("tuttu potti");
	}
	
}
