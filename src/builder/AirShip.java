package builder;
/**
 * ºÂ´¨ÅÆÓîÖæ·É´¬
 */
public class AirShip {
	private OrbitaModule orbitaModule;//¹ìµÀ²Õ
	
	private Engine engine;//·¢¶¯»ú
	
	private EscapeTower escapeTower;//ÌÓÒÝËþ
	
	public void launch(){
		System.out.println("lalalla,·É´¬µÄ¹¦ÄÜ");
	}
	
	public OrbitaModule getOrbitaModule() {
		return orbitaModule;
	}

	public void setOrbitaModule(OrbitaModule orbitaModule) {
		this.orbitaModule = orbitaModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	
}
class EscapeTower{
	private String name;
	public EscapeTower(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Engine{
	private String name;
	public Engine(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class OrbitaModule{
	private String name;
	
	public OrbitaModule(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}