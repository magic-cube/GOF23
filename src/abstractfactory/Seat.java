package abstractfactory;

public interface Seat {
	void m();
}

class LuxurySeat implements Seat{

	@Override
	public void m() {
		System.out.println("高端的，比较吊，可以按摩!");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void m() {
		System.out.println("低端的，能坐人。。。不挤就成");
	}
	
}

