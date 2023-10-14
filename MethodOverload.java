package com.kodnest.Methods.Level1;

public class MethodOverload {

	public static void main(String[] args) {
		//getBill();
		getBill(4, 40);
		//getBill(4, "Masala chai");
	}

	static void getBill() {
		System.out.println("bill-1");
	}

	static void getBill(long a, byte b) {
		System.out.println("bill_2");
	}

	static void getBill(int quantity, String type) {
		System.out.println("Bill-3");
	}

	static void getBill(double a, int b) {
		System.out.println("Bill-4");
	}
}
