package builder;
/**
 * 装配
 * @author hc
 *
 */
public class HcAirShipDirector implements AirShipDirector{
	
	private AirShipBuilder builder;
	//通过构造器可以在外部将builder传进来
	public HcAirShipDirector(AirShipBuilder builder){
		this.builder=builder;
	}
	
	@Override
	public AirShip directorAirShp() {
		
		Engine engine=builder.builderEngine();
		
		OrbitaModule orbitaModule=builder.builderoModule();
		
		EscapeTower escapeTower=builder.buliderEscapeTower();
		
		//装配成飞船对象的过程
		AirShip ship=new AirShip();
		ship.setEngine(engine);
		ship.setOrbitaModule(orbitaModule);
		ship.setEscapeTower(escapeTower);
		
		
		//返回装配好的ship
		return ship;
	}
	
}
