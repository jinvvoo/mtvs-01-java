package com.ohgiraffers.section01.list.comparator;

import java.util.Comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO> {

	/* 설명. Comparator 인터페이스를 상속받으면 오버라이딩 해야 하는 메소드가 강제화된다. */
	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/* 설명.
		 *  sort() 에서 내부적으로 사용하는 메소드이다.
		 *  인터페이스를 상속받아서 메소드 오버라이딩 하는 것을 강제화 해 놓았다.
		 * */
		
		/* 설명.
		 *  비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는
		 *  앞의 가격이 더 적은 가격이어야 한다.
		 *  만약 뒤의 가격이 더 적은 경우에는 두 인스턴스의 순서를 바꿔야 한다.
		 *  그 때 두 값을 바꾸라는 신호로 양수를 보내주게 되면 정렬 시 순서를 바꾸는 조건으로 사용된다.
		 * */
		
		/* 설명. 양수, 음수 형태로 두 비교값이 순서를 바꿔야 하는지를 알려주기 위한 용도의 변수 */
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			
			/* 설명. 오름차순을 위해 순서를 바꿔야 하는 경우 양수를 반환 */
			result = 1;
		} else if(o1.getPrice() < o2.getPrice()) {
			
			/* 설명. 이미 오름차순 정렬로 되어 있는 경우 음수를 반환 */
			result = -1;
		} else {
			
			/* 설명. 두 값이 같은 경우는 0을 반환 */
			result = 0;
		}
		
		/* 설명. 순서를 바꿔야 하는 경우에만 양수를 반환함 */
		return result;
	}
}
