package decorator;
/**
 * 装饰器模式
 * 职责：动态地为一个对象增加新的功能
 * 是一种用于代替继承的技术，更加灵活，避免类型体系的快速膨胀
 */
/**
 * 抽象组件
 * @author hc
 *
 */
public interface ICar {
	void move();
}

//真实角色
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}
	
}

/**
 * 装饰器
 */
class SuperCar implements ICar{
	//持有真实角色的引用
	private ICar car;
	
	public SuperCar(ICar car){
		this.car=car;
	}
	
	@Override
	public void move() {
		car.move();
	}
	
}

//具体装饰角色
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("天上飞");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	
	
}

//具体装饰角色
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
		System.out.println("游泳");
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
		System.out.println("自动跑");
	}
	
}




