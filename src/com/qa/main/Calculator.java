package com.qa.main;

public class Calculator {
		// method to sum numbers taking in two integers
		public int addition(int int1, int int2) {
			return int1+int2;
		}
		
		// method to multiply numbers taking in two numbers
		public int multiplication(int num1, int num2) {
			return num1*num2;
		}
		
		// method to subtract
		public int subtraction(int subFrom, int subThis) {
			return subFrom-subThis;
		}
		
		// method to divide
		public String division(double divFrom, double divBy) {
			
			String result;
			
			if ( divFrom > divBy) {
				result = "" + divFrom/divBy;
				return result;
			} else {
				result = "The division cannot be performed!";
				return result;
			}
			
		}
}
