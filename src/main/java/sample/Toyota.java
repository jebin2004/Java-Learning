package sample;

public class Toyota {
	private Vehicle vehicle = new Vehicle();
	private Vehicle duplicate = new Vehicle();
	
	public static void main(String[] args) {
		Toyota toyota = new Toyota();
		String make = toyota.getVehicle().getMake();
		toyota.getVehicle().setMake("Yaris");
		make = toyota.getVehicle().getMake();
		System.out.println(make);
		toyota.setDuplicate(new Vehicle());
		make = toyota.getDuplicate().getMake();
		System.out.println(make);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getDuplicate() {
		return duplicate;
	}

	public void setDuplicate(Vehicle duplicate) {
		this.duplicate = duplicate;
	}
	

}
