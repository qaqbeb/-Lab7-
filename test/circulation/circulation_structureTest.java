package circulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class circulation_structureTest {

	@Test
	void test() {
		assertEquals(13, circulation_structure.greatestCommonFactor(130, 169));
		assertEquals(13, circulation_structure.greatestCommonFactor(-130, 169));
		assertEquals(13, circulation_structure.greatestCommonFactor(-130, -169));
		
		assertEquals(0, circulation_structure.greatestCommonFactor(57, 0));
		assertEquals(0, circulation_structure.greatestCommonFactor(0, 57));
		
		assertEquals(7, circulation_structure.greatestCommonFactor(63, 91));
		assertEquals(32, circulation_structure.greatestCommonFactor(96, 1024));
		assertEquals(12, circulation_structure.greatestCommonFactor(324, 96468));
		assertEquals(324, circulation_structure.greatestCommonFactor(22032, 324));
	}

}
