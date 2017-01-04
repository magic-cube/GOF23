package singleton;
/**
 * ����ʽ������������ʱ���أ�
 * lazy load �����أ��ӳټ��أ������õ�ʱ��ż��أ�
 * ���⣺
 * 	-��Դ�����ʸ��ˣ���ÿ�ε���getInstance()������Ҫͬ��������Ч�ʽϵ�
 * @author hc
 *
 */
public class SingletonDemo02 {
	//�����ʱδ��ʼ������ʱ����
	private static SingletonDemo02 instance;
	//������˽�л�
	private SingletonDemo02(){}
	
	/*
	 * �����أ������õ�ʱ��ż���
	 * ��Ϊ����������ܻ��ж���̵߳��������������������synchronized�ؼ���
	 * ������ڣ����ܻᵼ���ڲ������ߵ�ʱ�򴴽��˶������
	 * ����ͬ��������Ч�ʵ�
	 */
	public static synchronized SingletonDemo02 getInstance(){
		if(instance==null){
			instance=new SingletonDemo02();
		}
		return instance;
	}
}
