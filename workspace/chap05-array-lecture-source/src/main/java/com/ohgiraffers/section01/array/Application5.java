package com.ohgiraffers.section01.array;

public class Application5 {

	public static void main(String[] args) {

		/* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.(2) */
		/* 필기. 랜덤한 카드를 한 장 뽑아서 출력해보자 */
		/* 설명. 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자 */
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		/* 설명. 배열 인덱스 범위의 난수 발생 */
		int randomShapeIndex = (int) (Math.random() * shapes.length);
		int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);
		
		/* 설명. index를 이용해서 출력 */
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + " 카드 입니다.");
	}
}
