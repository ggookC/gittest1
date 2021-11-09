package ch09;

import javax.security.auth.Refreshable;

public class MainTest {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();

		television.turnOn();
		television.turnOff();
		System.out.println("====================");
		refrigerator.turnOn();
		refrigerator.turnOff();

		// ������ - �� (��ü, ����, ����)

		RemoteController[] remote = new RemoteController[2];
		remote[0] = television;
		remote[1] = refrigerator;
		remote[2] = toyRobot;

		// Ȯ�� for�� turnOn() ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("====================");

		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("====================");
		// instanceOf ������ ����غ���
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü �Դϴ�. ");
				double a = 1.0;
				int b = (int) a;
				String name = ((ToyRobot) remote[i]).name;
				System.out.println(name);
				// ���� ����
				// remote[i] <--- �����ؼ� name ����� �ּ���.
				// ȭ�鿡 name ��� ������ ����� �ּ���.
			}
			// if TV
			if (remote[i] instanceof Television) {
				System.out.println("�ڷ����� ��ü �Դϴ�. ");
			}
			// if Re
			if (remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü �Դϴ�. ");
			}
		}
		
		// �������̽��� ����
		// ǥ��ȭ �����ϴ�.
		// ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		// Ŭ������ ���յ��� ���� ������ �ڵ带 ������ �� �ִ�.
		
		// ����
		// ��ü���� �з����� �ٽ�
		// ��ü�� ��ü�� ��ȣ �����ؼ� �ڵ带 ������ ������
		// ��ü�� ��ü�� ���踦 �����Ͽ� �ڵ带 ������ ������
		// (���, ���԰���, �߻�Ŭ����, �������̽�)
		// ������ (Ŭ������ �پ��� ���·�)
		
	} // end of main

}
