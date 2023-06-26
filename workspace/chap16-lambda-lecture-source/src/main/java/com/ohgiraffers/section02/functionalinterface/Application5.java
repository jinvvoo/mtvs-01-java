package com.ohgiraffers.section02.functionalinterface;

import java.util.function.Predicate;

public class Application5 {

	public static void main(String[] args) {

		/* 수업목표. 표준 함수적 인터페이스 중 Predicate에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Predicate : 매개변수와 boolean 리턴값이 있는 testXXX()를 가지고 있다.
		 *             이 메소드들은 매개변수 값을 이용하여 true 혹은 false값을 리턴하는 역할을 한다.
		 * */
		/* 목차. 1. Predicate<T>#test(T t) : boolean : T를 조사하여 boolean을 리턴한다. */
		Predicate<Object> predicate = value -> value instanceof String;
		System.out.println("문자열인지 확인 : " + predicate.test("123"));
		System.out.println("문자열인지 확인 : " + predicate.test(123));
		
		/* 목차. 2. BiPredicate<T, U>#test(T t, U u) : boolean : T와 U를 조사하여 true, false를 리턴한다. */
		
		/* 목차. 3. DoublePredicate#test(double value) : boolean : double 값을 조사하여 true, false를 리턴한다. */
		
		/* 목차. 4. IntPredicate#test(int value) : boolean : int값을 조사하여 true, false를 리턴한다. */
		
		/* 목차. 5. LongPredicate#test(long value) : boolean : long값을 조사하여 true, false를 리턴한다. */
	}
}
