package ch04;

public class SubWayMainiTest {

	public static void main(String[] args) {
		// subway ��ü 3�� ����
		SubWay subWay1 = new SubWay(1);
		SubWay subWay2 = new SubWay(2);
		SubWay subWay3 = new SubWay(3);
		
		// ���� take �޼��� ���� �� 
		subWay1.take(1300);
		subWay2.take(1300);
		subWay3.take(1300);

		// showInfo �޼��� ���� �����ּ���.
		subWay1.showInfo();
		subWay2.showInfo();
		subWay3.showInfo();

	}

}
