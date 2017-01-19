package prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 * 复制对象不会影响到原对象
 * @author hc
 *
 */
public class client2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(123124456123L);
		
		Sheep s1=new Sheep("duoli",date);
		
		System.out.println(s1);
		
		//调用clone 方法，克隆多利羊,保持了和原型羊一样的数据
		Sheep s2=(Sheep)s1.clone();
		System.out.println(s2);
		
		//此时修改复制的对象，不会影响到原对象
	}

}
