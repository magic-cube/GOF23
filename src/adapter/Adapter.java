package adapter;
/**
 * 适配器本身
 * USB和PS/2的转接口
 * @author hc
 *
 */
public class Adapter extends Adaptee implements Target{

	/*
	 * 与被适配器关联起来
	 * 1.继承需要适配的类
	 * 2.组合形式实现
	 */
	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
