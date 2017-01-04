package singleton;
/**
 *��η�ֹ����ͷ����л�©��
 *(�ڹ��������ֶ����쳣)
 */
public class SingletonDemo5 {
	//���ʼ��ʱ�����������������û����ʱ���ص����� ��
	private static SingletonDemo5 instance=new SingletonDemo5();
	
	//������˽�л�
	private SingletonDemo5(){
		//��ε���ʱ�����쳣
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	public static SingletonDemo5 getInstance(){
		return instance;
	}
}
