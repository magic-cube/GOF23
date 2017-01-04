package singleton;
/**
 *如何防止反射和反序列化漏洞
 *(在构造器中手动抛异常)
 */
public class SingletonDemo5 {
	//类初始化时会立即加载这个对象（没有延时加载的优势 ）
	private static SingletonDemo5 instance=new SingletonDemo5();
	
	//构造器私有化
	private SingletonDemo5(){
		//多次调用时会抛异常
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	public static SingletonDemo5 getInstance(){
		return instance;
	}
}
