package Adapter;

public class Adapter implements Target {

	//直接关联被适配类
	private Adaptee adaptee;
	
	//通过构造函数传入具体需要适配的被适配类对象
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	
	@Override
	public void request() {
		System.out.println("适配器做了XXX！！！");
		this.adaptee.specificRequest();
	}
	
	

}
