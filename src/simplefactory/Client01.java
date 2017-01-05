package simplefactory;
/**
 * 测试在没有工厂模式的情况下，去new每个类的对象
 * @author hc
 *
 */
public class Client01 {

	public static void main(String[] args) {
		Car c1=new Audi();
		Car c2=new Byd();
		
		c1.run();
		c2.run();
	}

}
