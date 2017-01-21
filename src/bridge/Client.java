package bridge;
/**
 * 桥接设计模式
 * 处理多层继承结构，处理多维度变化的场景
 * 将各个维度设计成独立的继承结构，使各个维度可以独立的拓展，在抽象层建立关联
 * @author hc
 *
 */
public class Client {
	/*
	 * 此时如果新加品牌或者电脑种类，将会非常容易
	 * 而不用于承担之前超级复杂的继承关系
	 */
	public static void main(String[] args) {
		/*
		 * 通过属性将两个维度连接起来
		 * 使用组合代替继承的关系
		 */
		
		//销售戴尔的笔记本
		Computer c=new Laptop(new Dell());
		c.sale();
		
		//销售联想的台式机
		Computer c2=new Desktop(new Lenovo());
		c2.sale();
	}
}
