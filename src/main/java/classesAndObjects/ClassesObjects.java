package classesAndObjects;

public class ClassesObjects {
	int speed;
	int wheel = 4;
	String colour;
	static int x;

	void bark(){
		System.out.println("Woof-Woof");
	}
	
	public static void main(String[] args) {
		ClassesObjects dog = new ClassesObjects();
		dog.bark();
		dog.bark();
		//int y = x;
	}

}
