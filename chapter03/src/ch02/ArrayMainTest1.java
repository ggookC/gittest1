package ch02;

import java.util.ArrayList;

import ch01.book;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		
		book book1 = new book(1, "흐르는 강물처럼", "파울로코엘료");
		book book2 = new book(2, "플러터UI실전", "김근호");
		book book3 = new book(3, "무궁화꽃이피었습니다", "김진명");
		book book4 = new book(4, "리딩으로리드하라", "이지성");
		book book5 = new book(5, "사피엔스", "유발하라리");
	
		// ArrayList 선언
		
		// 데이터를 담을 공간 만들기
		// ! ArrayList 는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<book> shoppingCart = new ArrayList<book>();
		
		// 추가 방법 1
		// 데이터 추가하기
		// shoppingCart[0] = ""
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);
		
		// 화면에 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("====================");
		// 추가 방법 2
		shoppingCart.add(2, book5);
		// for문 2번째 방법
		for (book b : shoppingCart) {
			b.showInfo();
		}
		System.out.println("====================");
		// 삭제하기
		shoppingCart.remove(0);
		// foreach
		 
//		shoppingCart.clear(); // 전부 삭제
		for(book book : shoppingCart) {
			book.showInfo();
		}
		System.out.println("====================");
		// 수정하기
		shoppingCart.set(2, book1);
		// foreach문 생성해서 화면에 출력
		for(book book : shoppingCart) {
			book.showInfo();
		}
		
		// C R U D
		
		// create, read, update, delete
	}

}
