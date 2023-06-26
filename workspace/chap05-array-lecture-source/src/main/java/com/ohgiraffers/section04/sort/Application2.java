package com.ohgiraffers.section04.sort;

public class Application2 {

	public static void main(String[] args) {
		
		/* 수업목표. 순차 정렬에 해대 이해하고 활용할 수 있다. */
		/* 설명.
		 *  순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
		 *  배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
		 * */
		
		/* 설명. 초기 배열 선언 및 초기화 */
		int[] iarr = {2,5,4,6,1,3};
		
		/* 설명.
		 *  인덱스 한 개씩 증가시키는 반복문
		 *  첫 번째 인덱스는 비교할 필요 없어서 1번 인덱스부터 비교 시작
		 * */
		for(int i = 1; i < iarr.length; i++){
			
			/* 설명. 인덱스가 증가할 때 마다 처음부터 해당 인덱스까지 값을 비교하는 반복문 */
			for(int j = 0; j < i; j++){
				
				/* 설명.
				 *  오름차순 정렬을 위한 처리
				 *  내림차순은 부등호만 반대로 처리하면 됨
				 **/
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}

			}
		}
		
		/* 설명. 값 출력용 반복문 */
		for(int i = 0; i < iarr.length; i++){
			System.out.print(iarr[i] + " ");
		}
		
	}
}
