package circulation;

public class circulation_structure {
	
	public static int greatestCommonFactor(int a, int b) {
		//一个求最大公因数的方法
		a = Math.abs(a);
		b = Math.abs(b);
		if(a == 0)
			return 0;
		if(b == 0)
			return 0;
		//虽然0和任何数都没有最大公因数
		//但为了防止无限循环，还是做了个判断，返回0
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
