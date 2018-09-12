package Observer;

public class Test {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Student Zhangsan = new Student("张三");
		Student Lisi = new Student("李四");
		Student Wangwu = new Student("王五");
		
		//注册观察者
		teacher.registerObserver(Zhangsan);
		teacher.registerObserver(Lisi);
		teacher.registerObserver(Wangwu);
		
		
		//初始化
		teacher.setPhone("123");
		System.out.println(Zhangsan.getName()+"收到的电话号码"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"收到的电话号码"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"收到的电话号码"+Wangwu.getTeacherPhone());
		System.out.println("------------");
		
		
		//更新
		teacher.setPhone("333");
		System.out.println(Zhangsan.getName()+"收到的电话号码"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"收到的电话号码"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"收到的电话号码"+Wangwu.getTeacherPhone());
		System.out.println("------------");
		
		
		//remove
		teacher.removeObserver(Zhangsan);
		teacher.setPhone("4444");
		System.out.println(Zhangsan.getName()+"收到的电话号码"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"收到的电话号码"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"收到的电话号码"+Wangwu.getTeacherPhone());
		
	}

}
