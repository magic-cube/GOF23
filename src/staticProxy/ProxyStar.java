package staticProxy;

public class ProxyStar implements Star{
	
	private Star star;
	
	/*
	 * 在创建的时候可以将真实角色的引用传进来
	 * 这样代理就持有了真实角色的引用
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
	 * 代理什么都可以做，就是不会唱歌，需要真实角色来
	 */
	@Override
	public void sing() {
		/*
		 * 真正的业务逻辑由真实角色来执行
		 */
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
