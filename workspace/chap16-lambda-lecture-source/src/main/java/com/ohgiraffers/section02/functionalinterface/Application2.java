package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 표준 함수적 인터페이스 중 Supplier에 대해 이해하고 사용할 수 있다. */
		/* 필기. Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다. */
		/* 목차. 1. Supplier<T>#get() : T : 객체 T를 리턴한다. */
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
		
		/* 목차. 2. BooleanSupplier#getAsBoolean() : boolean : boolean값을 리턴한다. */
		BooleanSupplier booleanSupplier = () -> {
			int random = (int) (Math.random() * 2);
			return random == 0? false: true;
		};
		System.out.println("랜덤 true or false : " + booleanSupplier.getAsBoolean());
		
		/* 목차. 3. IntSupplier#getAsInt() : int : int값을 리턴한다. */
		IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
		System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());
		
		/* 목차. 4. DoubleSupplier#getAsDouble() : double : double값을 리턴한다. */
		DoubleSupplier doubleSupplier = () -> Math.random();
		System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());
		
		/* 목차. 5. LongSupplier#getAsBoolean() : long : long값을 리턴한다. */
		LongSupplier longSupplier = () -> new java.util.Date().getTime();
		System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());
	}
}
