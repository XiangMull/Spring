package util;
/**
 * 
 * ����ģʽ
 * 
 * */
public class Dl {
	private static Dl dls=null;//����
	public static Dl getDl(){
		//���ô˷�����ñ�������������ʵ����
		if(null==dls){
			//�ж϶����Ƿ��Ѿ�ʵ����
			dls=new Dl();
		}
		return dls;//���ر�����
	}
	
}