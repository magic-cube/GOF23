package singleton;
/**
 * ¿Í»§¶Ë
 * @author hc
 *
 */
public class Client {

	public static void main(String[] args) {
		SingletonDemo01 s=SingletonDemo01.getInstance();
		SingletonDemo01 s2=SingletonDemo01.getInstance();
		System.out.println(s==s2);
	}

}
