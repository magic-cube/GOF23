package decorator;

public class Client {
	public static void main(String[] args) {
		//��ʵ��ɫ
		Car car=new Car();
		car.move();
		
		
		/*
		 * ��������car��Ҫװ�εĶ���,Ҳ���Դ�flyCar��
		 */
		System.out.println("====�����µĹ���,����=======");
		SuperCar flyCar=new FlyCar(car);
		flyCar.move();
		
		System.out.println("====�����¹��ܣ���Ӿ========");
		SuperCar waterCar=new Water(car);
		waterCar.move();
		
		System.out.println("======�����¹��ܣ��˹�����=====");
		SuperCar aiCar=new AICar(car);
		aiCar.move();
		
		System.out.println("====�����¹��ܣ����м���Ӿ======");
		SuperCar flyWaterCar=new FlyCar(waterCar);
		flyWaterCar.move();
	}
}
