package singleton;
/**
 * 使用枚举实现单例模式
 * 	-实现简单
 * 	-枚举本身就是单例模式，由JVM从根本上提供保障，避免通过反射和反序列化的漏洞,遗憾的是没有延时加载
 * 
 * 因为即使是你将构造器私有化了，我们也可以通过反射去创建他的对象
 * 我们甚至可以通过反射去操作私有属性和方法
 * @author hc
 *
 */
public enum SingletonDemo04 {
	
	//这个枚举元素本身就是单例对象
	INSYANEC;
	
	//添加自己需要的操作
	public void singletonOperation(){
		
	}
}
