package com.ohgiraffers.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 메소드 참조에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  메소드 참조(method references)는 함수형 인터페이스를 람다식이 아닌 일반 메소드를 참조시켜 선언하는 방법이다.
		 *  일반 메소드를 참조하기 위해서는 함수형 인터페이스의 매개변수 타입/갯수/반환형과 메소드의 매개변수 타입/갯수/반환형이 같아야 한다.
		 *  [메소드 참조 표현식]
		 *  클래스이름::메소드이름
		 *  참조변수이름::메소드이름
		 * */
		BiFunction<String, String, Boolean> biFunction = String::equals;
		System.out.println(biFunction.apply("java", "java"));
		
		Consumer<Object> consumer = System.out::println;
		consumer.accept("hello world");
		
		List<String> subjects = new ArrayList<>();
		subjects.add("java");
		subjects.add("oracle");
		subjects.add("jdbc");
		subjects.add("html");
		subjects.add("css");
		
		forEach(subjects, System.out::println);
	}
	
	private static void forEach(List<? extends Object> list, Consumer<Object> consumer) {
		for(Object obj : list) {
			consumer.accept(obj);
		}
	}

}
