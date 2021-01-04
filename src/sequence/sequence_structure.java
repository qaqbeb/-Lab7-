package sequence;

public class sequence_structure {
	public static int aToa(int a) {
		//一个从输入为a，输出为a的函数
		a += 21;
		a *= 7;
		a -= 105;
		a *= 4;
		a -= 168;
		a /= 28;
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("a = " + aToa(56));
	}
}
