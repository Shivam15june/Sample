package Abstractdemo;

public class bikemain {

	public static void main(String[] args) {

		Bike bb = new Bikeimpl();

		bb.brakes();
		bb.headlight();

		Bikeimpl bg = new Bikeimpl();
		bg.speed();
		bg.brakes();
		bg.headlight();
		bg.weight();
		bg.name();
	}
}
