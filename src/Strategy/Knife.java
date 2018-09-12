package Strategy;

//步骤二 实现策略类
public class Knife implements Weapon {

	@Override
	public void fighting() {
		System.out.println("正在 使用刀");
	}

}
