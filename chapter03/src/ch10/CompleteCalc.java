package ch10;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int resut = 0;
		if (num2 == 0) {
			System.out.println("0으로 나올 수 없습니다. ");
			return ERROR;
		} else {
			resut = num1 / num2;
		}
		return resut;
	}

	public void showInfo() {
		System.out.println("모두 구현했습니다. ");
		
	}

}
