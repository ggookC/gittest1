package ch05;

public class SubWay {

	int lineNumber;
	int passangerCount;
	int money;

	public SubWay(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passangerCount++;
	}

	public void showInfo() {
		System.out.println("����ö " + lineNumber + " �� ȣ���� ");
		System.out.println(passangerCount + " �� �̰� ");
		System.out.println("���� ���ͱ��� : " + money + "�� �Դϴ�. ");
	}
}