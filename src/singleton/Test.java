package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 通过反射和反序列化破解单例模式
 * @author hc
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		SingletonDemo01 s1=SingletonDemo01.getInstance();
		SingletonDemo01 s2=SingletonDemo01.getInstance();
		System.out.println(s1==s2);
		
//		
//		/*
//		 * 通过反射的方式直接调用私有构造器
//		 */
//		Class<SingletonDemo01> clazz=(Class<SingletonDemo01>) Class.forName("singleton.SingletonDemo01");
//		//获取构造器
//		Constructor<SingletonDemo01> c=clazz.getDeclaredConstructor(null);
//		//关闭安全检查
//		c.setAccessible(true);
//		SingletonDemo01 s3=c.newInstance();
//		SingletonDemo01 s4=c.newInstance();
//		
//		/*
//		 * 显然，这样跳过了单例的限制
//		 * 可以通过在构造器中手动抛异常的方法来防止这种漏洞
//		 */
//		System.out.println(s3==s4);
//		
//		
		
		
		/*
		 * 通过反序列化的方式构造多个对象
		 * 让单例类实现Serializable接口(SingletonDemo01)
		 * 
		 */
		//序列化
		FileOutputStream fos=new FileOutputStream("C:/my/a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		//反序列化
		FileInputStream fis=new FileInputStream("C:/my/a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SingletonDemo01 s11=(SingletonDemo01)ois.readObject();
		
		/*
		 * 可以看到，通过先序列化写到本地，然后反序列化读回来的方式也跳过了单例的限制，s1与s11不是同一个对象
		 * 防止反序列化的实现是通过readResolve()这个方法实现的，反序列化时会直接调用这个方法，将整个对象返回
		 * 而不会再反序列化一个新的对象
		 * 因为已经在单例类中添加了那个方法，所以看到两个对象是同一个
		 */
		System.out.println(s1);
		System.out.println(s11);
		
	}

}






