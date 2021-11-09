package ch01;

public class Zealot {

	private int power;
	private int hp;
	private String name;
	
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}
	
	public void showInfo() {
		System.out.println("===== ����â =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("===== ����â =====");
	}
	
	
	// ���� �մϴ� -> ������ ������ �����ϴ� ����
	// �ٸ� ��ü�� ��ȣ �ۿ� - �޼���� ���� ���� ����
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName(); 
//		System.out.println(this.name + "��(��)" + targetName + "�� �����մϴ�.");
//		marine.beAttacked(this.power);
//	}
//	
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(this.name + "��(��)" + targetName + "�� �����մϴ�.");
//		zergling.beAttacked(power);
//	}
	
	// ���� ���մϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
	}
	
	public String getName() {
		return name;
	}
	
	// �޼��� �����ε��� ����غ���
	public void attack(Marine marine) {
		String targetName = marine.getName(); 
		System.out.println(this.name + "��(��)" + targetName + "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� �����մϴ�.");
		zergling.beAttacked(power);
	}

}