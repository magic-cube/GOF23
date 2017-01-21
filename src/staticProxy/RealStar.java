package staticProxy;


public class RealStar implements Star {

	
	/*
	 * 此处的打印，表示，调用了方法
	 */
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");;
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦).sing()");
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

}
