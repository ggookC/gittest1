package ch04;

public class Bus {

	// ���� ��ȣ
	// �°� ��
	// ���ͱ�
	int busNumber;
	int passangerCount;
	int money;
	
	// �����Ϸ��� �⺻ �����ڸ� ����� �ش�.
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " �� �� �°��� ");
		System.out.println(passangerCount + " �� �̰� " );
		System.out.println("���� ���ͱ��� : " + money + "�� �Դϴ�. ");
	}
}
