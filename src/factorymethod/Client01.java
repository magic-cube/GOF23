package factorymethod;

public class Client01 {
	/*
	 * ��ʱ�����Ҫ������һ��Benz��
	 * ��ʱ���㲻��Ҫ�޸��κ����еĴ��룬ֻ��Ҫ���һ��Benz�࣬�������һ��BenzFactory��ʵ��CarFantory����
	 * ������ocp������ԭ�򣩣����޸Ĺرգ�����չ���ţ����޸����е��࣬ͨ����������ʵ����չ
	 * �򵥹����Ļ���Ҫȥ�޸����е��࣬Ҳ����ʵ��
	 * ͨ����Ŀ�У��������ʹ�ü򵥹���ģʽ��
	 */
	public static void main(String[] args) {
		Car c1=new AudiFactory().creatCar();
		Car c2=new BydFactory().creatCar();
		Car c3=new BenzFactory().creatCar();
		
		c1.run();
		c2.run();
		c3.run();
	}	

}
