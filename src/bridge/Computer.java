package bridge;
/**
 * 电脑类型的维度
 * 电脑种类（平板，台式，笔记本之类的）
 * 使用抽象类而不是接口的原因，是因为会存在一个属性
 * 
 * 抽象类更偏重于描述一类不存在的东西
 * 接口更偏重于描述一类共同的行为
 * @author hc
 *
 */
public abstract class Computer {
	//使用protected是为了让子类去使用
	protected Brand brand;
	
	public Computer(Brand brand) {
		this.brand=brand;
	}
	
	public void sale(){
		brand.sale();
	}
}

class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	
	public void sale(){
		super.sale();
		/*
		 * 销售台式机，至于什么品牌的，我不关系
		 */
		System.out.println("销售台式机");
	}
}

class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	
	public void sale(){
		super.sale();
		System.out.println("销售笔记本");
	}
	
}




