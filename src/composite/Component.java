package composite;
/**
 * 抽象组件
 * @author hc
 *
 */
public interface Component {
	void opetation();
}

//叶子组件
interface Leaf extends Component{
	
}

//容器组件
interface Composited extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}