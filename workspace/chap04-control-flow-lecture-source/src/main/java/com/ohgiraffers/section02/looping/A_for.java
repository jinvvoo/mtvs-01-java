package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

	public void testSimpleForStatement() {

		/* 수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
		/* 필기.
		 *  [for문 표현식]
		 *  for(초기식; 조건식; 증감식) {
		 *      조건을 만족하는 경우 수행할 구문(반복할 구문);
		 *  }
		 * */
		
		/* 필기. 1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문*/
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		/* 설명.
		 *  기본 반복문을 이용해서 조금씩 바꿔가며 우선 문법을 익숙해지도록 하자
		 *  1. 증감식이 없는 경우
		 *  2. 조건식이 없는 경우
		 *  3. 초기식, 조건식, 증감식이 없는 경우
		 *  4. 초기식, 조건식, 증감식 등을 변경하고 실행 값 예측해보기
		 *  5. 역순으로 반복문 실행
		 *  등등 필요에 따라 더 기본 반복문을 변형해가며 테스트 해보자
		 * */
		
		/* 설명.
		 *  반복문의 문법보다 어려운 것은
		 *  언제 반복문을 사용하는지를 판단하는 것이다.
		 *  반복문을 사용하는 간략한 예제들을 하나씩 살펴 볼 것이다.
		 * */
		
	}

	public void testForExample1() {
		
		/* 수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (1) */
		
		/* 필기. 10명의 학생 이름을 입력받아 이름을 출력해보자 */
		/* 설명. 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
		String student1 = sc.nextLine();
		System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
		
		System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
		String student2 = sc.nextLine();
		System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
		
		System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
		String student3 = sc.nextLine();
		System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
		
		System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
		String student4 = sc.nextLine();
		System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
		
		System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
		String student5 = sc.nextLine();
		System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
		
		System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
		String student6 = sc.nextLine();
		System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
		
		System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
		String student7 = sc.nextLine();
		System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
		
		System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
		String student8 = sc.nextLine();
		System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
		
		System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
		String student9 = sc.nextLine();
		System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
		
		System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
		String student10 = sc.nextLine();
		System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
		
		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
		
		/* 필기.
		 *  반복해야 하는 내용은
		 *  1. 안내문구 출력
		 *  2. 학생 이름 입력 받아 변수에 저장
		 *  3. 저장된 이름을 출력
		 *
		 * 필기.
		 *  반복 횟수는 1 부터 10까지 1씩 증가하며 총 10번을 반복한다.
		 * */

		/* 필기. 반복문으로 개선 */
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
			String student = sc.nextLine();
			System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
		}
		
		System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
		
		/* 설명.
		 *  둘 중에 어떤 코드가 더 좋은 코드일까?
		 *  둘 다 요구조건을 만족시켰기 때문에 둘 다 좋은 코드이다.
		 *
		 * 설명.
		 *  하지만, 아래의 이유 때문에 반복문을 사용한 것이 더 좋은 코드라고 볼 수 있다.
		 *  1. 보다 간결하게 코드가 작성되었다. (가독성)
		 *  2. 학생의 이름 뿐 아니라 성적도 입력하는 기능이 추가된다면? (유지보수성)
		 * */
	}

	public void testForExample2() {

		/* 수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (2) */
		/* 필기.
		 *  문장 속에서 규칙 찾기
		 *  1 ~ 10까지의 합계를 구하시오
		 * */

		/* 설명.
		 *  이렇게만 작성되어 있으면 처음 프로그래밍 하는 사람에게는 꽤나 난감하다.
		 *  어느 정도 익숙한 사람에게는 저 문제에서 해결해야 하는 내용과 규칙이 머릿속에 자연스럽게 그려지지만
		 *  처음 접하는 사람한테는 그렇지 않다.
		 *  단계적으로 접근할 수 있도록 위의 내용을 좀 풀어서 다시 작성해본다면
		 *  1부터 10까지 1씩 증가시키면서 증가시키는 값을 저장할 변수에 계속 누적시켜 변수에 저장된 값을 출력하세요 가 된다.
		 * */

		/* 필기. 1부터 10까지를 변수에 저장 */
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		/* 필기. 결과를 누적시켜 담아줄 변수 선언 */
		/* 설명. 더한 값을 누적시킬 변수는 통상 0으로 초기화를 한다. */
		int sum = 0;
		
		/* 필기. sum에 변수의 값 하나씩 담기 */
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		sum += num6;
		sum += num7;
		sum += num8;
		sum += num9;
		sum += num10;
		
		/* 필기. sum에 저장된 값 출력 */
		System.out.println("sum : " + sum);
		
		/* 설명.
		 *  무엇을 반복하면 좋을까? 반복해야 할 행동을 생각해보자
		 *  반복해야 할 내용
		 *  1. 변수에 1씩 증가하는 값 담기
		 *  2. 저장된 값을 sum에 누적시키기
		 *  반복 횟수는? 1부터 10까지 1씩 증가(10번 반복)
		 *
		 * 설명.
		 *  반복하지 않을 내용
		 *  1. 값을 누적해서 저장할 sum을 초기화
		 *  2. sum에 누적된 값 출력
		 * */
		
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		
		System.out.println("sum2 : " + sum2);
	}

	public void testForExample3() {

		/* 수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (3) */
		/* 설명.
		 *  반복문을 꼭 써야 하는 경우들도 종종 있다.
		 *  우선 반복문을 써야 하는 필요성을 느껴보기 위해 반복문을 쓰지 않고 작성해보자
		 * */
		
		/* 필기.
		 *  5 ~ 10 사이의 난수를 발생시켜서
		 *  1부터 발생한 난수까지의 합계를 구해보자.
		 * */
		
		int random = (int) (Math.random() * 6) + 5;
		
		System.out.println("random : " + random);
		
		/* 필기. 뭔가 더해서 담기 위해 sum 변수를 0으로 초기화 */
		int sum = 0;
		
		/* 설명. 발생한 난수에 따라 더하는 숫자가 달라지기 때문에 조건문을 이용해서 처리해보자  */
		if(random == 5) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
		} else if(random == 6) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
		} else if(random == 7) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
		} else if(random == 8) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4;
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
		} else if(random == 9) {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4; 
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
		} else {
			sum += 1;
			sum += 2;
			sum += 3;
			sum += 4; 
			sum += 5;
			sum += 6;
			sum += 7;
			sum += 8;
			sum += 9;
			sum += 10;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 : " + sum);
		

		/* 필기. 반복문을 이용한 개선 */
		int sum2 = 0;
		
		for(int i = 1; i <= random; i++) {
			sum2 += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 : " + sum2);
	}

	public void testForExample4() {

		/* 수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (4) */
		/* 필기.
		 *  숫자 두 개를 입력 받아 작은 수 에서 큰 수까지의 합계를 구하세요
		 *  단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 * */
		
		/* 필기. 정수 두 개 입력 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		/* 필기. 결과를 누적해서 담을 변수를 0으로 초기화 */
		int sum = 0;
		
		/* 설명. 첫 뻔재 정수가 더 큰 경우 */
		if(first > second) {
			
			/* 설명. 둘 중 더 작은 second가 시작하는 값이 되고, 더 큰 first가 끝나는 값이 된다. */
			for(int i = second; i <= first; i++) {
				sum += i;
			}
		
		/* 설명. 반대로 두 번쨰 정수가 더 큰 경우 */
		} else {
			
			/* 설명. 둘 중 더 작은 first가 시작하는 값이 되고, 더 큰 second가 끝나는 값이 된다. */
			for(int i = first; i <= second; i++) {
				sum += i;
			}
		}
		
		System.out.println("sum : " + sum);
		
		/* 설명.
		 *  결국 작은 수 부터 시작해서 큰 수까지의 합계를 구하는 것이기 때문에
		 *  first와 second 중 어느 것이 더 큰 수인지를 확인하면
		 *  작은수 ~ 큰수 까지의 합계를 구하는 로직으로 바꿀 수 있다.
		 * */
		
		/* 필기. 더 큰 값과 작은 값을 저장할 변수를 초기화한다. */
		int min = 0;
		int max = 0;
		
		if(first > second) {
			
			/* 설명. 처음 입력한 숫자가 더 크게 되면 first가 max이고, 자동으로 second는 min이다. */
			max = first;
			min = second;
		
		/* 설명. 반대 조건인 경우 */
		} else {
			
			/* 설명. 처음 입력한 숫자가 더 작으면 first는 min이고, 자동으로 second는 max이다. */
			min = first;
			max = second;
		}
		
		/* 설명. 반복문의 시작값은 min, 종료값은 max로 해 두면 된다. */
		int sum2 = 0;
		
		for(int i = min; i <= max; i++) {
			sum2 += i;
		}
		
		System.out.println("sum2 : " + sum2);
	}

	public void printSimpleGugudan() {

		/* 수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다. (5) */
		/* 필기.
		 *  키보드로 2~9 사이의 구구단을 입력받아
		 *  2~9 사이인 경우 해당 단의 구구단을 출력하고,
		 *  그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 출력
		 * */
		
		/* 설명.
		 *  구구단은 곱하는 수가 1부터 시작해서 9까지 1씩 증가하며 곱하는 규칙을 가지고 있다.
		 *  아래에서 규칙을 발견하고 규칙대로 for문을 이용하여 구구단을 출력하는 구문을 작성해보자
		 *  5 * 1 = 5
		 *  5 * 2 = 10
		 *  5 * 3 = 15
		 *  5 * 4 = 20
		 *  5 * 5 = 25
		 *  5 * 6 = 30
		 *  5 * 7 = 35
		 *  5 * 8 = 40
		 *  5 * 9 = 45
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		/* 설명. 입력한 숫자가 2 ~ 9 사이인지 조건 확인 */
		if(dan >= 2 && dan <= 9) {
			
			/* 필기. 2~9까지 입력한 경우 구구단 출력 */
			/* 설명. 먼저 작성한 후에 규칙 찾아서 개선하기 */
			//System.out.println(dan + " * " + 1 + " = " + (dan * 1));
			//System.out.println(dan + " * " + 2 + " = " + (dan * 2));
			//System.out.println(dan + " * " + 3 + " = " + (dan * 3));
			//System.out.println(dan + " * " + 4 + " = " + (dan * 4));
			//System.out.println(dan + " * " + 5 + " = " + (dan * 5));
			//System.out.println(dan + " * " + 6 + " = " + (dan * 6));
			//System.out.println(dan + " * " + 7 + " = " + (dan * 7));
			//System.out.println(dan + " * " + 8 + " = " + (dan * 8));
			//System.out.println(dan + " * " + 9 + " = " + (dan * 9));
			
			/* 필기. 반복문으로 변경 */
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		/* 설명. 2~9 사이의 값이 아닌 경우 */
		} else {
			
			/* 설명. 2~9 사이의 값이 아닌 경우 출력할 구문 */
			System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
