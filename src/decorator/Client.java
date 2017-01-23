package decorator;

public class Client {
	public static void main(String[] args) {
		//真实角色
		Car car=new Car();
		car.move();
		
		
		/*
		 * 传进来的car是要装饰的对象,也可以传flyCar等
		 */
		System.out.println("====增加新的功能,飞行=======");
		SuperCar flyCar=new FlyCar(car);
		flyCar.move();
		
		System.out.println("====增加新功能，游泳========");
		SuperCar waterCar=new Water(car);
		waterCar.move();
		
		System.out.println("======增加新功能，人工智能=====");
		SuperCar aiCar=new AICar(car);
		aiCar.move();
		
		System.out.println("====增加新功能，飞行加游泳======");
		SuperCar flyWaterCar=new FlyCar(waterCar);
		flyWaterCar.move();
	}
}
