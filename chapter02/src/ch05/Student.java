package ch05;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money ) {
		this.name = name;
		this.money = money;
	}
	
	// 학생이 버스를 탄다. (객체와 객체 간의 상호작용하게 코드를 설계)
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	// 학생이 지하철을 탄다. (객체와 객체의 상호 작용)
	public void takeSubWay(SubWay subWay) {
		subWay.take(1500);
		this.money -= 1500;
	}
	
	
	// 정보창 보여주기
	public void showInfo() {
		System.out.println(name + " 님의 남은 돈은 : " + money + " 입니다.");
	}
}
