package builder;
/**
 * װ��
 * @author hc
 *
 */
public class HcAirShipDirector implements AirShipDirector{
	
	private AirShipBuilder builder;
	//ͨ���������������ⲿ��builder������
	public HcAirShipDirector(AirShipBuilder builder){
		this.builder=builder;
	}
	
	@Override
	public AirShip directorAirShp() {
		
		Engine engine=builder.builderEngine();
		
		OrbitaModule orbitaModule=builder.builderoModule();
		
		EscapeTower escapeTower=builder.buliderEscapeTower();
		
		//װ��ɷɴ�����Ĺ���
		AirShip ship=new AirShip();
		ship.setEngine(engine);
		ship.setOrbitaModule(orbitaModule);
		ship.setEscapeTower(escapeTower);
		
		
		//����װ��õ�ship
		return ship;
	}
	
}
