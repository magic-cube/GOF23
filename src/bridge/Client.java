package bridge;
/**
 * �Ž����ģʽ
 * ������̳нṹ�������ά�ȱ仯�ĳ���
 * ������ά����Ƴɶ����ļ̳нṹ��ʹ����ά�ȿ��Զ�������չ���ڳ���㽨������
 * @author hc
 *
 */
public class Client {
	/*
	 * ��ʱ����¼�Ʒ�ƻ��ߵ������࣬����ǳ�����
	 * �������ڳе�֮ǰ�������ӵļ̳й�ϵ
	 */
	public static void main(String[] args) {
		/*
		 * ͨ�����Խ�����ά����������
		 * ʹ����ϴ���̳еĹ�ϵ
		 */
		
		//���۴����ıʼǱ�
		Computer c=new Laptop(new Dell());
		c.sale();
		
		//���������̨ʽ��
		Computer c2=new Desktop(new Lenovo());
		c2.sale();
	}
}
