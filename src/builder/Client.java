package builder;

public class Client {

	public static void main(String[] args) {
		AirShipDirector director=new HcAirShipDirector(new HcAirShipBuilder());
		
		AirShip ship=director.directorAirShp();
		
		//System.out.println(ship.getEngine().getName());
	}

}
