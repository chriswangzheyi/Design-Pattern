package Adapter;

public class Adapter implements Target {

	//ֱ�ӹ�����������
	private Adaptee adaptee;
	
	//ͨ�����캯�����������Ҫ����ı����������
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}
	
	@Override
	public void request() {
		System.out.println("����������XXX������");
		this.adaptee.specificRequest();
	}
	
	

}
