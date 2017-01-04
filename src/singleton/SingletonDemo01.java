package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ʽ�����������������أ�
 * 
 * ����ʽ����ģʽ�Ĵ����У�static����������װ��ʱ��ʼ������ʱ�����漰����̶߳�����ʸö��������
 * �������ֻ֤��װ�����θ��࣬�϶����ᷢ���������ʵ����⣬��˿���ʡ��synchronized�ؼ���(��Ȼ���̰߳�ȫ)
 * 
 * ���⣺���ֻ�Ǽ��ر��࣬������Ҫ����getInstance()��������Զ��������ã���������Դ�˷�
 * @author hc
 *
 */
public class SingletonDemo01 implements Serializable {
	//���ʼ��ʱ�����������������û����ʱ���ص����� ��
	private static SingletonDemo01 instance=new SingletonDemo01();
	
	//������˽�л�
	private SingletonDemo01(){}
	
	public static SingletonDemo01 getInstance(){
		return instance;
	}
	
	
	
	/*
	 * ����͸߶���
	 * �����л�ʱ��ֱ�ӵ���������������������󷵻أ�������Ҫ�ٷ����л�һ���µĶ���
	 * ��ֹ�˷����л���©��
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}





