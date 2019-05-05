/**
 * Test class for FactoryException
 */
package org.jpacman.test.framework.factory;

import static org.junit.Assert.*;

import org.jpacman.framework.factory.FactoryException;
import org.junit.Test;

/**
 * @author group8
 *
 */
public class FactoryExceptionTest {
	private FactoryException factory_test1;
	private FactoryException factory_test2;
	String message1 = "Testing Factory Exception1";
	String message2 = "Testing Factory Exception2";
	Throwable error = new Throwable("Error");
	
	@Test 
	public void testFactoryException() {
		factory_test1 = new FactoryException(message1);
		try {
			throw factory_test1;
		} catch (FactoryException e) {
			assertEquals(message1, factory_test1.getMessage());
		}
	}
	
	@Test
	public void testFactoryException2() {
		factory_test2 = new FactoryException(message2, error);
		try {
			throw factory_test2;
		} catch (FactoryException e) {
			assertEquals(message2, factory_test2.getMessage());
			assertEquals(error, factory_test2.getCause());
		}
	}

}
