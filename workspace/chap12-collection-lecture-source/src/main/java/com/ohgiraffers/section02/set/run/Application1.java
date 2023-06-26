package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. Set 자료구조의 특성을 이해하고 HashMap을 이용할 수 있다. */
		/* 필기.
		 *  Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
		 *  1. 요소의 저장 순서를 유지하지 않는다.
		 *  2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복하지 않게 하나의 null만 저장한다.)
		 * */
		
		/* 필기.
		 *  HashSet 클래스
		 *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
		 *  JDK 1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
		 * */
		
		/* 설명. HashSet 인스턴스 생성 */
		HashSet<String> hset = new HashSet<>();
		
		/* 설명. 다형성 적용하여 상위 인터페이스를 타입으로 사용 가능 */
//		Set hset2 = new HashSet();
//		Collection hset3 = new HashSet();

		hset.add(new String("java"));
		hset.add(new String("oracle"));
		hset.add(new String("jdbc"));
		hset.add(new String("html"));
		hset.add(new String("css"));

		/* 설명. 저장 순서 유지 안됨 */
		System.out.println("hset : " + hset);

		/* 설명. 중복 허용 안함 */
		hset.add(new String("java"));
		
		System.out.println("hset : " + hset);
		System.out.println("저장된 객체수 : " + hset.size());
		System.out.println("포함확인 : " + hset.contains(new String("oracle")));

		/* 설명.
		 *  저장된 객체를 하나씩 꺼내는 기능이 없음
		 *  반복문을 이용한 연속처리 하는 방법
		/* 목차. 1. toArray()배열로 바꾸고  for loop 사용 */
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++){
			System.out.println(i + " : " + arr[i]);
		}
		/* 목차. 2. iterator()로 목록 만들어 연속 처리 */
		Iterator<String> iter = hset.iterator();

		while(iter.hasNext()){
			System.out.println(iter.next());
		}

		/* 설명. 지우는 방법 */
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
	}
}
