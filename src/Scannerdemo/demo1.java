package Scannerdemo;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("User can vote");
		} else {
			System.out.println("User can not vote");
		}

	}

}
