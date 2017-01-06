package factorymethod;

public class AudiFactory implements CarFactory{
	
	public Car creatCar(){
		return new Audi();
	}
	
}
