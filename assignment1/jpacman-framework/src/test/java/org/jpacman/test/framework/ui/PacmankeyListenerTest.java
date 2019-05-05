/**
 * Test class for PacmanKeyListener
 */
package org.jpacman.test.framework.ui;

import static org.junit.Assert.*;

import org.junit.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.jpacman.framework.factory.FactoryException;
import org.jpacman.framework.ui.MainUI;

/**
 * @author group8
 *
 */
public class PacmankeyListenerTest {
	MainUI ui = new MainUI();
	
	/**
	 * Test method for KeyReleased. Since there is
	 * no any context in this method, so no any
	 * exception is expected.
	 * @throws FactoryException 
	 */
	@Test
	public void testKeyReleased() throws AWTException, FactoryException{
		Robot robot = new Robot();
		ui.initialize();
		ui.start();
		try {
		robot.keyRelease(KeyEvent.VK_UP);
		} catch (Exception e) {
		fail("keyReleased failed");
		}
	}

	/**
	 * Test method for KeyPressed(). We used 
	 * UI smoke testing to inspect that all the
	 * operations are performed.
	 * 
	 * The actions are:
	 * Start the game -> sleep for 3 seconds -> 
	 * go up -> go down -> stop the game ->
	 * sleep for 3 seconds -> start the game ->
	 * go left -> go right -> sleep for 3 seconds
	 * -> exit the game
	 * @throws FactoryException 
	 */
	@Test
	public void testKeyPressed() throws AWTException, FactoryException {
		Robot robot = new Robot();
		ui.initialize();
		ui.start();
		try {
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_Q);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_X);
		} catch (Exception e) {
		fail("KeyPressed failed");
		}
	}

}
