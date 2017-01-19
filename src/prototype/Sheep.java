package prototype;

import java.util.Date;

/**
 * ԭ��ģʽ
 * @author hc
 *
 */
public class Sheep implements Cloneable{
	//ʵ��Cloneable�������Խӿ�
	//ʵ��Object��clone�ķ���,clone�����Ǹ�native��������ײ�Ϊcʵ��,Ч�ʼ���
	private String sname;
	

	private Date birthday;
	
	public Sheep() {
		
	}
	
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();//ֱ�ӵ���Object��clone����
		
		//������´��룬ʵ����ƣ�deep Clone��
		Sheep s=(Sheep)obj;
		s.birthday=(Date)this.birthday.clone();
		
		return obj;
	}


	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Date setBirthday(Date birthday) {
		return this.birthday = birthday;
	}
	
	
	
}
