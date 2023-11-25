package Abstractdemo;

public class Bikeimpl extends RacingBike implements Bike, Superbike {

	@Override
	public void headlight() {
		System.out.println("This bike has headlights");

	}

	@Override
	public void brakes() {
		System.out.println("This bike has disc brakes");

	}

	@Override
	public void speed() {
		System.out.println("Speed is 500 km/h");

	}

	@Override
	public void weight() {
		System.out.println("Wieght is 170 kg");

	}

	@Override
	public void name() {
		System.out.println("Ninja");

	}

}
