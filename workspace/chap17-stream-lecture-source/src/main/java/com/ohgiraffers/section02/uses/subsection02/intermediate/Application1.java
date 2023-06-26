package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 스트림의 중계연산중 하나인 Filter에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Stream<T> filter(Predicate<? super T> predicate);
		 *  필터(Filter)는 스트림에서 특정 데이터만 걸러내는 메소드이다. 매개변수로 받는 Predicate는 boolean을 리턴하는 함수형
		 *  인터페이스이다.
		 */
		IntStream intStream = IntStream.range(0, 10);
		intStream.filter(i -> (i % 2) == 0).forEach(i -> System.out.print(i + " "));
	}
}
