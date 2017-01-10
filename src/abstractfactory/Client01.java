package abstractfactory;

public class Client01 {

	public static void main(String[] args) {
		CarFactory factory=new LuxuryCarFactory();
		Engine e=factory.creatEngine();
		e.start();
		e.run();
	}

}
