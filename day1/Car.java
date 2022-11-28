package week1.day1;

public class Car {
	//global variables : declared within the class and outside all the methods of that class.
	public byte noOfWheels = 4;
    short fuelCapacity = 250;
	int currentPrice = 50000;
	long newCarPrice = 6000000000L;
	float kmsRan = 122222.456f;
	double carDepValue = 400.323;
	boolean isPunctured = false;
	char fuelType = 'P';
	String brandName = "TATA";
	
	
	public void driveCar() {
		
	 System.out.println("Driving a Car");
	 System.out.println(isPunctured);

	}
	
	public void applyBreak() {
		System.out.println("Applying break");
		System.out.println(carDepValue);

	}
    public static void main(String[] args) {
	
    	
    	//ClassName objectName = new ClassName();
    	Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBreak();
		
	}
}
