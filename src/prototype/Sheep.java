package prototype;

import java.util.Date;

/**
 * 原型模式
 * @author hc
 *
 */
public class Sheep implements Cloneable{
	//实现Cloneable这个标记性接口
	//实现Object的clone的方法,clone方法是个native方法，其底层为c实现,效率极高
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
		Object obj=super.clone();//直接调用Object的clone方法
		
		//添加如下代码，实现深复制（deep Clone）
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
