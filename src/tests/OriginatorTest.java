package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import code.Originator;

public class OriginatorTest {
	@Test
		public void test() {
		Originator.Memento mem;
		Integer initialValue = 10;
		Integer firstExpectedResult = 20;
		Integer secondExpectedResult = 15;
		Integer firstActualResult,secondActualResult;
		Originator originator = new Originator(initialValue);
		mem = originator.saveToMemento();
		originator.whatNext();
		firstActualResult = originator.whatNext();
		assertEquals("Wronge answer! ",firstExpectedResult, firstActualResult);
		originator.restoreFromMemento(mem); 
		secondActualResult = originator.whatNext();
		assertEquals("Wronge answer! ",secondExpectedResult, secondActualResult);
	}
}