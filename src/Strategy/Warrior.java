package Strategy;

//������ ʵ������Context
public class Warrior {
	
	private Weapon weapon;
	
	//���캯��
	public Warrior(Weapon weapon) {
		this.weapon = weapon; 
	}

	
	public void fighting() {
		this.weapon.fighting();
	}
}
