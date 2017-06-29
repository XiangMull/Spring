package util;
/**
 * 
 * 单例模式
 * 
 * */
public class Dl {
	private static Dl dls=null;//定义
	public static Dl getDl(){
		//调用此方法获得本类对象，无需进行实例化
		if(null==dls){
			//判断对象是否已经实例化
			dls=new Dl();
		}
		return dls;//返回本对象
	}
	
}