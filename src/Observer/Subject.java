package Observer;

/**
 *  ����
 */

//����һ ��������
public interface Subject {
	
	// �۲���ע��
    public void registerObserver(Observer o);
    // ɾ���۲���
    public void removeObserver(Observer o);
    // �����������ݸ���ʱ���� ����֪ͨ�۲���
    public void notifyObserver();

}
