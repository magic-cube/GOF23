package prototype;

import java.util.Date;

/*
 * 测试原型模式（浅克隆）(浅复制)
 * 克隆对象会影响到原对象
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(123124456123L);
		
		Sheep s1=new Sheep("duoli",date);
		
		System.out.println(s1);
		
		//调用clone 方法，克隆多利羊,保持了和原型羊一样的数据
		Sheep s2=(Sheep)s1.clone();
		System.out.println(s2);
	}

}
