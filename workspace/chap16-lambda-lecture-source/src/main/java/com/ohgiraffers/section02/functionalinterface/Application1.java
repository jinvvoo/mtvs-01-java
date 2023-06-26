package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
		 *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
		 *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
		 *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
		 *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
		 *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
		 *  */
		
		/* 설명. 이 중 먼저 Consumer 부터 테스트해보자 */
		/* 목차. 1. Consumer<T>#accept(T t) : void : 객체 T를 받아 소비한다. */
		Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
		consumer.accept("hello world");
		
		/* 목차. 2. BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비한다. */
		BiConsumer<String, LocalTime> biConsumer = (str1, time) -> System.out.println(str1 + "이(가) " + time + "에 입력됨");
		biConsumer.accept("hello world", LocalTime.now());
		
		/* 목차. 3. IntConsumer#accept(int value) : void : int값을 받아 소비한다. */
		IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은 " + (num * num) + "입니다.");
		intConsumer.accept(15);
		
		/* 목차. 4. LongConsumer#accept(long value) : void : long값을 받아 소비한다. */
		LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
		longConsumer.accept(12345);
		
		/* 목차. 5. ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int값을 받아 소비한다. */
		ObjIntConsumer<java.util.Random> objIntConsumer = 
				(random, bound) -> System.out.println("0 부터 " + bound + "전 까지의 난수 발생 : " + random.nextInt(bound));
		objIntConsumer.accept(new java.util.Random(), 10);
		
		/* 목차. 6. ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long값을 받아 소비한다. */
		ObjLongConsumer<LocalDate> objLongConsumer = 
				(date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는 : " + date.plusDays(days));
		objLongConsumer.accept(LocalDate.now(), 10);
		
		/* 목차. 7. ObjDoubleConsumer<T>#accept(T t, double value) : void : 객체 T와 double값을 받아 소비한다. */
		ObjDoubleConsumer<StringBuilder> objDoubleConsumer = 
				(sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
		objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
	}
}
