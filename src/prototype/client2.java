package prototype;

import java.util.Date;

/**
 * ԭ��ģʽ����ƣ�
 * ���ƶ��󲻻�Ӱ�쵽ԭ����
 * @author hc
 *
 */
public class client2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(123124456123L);
		
		Sheep s1=new Sheep("duoli",date);
		
		System.out.println(s1);
		
		//����clone ��������¡������,�����˺�ԭ����һ��������
		Sheep s2=(Sheep)s1.clone();
		System.out.println(s2);
		
		//��ʱ�޸ĸ��ƵĶ��󣬲���Ӱ�쵽ԭ����
	}

}
