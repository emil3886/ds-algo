package com.emil.org.ds.algo.arrays;

//reverse a string
public class Example3 {

	private static String reverse(String input) {
		char[] charArray = input != null ? input.toCharArray() : new char[] {};
		String reverse = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse = reverse.concat(String.valueOf(charArray[i]));
		}

		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("Reverse of Emil : " + reverse("Emil"));
		System.out.println("Reverse of null : " + reverse(null));
		System.out.println("Reverse of Malayalam : " + reverse("Malayalam"));
		System.out.println("Reverse of Hello kaise ho : " + reverse("Hello kaise ho"));
		System.out.println("Reverse of Y : " + reverse("Y"));
	}

}
