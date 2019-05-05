/**
 * Exercise 2.4 for CPEN522
 * Create a new test class for testing model.Board.
 */
package org.jpacman.test.framework.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import org.jpacman.framework.model.Board;
import org.jpacman.framework.model.Direction;
import org.jpacman.framework.model.Tile;
import org.jpacman.framework.model.IBoardInspector.SpriteType;
import org.jpacman.framework.model.Player;
import org.jpacman.framework.model.Sprite;
import org.jpacman.framework.model.Ghost;
import org.jpacman.framework.model.Food;
import org.jpacman.framework.model.Wall;

/**
 * @author Group8
 *
 */
public class BoardTest {
	private Board board, board_test1, board_test2;
	private final Sprite sprite = new Sprite() { };
	private final Player player = new Player() { };
	private final Ghost ghost = new Ghost() { };
	private final Food food = new Food() { };
	private final Wall wall = new Wall() { };
	private Tile tile_1_1, tile_1_2, tile_2_1, tile_2_2;
	private static final int WIDTH = 5, HEIGHT = 5;

	/**
	 * Set up a board with specified width and height.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		board = new Board(WIDTH, HEIGHT);
		tile_1_1 = board.tileAt(1, 1);
		tile_1_2 = board.tileAt(1, 2);
		tile_2_1 = board.tileAt(2, 1);
		tile_2_2 = board.tileAt(2, 2);
	}
	
	/**
	 * Test method for Board(), if we create the
	 * board object successfully, then the return
	 * value should not be null.
	 */
	@Test
	public void testBoard() {
		assertNotNull(board);
	}
	

	/**
	 * Test method for withinBorders()
	 */
	@Test
	public void testWithinBorders() {
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				assertTrue(board.withinBorders(x, y));
				}
			}
		assertFalse(board.withinBorders(-1, HEIGHT - 1));
		assertFalse(board.withinBorders(WIDTH, HEIGHT - 1));
		assertFalse(board.withinBorders(WIDTH - 1, -1));
		assertFalse(board.withinBorders(WIDTH - 1, HEIGHT));
		assertFalse(board.withinBorders(WIDTH, HEIGHT));
	}
	
	/**
	 * Test method for tileAt(). It is suppose to throw
	 * an AssertionError if we try to get a tile out of
	 * the board.
	 */
	@Test(expected = AssertionError.class)
	public void testTileAt_Outside() {
		board.tileAt(WIDTH, HEIGHT);
	}
	
	/**
	 * Test method for tileAt(). tileAt() shall return
	 * A tile with correct x, y positions.
	 */
	@Test
	public void testTileAt_Inside() {
		for (int x = 0; x < WIDTH; x++) {
			for (int y = 0; y < HEIGHT; y++) {
				assertThat(board.tileAt(x, y).getX(), equalTo(x));
				assertThat(board.tileAt(x, y).getY(), equalTo(y));
			}
		}
	}
	
	/**
	 * Test method for getWidth(). It shall return 
	 * the correct width as assigned.
	 */
	@Test
	public void testGetWidth() {
		assertThat(board.getWidth(), equalTo(WIDTH));
		}
	
	/**
	 * Test method for getHeight(). It shall return 
	 * the correct height as assigned.
	 */
	@Test
	public void testGetHeight() {
		assertThat(board.getHeight(), equalTo(HEIGHT));
	}
	
	/**
	 * Test method for Board(). Test if an assertion 
	 * error is thrown when a negative width is 
	 * assigned.
	 */
	@Test(expected = AssertionError.class)
	public void testBoardWithNegativeWidth() {
		board_test1 = new Board(-1, HEIGHT);
	}
	
	/**
	 * Test method for Board(). Test if an assertion 
	 * error is thrown when a negative height is 
	 * assigned.
	 */
	@Test(expected = AssertionError.class)
	public void testBoardWithNegativeHeight() {
		board_test2 = new Board(WIDTH, -1);
	}
	
	/**
	 * Test method for put(). Test if an assertion
	 * error is thrown when putting a sprite at 
	 * the outside of the board.
	 */
	@Test(expected = AssertionError.class)
	public void testPutASpriteOutside() {
		board.put(sprite, -1, -1);
	}
	
	/**
	 * Test method for put(). Test if an assertion
	 * error is thrown when putting a null.
	 */
	@Test(expected = AssertionError.class)
	public void testPutNull() {
		board.put(null, 0, 0);
	}
	
	/**
	 * Test method for put(). Test if an assertion 
	 * error is thrown when putting an occupied 
	 * sprite.
	 */
	@Test(expected = AssertionError.class)
	public void testPutOccupiedPlayer() {
		player.occupy(tile_1_1);
		board.put(player, 1, 1);
	}
	
	/**
	 * Test method for spriteAt(). Test if 
	 * an assertion error is thrown when giving
	 * a sprite that is out the board.
	 */
	@Test(expected = AssertionError.class)
	public void testSpriteAtOutside() {
		board.spriteAt(-1, -1);
	}
	
	/**
	 * Test method for spriteAt(). Test if the method
	 * returns null when it should be.
	 */
	@Test
	public void testSpriteAtReturnNull() {
		assertNull(board.spriteAt(2, 2));
	}
	
	/**
	 * Test method for spriteAt(). Test the generic 
	 * function of the method.
	 */
	@Test
	public void testSpriteAtReturnNormal() {
		board.put(sprite, 2, 2);
		assertThat(board.spriteAt(2, 2), equalTo(sprite));
	}
	
	/**
	 * Test method for spriteTypeAt(). Test if 
	 * an assertion error is thrown when trying
	 * to find a sprite type which is not on the
	 * board.
	 */
	@Test(expected = AssertionError.class)
	public void testSpriteTypeAtOutside() {
		board.spriteTypeAt(-1, -1);
	}

	/**
	 * Test method for spriteTypeAt(). Test the 
	 * generic functions.
	 */
	@Test
	public void testSpriteTypeAt() {
		assertThat(board.spriteTypeAt(2, 2), equalTo(SpriteType.EMPTY));
		board.put(player, 3, 1);
		assertThat(board.spriteTypeAt(3, 1), equalTo(SpriteType.PLAYER));
		board.put(ghost, 3, 2);
		assertThat(board.spriteTypeAt(3, 2), equalTo(SpriteType.GHOST));
		board.put(food, 3, 3);
		assertThat(board.spriteTypeAt(3, 3), equalTo(SpriteType.FOOD));
		board.put(wall, 3, 4);
		assertThat(board.spriteTypeAt(3, 4), equalTo(SpriteType.WALL));
	}
	
	/**
	 * Test method for tileAtOffset(). Test if it
	 * throws an assertion error if the start is
	 * null.
	 */
	@Test(expected = AssertionError.class)
	public void testTileAtOffsetNull() {
		board.tileAtOffset(null, 1, 1);
	}
	
	/**
	 * Test method for tileAtOffset(). Test if it
	 * throws an assertion error if the start is not
	 * on the board.
	 */
	@Test(expected = AssertionError.class)
	public void testTileAtOffsetStartFromOutside() {
		board.tileAtOffset(board.tileAt(-1, -1), 1, 1);
	}
	
	/**
	 * Test method for tileAtDirection(). Test the 
	 * basic functions.
	 */
	@Test
	public void testTileAtDirection() {
		assertThat(board.tileAtDirection(tile_1_1, Direction.DOWN), equalTo(tile_1_2));
		assertThat(board.tileAtDirection(tile_1_1, Direction.RIGHT), equalTo(tile_2_1));
		assertThat(board.tileAtDirection(tile_2_2, Direction.UP), equalTo(tile_2_1));
		assertThat(board.tileAtDirection(tile_2_2, Direction.LEFT), equalTo(tile_1_2));
	}
	
	/**
	 * Test method for tileAtOffset(). Test the 
	 * basic functions.
	 */
	@Test
	public void testTileAtOffset() {
		assertThat(board.tileAtOffset(tile_1_1, 1, 1), equalTo(tile_2_2));
		assertThat(board.tileAtOffset(tile_1_1, WIDTH, 1), equalTo(tile_1_2));
		assertThat(board.tileAtOffset(tile_1_1, 1, HEIGHT), equalTo(tile_2_1));
		assertThat(board.tileAtOffset(tile_1_1, WIDTH, HEIGHT), equalTo(tile_1_1));
	}

}
