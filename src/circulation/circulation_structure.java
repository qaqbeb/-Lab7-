package circulation;

public class circulation_structure {
	
	public static int greatestCommonFactor(int a, int b) {
		//һ������������ķ���
		a = Math.abs(a);
		b = Math.abs(b);
		if(a == 0)
			return 0;
		if(b == 0)
			return 0;
		//��Ȼ0���κ�����û���������
		//��Ϊ�˷�ֹ����ѭ�����������˸��жϣ�����0
		if(a < b) {
			int z = a;
			a = b;
			b = z;
		}
		while(a % b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return b; 
	}
	
//	public static void main(String[] args) {
//		System.out.println(greatestCommonFactor(169, 130));
//	}

}
