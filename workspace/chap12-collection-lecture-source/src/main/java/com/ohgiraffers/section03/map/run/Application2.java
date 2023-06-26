package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Properties란?
		 *  HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
		 *  설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
		 * */
		Properties prop = new Properties();

		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");

		System.out.println(prop);

		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 설명. 파일로부터 읽어와서 Properties에 기록 */
		Properties prop2 = new Properties();

		try {
			prop2.load(new FileInputStream("driver.dat"));
			prop2.load(new FileReader("driver.txt"));
			
			prop2.loadFromXML(new FileInputStream("driver.xml"));
			
			/* 설명. Properties의 모든 키 값 목록을 대상 스트림에 내보내기 한다. */
			prop2.list(System.out);

			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
