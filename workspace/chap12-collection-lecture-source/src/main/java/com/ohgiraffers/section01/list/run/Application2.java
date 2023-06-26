package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. ArrayList의 정렬 기능을 이용할 수 있다. */
		/* 설명. 여러 권의 책 목록을 관리할 ArrayList 인스턴스 생성 */
		List<BookDTO> bookList = new ArrayList<>();
		
		/* 설명. 도서 정보 추가 */
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
		
		/* 설명. 제네릭의 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort가 사용 가능하다. */
//		Collections.sort(bookList);		//에러남
		
		/* 설명. 우리가 만든 DTO의 경우 이러한 방식으로 정렬하지 못하기 때문에 다른 방법을 사용해야 한다. */
		
		/* 설명. 정렬 전 책 리스트 출력 */
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 설명. 가격 순으로 오름차순 정렬을 해 볼 것이다. */
		/* 설명.
		 *  compare 패키지를 추가하여 Comparator 인터페이스를 상속받은 클래스를 하나 추가할 것이다.
		 *  AscendingPrice를 추가하자
		 * */

		/* 설명.
		 *  Comparator 인터페이스를 상속받아 정렬의 기준을 정해준 뒤 List의 default 메소드인 sort() 메소드의 인자로
		 *  정렬 기준이 되는 인스턴스를 넣어주게 되면 내부적으로 우리가 오버라이딩 한 메소드가 동작하게 되며
		 *  그것을 정렬 기준으로 삼는다.
		 * */
		bookList.sort(new AscendingPrice());
		
		/* 설명. 정렬 후 bookList를 다시 출력해보자 */
		System.out.println("가격 오름차순 정렬 ---------------------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 설명.
		 *  인터페이스를 구현한 클래스를 재사용 하는 경우 AscendingPrice 클래스 처럼 작성하면 되지만
		 *  한 번만 사용하기 위해서는 조금 더 간편한 방법을 이용할 수 있다.
		 *  익명클래스(Anonymous)를 이용할 수 있다.
		 * */
		
		/* 설명. 인터페이스 이기에 바로 인스턴스 생성을 할 수 없다. */
//		bookList.sort(new Comparator<BookDTO>());
		
		/* 설명.
		 *  익명클래스는 뒤에 {}을 만들어서 마치 Comparator 인터페이스를 상속받은 클래스인데
		 *  이름이 없다고 생각하고 사용하는 것이다.
		 * */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				/* 설명.
				 *  여기에 내림차순 정렬 조건을 넣어주면 된다.
				 *  아까와는 반대로 오름차순 정렬 된 상태인 경우 순서를 바꿔야 한다.
				 *  양수를 반환해서 순서를 바꾸라는 플래그로 이용했었다.
				 * */
				
				/* 설명. 내림차순 정렬이 되어 있어서 순서를 바꾸는 경우 양수, 바꾸지 않는 경우에만 음수 반환 */
				return o1.getPrice() >= o2.getPrice()? -1: 1;
			}
		});
		
		/* 설명. 정렬 후 bookList를 다시 출력해보자 */
		System.out.println("가격 내림차순 정렬 ---------------------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 설명. 이번에는 제목 순 오름차순으로 정렬을 해 보자 */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				
				/* 설명.
				 *  문자열은 대소비교를 할 수 없다.
				 *  문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지 확인해야 하는데
				 *  String클래스의 CompareTo() 메소드에서 이미 정의해 놓았다. */
				
				/* 설명.
				 *  앞에 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우) 음수 반환,
				 *  같으면 0 반환,
				 *  앞에 값이 더 큰 경우 양수 반환 (즉, 바꿔야 하는 경우)
				 * */
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
		/* 설명. 정렬 후 bookList를 다시 출력해보자 */
		System.out.println("책 제목 오름차순 정렬 ---------------------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 설명. 이번에는 제목 순 내림차순으로 정렬할 것이다. */
		/* 설명. 람다식을 활용할 수 도 있다. */
		bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));
		
		System.out.println("책 제목 내림차순 정렬 ---------------------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 설명.
		 *  나머지 필드 정렬 기준은 추가적으로 연습 해보려면 해보자
		 *  다음은 Vector의 경우 스레드 동기화처리가 된다는 점만 다르고 ArrayList와 동일하게 동작한다.
		 *  JDK 1.0부터 사용하긴 했지만 하위 호환을 위해 남겨놓았고 성능 문제로 현재는 사옹하지 않는다.
		 *  가급적이면 ArrayList를 이용하면 된다.
		 * */
	}
}
