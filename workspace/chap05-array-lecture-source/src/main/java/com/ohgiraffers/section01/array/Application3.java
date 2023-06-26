package com.ohgiraffers.section01.array;

public class Application3 {

	public static void main(String[] args) {

		/* 수업목표. 배열에 초기화되는 자료형별 기본값을 이해할 수 있다. */
		/* 설명.
		 *  기본적으로 배열을 선언하고 할당하게 되면
		 *  배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
		 *  heap영역은 값이 없는 빈 공간이 존재할 수 없다.
		 * */
		
		/* 필기.
		 *  값의 형태 별 기본값
		 *  정수 : 0
		 *  실수 : 0.0
		 *  논리 : false
		 *  문자 : \u0000
		 *  참조 : null
		 * */
		int[] iarr = new int[5];
		
		/* 설명. int의 기본값인 0으로 초기화가 되어 있다. */
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[4]);
		
		/* 설명. 반복문을 통해서도 확인할 수 있다. */
		for(int i = 0; i < iarr.length; i++){
			System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
		}
		
		/* 필기.
		 *  자바에서 지정한 기본값 외의 값으로 초기화를 하고싶은 경우 블럭을 이용한다.
		 *  블럭을 사용하는 경우에는 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다.
		 * */
		int[] iarr2 = {11, 22, 33, 44, 55};
		
		/* 설명. 이러한 형식으로도 사용 가능하다. */
		int[] iarr3 = new int[] {11, 22, 33, 44, 55};
		
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("iarr3의 길이 : " + iarr3.length);
		
		/* 설명. 초기화 값 확인 */
		for(int i = 0; i < iarr2.length; i++) {
			System.out.println("iarr2[" + i + "] : " + iarr2[i]);
		}
		
		for(int i = 0; i < iarr3.length; i++) {
			System.out.println("iarr3[" + i + "] : " + iarr3[i]);
		}
		
		/* 설명. 문자열도 배열로 사용할 수 있다. */
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < sarr.length; i++){
			System.out.println("sarr[" + i + "]의 값 : " + sarr[i]);
		}
	}
}
