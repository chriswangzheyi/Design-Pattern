package Strategy;

//������ ����
public class Test {

	public static void main(String[] args) {
		
		
		Warrior warrior = new Warrior(new Knife());
		System.out.println("ѡ������Ϊ��");
		warrior.fighting();
		System.out.println("----------------");
		
		warrior = new Warrior(new Bow());
		System.out.println("ѡ������Ϊ��");
		warrior.fighting();
		System.out.println("----------------");
		
		warrior = new Warrior(new Gun());
		System.out.println("ѡ������Ϊǹ");
		warrior.fighting();
		System.out.println("----------------");
		
	}
}
