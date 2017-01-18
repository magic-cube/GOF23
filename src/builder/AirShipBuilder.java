package builder;
/*
 * 用于构建飞船
 */
public interface AirShipBuilder {
	//构建发动机的方法
	Engine builderEngine();
	
	OrbitaModule builderoModule();
	//构建逃逸塔
	EscapeTower buliderEscapeTower();
	
}
