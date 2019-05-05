/**
 * Exercise 2.5 for CPEN522
 * Add a unit test class for the model.Board.withinBorders method.
 */
package org.jpacman.test.framework.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.jpacman.framework.model.Board;

/**
 * @author Group8
 *
 */
@RunWith(Parameterized.class)
public class WithinBordersTest {
	private Board board;
	private int x, y;
	private boolean inside;
	
	// we use a 5x5 board here
	private static final int WIDTH = 5;
	private static final int HEIGHT = 5;
	
	/**
	 * Create a new test case to test whether
	 * if the given position is within the 
	 * board.
	 * @param x
	 * @param y
	 * @param inside
	 */
	public WithinBordersTest(int x, int y, boolean inside) {
		this.x = x;
		this.y = y;
		this.inside = inside;
		board = new Board(WIDTH, HEIGHT);
	}
	
	/**
	 * The actual test case.
	 */
	@Test
	public void testWithinBorders() {
		assertThat(board.withinBorders(x, y), equalTo(inside));
	}
	
	/**
	 * Use the 1x1 domain testing strategy to
	 * create a serials of test cases with
	 * parameterized data.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] values = new Object[][] {
			{0, 1, true},
			{-1, 2, false},
			{5, 3, false},
			{4, 4, true},
			{1, 0, true},
			{2, -1, false},
			{3, 5, false},
			{4, 4, true}
		};
		return Arrays.asList(values);
	}
	
}
