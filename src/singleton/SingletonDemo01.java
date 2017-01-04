package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式（单例对象立即加载）
 * 
 * 饿汉式单例模式的代码中，static变量会在类装载时初始化，此时不会涉及多个线程对象访问该对象的问题
 * 虚拟机保证只会装载依次该类，肯定不会发生并发访问的问题，因此可以省略synchronized关键字(天然的线程安全)
 * 
 * 问题：如果只是加载本类，而不是要调用getInstance()，甚至永远都不会调用，则会造成资源浪费
 * @author hc
 *
 */
public class SingletonDemo01 implements Serializable {
	//类初始化时会立即加载这个对象（没有延时加载的优势 ）
	private static SingletonDemo01 instance=new SingletonDemo01();
	
	//构造器私有化
	private SingletonDemo01(){}
	
	public static SingletonDemo01 getInstance(){
		return instance;
	}
	
	
	
	/*
	 * 这个就高端了
	 * 反序列化时会直接调用这个方法，将整个对象返回，而不需要再反序列化一个新的对象
	 * 防止了反序列化的漏洞
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}





