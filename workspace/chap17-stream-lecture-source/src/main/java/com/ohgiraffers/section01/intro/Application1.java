package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. Stream에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  스트림(Stream)은 자바 8 부터 추가된 기능으로, 컬렉션에 저장된 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 기능이다.
		 *  자바 8 이전에 배열 또는 컬렉션 다루는 방법은 `for`, `foreach` 를 사용하여 엘리먼트들을 꺼내서 다루는 방법이었다.
		 *  스트림을 이용하면 배열 또는 컬렉션을 함수 여러 개를 사용해서 결과를 쉽게 얻을 수 있다.
		 *  람다식과 함께 사용할 수 있으며 컬렉션에 들어있는 데이터에 대한 처리를 간결하게 표현할 수 있다.
		 *  또한, 스트림을 사용하면 람다식을 활용해 코드 양도 줄이고 간결하게 표현도 가능하다.
		 *  스트림은 내부 반복자를 사용하기 때문에 병렬처리가 쉽다는 장점이 있다.
		 */
		
		List<String> stringList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));
		
		/* 설명. 이전에 스트림을 이용하지 않던 방식 */
		System.out.println("=============== foreach");
		for(String str : stringList) {
			System.out.println(str);
		}
		
		/* 설명. 스트림을 이용한 방식 */
		System.out.println("================ stream");
		stringList.forEach(System.out::println);
	}
}
