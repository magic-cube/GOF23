package abstractfactory;

public interface CarFactory {
	Engine creatEngine();
	Seat creatSeat();
	Tyre tyre();
}
