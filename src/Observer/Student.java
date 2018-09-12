package Observer;

//步骤二 定义具体观察者类
public class Student implements Observer {

	private String name;
	private String teacherPhone;
	
	//getter and setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	
	
	//构造函数
	public Student(String name) {
		this.name =name;
	}

	@Override
	public void update(Object o) {
		this.teacherPhone = (String) o;
	}
	
	


}
