package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int firstInt = 10;
		int secondInt = 15;
		int addResult = calc.addition(firstInt, secondInt);
		System.out.println(firstInt + " + " + secondInt + " = " + addResult);
		
		int multResult = calc.multiplication(firstInt, secondInt);
		System.out.println(firstInt + " * " + secondInt + " = " + multResult);
		
		int subResult = calc.subtraction(firstInt, secondInt);
		System.out.println(firstInt + " - " + secondInt + " = " + subResult);
		
		String divResult = calc.division(firstInt, secondInt);
		System.out.println(firstInt + " / " + secondInt + " = " + divResult);
	}

}
