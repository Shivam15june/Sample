package Scannerdemo;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("USername=:");

		String username = sc.next();

		System.out.println("Pin=:");

		int pin = sc.nextInt();

		if (username.equals("Shivam") && pin == 1234) {
			System.out.println("Welcome!!!");
		} else if (username.equals("Abhijit") && pin == 2345) {
			System.out.println("Welcome!!!");
		}

		else {
			System.out.println("Incorrect credentials");
		}

	}

}
