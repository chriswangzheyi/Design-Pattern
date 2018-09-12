package Strategy;

//步骤三 实现内容Context
public class Warrior {
	
	private Weapon weapon;
	
	//构造函数
	public Warrior(Weapon weapon) {
		this.weapon = weapon; 
	}

	
	public void fighting() {
		this.weapon.fighting();
	}
}
