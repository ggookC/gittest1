package ex1;

public class Wizard {

	// ��� ����
	// hp, power, name
	int hp;
	int mp;
	int skillPower;
	String name;
	String skill;
	// �����ڵ� ����� �ּ���.
	
	// ������ �����ε�
	public Wizard(int hp, int mp) {
		
	}
	
	public Wizard(int hp, int mp, int skillPower, String name, String skill) {
		this.hp = hp;
		this.mp = mp;
		this.skillPower = skillPower;
		this.name = name;
		this.skill = skill;
	}

	// �޼���

	// ���縦 ���� �Ѵ�.
	public void attackWarrior(String name, int SkillPower, int hp) {
		System.out.println(name + " �� �����մϴ�. ");
		
		this.mp -= this.skillPower;
		System.out.println(this.name + " ��ų�� ����ؼ� " + " mp�� " + this.skillPower + " ��ŭ ���ҵǾ� " + this.name + " �� ������ " + this.mp + " �Դϴ�.");
		
		hp -= this.skillPower;
		System.out.println(name + " �� " + this.skillPower + " �������� �޾� " + name + " ü����" + hp + " �Դϴ�. ");
	}
	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���.
	public void wizardshowInfo() {
		System.out.println("ü���� : " + this.hp + "\n������ : " + mp + "\n��ų ���ݷ��� : " + skillPower + "\n��ų �̸��� : " + skill);
	}
}
