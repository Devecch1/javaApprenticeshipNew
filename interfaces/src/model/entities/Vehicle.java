package model.entities;

public class Vehicle {

	private String model;

	public Vehicle(){ // CONSTRUTOR SEM ARGUMENTO
	}
	
	public Vehicle(String vehicle) { // CONSTRUTOR COM ARGUMENTO
		this.model = vehicle;
	}

	public String getVehicle() {
		return model;
	}

	public void setVehicle(String vehicle) {
		this.model = vehicle;
	}
	
	

}
