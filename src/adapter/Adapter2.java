package adapter;
/**
 * ������
 * ʹ����ϵķ�ʽʵ�ָ���������������
 * 
 * @author hc
 *
 */
public class Adapter2 implements Target{

	
	private Adaptee adaptee;
	
	
	@Override
	public void handleReq() {
		adaptee.request();
	}
	
	//���б�������Ķ���ͨ�����캯��������
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee=adaptee;
	}
}
