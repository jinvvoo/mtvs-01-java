package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
	
	/* 설명. 예외 없이 오버라이딩 할 수 있다. */
//	@Override
//	public void method() {}							//정상
	
	/* 설명. 같은 예외를 던져주는 구문으로 오버라이딩 해야 한다. */
//	@Override
//	public void method() throws IOException {}		//정상
	
	/* 설명. 부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 할 수 없다. */
//	@Override
//	public void method() throws Exception {}		//에러
	
	/* 설명. 하지만 부모의 예외처리 클래스보더 더 하위에 있는 예외(즉, 더 구체적인 예외상황)인 경우에는 오버라이딩 할 수 있다. */
	@Override
	public void method() throws FileNotFoundException {}	//정상
	
}
