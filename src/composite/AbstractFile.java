package composite;
/**
 * 抽象构建
 * 使用组合模式，模拟杀毒软件的设计架构
 * @author hc
 *
 */
public interface AbstractFile {
	void killVirus();//杀毒
}
class ImageFile implements AbstractFile{

	@Override
	public void killVirus() {
		
	}
	
}