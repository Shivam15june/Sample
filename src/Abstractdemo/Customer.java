package Abstractdemo;

public class Customer extends Car {

	@Override
	public void speed() {
		System.out.println("Speed is 300 km/h");

	}

	@Override
	public void gears() {

		System.out.println("5 gear");
	}

}
