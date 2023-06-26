package com.ohgiraffers.section02.demensinal;

public class Application2 {
	
	public static void main(String[] args) {

		/* 수업목표. 2차원 정변배열을 선언 및 할당하여 사용할 수 있다. */
		/* 목차. 1. 배열의 선언 및 할당 */
		/* 필기.
		 *  정변 배열의 경우 각 인덱스별 배열을 따로 할당할 수 도 있지만 선언과 동시에 모든 배열을 할당할 수 있다.
		 *  자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
		 * */
		int[][] iarr = new int[3][5];		//길이 5의 배열을 3개 할당하고 그 주소를 묶어 관리하는 배열의 주소를 stack의 iarr에 저장한다.
		
		/* 목차. 2. 각 배열의 인덱스에 접근해서 값 대입 후 출력 */
		/* 목차. 2-1. 각 인덱스 공간에 하나씩 접근하여 값 대입 후 출력 */
		/* 설명. 값 대입 */
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 6;
		iarr[1][1] = 7;
		iarr[1][2] = 8;
		iarr[1][3] = 9;
		iarr[1][4] = 10;
		
		iarr[2][0] = 11;
		iarr[2][1] = 12;
		iarr[2][2] = 13;
		iarr[2][3] = 14;
		iarr[2][4] = 15;
		
		/* 설명. 값 출력 */
		System.out.print(iarr[0][0] + " ");
		System.out.print(iarr[0][1] + " ");
		System.out.print(iarr[0][2] + " ");
		System.out.print(iarr[0][3] + " ");
		System.out.print(iarr[0][4] + " ");
		
		System.out.println();
		
		System.out.print(iarr[1][0] + " ");
		System.out.print(iarr[1][1] + " ");
		System.out.print(iarr[1][2] + " ");
		System.out.print(iarr[1][3] + " ");
		System.out.print(iarr[1][4] + " ");
		
		System.out.println();
		
		System.out.print(iarr[2][0] + " ");
		System.out.print(iarr[2][1] + " ");
		System.out.print(iarr[2][2] + " ");
		System.out.print(iarr[2][3] + " ");
		System.out.print(iarr[2][4] + " ");
		
		System.out.println();
		
		/* 설명.
		 *  그냥 변수 15개를 사용하는것과 똑같다고 생각하면 된다.
		 *  하지만 배열은 []기호 안에 있는 숫자 대신 변수를 사용할 수 있다.
		 *  따라서 반복문 사용이 가능해진다.
		 *  위에서 값을 대입하고 출력한 것에 규칙을 찾아보고, 그 규칙대로 반복문을 이용해서 값을 대입 후 출력하는 구문으로 바꿔보자
		 *  */

		/* 목차. 2-2. 반복문을 이용하여 값 대입 후 출력 */
		/* 설명.
		 *  배열 인덱스를 하나씩 증가시키며 0번째 인덱스부터 마지막 번째 인덱스까지 차례로 인덱스를 증가시키며 공간에 접근한다.
		 *  접근한 뒤 1부터 1씩 증가하는 값을 이용해서 차례로 값을 대입하고,
		 *  모든 인덱스에 값을 다 대입하면 다음 배열의 0번 인덱스부터 다시 접근을 시작하여,
		 *  배열의 갯수만큼을 반복적으로 접하며 값을 대입한다.
		 * */
		
		/* 설명. 배열에 저장하기 위한 하나씩 증가하는 값을 저장할 변수 */
		int value = 1;

		/* 설명. 배열의 갯수 만큼 반복적으로 접근하기 위한 용도의 반복문 */
		for(int i = 0; i < iarr.length; i++) {
			
			/* 설명. 하나의 배열의 0번 부터 마지막 인덱스까지 차례로 접근해서 값을 대입하는 용도의 반복문 */
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		/* 설명.
		 *  0부터 1씩 증가하며 마지막 인덱스까지 배열의 값을 하나씩 출력하고
		 *  모든 인덱스의 값을 출력하고 나면 다음 배열도 순차적으로 접근해서 값을 출력하면서
		 *  매 배열의 값을 다 출력할 때 마다 한 줄씩 라인을 바꿔주는 행위를 배열의 갯수만큼 반복하고 있다.
		 * */
		
		/* 설명. 배열의 갯수만큼 배엘에 하나씩 반복적으로 접근하기 위한 용도의 반복문 */
		for(int i = 0; i < iarr.length; i++) {
			
			/* 설명. 각 배열에 접근했을 때 해당 배열의 값을 처음 인덱스부터 차례로 접근하며 출력해주는 반복문 */
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
