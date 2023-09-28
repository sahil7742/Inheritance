package sahil;
import sahil.Vehicle;

public class Paramitedconstructor {

	public static void main(String[] args) {
		Bike bike = new Bike("long" , "disel", 4 ,4,45, "on");
		//String steering, String musicSystem, String airConditioner, int container,String engine, int wheels, int seats, int fueltank, String light
		Truck truck = new Truck("right","on","colling", 2, "disel", 8 , 2 ,90,"on");
		//String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,String engine
		//, int wheels, int seats, int fueltank, String light
		Car car = new Car("right", "on" ,"cooling","working", "playing" ,"disel" ,4 ,7,35,"on");
		System.out.println(bike);
		System.out.println(truck);
		System.out.println(car);

	}

}
