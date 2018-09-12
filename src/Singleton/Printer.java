package Singleton;

//步骤一 定义对象
public class Printer {

	private static Printer printer = new Printer();
	
	private Printer() {}  //声明这个构造方法是为了阻止外部实例化该类
	
	public static Printer getPrinter() {
		return printer;
	}
	
	
}
