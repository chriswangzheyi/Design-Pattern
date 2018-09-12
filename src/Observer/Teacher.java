package Observer;

import java.util.ArrayList;

//����� �������������
public class Teacher implements Subject {
	
	
	private ArrayList observers;
	private String phone;
	
		
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
		notifyObserver(); //ִ��set��ʱ��֪ͨ���й۲���
	}


	public Teacher() {
		observers = new ArrayList<>();
	}
	

	//ע��۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	//�Ƴ��۲���
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
        if (i>=0) {
            observers.remove(i);
        }

	}

	//֪ͨ�۲���
	@Override
	public void notifyObserver() {
		
		for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(phone);
        }
	}
	
	

}
