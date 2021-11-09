package ch03;

public class MainTest5 {

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		// 논리 연산자 (&& , ||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용 됨
		// 연산의 결과가 true, false

		int num1 = 10;
		int num2 = 20;

		// 1. 논리 곱 (&&)

		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);

		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		// 둘 다 true(참) 일 때, true를 반환

		// 2. 논리 합 (||)

		boolean flag3 = (num1 < 0) || (num2 > 0);
		System.out.println(flag3);

		boolean flag4 = (num1 > 0) || (num2 > 0);
		System.out.println(flag4);
		// 둘 중 하나라도 true이면, 연산의 결과는 true 반환

		System.out.println("====================");

		// num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0);

		boolean flag6 = (num1 > 0) || (num2 > 0);

	} // end of main

} // end of class
