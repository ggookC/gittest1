package ch05;

public class Bus {

	int busNumber;
	int passangerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passangerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + " �� �� �°��� ");
		System.out.println(passangerCount + " �� �̰� ");
		System.out.println("���� ���ͱ��� : " + money + "�� �Դϴ�. ");
	}
}
