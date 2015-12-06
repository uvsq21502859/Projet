package uvsq.fr;

import org.junit.Test;

import junit.framework.TestCase;

public class Testeur extends TestCase {
	
	@Test
    public void testConcatenate() {
		String result = ("one"+"two");

        assertEquals("onetwo", result);

    }
	

}
