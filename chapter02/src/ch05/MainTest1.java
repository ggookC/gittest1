package ch05;

public class MainTest1 {

	public static void main(String[] args) {
		
		
		
		
		// 버스 만들기
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		Student student1 = new Student("홍길동", 10_000);
		Student student2 = new Student("야스오", 50_000);
		Student student3 = new Student("티모", 20_000);
		
		SubWay subWay1 = new SubWay(1);
		SubWay subWay2 = new SubWay(2);
		SubWay subWay3 = new SubWay(3);

		
		// 학생이 버스를 탄다.
		student1.takeBus(bus100);
		
		// 상태창 확인
		student1.showInfo();
		//
		System.out.println("====================");
		bus100.showInfo();

		System.out.println("====================");
		student2.takeBus(bus100);
		student2.showInfo();
		
		System.out.println("====================");
		bus100.showInfo();
		// 학생들이 마치고 돌아갑니다.
		
		// s1 지하철을 탑니다
		student1.takeSubWay(subWay1);
		System.out.println("====================");
		student1.showInfo();
		subWay1.showInfo();
		System.out.println("====================");
	}

}
