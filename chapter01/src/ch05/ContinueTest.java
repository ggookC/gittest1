package ch05;

import java.util.Scanner;

public class ContinueTest {
 
	// ���� �Լ�
	public static void main(String[] args) {
		
		// ����� continue
		// �����ϰ� �����ϴ� continue
		// ��ĳ�� �̿��ؼ� MAX ��, MULTIPLE �� �޾Ƽ� ���α׷��� �ϼ����ּ���.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("MAX �� �Է� : ");
		final int MAX = scanner.nextInt();
		
		System.out.println("����� �Է� : ");
		final int MULTIPLE = scanner.nextInt();
		
		final int MIN = 31;
		int num;
		int count = 0;
		
		for(num = MIN; num < MAX; num++) {
			
			// 3�� ����̸� ������� ���ÿ�.
			if(num % MULTIPLE == 0) {
				count++;
				continue;
			} // end of if
			
		} // end of for
		
//		System.out.println("��� �� : " + num);
		System.out.println(MULTIPLE + "�� ����� ���� : " + count);

	} // end of main

} // end of class
