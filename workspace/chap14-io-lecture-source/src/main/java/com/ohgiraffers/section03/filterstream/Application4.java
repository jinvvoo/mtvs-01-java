package com.ohgiraffers.section03.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

public class Application4 {

	public static void main(String[] args) {

		/* 수업목표. 객체단위 입출력 보조스트림을 이해하고 사용할 수 있다. */
		/* 설명.
		 *  객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream 확인하기
		 *  dto패키지를 하나 추가한 뒤 MemberDTO 클래스를 하나 만들자
		 * */
		MemberDTO[] outputMembers = {
				new MemberDTO("user01", "pass01", "홍길동", "hong777@ohgiraffers.com", 25, '남', 1250.7),
				new MemberDTO("user02", "pass02", "유관순", "korea31@ohgiraffers.com", 16, '여', 1221.6),
				new MemberDTO("user03", "pass03", "이순신", "leesoonsin@ohgiraffers.com", 22, '남', 1234.6)};

		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));
			
			for(int i = 0; i < outputMembers.length; i++){
				objOut.writeObject(outputMembers[i]);
			}

			objOut.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 설명. DTO에 직렬화 처리를 하지 않았다면, 실행할 때 NotSerializableException이 발생할 것이다. */
		/* 설명.
		 *  NotSerializableException이란?
		 *  직렬화 처리를 해주지 않아서 발생하는 에러이다.
		 *  직렬화란?
		 *  자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부 에서도 사용할 수 있도록
		 *  바이트(byte)형태로 데이터를 변환하는 기술을 말한다.
		 *  반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.
		 *  */

		MemberDTO[] inputMembers = new MemberDTO[3];
		ObjectInputStream objIn = null;
		
		try {
			
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));
			
			while(true) {
				System.out.println((MemberDTO) objIn.readObject());
			}

		} catch (EOFException e){
			System.out.println("끝");
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 설명. 직렬화 대상에서 제외하고 싶은 필드의 경우 transient 키워들 이용할 수있다. (DTO 수정 후 확인) */
	}
}
