package builder;
/*
 * ���ڹ����ɴ�
 */
public interface AirShipBuilder {
	//�����������ķ���
	Engine builderEngine();
	
	OrbitaModule builderoModule();
	//����������
	EscapeTower buliderEscapeTower();
	
}
