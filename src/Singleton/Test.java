package Singleton;

//����� ����
public class Test {
	
	public static void main(String[] args) {
		
		//ģ��10���߳��Ⱥ���ô�ӡ�������õ���hashcode��һ��
		Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread(); 
            threads[i].start();
        }
   
	}
}



class TestThread extends Thread {
    @Override
    public void run() {
        // ���ڲ�ͬ����ģʽ��ʵ�֣�ֻ�������Ӧ�ĵ����������乫�о�̬��������������
        int hash = Printer.getPrinter().hashCode();  
        System.out.println(TestThread.currentThread()+"�����ˣ���Ӧ��hashcode��:"+hash);
    }
}

