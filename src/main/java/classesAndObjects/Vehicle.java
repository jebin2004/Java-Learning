package classesAndObjects;

public class Vehicle {
	private String colour;
	
	public String getColour(){
		return colour;	
	}
	public void setColour(String c){
		this.colour = c;
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setColour("Yellow");
		System.out.println(v1.getColour());
		
	}
}
