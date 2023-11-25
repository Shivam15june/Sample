package Abstractdemo;

public class mainclass {

	public static void main(String[] args) {
		Car cc;
		cc = new Customer();

		cc.speed();
		cc.gears();
		cc.price();

		System.out.println("***********");

		cc = new Customer1();
		cc.speed();
		cc.gears();
		cc.price();

		System.out.println("*******************");

		Car cd = new Customer1();

		cd.gears();
		cd.speed();
		cd.price();
	}

}
