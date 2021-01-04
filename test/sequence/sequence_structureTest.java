package sequence;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class sequence_structureTest {

	
	@Test
	void test() {
		int a = 12;
		assertEquals(a, sequence_structure.aToa(a));
		a = 0;
		assertEquals(a, sequence_structure.aToa(a));
		a = -104;
		assertEquals(a, sequence_structure.aToa(a));
	}

}
