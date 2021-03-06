package ex01;


public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
		}
	}

	public String getName() {
		return this.name;
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(this.name + "이(가)" + targetName + "을 공격합니다.");
		unit.beAttacked(this.power);
	}

	public void showInfo() {
		System.out.println("===== 정보창 =====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("===== 정보창 =====");
	}
}
