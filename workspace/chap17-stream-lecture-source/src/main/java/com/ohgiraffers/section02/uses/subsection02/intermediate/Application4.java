package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {

	public static void main(String[] args) {

		/* 수업목표. 스트림의 중계연산중 하나인 sorted에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Stream<T> sorted();
		 *  Stream<T> sorted(Comparator<? super T> comparator);
		 *  sorted() 은 인자가 없이도 호출이 가능한데, 인자가 없으면 오름차순으로 자동 정렬된다. 별도의 비교 로직을 구현하고 싶다면 comparator를 인자로 넘겨주면 된다.
		 */
		List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
	            .boxed()
	            .sorted()
	            .collect(Collectors.toList());

	    System.out.println("integerList = " + integerList); 
	}
}
