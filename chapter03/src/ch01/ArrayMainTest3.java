package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		book book1 = new book(1, "흐르는 강물처럼", "파울로코엘료");
		book book2 = new book(2, "플러터UI실전", "김근호");
		book book3 = new book(3, "무궁화꽃이피었습니다", "김진명");
		book book4 = new book(4, "리딩으로리드하라", "이지성");
		book book5 = new book(5, "사피엔스", "유발하라리");

		// 문제
		// 1. 배열을 이용해서 shoppingCart 변수(배열)에 객체를 담아봅시다.
		book[] shoppingCart = new book[5];
		// 2. 사고 싶은 책을 장바구니에 3개만 담아 봅시다.
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		// 3. 장바구니에 담은 정보를 화면에 출력 하세요.
		// 오류 수정해 주세요!
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		// 4.
		shoppingCart[0] = book5;
		
		// 5. 인덱스 1번째에 book3 추가해주세요.
		// 0,1 = book3, 1-->2, 2-->3, 3-->3
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		
		// 배열에 추가를 하려면 직접 인덱스 연산을해서 처리해야한다.
		
	}

}
