package com.fab.heroacademia._functional;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

import lombok.Getter;

public class FunctionUtils {

	
	public static Function<Integer, Integer> multiplyByTwo = x -> x * 2;
	
	public static Function<Integer, Integer> addFour = x -> x + 4;
	
	/**
	 * addFour then multiplyByTwo
	 * (x + 4) * 2
	 */
	public static Function<Integer, Integer> composeMultiplyAndAddition = multiplyByTwo.compose(addFour);
	
	/**
	 * multiplyByTwo then addFour
	 * x * 2 + 4
	 */
	public static Function<Integer, Integer> multiplyThenAdd = multiplyByTwo.andThen(addFour);
	
	@Getter
	private static Integer acc = 0;
	public static Consumer<Integer> addToAccumulator = x -> acc += x;
	
	/**
	 * more verbose
	 * use anonymous inner class
	 */
	public static Supplier<String> giveString = new Supplier<String>() {
		
		@Override
		public String get() {
			return "Coucou !";
		}
	}; 
	
	public static BinaryOperator<String> concatString = (s1, s2) -> s1 + s2;
	
	public static Predicate<Integer> isGreaterThanTen = x -> x > 10;
	
	public static UnaryOperator<Integer> opposite = x -> -x;
	
	public ToIntFunction<String> stringLength = s -> s.length();
}
