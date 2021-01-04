package branch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class branch_structureTest {

	@Test
	void test() {
		//测试负数和0
		assertEquals(true, branch_structure.yearMonthDay(2020, 12, 31));
		assertEquals(false, branch_structure.yearMonthDay(-2021, 1, 1));
		assertEquals(false, branch_structure.yearMonthDay(2021, -1, 1));
		assertEquals(false, branch_structure.yearMonthDay(2021, 1, -1));
		assertEquals(false, branch_structure.yearMonthDay(2021, 1, 0));
		
		//测试2月
		assertEquals(true, branch_structure.yearMonthDay(1000, 2, 28));
		assertEquals(false, branch_structure.yearMonthDay(1000, 2, 29));
		assertEquals(true, branch_structure.yearMonthDay(2000, 2, 29));
		assertEquals(false, branch_structure.yearMonthDay(2000, 2, 30));
		assertEquals(true, branch_structure.yearMonthDay(2020, 2, 29));
		assertEquals(false, branch_structure.yearMonthDay(2020, 2, 30));
		assertEquals(true, branch_structure.yearMonthDay(2021, 2, 28));
		assertEquals(false, branch_structure.yearMonthDay(2021, 2, 29));
		
		assertEquals(true, branch_structure.yearMonthDay(2021, 12, 1));
		assertEquals(false, branch_structure.yearMonthDay(2021, 13, 1));
		assertEquals(true, branch_structure.yearMonthDay(2021, 1, 31));
		assertEquals(false, branch_structure.yearMonthDay(2021, 1, 32));
		assertEquals(true, branch_structure.yearMonthDay(2021, 4, 30));
		assertEquals(false, branch_structure.yearMonthDay(2021, 4, 31));
	}

}
