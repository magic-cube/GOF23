package builder;

public class HcAirShipBuilder implements AirShipBuilder{
	//StringBuilder,������builder��β���ǹ�����ģʽ
	//XML�����У�JDOM���е���  DomBuilder��SaxBuilder���õ��˽�����ģʽ
	
	@Override
	public Engine builderEngine() {
		System.out.println("����������");
		/*
		 * ���ʹ�õ���newһ������Ҳ����ʹ�ù���ģʽ����ö���
		 */
		return new Engine("�´��Ʒ�����");
	}

	@Override
	public OrbitaModule builderoModule() {
		System.out.println("���������");
		return new OrbitaModule("�´��ƹ����");
	}

	@Override
	public EscapeTower buliderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("�´���������");
	}


}
