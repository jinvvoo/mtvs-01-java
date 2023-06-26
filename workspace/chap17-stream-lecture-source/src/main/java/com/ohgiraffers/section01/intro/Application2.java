package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 스트림의 병렬처리에 대해 이해할 수 있다. */
		/* 설명. 스트림의 병렬 처리 확인 */
		List<String> stringList = new ArrayList<>(Arrays.asList("java", "oracle", "jdbc", "html", "css"));
		
		/* 설명. 스트림을 사용하지 않으면 모든 작업은 main쓰레드에서 일어난다. */
		System.out.println("===================== foreach");
		for(String s : stringList) {
			System.out.println(s + " : " + Thread.currentThread().getName());
		}
		
		for(String s : stringList) {
			System.out.println(s + " : " + Thread.currentThread().getName());
		}
		
		/* 설명. 일반적인 스트림도 main쓰레드에서 작업을 수행한다. */
		System.out.println("==================== normal stream");
		stringList.forEach(Application2::print);
		stringList.forEach(Application2::print);
		
		/* 설명. 병렬 스트림인 경우에도 손쉽게 병렬처리 할 수 있다.(성능상 유리함) */
		System.out.println("==================== paralle stream");
		stringList.parallelStream().forEach(Application2::print);
		stringList.parallelStream().forEach(Application2::print);
	}
	private static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
