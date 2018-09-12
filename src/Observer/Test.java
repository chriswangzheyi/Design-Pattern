package Observer;

public class Test {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Student Zhangsan = new Student("����");
		Student Lisi = new Student("����");
		Student Wangwu = new Student("����");
		
		//ע��۲���
		teacher.registerObserver(Zhangsan);
		teacher.registerObserver(Lisi);
		teacher.registerObserver(Wangwu);
		
		
		//��ʼ��
		teacher.setPhone("123");
		System.out.println(Zhangsan.getName()+"�յ��ĵ绰����"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"�յ��ĵ绰����"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"�յ��ĵ绰����"+Wangwu.getTeacherPhone());
		System.out.println("------------");
		
		
		//����
		teacher.setPhone("333");
		System.out.println(Zhangsan.getName()+"�յ��ĵ绰����"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"�յ��ĵ绰����"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"�յ��ĵ绰����"+Wangwu.getTeacherPhone());
		System.out.println("------------");
		
		
		//remove
		teacher.removeObserver(Zhangsan);
		teacher.setPhone("4444");
		System.out.println(Zhangsan.getName()+"�յ��ĵ绰����"+Zhangsan.getTeacherPhone());
		System.out.println(Lisi.getName()+"�յ��ĵ绰����"+Lisi.getTeacherPhone());
		System.out.println(Wangwu.getName()+"�յ��ĵ绰����"+Wangwu.getTeacherPhone());
		
	}

}
