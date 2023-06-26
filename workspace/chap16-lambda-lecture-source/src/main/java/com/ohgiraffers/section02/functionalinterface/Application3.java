package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
		/* 필기. Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할) */
		/* 목차. 1. Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다. */
		Function<String, Integer> function = (str) -> Integer.parseInt(str);
		String strValue = "12345";
		System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());
		
		/* 목차. 2. BiFunction<T, U, R>#apply(T t, U u) : R : 객체 T와 U를 R로 매핑한다. */
		BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
		String str1 = "12345";
		String str2 = "67890";
		System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());
		
		/* 목차. 3. IntFunction<R>#apply(int value) : R : int를 R로 매핑한다. */
		IntFunction<String> intFunction = intValue -> String.valueOf(intValue);
		int intValue = 123;
		System.out.println(intFunction.apply(intValue) + " : " + intFunction.apply(intValue).getClass().getName());
		
		/* 목차. 4. IntToDoubleFunction#applyAsDouble(int value) : double : int를 double로 매핑한다. */
		
		/* 목차. 5. IntToLongFunction#applyAsLong(int value) : long : int를 long으로 매핑한다. */
		
		/* 목차. 6. DoubleFunction<R>#apply(double value) : R : double을 R로 매핑한다. */
		
		/* 목차. 7. LongToDoubleFunction#applyAsDouble(long value) : double : long을 double로 매핑한다. */
		
		/* 목차. 8. LongToIntFunction#applyAsInt(long value) : int : long을 int로 매핑한다. */
		
		/* 목차. 9. ToDoubleBiFunction<T, U>#applyAsDouble(T t, U u) : double : 객체 T와 U를 double로 매핑한다. */
		
		/* 목차. 10. ToDoubleFunction<T>#applyAsDouble(T t) : double : 객체 T를 double로 매핑한다. */
		
		/* 목차. 11. ToIntBiFunction<T, U>#applyAsInt(T t, U u) : int : 객체 T와 U를 int로 매핑한다. */
		
		/* 목차. 12. ToIntFunction<T>#applyAsInt(T t) : int : 객체 T를 int로 매핑한다. */
		
		/* 목차. 13. ToLongBiFunction<T, U>#applyAsLong(T t, U u) : long : 객체 T와 U를 long으로 매핑한다. */
		
		/* 목차. 14. ToLongFunction<T>#applyAsLong(T t) : long : 객체 T를 long으로 매핑한다. */
	}
}
