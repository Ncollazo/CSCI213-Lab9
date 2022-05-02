/**
Car.java 
CSCI 213 
Lab 9   
Natalia Collazo 
Prof. Givens  
**/ 

public class Car extends Vehicle{
		
	private int door; 
	private int pass; 

	public Car(String theMake, String theModel, String thePlate, int theDoor, int thePassenger){
		super(theMake,theModel, thePlate); 
		this.door = theDoor; 
		this.pass = thePassenger; 
	}
	public int getDoors() 
		return this.door;
	} 
	
	public int getPassengers() {
		return this.pass;
	}
	
	public String toString() {
		String result = "";
		int door = this.door; 
		String result  = String.format("%d-doors %s %s with license %s.", door, getMake(), getModel(), getPlate());
		return result; 
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Car) 
			return false; 
		
		Car otherCar = (Car) other;
		
		return this.door == otherCar.getDoors && super.equal(obj);
		
	}
	
	public Car copy(){
		Car theCopy = new Car(this.getMake(), this.getModel(), this.getPlate(), this.door, this.pass);
		return theCopy;
	
	}
	