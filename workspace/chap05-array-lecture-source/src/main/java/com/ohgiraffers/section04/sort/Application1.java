package com.ohgiraffers.section04.sort;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다. */
		/* 필기. 변수의 두 값 변경하기 */
		int num1 = 10;
		int num2 = 20;
		
		/* 설명. 변경 전 값 출력 */
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/* 설명. 두 변수의 값을 바꾸기 위해 다른 변수 한 개가 더 필요하다. */
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		/* 설명. 변경 후 값 출력 */
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/* 설명. 배열의 인덱스에 있는 값도 서로 변경할 수 있다.(변수라고 생각하면 된다.) */
		int[] arr = {2, 1, 3};
		
		/* 설명. 역시 임시 변수를 이용한다. */
		int temp2;
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		/* 설명. 반복문으로 저장된 값 확인 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
