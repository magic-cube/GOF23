package abstractfactory;

public interface Seat {
	void m();
}

class LuxurySeat implements Seat{

	@Override
	public void m() {
		System.out.println("�߶˵ģ��Ƚϵ������԰�Ħ!");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void m() {
		System.out.println("�Ͷ˵ģ������ˡ����������ͳ�");
	}
	
}

