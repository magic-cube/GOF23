package bridge;
/**
 * �������͵�ά��
 * �������ࣨƽ�壬̨ʽ���ʼǱ�֮��ģ�
 * ʹ�ó���������ǽӿڵ�ԭ������Ϊ�����һ������
 * 
 * �������ƫ��������һ�಻���ڵĶ���
 * �ӿڸ�ƫ��������һ�๲ͬ����Ϊ
 * @author hc
 *
 */
public abstract class Computer {
	//ʹ��protected��Ϊ��������ȥʹ��
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
		 * ����̨ʽ��������ʲôƷ�Ƶģ��Ҳ���ϵ
		 */
		System.out.println("����̨ʽ��");
	}
}

class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
	}
	
	public void sale(){
		super.sale();
		System.out.println("���۱ʼǱ�");
	}
	
}




