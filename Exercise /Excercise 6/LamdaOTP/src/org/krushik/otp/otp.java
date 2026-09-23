package org.krushik.otp;

import java.util.Random;
import java.util.function.Supplier;

public class otp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		String s = "AEIOU";
		Supplier<Character> vowel = () -> s.charAt(random.nextInt(s.length()));
		System.out.print(vowel.get());
		
		Supplier<Integer> digit = () -> (random.nextInt(10));
		System.out.print(digit.get());
		System.out.print(digit.get());
		System.out.print(digit.get());
		System.out.print(digit.get());
	}

}
