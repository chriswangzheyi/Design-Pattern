package Strategy;

//步骤四 测试
public class Test {

	public static void main(String[] args) {
		
		
		Warrior warrior = new Warrior(new Knife());
		System.out.println("选择武器为刀");
		warrior.fighting();
		System.out.println("----------------");
		
		warrior = new Warrior(new Bow());
		System.out.println("选择武器为弓");
		warrior.fighting();
		System.out.println("----------------");
		
		warrior = new Warrior(new Gun());
		System.out.println("选择武器为枪");
		warrior.fighting();
		System.out.println("----------------");
		
	}
}
