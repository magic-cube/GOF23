package decorator;
/**
 * װ����ģʽ
 * ְ�𣺶�̬��Ϊһ�����������µĹ���
 * ��һ�����ڴ���̳еļ���������������������ϵ�Ŀ�������
 */
/**
 * �������
 * @author hc
 *
 */
public interface ICar {
	void move();
}

//��ʵ��ɫ
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("½������");
	}
	
}

/**
 * װ����
 */
class SuperCar implements ICar{
	//������ʵ��ɫ������
	private ICar car;
	
	public SuperCar(ICar car){
		this.car=car;
	}
	
	@Override
	public void move() {
		car.move();
	}
	
}

//����װ�ν�ɫ
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("���Ϸ�");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	
	
}

//����װ�ν�ɫ
class Water extends SuperCar{

	public Water(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
	public void swim(){
		System.out.println("��Ӿ");
	}
	
}

class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
	public void autoMove(){
		System.out.println("�Զ���");
	}
	
}




