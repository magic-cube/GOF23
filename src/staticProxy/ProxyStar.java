package staticProxy;

public class ProxyStar implements Star{
	
	private Star star;
	
	/*
	 * �ڴ�����ʱ����Խ���ʵ��ɫ�����ô�����
	 * ��������ͳ�������ʵ��ɫ������
	 */
	public ProxyStar(Star star) {
		super();
		this.star=star;
	}
	
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	/*
	 * ����ʲô�������������ǲ��ᳪ�裬��Ҫ��ʵ��ɫ��
	 */
	@Override
	public void sing() {
		/*
		 * ������ҵ���߼�����ʵ��ɫ��ִ��
		 */
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
