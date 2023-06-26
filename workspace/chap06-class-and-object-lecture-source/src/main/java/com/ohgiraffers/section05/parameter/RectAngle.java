package com.ohgiraffers.section05.parameter;

public class RectAngle {
	
	/* 설명. 사각형의 길이와 높이를 저장하는 필드 */
	private double width;
	private double height;
	
	/* 설명. 기본생성자로 객체 생성을 막고, 모든 필드를 초기화하는 생성자 추가하여 초기값을 입력해서 인스턴스를 생성하도록 제한 */
	public RectAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/* 설명. 필드에 접근하기 위한 설정자와 접근자 추가 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}

	public void calcArea() {
		
		double area = width * height;
		
		System.out.println("이 사각형의 넓이는 " + area + "입니다.");
	}

	public void calcRound() {
		
		double round = (width + height) * 2;
		
		System.out.println("이 사각형의 둘레는 " + round + "입니다.");
	}
}
