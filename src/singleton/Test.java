package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * ͨ������ͷ����л��ƽⵥ��ģʽ
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
//		 * ͨ������ķ�ʽֱ�ӵ���˽�й�����
//		 */
//		Class<SingletonDemo01> clazz=(Class<SingletonDemo01>) Class.forName("singleton.SingletonDemo01");
//		//��ȡ������
//		Constructor<SingletonDemo01> c=clazz.getDeclaredConstructor(null);
//		//�رհ�ȫ���
//		c.setAccessible(true);
//		SingletonDemo01 s3=c.newInstance();
//		SingletonDemo01 s4=c.newInstance();
//		
//		/*
//		 * ��Ȼ�����������˵���������
//		 * ����ͨ���ڹ��������ֶ����쳣�ķ�������ֹ����©��
//		 */
//		System.out.println(s3==s4);
//		
//		
		
		
		/*
		 * ͨ�������л��ķ�ʽ����������
		 * �õ�����ʵ��Serializable�ӿ�(SingletonDemo01)
		 * 
		 */
		//���л�
		FileOutputStream fos=new FileOutputStream("C:/my/a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		//�����л�
		FileInputStream fis=new FileInputStream("C:/my/a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SingletonDemo01 s11=(SingletonDemo01)ois.readObject();
		
		/*
		 * ���Կ�����ͨ�������л�д�����أ�Ȼ�����л��������ķ�ʽҲ�����˵��������ƣ�s1��s11����ͬһ������
		 * ��ֹ�����л���ʵ����ͨ��readResolve()�������ʵ�ֵģ������л�ʱ��ֱ�ӵ���������������������󷵻�
		 * �������ٷ����л�һ���µĶ���
		 * ��Ϊ�Ѿ��ڵ�������������Ǹ����������Կ�������������ͬһ��
		 */
		System.out.println(s1);
		System.out.println(s11);
		
	}

}






