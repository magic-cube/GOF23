package abstractfactory;

public interface Engine {
	void run();
	void start();
}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑得快啊跑得快！");
	}

	@Override
	public void start() {
		System.out.println("启动的快啊启动得快！");
	}
	
}
class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑得慢啊跑的慢！");
	}

	@Override
	public void start() {
		System.out.println("启动的慢啊启动的慢！");
	}
	
}
