package com.ohgiraffers.section01.conditional;
import java.util.Scanner;

public class D_switch {

	public void testSimpleSwitchStatement() {

		/* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
		/* 필기.
		 *  [switch문 표현식]
		 *  switch(비교할변수) {
		 *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
		 *      default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 *  }
		 * */
		
		/* 필기.
		 *  여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
		 *  따라서 일부 호환이 가능하다.
		 *  하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
		 *  실수와 논리는 비교할 수 없다.
		 *  또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
		 *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
		 *  또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
		 * */
		
		
		/* 필기.
		 *  정수 두 개와 연산 기호 문자를 입력 받아서
		 *  두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
		 * */
		
		/* 필기. 정수 두 개와 연산 기호 입력 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);

		/* 설명. 연산의 결과를 저장할 변수 */
		int result = 0;
		
		/* 설명. 입력한 연산기호 문자에 따라 연산 결과가 달라짐 */
		switch(op) {
			case '+' : 
				result = first + second;
				break;
			case '-' : 
				result = first - second;
				break;
			case '*' : 
				result = first * second;
				break;
			case '/' : 
				result = first / second;			//second가 0이면 에러 발생(ArithmeticException)
				break;		
			case '%' : 
				result = first % second;
				break;
			/* 설명. default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 작성해주는 것이 좋다. */
			/* 필기. 산술연산 외에 다른 문자에 대한 처리는 생략하였음 */
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
	}

	public void testSwitchVendingMachine() {

		/* 수업목표. switch문 내의 break문에 대해 흐름을 이해하고 적용할 수 있다. */
		/* 필기. switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
		/* 필기.
		 *  1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
		 *  2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
		 * */
		
		/* 필기. switch문을 이용한 간단한 자판기 */
		System.out.println("=== OhGiraffers vending machine ===");
		System.out.println("  사이다   콜라   환타   바카스  핫식스  ");
		System.out.println("==============================");
		System.out.print("음료를 선택해주세요 : ");
		
		/* 설명. 원하는 음료를 문자열로 입력받음 */
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();
		
		/* 설명. 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0;
		
		/* 설명.
		 *  선택한 메뉴에 따라 구문이 출력은 된다. (문자열 비교 가능함)
		 *  하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다.
		 *  가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
		 * */
		switch(selectedDrink) {
			case "사이다" :
				System.out.println("사이다를 선택하셨습니다.");
				price = 500;
			case "콜라" : 
				System.out.println("콜라를 선택하셨습니다.");
				price = 600;
			case "환타" : 
				System.out.println("환타를 선택하셨습니다.");
				price = 700;
			case "바카스" : 
				System.out.println("바카스를 선택하셨습니다.");
				price = 2000;
			case "핫식스" : 
				System.out.println("핫식스를 선택하셨습니다.");
				price = 10000;
		}
		
		System.out.println(price + "원을 투입해주세요!");
		
		/* 필기.
		 *  자판기를 구입한 OhGiraffers 슈퍼에서는 자판기 개발사에 항의를 했다.
		 *  이제 정상적으로 자판기 기능을 수행할 수 있도록 위의 코드를 개선해보자 (break 추가)
		 * */
		
		/* 설명. 수정 후 */
		System.out.println("------------------ 개선된 자판기 --------------------");
		
		String order = "";
		
		switch(selectedDrink) {
			case "사이다" :
				order = "사이다";
				price = 500;
				break;
			case "콜라" : 
				order = "콜라";
				price = 600;
				break;
			case "환타" : 
				order = "환타";
				price = 700;
				break;
			case "바카스" : 
				order = "바카스";
				price = 2000;
				break;
			case "핫식스" : 
				order = "핫식스";
				price = 10000;
				break;
		}
		
		System.out.println(order + "를 선택하셨습니다.");
		System.out.println(price + "원을 투입해주세요!");
	}
}
