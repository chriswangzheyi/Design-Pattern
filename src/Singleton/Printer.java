package Singleton;

//����һ �������
public class Printer {

	private static Printer printer = new Printer();
	
	private Printer() {}  //����������췽����Ϊ����ֹ�ⲿʵ��������
	
	public static Printer getPrinter() {
		return printer;
	}
	
	
}
