package Observer;

import java.util.ArrayList;

//步骤二 定义具体主体类
public class Teacher implements Subject {
	
	
	private ArrayList observers;
	private String phone;
	
		
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
		notifyObserver(); //执行set的时候，通知所有观察者
	}


	public Teacher() {
		observers = new ArrayList<>();
	}
	

	//注册观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	//移除观察者
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }

	}

	//通知观察者
	@Override
	public void notifyObserver() {
		
		for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(phone);
        }
	}
	
	

}
