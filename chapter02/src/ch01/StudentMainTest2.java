package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		// 1. 접근해서 name, height, weight, grade 값을 줘서 화면에 출력해주세요.
		
		student1.height = 167;
		student1.weight = 81;
		student1.grade = 4;
		student1.name = "국상석";
		
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println(student1.name);
		
		System.out.println("====================");
		
		Student student2 = new Student();
		// 1. 접근해서 name, height, weight, grade 값을 줘서 화면에 출력해주세요.

	} // end of main

} // end of class
