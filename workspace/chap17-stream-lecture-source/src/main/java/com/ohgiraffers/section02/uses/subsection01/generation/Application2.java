package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 기본 타입 스트림 생성에 대해 이해하고 사용할 수 있다. */
		/* 필기. 기본 타입 스트림 생성 */
		/* 필기.
		 *  range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값 전까지 범위의 스트림 생성
		 *  rangeClosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값까지 범위의 스트림 생성
		 * */
		IntStream intStream = IntStream.range(5, 10);
		intStream.forEach(value -> System.out.print(value + " "));
		System.out.println();
		
		LongStream longStream = LongStream.rangeClosed(5, 10);
		longStream.forEach(value -> System.out.print(value + " "));
		System.out.println();
		
		/* 필기.
		 *  Wrapper 클래스자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다.
		 *  doubles(갯수) : 난수를 활용한 DoubleStream을 갯수 만큼 생성하여 반환한다.
		 *  boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper 타입의 Stream<XXX>으로 반환한다.
		 * */
		Stream<Double> doubleStream = new Random().doubles(5).boxed();
		doubleStream.forEach(value -> System.out.print(value + " "));
		System.out.println();
		
		/* 설명. 문자열을 intStream으로 변환 */
		IntStream helloworldChars = "hello world".chars();
		helloworldChars.forEach(v -> System.out.print(v + " "));
		System.out.println();
		
		/* 설명. 문자열을 split하여 stream으로 생성 */
		Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
		splitStream.forEach(System.out::println);
		
		/* 설명. Stream.of()를 이용한 생성 */
		Stream<String> stringStream1 = Stream.of("java", "oracle", "jdbc");
		Stream<String> stringStream2 = Stream.of("html", "css", "javascript");
		
//		stringStream1.forEach(System.out::println);
//		stringStream2.forEach(System.out::println);
		
		/* 설명.
		 *  concat()을 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다.
		 *  스트림은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가능하다 (위에꺼 주석 안하면 IllegalStateException발생함)
		 * */
		Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
		concatStream.forEach(v -> System.out.print(v + " "));
	}
}
