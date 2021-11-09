package ch03;

public class StudentMainTest {

	// 클래스를 사용하는 입장 쪽 코딩
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이대호";
		studentLee.address = "부산";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
		

		Student studentkim = new Student();
		studentkim.studentName = "김민수";
		studentkim.address = "인천";
		studentkim.showStudentInfo();
		
		// 메서드 사용
		// 1. takeTest 실행
		// 2. cleanUp 실행
		studentkim.takeTest();
		studentkim.cleanUp();
		
		System.out.println("====================");
		String name1 = studentkim.getStudentName();
		System.out.println("name1 : " + name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2 : " + name2);

	} // end of main

}
