package bridge;
/**
 * Ʒ�ƽӿڵ�ά��
 */
public interface Brand {
	void sale();
}
class Lenovo implements Brand{

	@Override
	public void sale() {
		/*
		 * ����������ԣ�������ʲô����ģ��Ҳ�����
		 */
		System.out.println("�����������");
	}
 	
}

class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("���۴�������");
	}
}