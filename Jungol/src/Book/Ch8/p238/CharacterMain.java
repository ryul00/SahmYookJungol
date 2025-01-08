package Book.Ch8.p238;

public class CharacterMain {

	public static void main(String[] args) {
//		Character character = new Character(null, null);
		Warrior warrior = new Warrior(90000,580000,"자쿰의 투구", "팔라딘");
		Gladiator gladiator = new Gladiator(300, 600000, 77777, "소울 마스터");
		Wizard wizard = new Wizard(20, 3, 999999999, "썬콜");
		
	
		
		System.out.println("전사 스탯 = " + "체력 : " + warrior.hp +  " 공격력 : " +  warrior.power + "  ");
		System.out.println("검투사 스탯 = " + "체력 : " + gladiator.hp +  " 공격력 : " +  gladiator.power);
		System.out.println("주유소 스탯 = " + "체력 : " + wizard.hp +  " 공격력 : " +  wizard.power);
		
		warrior.defend(wizard);
		gladiator.powerAttack(wizard);
		wizard.healing(wizard.name, warrior);
		
		
		

	}

}
class Character{
	int hp;
	int power;
	String name;
	public Character(int hp, int power, String name) {
		this.hp = hp;
		this.power = power;
		this.name = name;
	}
	public void attack(Object target) {
		System.out.println("공격");
	}
	
}

class Warrior extends Character{
	String weapon;
	public Warrior(int hp, int power, String weapon, String name) {
		super(hp, power, name);
		this.weapon = weapon;
	}
	
	public void defend(Object targer) {
		System.out.println("방어");
	}
}



class Gladiator extends Character{
	int shield;
	public Gladiator(int hp, int power, int shield, String name) {
		super(hp,power,name);
		this.shield = shield;
	}
	public void powerAttack(Object target) {
		System.out.println("강화평타");
	}
}

class Wizard extends Character{
	int heal;
	public Wizard(int hp, int power, int heal, String name) {
		super(hp, power, name);
		this.heal = heal;
		
	}
	
	public void healing(String name,Object target) {
		System.out.println(name + "이" + target + "에게 주유 시작합니다.");
		
	}
}
