package ch06;

// Ŭ������ ����ϴ� ����
public class MainTest1 {

	// ���� �Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentScore();
		
		// �л� 2 ���� ����
		Student studentKim = new Student(2, "Kim");
		studentKim.setKoreaSubject("����", 30);
		studentKim.setMathSubject("����", 40);
		studentKim.showStudentScore();
		
		// �л� 3 ���� ����
		Student studentKuk = new Student(3, "Kuk");
		studentKuk.setKoreaSubject("����", 100);
		studentKuk.setMathSubject("����", 100);
		studentKuk.showStudentScore();

	} // end of main

} // end of class
