package composite;
/**
 * �������
 * @author hc
 *
 */
public interface Component {
	void opetation();
}

//Ҷ�����
interface Leaf extends Component{
	
}

//�������
interface Composited extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}