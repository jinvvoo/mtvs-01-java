package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {

		/* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.(1) */
		/* 필기. 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요 */
		
		/* 설명. 5명의 자바 점수를 저장할 배열을 하나 할당한다. */
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/* 설명. 반복문을 이용하여 배열 인덱스에 하나씩 접근해서 점수를 입력받는다. */
		for(int i = 0; i < scores.length; i++) {
			
			/* 설명. 개발자가 아닌 사용자에게는 0부터 시작하는 숫자체계는 익숙하지 않다. */
			System.out.print((i + 1) + "번 째 학생의 자바 점수를 입력해 주세요 : ");
			scores[i] = sc.nextInt();
		}
		
		/* 설명. 합계와 평균을 구한다. */
		double sum = 0.0;
		double avg = 0.0;
		
		/* 설명. 합계는 모든 인덱스의 값을 sum 변수에 누적해서 담아준다. */
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		/* 설명. 평균은 합계를 구한 값에서 배열의 길이(갯수)를 나눈다. */
		avg = sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
