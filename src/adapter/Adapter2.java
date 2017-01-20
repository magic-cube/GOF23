package adapter;
/**
 * 适配器
 * 使用组合的方式实现跟被适配对象的整合
 * 
 * @author hc
 *
 */
public class Adapter2 implements Target{

	
	private Adaptee adaptee;
	
	
	@Override
	public void handleReq() {
		adaptee.request();
	}
	
	//持有被适配类的对象，通过构造函数传进来
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee=adaptee;
	}
}
