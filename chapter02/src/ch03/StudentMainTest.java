package ch03;

public class StudentMainTest {

	// Ŭ������ ����ϴ� ���� �� �ڵ�
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̴�ȣ";
		studentLee.address = "�λ�";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		

		Student studentkim = new Student();
		studentkim.studentName = "��μ�";
		studentkim.address = "��õ";
		studentkim.showStudentInfo();
		
		// �޼��� ���
		// 1. takeTest ����
		// 2. cleanUp ����
		studentkim.takeTest();
		studentkim.cleanUp();
		
		System.out.println("====================");
		String name1 = studentkim.getStudentName();
		System.out.println("name1 : " + name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2 : " + name2);

	} // end of main

}
