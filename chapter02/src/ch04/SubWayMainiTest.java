package ch04;

public class SubWayMainiTest {

	public static void main(String[] args) {
		// subway 객체 3개 생성
		SubWay subWay1 = new SubWay(1);
		SubWay subWay2 = new SubWay(2);
		SubWay subWay3 = new SubWay(3);
		
		// 각각 take 메서드 실행 후 
		subWay1.take(1300);
		subWay2.take(1300);
		subWay3.take(1300);

		// showInfo 메서드 실행 시켜주세요.
		subWay1.showInfo();
		subWay2.showInfo();
		subWay3.showInfo();

	}

}
