package ch04;

public class SubWay {

	// ȣ�� ��ȣ
	// �°���
	// ���ͱ�
	
	// ������ - ȣ����ȣ�� �޴� ������
	
	// �޼��� take, showInfo
	
	int lineNumber;
	int passangerCount;
	int money;
	
	// �����Ϸ��� �⺻ �����ڸ� ����� �ش�.
	public SubWay(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passangerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + " �� ȣ���� ");
		System.out.println(passangerCount + " �� �̰� " );
		System.out.println("���� ���ͱ��� : " + money + "�� �Դϴ�. ");
	}
}