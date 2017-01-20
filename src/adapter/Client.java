package adapter;
/**
 * 客户端类
 * 两种方式，类适配器和对象适配器
 * 相当于只有USB接口的笔记本
 * @author hc
 *
 */
public class Client {
	
	//我只拥有一个接口，如果需要使用别的接口，需要适配器
	public void test(Target t){
		t.handleReq();
		
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		Adaptee a = new Adaptee();
		
		
		//类适配器方式
//		Target t = new Adapter();
		
		//对象适配器方式
		Target t=new Adapter2(new Adaptee());
		
		c.test(t);
		
	}
	
}
