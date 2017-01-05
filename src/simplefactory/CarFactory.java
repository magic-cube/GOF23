package simplefactory;

public class CarFactory {
	
	
	/*
	 * 根据开闭原则，这么写，明显有问题,所以说简单工厂存在一点小问题
	 */
	public static Car creatCar(String type){
		if(type.equals("奥迪")){
			return new Audi();
		}else if(type.equals("比亚迪")){
			return new Byd();
		}else{
			return null;
		}
	}
	
	//简单工厂也可以这么实现
	public static Car creatAudi(){
		return new Audi();
	}
	public static Car creatByd(){
		return new Byd();
	}
}
