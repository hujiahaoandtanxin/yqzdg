
public class Regex_study {
	
	public static void main(String[] args) {
		regexQQ();
		split_01();
		replaceAll_01();emailRegex();
	}
	/**
	 * ��֤QQ��ʽ
	 */
	public static void regexQQ() {
		String QQ="12345600";
		//��һλ������1��9���ڶ�λ��ʼ��6������8�����֣�0��9
		boolean matches = QQ.matches("[1-9][\\d]{6,8}");
		if(matches==true) {
			System.out.println("QQ��ʽ��ȷ");		
		}else {
			System.out.println("QQ��ʽ����");
		}
	}
	/**
	 * �и��ַ���---ʹ���������
	 */
	public static void split_01() {
		String ip ="192.168...22.2525";
		String[] str = ip.split("\\.+");
		System.out.println(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	/**replaceAll����
	 * ȡ���ַ���
	 */
	public static void replaceAll_01() {
		String str="456wewe656";
		//��ĸ����������1
		String newStr = str.replaceAll("[\\D+]", "1");
		System.out.println(newStr);
	}
	/**
	 * �����ʽ��֤
	 */
	public static void emailRegex() {
		String email="1@qq.com.cn";
		String emailRegex="\\w+@\\w+[\\.\\w]+";
		boolean b = email.matches(emailRegex);
		System.out.println(b);
	}
}	