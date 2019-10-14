
public class Car {
	private int id;
	// example of declaring a constant, something that will never change, so can be public
	public static int Num_wheels = 4;
	private static int objectCount = 0;
	
	//this is an empty constructor- no value has been passed in
	public Car() {
		id = 0;
		objectCount ++;
	}
	//constructor accepting a parameter
	public Car(int i) {
		id = i;
		objectCount ++;
	}
	
	// getter method
	public int getId() {
		return id;
	}
	
	// setter method
	public void setId(int i) {
		id = i;
	}
	
	//toString method
	public String toString () {
		return "Car: id = " + id +",objectCount = " +objectCount;
		
	}
	
	
	
	
	
	
		
	

}
