package singleton;
/**
 * 懒汉式（单例对象延时加载）
 * lazy load 懒加载，延迟加载，真正用的时候才加载！
 * 问题：
 * 	-资源利用率高了，但每次调用getInstance()方法都要同步，并发效率较低
 * @author hc
 *
 */
public class SingletonDemo02 {
	//类加载时未初始化，延时加载
	private static SingletonDemo02 instance;
	//构造器私有化
	private SingletonDemo02(){}
	
	/*
	 * 懒加载，真正用的时候才加载
	 * 因为这个方法可能会有多个线程调用这个方法，因而需加上synchronized关键字
	 * 如果不在，可能会导致在并发量高的时候创建了多个对象
	 * 方法同步，调用效率低
	 */
	public static synchronized SingletonDemo02 getInstance(){
		if(instance==null){
			instance=new SingletonDemo02();
		}
		return instance;
	}
}
