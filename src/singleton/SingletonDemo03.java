package singleton;
/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ(�̰߳�ȫ������Ч�ʸߣ�����ʵ������ʱ����!)
 * 
 * Ҫ�㣺�ⲿ��û��static���ԣ��򲻻������ʽ�����������ض���
 * ֻ����������getInstance()ʱ�Ż���ؾ�̬�ڲ��࣬������ʱ���̰߳�ȫ��
 * instance��static final���ͣ���֤���ڴ���ֻ��������һ��ʵ�����ڣ�����ֻ�ܱ���ֵһ�Σ��Ӷ���֤���̰߳�ȫ
 * 
 * �汸�˲�����Ч���ú��ӳټ��ص����� !
 * 
 * 
 * @author hc
 *
 */
public class SingletonDemo03 {
	
	private static class SingletonClassInstance{
		//final���벻�Ӷ�����,
		private static /*final*/ SingletonDemo03 instance=new SingletonDemo03();
	}
	
	//������˽�л�
	private SingletonDemo03(){};
	
	//����û��ͬ��������Ч�ʸ�
	public SingletonDemo03 getInstance(){
		return SingletonClassInstance.instance;
	}
}
