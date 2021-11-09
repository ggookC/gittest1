package ex1;

public class Wizard {

	// 멤버 변수
	// hp, power, name
	int hp;
	int mp;
	int skillPower;
	String name;
	String skill;
	// 생성자도 만들어 주세요.
	
	// 생성자 오버로딩
	public Wizard(int hp, int mp) {
		
	}
	
	public Wizard(int hp, int mp, int skillPower, String name, String skill) {
		this.hp = hp;
		this.mp = mp;
		this.skillPower = skillPower;
		this.name = name;
		this.skill = skill;
	}

	// 메서드

	// 전사를 공격 한다.
	public void attackWarrior(String name, int SkillPower, int hp) {
		System.out.println(name + " 를 공격합니다. ");
		
		this.mp -= this.skillPower;
		System.out.println(this.name + " 스킬을 사용해서 " + " mp가 " + this.skillPower + " 만큼 감소되어 " + this.name + " 의 마나는 " + this.mp + " 입니다.");
		
		hp -= this.skillPower;
		System.out.println(name + " 이 " + this.skillPower + " 데미지를 받아 " + name + " 체력이" + hp + " 입니다. ");
	}
	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요.
	public void wizardshowInfo() {
		System.out.println("체력은 : " + this.hp + "\n마나는 : " + mp + "\n스킬 공격력은 : " + skillPower + "\n스킬 이름은 : " + skill);
	}
}
