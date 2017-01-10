package abstractfactory;

public interface Engine {
	void run();
	void start();
}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�ܵÿ찡�ܵÿ죡");
	}

	@Override
	public void start() {
		System.out.println("�����Ŀ찡�����ÿ죡");
	}
	
}
class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("�ܵ������ܵ�����");
	}

	@Override
	public void start() {
		System.out.println("��������������������");
	}
	
}
