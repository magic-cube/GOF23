package abstractfactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine creatEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat creatSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre tyre() {
		return new LuxuryTyre();
	}

}
