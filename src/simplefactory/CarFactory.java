package simplefactory;

public class CarFactory {
	
	
	/*
	 * ���ݿ���ԭ����ôд������������,����˵�򵥹�������һ��С����
	 */
	public static Car creatCar(String type){
		if(type.equals("�µ�")){
			return new Audi();
		}else if(type.equals("���ǵ�")){
			return new Byd();
		}else{
			return null;
		}
	}
	
	//�򵥹���Ҳ������ôʵ��
	public static Car creatAudi(){
		return new Audi();
	}
	public static Car creatByd(){
		return new Byd();
	}
}
