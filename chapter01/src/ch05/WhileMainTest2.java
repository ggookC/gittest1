package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	// ���� �Լ�
	public static void main(String[] args) {

		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���.
		
		System.out.println("���� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);

		final int LIMIT_VALUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while (num <= LIMIT_VALUE) {
			
			sum = sum + num;
			num++;
		}
		
		System.out.println("����� : " + sum);
	} // end of main

} // end of class
