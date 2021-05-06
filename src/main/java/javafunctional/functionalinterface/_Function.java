package javafunctional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		
		//Function takes one argument and produces one result
		int increment = incrementByOne(1);
		System.out.println(increment);

		Integer increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);
		
		int multiply = multiplyBy10Function.apply(increment2);
		System.out.println(multiply);
		
		Function<Integer, Integer> addBy1andThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
		System.out.println(addBy1andThenMultiplyBy10.apply(4));
		

		//BiFunction takes two arguments and produces one result
		System.out.println(incrementByOneAndMultiply(4, 100));
		System.out.println(incrementByOneAndMultiply(4, 100));
	}
	
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	
	static int incrementByOne(int number) {
		return number + 1;
	}
	
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = 
			(numberToIncrementByOne, numToMultiplyBy) -> (numberToIncrementByOne + 1) * numToMultiplyBy; 
	
	static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
		
		return (number + 1) * numToMultiplyBy;
	}

}
