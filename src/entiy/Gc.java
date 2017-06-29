package entiy;
/**
 * 工厂模式
 * @author Administrator
 *
 */
public class Gc {
	private  static Gc gc=null;
	public static Gc getGc(Object o){
		if(o instanceof Demo){
			gc=new Demo();
		}else{
			gc=new Demo1();
		}
		return gc;
	}
}
