package com.ohgiraffers.section01.object.book;

public class Book {
	
	private int number;
	private String title;
	private String author;
	private int price;
	
	/* 설명. 기본 생성자 */
	public Book() {}
	
	/* 설명. 모든 필드를 초기화하는 생성자 */
	public Book(int number, String title, String author, int price) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/* 설명. setter/getter */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
	/* 목차. 1. toString() 오버라이딩 */
	@Override
	public String toString() {
		return "BookVO [number=" + this.number 
					+ ", title=" + title 
					+ ", author=" + author 
					+ ", price=" + price
					+ "]";
	}
	
	/* 목차. 2. equals() 오버라이딩 */
	@Override
	public boolean equals(Object obj) {
		
		/* 설명. 두 인스턴스의 주소가 같으면 이후 다른 내용을 비교할 것 없이 true를 반환한다. */
		if(this == obj) {
			return true;
		}
		
		/* 설명.
		 *  this는 인스턴스가 생성되면 주소값이 저장된다. null일 수 없다.
		 *  따라서 전달받은 레퍼런스변수에 null값이 저장되어 있다면
		 *  비교하려는 두 개의 인스턴스는 서로 다른 인스턴스이다.
		 * */
		if(obj == null) {
			return false;
		}
		
		/* 설명. 전달받은 레퍼런스 변수를 Book 타입으로 형변환하여 각 필드별로 비교를 시작한다. */
		Book other = (Book) obj;
		
		/* 설명. number 필드의 값이 서로 같지 않은 경우 서로 다른 인스턴스이다. */
		if(this.number != other.number) {
			return false;
		}
		
		/* 설명.
		 *  title 필드의 값이 null인 경우
		 *  매개변수로 전달받은 인스턴스의 title 필드에도 null이 저장되어 있어야 서로 같은 값을 가진다.
		 *  그렇지 않은 경우 false를 리턴하고 종료함
		 * */
		if(this.title == null) {
			
			/* 설명. title 필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false 반환 */
			if(other.title != null) {
				return false;
			}
			
		} else if(!this.title.equals(other.title)) {
			
			/* 설명.
			 *  String 클래스의 equals()는 이미 해당 기능을 오버라이딩 해 두었기 때문에
			 *  같은 값을 가지는지 비교를 한다.
			 * */
			
			/* 설명.
			 *  title필드가 null이 아닌 경우
			 *  두 인스턴스의 title 필드값이 같아야 한다.
			 *  그렇지 않은 경우 false 반환
			 * */
			return false;
		}
		
		/* 설명. 작가의 경우도 마찬가지로 비교한다. */
		if(this.author == null) {
			
			if(other.author != null) {
				return false;
			}
			
		} else if(!this.author.equals(other.author)) {
			
			return false;
		}
		
		/* 설명. price 필드가 서로 다른 값을 가지면 false 반환 */
		if(this.price != other.price) {
			return false;
		}
		
		/* 설명. 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true 반환 */
		return true;
	}

	/* 목차. 3. hashCode() 오버라이딩 */
	@Override
	public int hashCode() {
		
		/* 설명. 곱셈 연산을 누적시켜야 하기 때문에 0이 아닌 값으로 초기화 */
		int result = 1;
		
		/* 설명.
		 *  필드마다 곱해줄 소수값을 선언
		 *  31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확율을 증가시킨다.
		 *  31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.
		 * */
		final int PRIME = 31;
		
		/* 설명.
		 *  31과 필드값을 이용하여 새로운 hashCode를 연산한다.
		 *  여기서 포인트는 필드값이 같은 경우 동일한 hashCode를 반환하면 된다.
		 * */
		result = PRIME * result + this.number;

		/* 설명.
		 *  String 클래스의 hashCode 메소드는 이미 재정의 되어 있다.
		 *  같은 값을 가지는 문자열은 동일한 hashCode값을 반환한다.
		 * */
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		
		return result;
	}
}
