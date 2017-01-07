package factorymethod;

public class Client01 {
	/*
	 * 此时如果你要新增加一个Benz类
	 * 这时，你不需要修改任何已有的代码，只需要添加一个Benz类，并且添加一个BenzFactory类实现CarFantory即可
	 * 满足了ocp（开闭原则），对修改关闭，对扩展开放，不修改现有的类，通过增加类来实现扩展
	 * 简单工厂的话需要去修改已有的类，也可以实现
	 * 通常项目中，更多的是使用简单工厂模式，
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
