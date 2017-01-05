package simplefactory;
/**
 * 简单工厂模式的情况下，去new每个类的对象
 * @author hc
 *
 */
public class Client02 {
	/*
	 * 现在，我就不需要去和每个汽车的实现类打交道，而只要与汽车工厂打交道即可
	 * 至于他内部怎么去建了一个car，我也可以不用去知道，
	 * 通过多增加了工厂类，实现了更详细的分工
	 */
	public static void main(String[] args) {
		Car c1=CarFactory.creatCar("奥迪");
		Car c2=CarFactory.creatCar("比亚迪");
		
		c1.run();
		c2.run();
	}

}
