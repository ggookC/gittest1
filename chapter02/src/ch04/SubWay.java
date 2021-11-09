package ch04;

public class SubWay {

	// 호선 번호
	// 승객수
	// 수익금
	
	// 생성자 - 호선번호를 받는 생성자
	
	// 메서드 take, showInfo
	
	int lineNumber;
	int passangerCount;
	int money;
	
	// 컴파일러가 기본 생성자를 만들어 준다.
	public SubWay(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + " 번 호선의 ");
		System.out.println(passangerCount + " 명 이고 " );
		System.out.println("현재 수익금은 : " + money + "원 입니다. ");
	}
}