package abstractfactory;

public class LowCarFactory implements CarFactory{
	
	public Engine creatEngine() {
		return new LowEngine();
	}

	public Seat creatSeat() {
		return new LowSeat();
	}

	public Tyre tyre() {
		return new LowTyre();
	}
}
