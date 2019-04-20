package eg.edu.alexu.csd.datastructure.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SLinkedListTest {

	@Test
	void testsingle() {
		ILinkedList test = new ILinkedList();
		test.add(5);
		test.add(3);
		test.add(4);
		test.add(6);
		Object ans1 = test.get(0);
		assertSame(5, ans1);
		test.add(1, 11);
		Object ans2 = test.get(1);
		assertSame(11, ans2);
		test.set(3, 20);
		Object ans3 = test.get(3);
		assertSame(20, ans3);
		ILinkedList x = test.sublist(0, 2);
		int z = x.size();
		assertSame(3, z);
		test.remove(0);
		Object w =test.get(0);
		assertSame(11, w);
		boolean m = test.contains(300);
		assertSame(false, m);
		boolean r = test.contains(5);
		assertSame(true, r);
		test.clear();
		boolean y = test.isEmpty();
		assertSame(true, y);
		
		
	}

}
