package simplefactory;
/**
 * �򵥹���ģʽ������£�ȥnewÿ����Ķ���
 * @author hc
 *
 */
public class Client02 {
	/*
	 * ���ڣ��ҾͲ���Ҫȥ��ÿ��������ʵ����򽻵�����ֻҪ�����������򽻵�����
	 * �������ڲ���ôȥ����һ��car����Ҳ���Բ���ȥ֪����
	 * ͨ���������˹����࣬ʵ���˸���ϸ�ķֹ�
	 */
	public static void main(String[] args) {
		Car c1=CarFactory.creatCar("�µ�");
		Car c2=CarFactory.creatCar("���ǵ�");
		
		c1.run();
		c2.run();
	}

}
