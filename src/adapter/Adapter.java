package adapter;
/**
 * ����������
 * USB��PS/2��ת�ӿ�
 * @author hc
 *
 */
public class Adapter extends Adaptee implements Target{

	/*
	 * �뱻��������������
	 * 1.�̳���Ҫ�������
	 * 2.�����ʽʵ��
	 */
	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
