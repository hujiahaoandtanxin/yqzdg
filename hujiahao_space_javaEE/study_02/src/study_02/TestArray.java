package study_02;

public class TestArray {
/**
 * �������ʮ����-ʮ������
 * @param num
 */
public static void toHex(int num) {
	//����һ����
	char [] chs= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	//һ����ʱ����
	char [] arrays=new char[8];
	//����һ��ָ��
	int pos=arrays.length;
	while(num!=0)	 {
		int temp=num & 15;
		System.out.println("temp="+temp);
		arrays[--pos]=chs[temp];
		num=num>>>4;
		
	}
	System.out.println(pos);
	System.out.println(arrays.length);
	for (int y =pos;y<arrays.length;y++) {
		System.out.print(arrays[y]+",");
	}
	System.out.println("");
}	
		public static void main(String[] args) {
			toHex(60);
			toBin(20);
			 toBa(20);
	}
		/**
		 * ʮ����ת��Ϊ������
		 * @param num
		 */
		public static void toBin(int num) {
			char []chs= {'0','1'};
			char []arrays=new char[32];
			int pos=arrays.length;
			while(num!=0) {
				int temp=num&1;
				arrays[--pos]=chs[temp];
				num=num>>>1;
			}
			for (int y =pos;y<arrays.length;y++) {
				System.out.print(arrays[y]+",");
			}
		}
		public static void trans(int num,int base,int offset) {
			char [] chs= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			char []arrays=new char[32];
			int pos=arrays.length;
			while(num!=0) {
				int temp=num&base;
				arrays[--pos]=chs[temp];
				num=num>>>offset;
			}
			for (int y =pos;y<arrays.length;y++) {
				System.out.print(arrays[y]+",");
			}
		}
		public static void  toBa(int num) {
			System.out.println("");
			trans(num,7,3);
		}
}