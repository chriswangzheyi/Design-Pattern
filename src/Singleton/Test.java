package Singleton;

//步骤二 测试
public class Test {
	
	public static void main(String[] args) {
		
		//模拟10个线程先后调用打印机，最后得到的hashcode都一样
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
        // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
        int hash = Printer.getPrinter().hashCode();  
        System.out.println(TestThread.currentThread()+"启动了，对应的hashcode是:"+hash);
    }
}

