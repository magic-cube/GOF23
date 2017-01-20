package adapter;
/**
 * 被适配的类
 * 相当于需要适配的PS/2键盘
 * @author hc
 *
 */
public class Adaptee {
	
	public void request(){
		System.out.println("这个键盘可以打字");
	}
	
}
