package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. TreeSet에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  TreeSet 클래스
		 *  TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
		 *  이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
		 *  JDK 1.2부터 제공되고 있으며
		 *  Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
		 * */
		
		/* 설명. 자동 오름차순 정렬하여 이진 트리 형태로 요소를 저장하고 있음 */
		TreeSet<String> tset = new TreeSet<>();
		Set<String> tset2 = new TreeSet<>();

		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");

		/* 설명. 자동 오름차순 정렬됨 */
		System.out.println(tset);

		/* 설명. 목록 만들어서 하나씩 대문자로 변경해서 출력처리 */
		Iterator<String> iter = tset.iterator();

		while(iter.hasNext()){
			System.out.println(((String) iter.next()).toUpperCase());
		}

		/* 설명. 배열로 바꾸어 연속 처리하기 */
		Object[] arr = tset.toArray();

		for(Object obj : arr){
			System.out.println(((String) obj).toUpperCase());
		}
		
		/* 설명. 로또 번호 발생(TreeSet 특징 이용) */
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) {
			lotto.add(((int) (Math.random() * 45)) + 1);
		}
		
		System.out.println("lotto : " + lotto);
	}
}
