package adapter;
/**
 * �ͻ�����
 * ���ַ�ʽ�����������Ͷ���������
 * �൱��ֻ��USB�ӿڵıʼǱ�
 * @author hc
 *
 */
public class Client {
	
	//��ֻӵ��һ���ӿڣ������Ҫʹ�ñ�Ľӿڣ���Ҫ������
	public void test(Target t){
		t.handleReq();
		
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		Adaptee a = new Adaptee();
		
		
		//����������ʽ
//		Target t = new Adapter();
		
		//������������ʽ
		Target t=new Adapter2(new Adaptee());
		
		c.test(t);
		
	}
	
}
