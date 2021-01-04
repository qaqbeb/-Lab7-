package branch;

public class branch_structure {
	
	private static boolean contain(int[] arr, int b) {
		int len =arr.length;
		for(int i = 0; i < len; i++) {
			if(arr[i] == b)
				return true;
		}
		return false;
	}
	
	public static boolean yearMonthDay(int year, int month, int day) {
		//判断输入的年月日是否合法，年份要求大于0
		if(year <= 0)
			return false;
		if(month <= 0)
			return false;
		if(day <= 0)
			return false;
		if(month == 2) {
			if(year % 4 == 0) {
				if(year % 400 ==0) {
					if(day > 29)
						return false;
				}
				else if(year % 100 == 0) {
					if(day > 28)
						return false;
				}
				if(day > 29)
					return false;
			}
			else if(day > 28)
				return false;
			return true;
		}
		int monthList1[] = {1, 3, 5, 7, 8, 10, 12};
		int monthList2[] = {4, 6, 9, 11};
		if(contain(monthList1, month)){
			//contain方法判断数组中是否存在某一个数
			if(day > 31)
				return false;
		}
		else{
			if(contain(monthList2, month)) {
				if(day > 30)
					return false;
			}
			else
				return false;
		}
		
		return true;
	}
	
//	public static void main(String[] args) {
//		System.out.println(yearMonthDay(2021, 12, 31));
//	}
	
}
