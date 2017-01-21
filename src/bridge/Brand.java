package bridge;
/**
 * 品牌接口的维度
 */
public interface Brand {
	void sale();
}
class Lenovo implements Brand{

	@Override
	public void sale() {
		/*
		 * 销售联想电脑，至于是什么种类的，我不关心
		 */
		System.out.println("销售联想电脑");
	}
 	
}

class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("销售戴尔电脑");
	}
}