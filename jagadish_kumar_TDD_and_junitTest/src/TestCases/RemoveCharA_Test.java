package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import MainProgramme.RemoveLast2Char;

class RemoveCharA_Test {
    		
	@Test
	void test1Equal() {
		RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
		assertEquals("BCD",RemoveLast2Char.Remove("AABCD"));
	}
	@Test
	void test2Equal() {
		RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
		assertEquals("CD",RemoveLast2Char.Remove("AACD"));
	}
	@Test
	void test3Equal() {
		RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
		assertEquals("BCD",RemoveLast2Char.Remove("BACD"));
	}
	@Test
	void test4Equal() {
		RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
		assertEquals("BBAA",RemoveLast2Char.Remove("BBAA"));
	}
	 @Test
	void test5Equal() {
		RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
		assertEquals("BAA",RemoveLast2Char.Remove("AABAA"));
	}
	 @Test
		void test6Equal() {
			RemoveLast2Char RemoveLast2Char = new RemoveLast2Char();
			assertEquals("BCD",RemoveLast2Char.Remove("ABCD"));
		}
}
