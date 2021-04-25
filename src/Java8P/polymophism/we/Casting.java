package Java8P.polymophism.we;


public class Casting {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		vehicle.getVehicle();

		Casting casting = new Casting();

		casting.testVehicle(vehicle);
		casting.testBus((Bus)vehicle);

		Vehicle vehicle2 = new Vehicle();

		//	This throws runtime exception ClassCastException ! as vehicle2 is object of Vehicle  
//		casting.testBus((Bus)vehicle2);

		Bus bus = new Bus();
		casting.testVehicle(bus);
		
		Vehicle v = (Vehicle)bus;
		
		v.getVehicle();
		
		
	}

	public void testVehicle(Vehicle vehicle) {

		vehicle.getVehicle();
	}

	public void testBus(Bus bus) {

		bus.getBus();
	}

}


class Vehicle{

	public void getVehicle()
	{

		System.out.println("getVehicle()");
	}

}

class Bus extends Vehicle{

	int i =12;

	public void getBus()
	{

		System.out.println("getBus()" + i);
	}

}

class Car extends Vehicle{

	public void getCar()
	{

		System.out.println("getCar()");
	}

}