package builder;

public class HcAirShipBuilder implements AirShipBuilder{
	//StringBuilder,基本以builder结尾都是构建者模式
	//XML解析中，JDOM库中的类  DomBuilder，SaxBuilder都用到了建造者模式
	
	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		/*
		 * 这块使用的是new一个对象，也可以使用工厂模式来获得对象
		 */
		return new Engine("郝川牌发动机");
	}

	@Override
	public OrbitaModule builderoModule() {
		System.out.println("构建轨道舱");
		return new OrbitaModule("郝川牌轨道舱");
	}

	@Override
	public EscapeTower buliderEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("郝川牌逃逸塔");
	}


}
