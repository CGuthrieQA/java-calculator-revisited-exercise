# Calculator Revisited

1. Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.

```java
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
```

```java
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
```