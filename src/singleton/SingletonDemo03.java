package singleton;
/**
 * 静态内部类实现单例模式(线程安全，调用效率高，并且实现了延时加载!)
 * 
 * 要点：外部类没有static属性，则不会像饿汉式那样立即加载对象
 * 只有真正调用getInstance()时才会加载静态内部类，加载类时是线程安全的
 * instance是static final类型，保证了内存中只有这样的一个实例存在，而且只能被赋值一次，从而保证了线程安全
 * 
 * 兼备了并发高效调用和延迟加载的优势 !
 * 
 * 
 * @author hc
 *
 */
public class SingletonDemo03 {
	
	private static class SingletonClassInstance{
		//final加与不加都可以,
		private static /*final*/ SingletonDemo03 instance=new SingletonDemo03();
	}
	
	//构造器私有化
	private SingletonDemo03(){};
	
	//方法没有同步，调用效率高
	public SingletonDemo03 getInstance(){
		return SingletonClassInstance.instance;
	}
}
