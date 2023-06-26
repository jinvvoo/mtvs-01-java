package com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {

		/* 수업목표. Enum의 문법에 대해 이해하고 사용할 수 있다. */
		UserRole1 admin = UserRole1.ADMIN;
		System.out.println(admin);
		System.out.println(admin.getNameToLowerCase());
		
		/* 설명.
		 *  최초 enum타입을 사용할 시 생성자가 호출된다.
		 *  하지만 이것이 동적으로 생성되는 것을 의미하는 것은 아니다.
		 * */ 
		UserRole2 consumer = UserRole2.CONSUMER;
		System.out.println(consumer.ordinal() + " " + consumer.name() + " " + consumer.getDescription());
		
		/* 설명. 최초 사용시에만 열거 타입의 인스턴스를 생성하고 이후에는 생성자를 호출하지 않는다. */
		UserRole2 consumer2 = UserRole2.CONSUMER;
		/* 설명. 인스턴스는 싱글톤으로 관리되기 때문에 동일비교 연산으로 비교가 가능하다. */
		System.out.println(consumer == consumer2);
		
		System.out.println("==========================================");
		
		/* 설명. EnumSet을 활용하여 여러 열거형 타입들을 set으로 취급할 수 있다. */
		EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
		Iterator<UserRole2> iter = roles.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().name());
		}
		
		System.out.println("==========================================");
		
		/* 설명. 특정 상수만 골라서 set에 추가할 수 있다. */
		EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
		Iterator<UserRole2> userIter = users.iterator();
		while(userIter.hasNext()) {
			UserRole2 role = userIter.next();
			System.out.println(role.ordinal() + " " + role.getDescription());
		}
		
		System.out.println("=========================================");
		
		/* 설명. 특정 상수만 제외하여 set에 추가할 수 있다. */
		EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
		Iterator<UserRole2> notGuestIter = notGuest.iterator();
		while(notGuestIter.hasNext()) {
			UserRole2 role = notGuestIter.next();
			System.out.println(role.ordinal() + " " + role.getDescription());
		}
	}
}
