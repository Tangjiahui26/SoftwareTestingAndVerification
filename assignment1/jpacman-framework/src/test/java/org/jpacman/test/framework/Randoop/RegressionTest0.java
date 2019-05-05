package org.jpacman.test.framework.Randoop;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY;
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.WALL;
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.OTHER;
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.OTHER + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.OTHER));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        int int2 = food0.getPoints();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER;
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST;
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.jpacman.framework.model.Food.DEFAULT_POINTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        try {
            org.jpacman.framework.model.Tile tile9 = null; // flaky: board2.tileAtOffset(tile5, 100, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        java.util.Observer observer4 = null;
        try {
// flaky:             game0.attach(observer4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        try {
            org.jpacman.framework.model.Tile tile8 = null; // flaky: board2.tileAt(0, 62);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.Observer observer1 = null;
        try {
// flaky:             game0.attach(observer1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        int int13 = food12.getPoints();
        int int14 = food12.getPoints();
        boolean boolean15 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food12);
        org.jpacman.framework.model.Sprite sprite16 = tile9.topSprite();
        org.jpacman.framework.model.Player player17 = new org.jpacman.framework.model.Player();
        int int19 = player17.addPoints((int) (short) 10);
        int int20 = player17.getPoints();
        int int22 = player17.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction23 = player17.getDirection();
        try {
            org.jpacman.framework.model.Tile tile24 = null; // flaky: board2.tileAtDirection(tile9, direction23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sprite16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 62 + "'", int22 == 62);
        org.junit.Assert.assertTrue("'" + direction23 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction23.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        int int11 = player8.getPoints();
        int int13 = player8.addPoints((int) '4');
        boolean boolean14 = tile5.containsSprite((org.jpacman.framework.model.Sprite) player8);
        try {
            org.jpacman.framework.model.Tile tile17 = null; // flaky: board2.tileAtOffset(tile5, 0, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        try {
            org.jpacman.framework.model.Sprite sprite9 = null; // flaky: board2.spriteAt((int) (byte) -1, 20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNull(iBoardInspector5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food7 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food7.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food7.getSpriteType();
        boolean boolean10 = tile6.containsSprite((org.jpacman.framework.model.Sprite) food7);
        org.jpacman.framework.model.Sprite sprite11 = tile6.topSprite();
        org.jpacman.framework.model.Direction direction12 = org.jpacman.framework.model.Direction.RIGHT;
        int int13 = direction12.getDx();
        try {
            org.jpacman.framework.model.Tile tile14 = null; // flaky: board2.tileAtDirection(tile6, direction12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction12.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        try {
            org.jpacman.framework.model.Tile tile5 = null; // flaky: board2.tileAt(1, 62);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        org.jpacman.framework.model.Tile tile8 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int9 = tile8.getX();
        int int10 = tile8.getX();
        org.jpacman.framework.model.Food food11 = new org.jpacman.framework.model.Food();
        int int12 = food11.getPoints();
        int int13 = food11.getPoints();
        boolean boolean14 = tile8.containsSprite((org.jpacman.framework.model.Sprite) food11);
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = player15.getSpriteType();
        org.jpacman.framework.model.Direction direction19 = org.jpacman.framework.model.Direction.LEFT;
        int int20 = direction19.getDx();
        player15.setDirection(direction19);
        try {
            org.jpacman.framework.model.Tile tile22 = null; // flaky: board2.tileAtDirection(tile8, direction19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + spriteType18 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType18.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction19.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite9 = null; // flaky: board2.spriteAt(1, 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        food0.setPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        try {
            org.jpacman.framework.model.Tile tile9 = null; // flaky: board2.tileAtOffset(tile6, (int) (short) -1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite6 = null; // flaky: board2.spriteAt(0, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int11 = tile10.getX();
        int int12 = tile10.getX();
        int int13 = tile10.getX();
        org.jpacman.framework.model.Direction direction14 = org.jpacman.framework.model.Direction.LEFT;
        try {
            org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile10, direction14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite10 = null; // flaky: board2.spriteAt(100, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        try {
            org.jpacman.framework.model.Sprite sprite8 = null; // flaky: board2.spriteAt((int) ' ', (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite10 = tile9.topSprite();
        try {
            org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtOffset(tile9, 0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNull(sprite10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) (short) 1, (int) (byte) 1);
        try {
            org.jpacman.framework.model.Tile tile12 = null; // flaky: board2.tileAt((-1), (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board5 = game4.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        game4.addGhost(ghost6);
        org.jpacman.framework.model.Direction direction8 = null;
        try {
            game0.moveGhost(ghost6, direction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(board5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        try {
            org.jpacman.framework.model.Board board2 = null; // flaky: new org.jpacman.framework.model.Board((int) (short) 1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 100);
        try {
            org.jpacman.framework.model.Sprite sprite13 = null; // flaky: board2.spriteAt(0, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            org.jpacman.framework.model.Board board2 = null; // flaky: new org.jpacman.framework.model.Board(1, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(52, (int) (short) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        boolean boolean11 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food8);
        int int12 = food8.getPoints();
        game0.addFood(food8);
        java.util.Observer observer14 = null;
        try {
            game0.addObserver(observer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((-1), (int) (short) 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        level0.setMapFile("FOOD occupying null");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor4 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: FOOD occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        java.lang.String str7 = tile2.toString();
        java.lang.String str8 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite9 = tile2.topSprite();
        org.jpacman.framework.model.Sprite sprite10 = tile2.topSprite();
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,100]" + "'", str7.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,100]" + "'", str8.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite9);
        org.junit.Assert.assertNull(sprite10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getX();
        int int9 = tile7.getX();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        int int15 = player10.addPoints((int) '4');
        boolean boolean16 = tile7.containsSprite((org.jpacman.framework.model.Sprite) player10);
        java.lang.Class<?> wildcardClass17 = tile7.getClass();
        try {
            org.jpacman.framework.model.Tile tile20 = null; // flaky: board2.tileAtOffset(tile7, 62, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        try {
            org.jpacman.framework.model.Sprite sprite5 = null; // flaky: board2.spriteAt((int) (short) 0, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        int int9 = tile6.getX();
        player0.occupy(tile6);
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        org.jpacman.framework.model.Sprite sprite12 = tile2.topSprite();
        int int13 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(sprite12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        java.util.Observer observer7 = null;
        try {
            game0.addObserver(observer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        pointManager0.addPointsToBoard((int) 'a');
        int int4 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        int int16 = tile13.getX();
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        org.jpacman.framework.model.Tile tile18 = null; // flaky: board2.tileAtDirection(tile13, direction17);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = null; // flaky: board2.spriteTypeAt(10, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction17.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        java.util.Observer observer11 = null;
        try {
            game0.addObserver(observer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.RIGHT;
        int int1 = direction0.getDx();
        int int2 = direction0.getDy();
        int int3 = direction0.getDy();
        int int4 = direction0.getDy();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction0.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        java.util.Observer observer6 = null;
        try {
            game0.addObserver(observer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType0 = org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD;
        java.lang.Class<?> wildcardClass1 = spriteType0.getClass();
        org.junit.Assert.assertTrue("'" + spriteType0 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType0.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        int int5 = game0.countObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        java.lang.String str16 = tile5.toString();
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1,100]" + "'", str16.equals("[-1,100]"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        java.util.Observer observer12 = null;
        try {
// flaky:             game0.attach(observer12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        boolean boolean13 = game11.won();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        int int20 = food19.getPoints();
        int int21 = food19.getPoints();
        boolean boolean22 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food19);
        int int23 = food19.getPoints();
        game11.addFood(food19);
        org.jpacman.framework.model.Ghost ghost25 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost25.getSpriteType();
        game11.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost25.getSpriteType();
        org.jpacman.framework.model.Direction direction31 = org.jpacman.framework.model.Direction.DOWN;
        try {
            game0.moveGhost(ghost25, direction31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + direction31 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction31.equals(org.jpacman.framework.model.Direction.DOWN));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.IBoardInspector iBoardInspector12 = game0.getBoardInspector();
        boolean boolean13 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(iBoardInspector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int13 = player5.addPoints(0);
        org.jpacman.framework.model.Tile tile14 = player5.getTile();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertNull(tile14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        boolean boolean18 = player14.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = player14.getSpriteType();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player14, (int) (byte) 1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile3 = player0.getTile();
        org.junit.Assert.assertNull(tile3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        org.jpacman.framework.model.Direction direction6 = org.jpacman.framework.model.Direction.RIGHT;
        java.lang.Class<?> wildcardClass7 = direction6.getClass();
        int int8 = direction6.getDy();
        try {
            org.jpacman.framework.model.Tile tile9 = null; // flaky: board2.tileAtDirection(tile5, direction6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction6.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        boolean boolean6 = player3.isAlive();
        player3.die();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        boolean boolean11 = player8.isAlive();
        org.jpacman.framework.model.Tile tile14 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int15 = tile14.getX();
        int int16 = tile14.getX();
        int int17 = tile14.getX();
        player8.occupy(tile14);
        player3.occupy(tile14);
        player0.occupy(tile14);
        player0.die();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        try {
            game0.addObserver(observer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 100);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        org.jpacman.framework.model.PointManager pointManager13 = game11.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList14 = game11.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector15 = game11.getBoardInspector();
        boolean boolean16 = game11.hasChanged();
        org.jpacman.framework.model.Game game17 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player18 = game17.getPlayer();
        boolean boolean19 = game17.won();
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int23 = tile22.getX();
        int int24 = tile22.getX();
        org.jpacman.framework.model.Food food25 = new org.jpacman.framework.model.Food();
        int int26 = food25.getPoints();
        int int27 = food25.getPoints();
        boolean boolean28 = tile22.containsSprite((org.jpacman.framework.model.Sprite) food25);
        int int29 = food25.getPoints();
        game17.addFood(food25);
        org.jpacman.framework.model.Ghost ghost31 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost31.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost31.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost31.getSpriteType();
        game17.addGhost(ghost31);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost31.getSpriteType();
        game11.addGhost(ghost31);
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) ghost31, 104, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertNotNull(pointManager13);
        org.junit.Assert.assertNotNull(ghostList14);
        org.junit.Assert.assertNull(iBoardInspector15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(player18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        boolean boolean3 = pointManager0.allEaten();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        boolean boolean7 = player4.isAlive();
        int int9 = player4.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player4.getSpriteType();
        boolean boolean11 = player4.isAlive();
// flaky:         pointManager0.consumePointsOnBoard(player4, (int) (byte) 1);
        int int14 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        boolean boolean6 = game4.won();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        int int13 = food12.getPoints();
        int int14 = food12.getPoints();
        boolean boolean15 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food12);
        int int16 = food12.getPoints();
        game4.addFood(food12);
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost18.getSpriteType();
        game4.addGhost(ghost18);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost18.getSpriteType();
        game0.addGhost(ghost18);
        org.jpacman.framework.model.Game game27 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player28 = game27.getPlayer();
        org.jpacman.framework.model.PointManager pointManager29 = game27.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList30 = game27.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector31 = game27.getBoardInspector();
        game27.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board36 = new org.jpacman.framework.model.Board(0, 20);
        int int37 = board36.getHeight();
        game27.setBoard(board36);
        org.jpacman.framework.model.Ghost ghost39 = new org.jpacman.framework.model.Ghost();
        game27.addGhost(ghost39);
        org.jpacman.framework.model.Direction direction41 = null;
        try {
            game0.moveGhost(ghost39, direction41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(player28);
        org.junit.Assert.assertNotNull(pointManager29);
        org.junit.Assert.assertNotNull(ghostList30);
        org.junit.Assert.assertNull(iBoardInspector31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        boolean boolean7 = game5.won();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        int int11 = player8.getPoints();
        int int13 = player8.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player8.getSpriteType();
        game5.addPlayer(player8);
        game0.addPlayer(player8);
        java.util.Observer observer17 = null;
        try {
            game0.addObserver(observer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(94, 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        java.lang.String str7 = food3.toString();
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FOOD occupying null" + "'", str7.equals("FOOD occupying null"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        boolean boolean8 = board2.withinBorders(20, (int) (byte) 10);
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food12.getSpriteType();
        boolean boolean15 = tile11.containsSprite((org.jpacman.framework.model.Sprite) food12);
        java.lang.String str16 = tile11.toString();
        try {
            org.jpacman.framework.model.Tile tile19 = null; // flaky: board2.tileAtOffset(tile11, 104, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1,100]" + "'", str16.equals("[-1,100]"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.getFoodEaten();
        int int3 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        boolean boolean6 = game4.won();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        int int13 = food12.getPoints();
        int int14 = food12.getPoints();
        boolean boolean15 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food12);
        int int16 = food12.getPoints();
        game4.addFood(food12);
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost18.getSpriteType();
        game4.addGhost(ghost18);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost18.getSpriteType();
        game0.addGhost(ghost18);
        java.util.Observer observer27 = null;
        try {
// flaky:             game0.attach(observer27);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = null; // flaky: board2.spriteTypeAt((int) (short) 1, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        int int16 = board2.getHeight();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        org.jpacman.framework.model.Player player22 = new org.jpacman.framework.model.Player();
        int int24 = player22.addPoints((int) (short) 10);
        int int25 = player22.getPoints();
        int int27 = player22.addPoints((int) '4');
        boolean boolean28 = tile19.containsSprite((org.jpacman.framework.model.Sprite) player22);
        int int29 = tile19.getY();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        int int33 = player30.getPoints();
        org.jpacman.framework.model.Direction direction34 = player30.getDirection();
        org.jpacman.framework.model.Tile tile35 = null; // flaky: board2.tileAtDirection(tile19, direction34);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = null; // flaky: board2.spriteTypeAt((int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction34.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile35);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        int int4 = board2.getWidth();
        try {
            org.jpacman.framework.model.Sprite sprite7 = null; // flaky: board2.spriteAt((-1), 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        java.util.Observer observer4 = null;
        try {
            game0.addObserver(observer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        try {
// flaky:             game0.attach(observer5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) (short) 1, 52);
        try {
            org.jpacman.framework.model.Sprite sprite12 = null; // flaky: board2.spriteAt((int) (byte) -1, 62);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        player3.die();
        player3.resurrect();
        org.jpacman.framework.model.Tile tile8 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        boolean boolean12 = tile8.containsSprite((org.jpacman.framework.model.Sprite) food9);
        java.lang.String str13 = tile8.toString();
        java.lang.String str14 = tile8.toString();
        org.jpacman.framework.model.Sprite sprite15 = tile8.topSprite();
        player3.occupy(tile8);
        org.jpacman.framework.model.Board board19 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food23 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = food23.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = food23.getSpriteType();
        boolean boolean26 = tile22.containsSprite((org.jpacman.framework.model.Sprite) food23);
        java.lang.String str27 = tile22.toString();
        org.jpacman.framework.model.Direction direction28 = org.jpacman.framework.model.Direction.RIGHT;
        int int29 = direction28.getDx();
        int int30 = direction28.getDy();
        int int31 = direction28.getDy();
        org.jpacman.framework.model.Tile tile32 = null; // flaky: board19.tileAtDirection(tile22, direction28);
        int int33 = board19.getHeight();
        org.jpacman.framework.model.Tile tile36 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int37 = tile36.getX();
        int int38 = tile36.getX();
        org.jpacman.framework.model.Player player39 = new org.jpacman.framework.model.Player();
        int int41 = player39.addPoints((int) (short) 10);
        int int42 = player39.getPoints();
        int int44 = player39.addPoints((int) '4');
        boolean boolean45 = tile36.containsSprite((org.jpacman.framework.model.Sprite) player39);
        int int46 = tile36.getY();
        org.jpacman.framework.model.Player player47 = new org.jpacman.framework.model.Player();
        player47.die();
        player47.resurrect();
        int int50 = player47.getPoints();
        org.jpacman.framework.model.Direction direction51 = player47.getDirection();
        org.jpacman.framework.model.Tile tile52 = null; // flaky: board19.tileAtDirection(tile36, direction51);
        try {
            org.jpacman.framework.model.Tile tile53 = null; // flaky: board2.tileAtDirection(tile8, direction51);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[-1,100]" + "'", str13.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,100]" + "'", str14.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite15);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[-1,100]" + "'", str27.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction28.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 62 + "'", int44 == 62);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + direction51 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction51.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.totalFoodInGame();
        int int4 = pointManager2.totalFoodInGame();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        try {
            org.jpacman.framework.model.Sprite sprite5 = null; // flaky: board2.spriteAt(104, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = null; // flaky: board2.spriteTypeAt((int) '#', 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getY();
        int int9 = tile7.getY();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.RIGHT;
        int int11 = direction10.getDx();
        int int12 = direction10.getDy();
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board4.tileAtDirection(tile7, direction10);
        int int14 = board4.getHeight();
        try {
            org.jpacman.framework.model.Tile tile17 = null; // flaky: board4.tileAt(94, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction10.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = null; // flaky: board2.spriteTypeAt((int) (byte) 100, 104);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        org.jpacman.framework.model.Ghost ghost4 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost4.getSpriteType();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) ghost4, 52, 62);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        boolean boolean18 = player14.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = player14.getSpriteType();
        player14.die();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player14, 0, 72);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 100);
        try {
            org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAt((int) ' ', 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        try {
            java.lang.Class<?> wildcardClass5 = player4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNull(player4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.Observer observer1 = null;
        try {
            game0.addObserver(observer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        player0.die();
        int int5 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        int int15 = food14.getPoints();
        int int16 = food14.getPoints();
        int int17 = food14.getPoints();
        java.lang.String str18 = food14.toString();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) food14, (int) 'a', (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "FOOD occupying null" + "'", str18.equals("FOOD occupying null"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        level0.setMapFile("[-1,100]");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor3 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: [-1,100] not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int3 = board2.getWidth();
        try {
            org.jpacman.framework.model.Tile tile6 = null; // flaky: board2.tileAt(52, 21);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        boolean boolean9 = game7.won();
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int13 = tile12.getX();
        int int14 = tile12.getX();
        org.jpacman.framework.model.Food food15 = new org.jpacman.framework.model.Food();
        int int16 = food15.getPoints();
        int int17 = food15.getPoints();
        boolean boolean18 = tile12.containsSprite((org.jpacman.framework.model.Sprite) food15);
        int int19 = food15.getPoints();
        game7.addFood(food15);
        java.lang.String str21 = food15.toString();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) food15, (int) ' ', 21);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "FOOD occupying null" + "'", str21.equals("FOOD occupying null"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying null");
        org.jpacman.framework.factory.IGameFactory iGameFactory9 = null;
// flaky:         level0.setFactory(iGameFactory9);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        game0.notifyObservers();
        game0.notifyObservers();
        org.jpacman.framework.model.Game game13 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player14 = game13.getPlayer();
        boolean boolean15 = game13.won();
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int19 = tile18.getX();
        int int20 = tile18.getX();
        org.jpacman.framework.model.Food food21 = new org.jpacman.framework.model.Food();
        int int22 = food21.getPoints();
        int int23 = food21.getPoints();
        boolean boolean24 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food21);
        int int25 = food21.getPoints();
        game13.addFood(food21);
        org.jpacman.framework.model.Ghost ghost27 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost27.getSpriteType();
        game13.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost27.getSpriteType();
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = player35.getSpriteType();
        org.jpacman.framework.model.Direction direction39 = org.jpacman.framework.model.Direction.LEFT;
        int int40 = direction39.getDx();
        player35.setDirection(direction39);
        try {
            game0.moveGhost(ghost27, direction39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(player14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction39 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction39.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        pointManager0.addPointsToBoard((int) 'a');
        boolean boolean4 = pointManager0.allEaten();
        pointManager0.addPointsToBoard((int) 'a');
        boolean boolean7 = pointManager0.allEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.deleteObservers();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        boolean boolean6 = game4.won();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        int int13 = food12.getPoints();
        int int14 = food12.getPoints();
        boolean boolean15 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food12);
        int int16 = food12.getPoints();
        game4.addFood(food12);
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost18.getSpriteType();
        game4.addGhost(ghost18);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost18.getSpriteType();
        game0.addGhost(ghost18);
        org.jpacman.framework.model.Food food27 = null;
        try {
            game0.addFood(food27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(62, (-1));
        java.lang.String str3 = tile2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[62,-1]" + "'", str3.equals("[62,-1]"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        boolean boolean4 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ghostList5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        boolean boolean7 = game5.won();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int11 = tile10.getX();
        int int12 = tile10.getX();
        org.jpacman.framework.model.Food food13 = new org.jpacman.framework.model.Food();
        int int14 = food13.getPoints();
        int int15 = food13.getPoints();
        boolean boolean16 = tile10.containsSprite((org.jpacman.framework.model.Sprite) food13);
        int int17 = food13.getPoints();
        game5.addFood(food13);
        org.jpacman.framework.model.Ghost ghost19 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = ghost19.getSpriteType();
        game5.addGhost(ghost19);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost19.getSpriteType();
        try {
// flaky:             board4.put((org.jpacman.framework.model.Sprite) ghost19, 100, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = null; // flaky: board2.spriteTypeAt((int) '4', (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        org.jpacman.framework.model.Sprite sprite7 = tile5.topSprite();
        player0.occupy(tile5);
        boolean boolean9 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(sprite7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        try {
            org.jpacman.framework.model.Sprite sprite11 = null; // flaky: board3.spriteAt(0, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        try {
            org.jpacman.framework.model.Tile tile11 = null; // flaky: board2.tileAt(0, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = null; // flaky: board2.spriteTypeAt((int) (short) -1, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        boolean boolean13 = game11.won();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        int int20 = food19.getPoints();
        int int21 = food19.getPoints();
        boolean boolean22 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food19);
        int int23 = food19.getPoints();
        game11.addFood(food19);
        org.jpacman.framework.model.Ghost ghost25 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost25.getSpriteType();
        game11.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost25.getSpriteType();
        org.jpacman.framework.model.Board board34 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite38 = tile37.topSprite();
        int int39 = tile37.getY();
        org.jpacman.framework.model.Tile tile42 = null; // flaky: board34.tileAtOffset(tile37, 100, 1);
        org.jpacman.framework.model.Tile tile45 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player46 = new org.jpacman.framework.model.Player();
        player46.die();
        player46.resurrect();
        org.jpacman.framework.model.Tile tile51 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food52 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType53 = food52.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType54 = food52.getSpriteType();
        boolean boolean55 = tile51.containsSprite((org.jpacman.framework.model.Sprite) food52);
        java.lang.String str56 = tile51.toString();
        java.lang.String str57 = tile51.toString();
        org.jpacman.framework.model.Sprite sprite58 = tile51.topSprite();
        player46.occupy(tile51);
        org.jpacman.framework.model.Direction direction60 = player46.getDirection();
        org.jpacman.framework.model.Tile tile61 = null; // flaky: board34.tileAtDirection(tile45, direction60);
        try {
            game0.moveGhost(ghost25, direction60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(sprite38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile42);
        org.junit.Assert.assertTrue("'" + spriteType53 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType53.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType54 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType54.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "[-1,100]" + "'", str56.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[-1,100]" + "'", str57.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite58);
        org.junit.Assert.assertTrue("'" + direction60 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction60.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile61);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Ghost ghost6 = null;
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        int int11 = player8.getPoints();
        int int13 = player8.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction14 = player8.getDirection();
        int int15 = direction14.getDy();
        try {
// flaky:             game0.movePlayer(direction14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        try {
            org.jpacman.framework.model.Board board2 = null; // flaky: new org.jpacman.framework.model.Board(10, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 100);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int21 = tile20.getX();
        int int22 = tile20.getX();
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        int int25 = player23.addPoints((int) (short) 10);
        int int26 = player23.getPoints();
        int int28 = player23.addPoints((int) '4');
        boolean boolean29 = tile20.containsSprite((org.jpacman.framework.model.Sprite) player23);
        boolean boolean30 = tile13.containsSprite((org.jpacman.framework.model.Sprite) player23);
        org.jpacman.framework.model.Sprite sprite31 = tile13.topSprite();
        try {
            org.jpacman.framework.model.Tile tile34 = null; // flaky: board2.tileAtOffset(tile13, 72, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(sprite31);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        try {
            org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAt((int) (short) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        boolean boolean9 = game0.won();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite6 = null; // flaky: board2.spriteAt((int) (byte) -1, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.totalFoodInGame();
        java.lang.Class<?> wildcardClass4 = pointManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.DOWN;
        player0.setDirection(direction17);
        int int19 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction17.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food8.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food8.getSpriteType();
        boolean boolean11 = tile7.containsSprite((org.jpacman.framework.model.Sprite) food8);
        game0.addFood(food8);
        org.jpacman.framework.model.Game game13 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player14 = game13.getPlayer();
        org.jpacman.framework.model.Player player15 = game13.getPlayer();
        org.jpacman.framework.model.Board board16 = game13.getBoard();
        int int17 = game13.countObservers();
        org.jpacman.framework.model.Game game18 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player19 = game18.getPlayer();
        org.jpacman.framework.model.PointManager pointManager20 = game18.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList21 = game18.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector22 = game18.getBoardInspector();
        boolean boolean23 = game18.hasChanged();
        org.jpacman.framework.model.Game game24 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player25 = game24.getPlayer();
        boolean boolean26 = game24.won();
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int30 = tile29.getX();
        int int31 = tile29.getX();
        org.jpacman.framework.model.Food food32 = new org.jpacman.framework.model.Food();
        int int33 = food32.getPoints();
        int int34 = food32.getPoints();
        boolean boolean35 = tile29.containsSprite((org.jpacman.framework.model.Sprite) food32);
        int int36 = food32.getPoints();
        game24.addFood(food32);
        org.jpacman.framework.model.Ghost ghost38 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost38.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost38.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = ghost38.getSpriteType();
        game24.addGhost(ghost38);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = ghost38.getSpriteType();
        game18.addGhost(ghost38);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType45 = ghost38.getSpriteType();
        game13.addGhost(ghost38);
        game0.addGhost(ghost38);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(player14);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertNull(board16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(player19);
        org.junit.Assert.assertNotNull(pointManager20);
        org.junit.Assert.assertNotNull(ghostList21);
        org.junit.Assert.assertNull(iBoardInspector22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(player25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType43 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType43.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType45 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType45.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        boolean boolean7 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.Observer observer4 = null;
        try {
// flaky:             game0.attach(observer4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getY();
        int int9 = tile7.getY();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.RIGHT;
        int int11 = direction10.getDx();
        int int12 = direction10.getDy();
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board4.tileAtDirection(tile7, direction10);
        int int14 = board4.getHeight();
        org.jpacman.framework.model.Food food15 = new org.jpacman.framework.model.Food();
        int int16 = food15.getPoints();
        int int17 = food15.getPoints();
        food15.setPoints((int) (byte) 0);
        int int20 = food15.getPoints();
        try {
// flaky:             board4.put((org.jpacman.framework.model.Sprite) food15, (-1), (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction10.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        org.jpacman.framework.model.PointManager pointManager6 = game4.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game4.getGhosts();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        boolean boolean10 = game8.won();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        org.jpacman.framework.model.Food food16 = new org.jpacman.framework.model.Food();
        int int17 = food16.getPoints();
        int int18 = food16.getPoints();
        boolean boolean19 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food16);
        int int20 = food16.getPoints();
        game8.addFood(food16);
        org.jpacman.framework.model.Ghost ghost22 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost22.getSpriteType();
        game8.addGhost(ghost22);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost22.getSpriteType();
        game4.addGhost(ghost22);
        game0.addGhost(ghost22);
        org.jpacman.framework.model.PointManager pointManager32 = game0.getPointManager();
        java.util.Observer observer33 = null;
        try {
            game0.addObserver(observer33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(pointManager32);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        try {
            org.jpacman.framework.model.Sprite sprite8 = null; // flaky: board2.spriteAt((int) (short) 100, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.deleteObservers();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        org.jpacman.framework.model.PointManager pointManager5 = game3.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game3.getGhosts();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        boolean boolean9 = game7.won();
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int13 = tile12.getX();
        int int14 = tile12.getX();
        org.jpacman.framework.model.Food food15 = new org.jpacman.framework.model.Food();
        int int16 = food15.getPoints();
        int int17 = food15.getPoints();
        boolean boolean18 = tile12.containsSprite((org.jpacman.framework.model.Sprite) food15);
        int int19 = food15.getPoints();
        game7.addFood(food15);
        org.jpacman.framework.model.Ghost ghost21 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost21.getSpriteType();
        game7.addGhost(ghost21);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost21.getSpriteType();
        game3.addGhost(ghost21);
        game0.addGhost(ghost21);
        game0.deleteObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertNotNull(pointManager5);
        org.junit.Assert.assertNotNull(ghostList6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.deleteObservers();
        java.util.Observer observer3 = null;
        try {
            game0.addObserver(observer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        player5.resurrect();
        boolean boolean14 = player5.isAlive();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        try {
            org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAt((int) '4', 19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost3.occupy(tile7);
        ghost3.deoccupy();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        int int4 = board2.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = null; // flaky: board2.spriteTypeAt((int) (short) 100, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food7 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food7.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food7.getSpriteType();
        boolean boolean10 = tile6.containsSprite((org.jpacman.framework.model.Sprite) food7);
        org.jpacman.framework.model.Direction direction11 = null;
        try {
            org.jpacman.framework.model.Tile tile12 = board2.tileAtDirection(tile6, direction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        game0.notifyObservers((java.lang.Object) pointManager8);
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        game0.addPlayer(player10);
        java.util.Observer observer15 = null;
        try {
// flaky:             game0.attach(observer15);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        java.lang.String str4 = player0.toString();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.DOWN;
        int int6 = direction5.getDx();
        player0.setDirection(direction5);
        int int8 = direction5.getDy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "PLAYER occupying null" + "'", str4.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction5.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        org.jpacman.framework.model.Wall wall8 = new org.jpacman.framework.model.Wall();
        java.lang.String str9 = wall8.toString();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) wall8, 10, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "WALL occupying null" + "'", str9.equals("WALL occupying null"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        boolean boolean4 = player0.isAlive();
        boolean boolean5 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        int int9 = tile6.getX();
        player0.occupy(tile6);
        org.jpacman.framework.model.Sprite sprite11 = tile6.topSprite();
        java.lang.String str12 = tile6.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(sprite11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[10,-1]" + "'", str12.equals("[10,-1]"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = null; // flaky: board2.spriteTypeAt(10, 19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        game0.notifyObservers((java.lang.Object) pointManager8);
        boolean boolean10 = pointManager8.allEaten();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor6 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code a");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        try {
            org.jpacman.framework.model.Board board2 = null; // flaky: new org.jpacman.framework.model.Board((-1), (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        int int16 = board2.getHeight();
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        int int18 = food17.getPoints();
        int int19 = food17.getPoints();
        int int20 = food17.getPoints();
        java.lang.String str21 = food17.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food17.getSpriteType();
        java.lang.Class<?> wildcardClass23 = food17.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = food17.getSpriteType();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) food17, (int) (short) 10, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "FOOD occupying null" + "'", str21.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        java.util.Observer observer13 = null;
        game0.deleteObserver(observer13);
        java.util.Observer observer15 = null;
        try {
            game0.addObserver(observer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        try {
            org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAt((int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        int int15 = player12.getPoints();
        int int17 = player12.addPoints((int) '4');
        boolean boolean18 = tile9.containsSprite((org.jpacman.framework.model.Sprite) player12);
        boolean boolean19 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player12);
        int int20 = player12.getPoints();
        org.jpacman.framework.model.Tile tile21 = player12.getTile();
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 62 + "'", int17 == 62);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 62 + "'", int20 == 62);
        org.junit.Assert.assertNull(tile21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food11 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food11.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food11.getSpriteType();
        boolean boolean14 = tile10.containsSprite((org.jpacman.framework.model.Sprite) food11);
        java.lang.String str15 = tile10.toString();
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.RIGHT;
        int int17 = direction16.getDx();
        int int18 = direction16.getDy();
        int int19 = direction16.getDy();
        org.jpacman.framework.model.Tile tile20 = null; // flaky: board7.tileAtDirection(tile10, direction16);
        game3.setBoard(board7);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = null; // flaky: board7.spriteTypeAt((int) (byte) 100, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1,100]" + "'", str15.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction16.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        food0.setPoints((-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.jpacman.framework.model.Tile tile5 = food0.getTile();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNull(tile5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        int int16 = board2.getHeight();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        org.jpacman.framework.model.Player player22 = new org.jpacman.framework.model.Player();
        int int24 = player22.addPoints((int) (short) 10);
        int int25 = player22.getPoints();
        int int27 = player22.addPoints((int) '4');
        boolean boolean28 = tile19.containsSprite((org.jpacman.framework.model.Sprite) player22);
        int int29 = tile19.getY();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        int int33 = player30.getPoints();
        org.jpacman.framework.model.Direction direction34 = player30.getDirection();
        org.jpacman.framework.model.Tile tile35 = null; // flaky: board2.tileAtDirection(tile19, direction34);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = null; // flaky: board2.spriteTypeAt((int) (byte) 1, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction34.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile35);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player0.getSpriteType();
        boolean boolean9 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        game0.deleteObservers();
        org.jpacman.framework.model.Ghost ghost4 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost4.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = ghost4.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost4.getSpriteType();
        game0.addGhost(ghost4);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        int int7 = pointManager3.getFoodEaten();
        int int8 = pointManager3.totalFoodInGame();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        boolean boolean7 = game0.hasChanged();
        org.jpacman.framework.model.Ghost ghost8 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = ghost8.getSpriteType();
        game0.addGhost(ghost8);
        java.util.Observer observer11 = null;
        try {
// flaky:             game0.attach(observer11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.Observer observer5 = null;
        try {
            game0.addObserver(observer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.Ghost ghost12 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost12);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = ghost12.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(54, (int) (byte) 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(54, (int) '#');
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = null; // flaky: board2.spriteTypeAt(19, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        org.jpacman.framework.model.Sprite sprite18 = tile13.topSprite();
        player7.occupy(tile13);
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player7.occupy(tile22);
// flaky:         pointManager3.consumePointsOnBoard(player7, (int) 'a');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = player7.getSpriteType();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sprite18);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        try {
            org.jpacman.framework.model.Tile tile18 = null; // flaky: board2.tileAt(72, 62);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        java.lang.String str11 = tile5.toString();
        org.jpacman.framework.model.Sprite sprite12 = tile5.topSprite();
        player0.occupy(tile5);
        org.jpacman.framework.model.Direction direction14 = player0.getDirection();
        int int15 = direction14.getDx();
        int int16 = direction14.getDx();
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1,100]" + "'", str11.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite12);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = ghost0.getSpriteType();
        java.lang.Class<?> wildcardClass3 = ghost0.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost3.occupy(tile7);
        org.jpacman.framework.model.PointManager pointManager9 = new org.jpacman.framework.model.PointManager();
        boolean boolean10 = pointManager9.allEaten();
        int int11 = pointManager9.totalFoodInGame();
        int int12 = pointManager9.getFoodEaten();
        int int13 = pointManager9.totalFoodInGame();
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        player14.die();
        player14.resurrect();
        int int17 = player14.getPoints();
// flaky:         pointManager9.consumePointsOnBoard(player14, (int) (byte) 1);
        boolean boolean20 = tile7.containsSprite((org.jpacman.framework.model.Sprite) player14);
        java.lang.String str21 = tile7.toString();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1,20]" + "'", str21.equals("[-1,20]"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, (int) (byte) 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        int int8 = tile5.getX();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        int int12 = player9.getPoints();
        int int14 = player9.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction15 = player9.getDirection();
        int int16 = direction15.getDy();
        try {
            org.jpacman.framework.model.Tile tile17 = null; // flaky: board2.tileAtDirection(tile5, direction15);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction15.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(20, (int) (short) -1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        int int17 = tile11.getY();
        int int18 = tile11.getX();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        game0.addFood(food9);
        org.jpacman.framework.model.Board board15 = new org.jpacman.framework.model.Board(0, 20);
        int int16 = board15.getHeight();
        int int17 = board15.getWidth();
        int int18 = board15.getWidth();
        game0.setBoard(board15);
        int int20 = game0.countObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = null; // flaky: board2.spriteTypeAt(72, 20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.RIGHT;
        int int1 = direction0.getDx();
        int int2 = direction0.getDx();
        int int3 = direction0.getDx();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction0.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        boolean boolean5 = game3.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        game3.addPlayer(player6);
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = food17.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = food17.getSpriteType();
        boolean boolean20 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food17);
        java.lang.String str21 = tile16.toString();
        java.lang.String str22 = tile16.toString();
        org.jpacman.framework.model.Sprite sprite23 = tile16.topSprite();
        player6.occupy(tile16);
// flaky:         pointManager0.consumePointsOnBoard(player6, 19);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        int int30 = player27.getPoints();
        int int32 = player27.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = player27.getSpriteType();
        int int35 = player27.addPoints((int) (short) 10);
        player27.resurrect();
        player27.die();
// flaky:         pointManager0.consumePointsOnBoard(player27, 0);
        player27.die();
        boolean boolean41 = player27.isAlive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType18 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType18.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1,100]" + "'", str21.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1,100]" + "'", str22.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 62 + "'", int32 == 62);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 72 + "'", int35 == 72);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        int int5 = pointManager0.totalFoodInGame();
        int int6 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        int int9 = tile6.getX();
        player0.occupy(tile6);
        player0.die();
        int int13 = 0; // flaky: player0.addPoints(72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 82 + "'", int13 == 82);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        boolean boolean5 = game3.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        game3.addPlayer(player6);
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = food17.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = food17.getSpriteType();
        boolean boolean20 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food17);
        java.lang.String str21 = tile16.toString();
        java.lang.String str22 = tile16.toString();
        org.jpacman.framework.model.Sprite sprite23 = tile16.topSprite();
        player6.occupy(tile16);
// flaky:         pointManager0.consumePointsOnBoard(player6, 19);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        int int30 = player27.getPoints();
        int int32 = player27.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = player27.getSpriteType();
        int int35 = player27.addPoints((int) (short) 10);
        player27.resurrect();
        player27.die();
// flaky:         pointManager0.consumePointsOnBoard(player27, 0);
        int int40 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType18 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType18.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1,100]" + "'", str21.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1,100]" + "'", str22.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 62 + "'", int32 == 62);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 72 + "'", int35 == 72);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = ghost0.getSpriteType();
        java.lang.Class<?> wildcardClass3 = ghost0.getClass();
        org.jpacman.framework.model.Tile tile4 = ghost0.getTile();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(tile4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(94, (int) '#');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        boolean boolean7 = player4.isAlive();
        player4.die();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        boolean boolean12 = player9.isAlive();
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int16 = tile15.getX();
        int int17 = tile15.getX();
        int int18 = tile15.getX();
        player9.occupy(tile15);
        player4.occupy(tile15);
        org.jpacman.framework.model.Direction direction21 = org.jpacman.framework.model.Direction.LEFT;
        int int22 = direction21.getDx();
        player4.setDirection(direction21);
        boolean boolean24 = player4.isAlive();
        org.jpacman.framework.model.Level level25 = new org.jpacman.framework.model.Level();
        java.lang.String str26 = level25.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor27 = level25.parseMap();
        org.jpacman.framework.model.Game game28 = level25.getGame();
        org.jpacman.framework.model.Board board29 = game28.getBoard();
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getY();
        int int34 = tile32.getY();
        org.jpacman.framework.model.Direction direction35 = org.jpacman.framework.model.Direction.RIGHT;
        int int36 = direction35.getDx();
        int int37 = direction35.getDy();
        org.jpacman.framework.model.Tile tile38 = null; // flaky: board29.tileAtDirection(tile32, direction35);
        player4.setDirection(direction35);
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player4, 1, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction21.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "board.txt" + "'", str26.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor27);
        org.junit.Assert.assertNotNull(game28);
        org.junit.Assert.assertNotNull(board29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction35.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile38);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        int int5 = 0; // flaky: player0.addPoints((int) (short) 1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction7 = player0.getDirection();
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction7.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        level0.setMapFile("WALL occupying null");
        level0.setMapFile("FOOD occupying null");
        java.lang.String str10 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory11 = null;
// flaky:         level0.setFactory(iGameFactory11);
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor13 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: FOOD occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers();
        java.util.Observer observer6 = null;
        game0.deleteObserver(observer6);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        org.jpacman.framework.factory.IGameFactory iGameFactory7 = null;
// flaky:         level0.setFactory(iGameFactory7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        java.lang.String str3 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory4 = null;
// flaky:         level0.setFactory(iGameFactory4);
        org.jpacman.framework.model.Game game6 = level0.getGame();
        org.jpacman.framework.model.Ghost ghost7 = null;
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        player8.die();
        player8.resurrect();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Sprite sprite20 = tile13.topSprite();
        player8.occupy(tile13);
        org.jpacman.framework.model.Direction direction22 = player8.getDirection();
        int int23 = direction22.getDx();
        try {
            game6.moveGhost(ghost7, direction22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "board.txt" + "'", str3.equals("board.txt"));
        org.junit.Assert.assertNotNull(game6);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction22.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        player0.die();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.jpacman.framework.model.Player player10 = null;
        game0.addPlayer(player10);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        game0.notifyObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getY();
        int int9 = tile7.getY();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.RIGHT;
        int int11 = direction10.getDx();
        int int12 = direction10.getDy();
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board4.tileAtDirection(tile7, direction10);
        int int14 = board4.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite17 = null; // flaky: board4.spriteAt(62, 104);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction10.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        java.lang.String str14 = tile13.toString();
        org.jpacman.framework.model.Direction direction15 = org.jpacman.framework.model.Direction.RIGHT;
        java.lang.Class<?> wildcardClass16 = direction15.getClass();
        int int17 = direction15.getDy();
        int int18 = direction15.getDy();
        int int19 = direction15.getDy();
        try {
            org.jpacman.framework.model.Tile tile20 = null; // flaky: board5.tileAtDirection(tile13, direction15);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[35,10]" + "'", str14.equals("[35,10]"));
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction15.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        int int16 = board2.getHeight();
        boolean boolean19 = board2.withinBorders((int) ' ', (int) '#');
        try {
            org.jpacman.framework.model.Sprite sprite22 = null; // flaky: board2.spriteAt(104, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        game0.addFood(food9);
        org.jpacman.framework.model.Board board15 = new org.jpacman.framework.model.Board(0, 20);
        int int16 = board15.getHeight();
        int int17 = board15.getWidth();
        int int18 = board15.getWidth();
        game0.setBoard(board15);
        try {
            org.jpacman.framework.model.Sprite sprite22 = null; // flaky: board15.spriteAt(54, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) (short) 1, (int) (byte) 1);
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        int int11 = food10.getPoints();
        food10.setPoints((-1));
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) food10, 1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        boolean boolean11 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food8);
        int int12 = food8.getPoints();
        game0.addFood(food8);
        org.jpacman.framework.model.Ghost ghost14 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = ghost14.getSpriteType();
        game0.addGhost(ghost14);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost14.getSpriteType();
        org.jpacman.framework.model.Tile tile22 = ghost14.getTile();
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(20, (int) (short) 10);
        ghost14.occupy(tile25);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType17 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType17.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(tile22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Player player11 = game0.getPlayer();
        game0.notifyObservers();
        java.util.Observer observer13 = null;
        try {
// flaky:             game0.attach(observer13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(player11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        int int4 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        try {
            org.jpacman.framework.model.Tile tile6 = null; // flaky: board2.tileAt(52, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        java.util.Observer observer4 = null;
        try {
// flaky:             game0.attach(observer4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game5.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game5.getGhosts();
        org.jpacman.framework.model.Game game9 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player10 = game9.getPlayer();
        boolean boolean11 = game9.won();
        org.jpacman.framework.model.Tile tile14 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int15 = tile14.getX();
        int int16 = tile14.getX();
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        int int18 = food17.getPoints();
        int int19 = food17.getPoints();
        boolean boolean20 = tile14.containsSprite((org.jpacman.framework.model.Sprite) food17);
        int int21 = food17.getPoints();
        game9.addFood(food17);
        org.jpacman.framework.model.Ghost ghost23 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost23.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost23.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost23.getSpriteType();
        game9.addGhost(ghost23);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost23.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost23.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost23.getSpriteType();
        game5.addGhost(ghost23);
        game0.addGhost(ghost23);
        game0.deleteObservers();
        java.util.Observer observer34 = null;
        try {
            game0.addObserver(observer34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNotNull(pointManager7);
        org.junit.Assert.assertNotNull(ghostList8);
        org.junit.Assert.assertNull(player10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(21, 35);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction7 = org.jpacman.framework.model.Direction.RIGHT;
        int int8 = direction7.getDx();
        player0.setDirection(direction7);
        boolean boolean10 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction7.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("hi!");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor7 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: hi! not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        int int9 = tile6.getX();
        player0.occupy(tile6);
        org.jpacman.framework.model.Sprite sprite11 = tile6.topSprite();
        sprite11.deoccupy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(sprite11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        boolean boolean3 = pointManager0.allEaten();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        boolean boolean7 = player4.isAlive();
        int int9 = player4.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player4.getSpriteType();
        boolean boolean11 = player4.isAlive();
// flaky:         pointManager0.consumePointsOnBoard(player4, (int) (byte) 1);
        int int14 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        boolean boolean10 = game0.hasChanged();
        org.jpacman.framework.model.Board board11 = game0.getBoard();
        org.jpacman.framework.model.Board board14 = new org.jpacman.framework.model.Board(62, 10);
        int int15 = board14.getWidth();
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        int int22 = player19.getPoints();
        int int24 = player19.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction25 = player19.getDirection();
        int int26 = direction25.getDy();
        org.jpacman.framework.model.Tile tile27 = null; // flaky: board14.tileAtDirection(tile18, direction25);
        org.jpacman.framework.model.Tile tile30 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food31 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = food31.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = food31.getSpriteType();
        boolean boolean34 = tile30.containsSprite((org.jpacman.framework.model.Sprite) food31);
        org.jpacman.framework.model.Sprite sprite35 = tile30.topSprite();
        org.jpacman.framework.model.Tile tile38 = null; // flaky: board14.tileAtOffset(tile30, 100, (int) '4');
        org.jpacman.framework.model.Board board41 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile44 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food45 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = food45.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = food45.getSpriteType();
        boolean boolean48 = tile44.containsSprite((org.jpacman.framework.model.Sprite) food45);
        java.lang.String str49 = tile44.toString();
        org.jpacman.framework.model.Direction direction50 = org.jpacman.framework.model.Direction.RIGHT;
        int int51 = direction50.getDx();
        int int52 = direction50.getDy();
        int int53 = direction50.getDy();
        org.jpacman.framework.model.Tile tile54 = null; // flaky: board41.tileAtDirection(tile44, direction50);
        int int55 = board41.getHeight();
        org.jpacman.framework.model.Tile tile58 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int59 = tile58.getX();
        int int60 = tile58.getX();
        org.jpacman.framework.model.Player player61 = new org.jpacman.framework.model.Player();
        int int63 = player61.addPoints((int) (short) 10);
        int int64 = player61.getPoints();
        int int66 = player61.addPoints((int) '4');
        boolean boolean67 = tile58.containsSprite((org.jpacman.framework.model.Sprite) player61);
        int int68 = tile58.getY();
        org.jpacman.framework.model.Player player69 = new org.jpacman.framework.model.Player();
        player69.die();
        player69.resurrect();
        int int72 = player69.getPoints();
        org.jpacman.framework.model.Direction direction73 = player69.getDirection();
        org.jpacman.framework.model.Tile tile74 = null; // flaky: board41.tileAtDirection(tile58, direction73);
        try {
            org.jpacman.framework.model.Tile tile75 = null; // flaky: board11.tileAtDirection(tile30, direction73);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(board11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 62 + "'", int24 == 62);
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction25.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile27);
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(sprite35);
// flaky:         org.junit.Assert.assertNotNull(tile38);
        org.junit.Assert.assertTrue("'" + spriteType46 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType46.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType47 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType47.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[-1,100]" + "'", str49.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction50 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction50.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 62 + "'", int66 == 62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + direction73 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction73.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile74);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        boolean boolean7 = pointManager0.allEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Board board13 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        int int14 = board13.getHeight();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        int int18 = player15.getPoints();
        boolean boolean19 = player15.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = player15.getSpriteType();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        player21.die();
        player21.resurrect();
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        int int26 = player24.addPoints((int) (short) 10);
        boolean boolean27 = player24.isAlive();
        player24.die();
        org.jpacman.framework.model.Player player29 = new org.jpacman.framework.model.Player();
        int int31 = player29.addPoints((int) (short) 10);
        boolean boolean32 = player29.isAlive();
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int36 = tile35.getX();
        int int37 = tile35.getX();
        int int38 = tile35.getX();
        player29.occupy(tile35);
        player24.occupy(tile35);
        player21.occupy(tile35);
        player15.occupy(tile35);
        org.jpacman.framework.model.Player player43 = new org.jpacman.framework.model.Player();
        int int45 = player43.addPoints((int) (short) 10);
        boolean boolean46 = player43.isAlive();
        player43.die();
        org.jpacman.framework.model.Player player48 = new org.jpacman.framework.model.Player();
        int int50 = player48.addPoints((int) (short) 10);
        boolean boolean51 = player48.isAlive();
        org.jpacman.framework.model.Tile tile54 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int55 = tile54.getX();
        int int56 = tile54.getX();
        int int57 = tile54.getX();
        player48.occupy(tile54);
        player43.occupy(tile54);
        org.jpacman.framework.model.Direction direction60 = org.jpacman.framework.model.Direction.LEFT;
        int int61 = direction60.getDx();
        player43.setDirection(direction60);
        org.jpacman.framework.model.Tile tile63 = null; // flaky: board13.tileAtDirection(tile35, direction60);
        try {
            org.jpacman.framework.model.Tile tile64 = null; // flaky: board2.tileAtDirection(tile5, direction60);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + direction60 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction60.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
// flaky:         org.junit.Assert.assertNotNull(tile63);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        boolean boolean6 = game4.won();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        int int13 = food12.getPoints();
        int int14 = food12.getPoints();
        boolean boolean15 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food12);
        int int16 = food12.getPoints();
        game4.addFood(food12);
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost18.getSpriteType();
        game4.addGhost(ghost18);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost18.getSpriteType();
        game0.addGhost(ghost18);
        boolean boolean27 = game0.won();
        org.jpacman.framework.model.PointManager pointManager28 = game0.getPointManager();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(pointManager28);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        level0.setMapFile("WALL occupying null");
        level0.setMapFile("FOOD occupying null");
        java.lang.String str10 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory11 = null;
// flaky:         level0.setFactory(iGameFactory11);
        org.jpacman.framework.model.Game game13 = level0.getGame();
        java.lang.Class<?> wildcardClass14 = game13.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        player14.die();
        player14.resurrect();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food20 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food20.getSpriteType();
        boolean boolean23 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food20);
        java.lang.String str24 = tile19.toString();
        java.lang.String str25 = tile19.toString();
        org.jpacman.framework.model.Sprite sprite26 = tile19.topSprite();
        player14.occupy(tile19);
        org.jpacman.framework.model.Direction direction28 = player14.getDirection();
        org.jpacman.framework.model.Tile tile29 = null; // flaky: board2.tileAtDirection(tile13, direction28);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile35 = null; // flaky: board2.tileAtOffset(tile32, (int) (short) 10, 35);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = null; // flaky: board2.spriteTypeAt(10, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1,100]" + "'", str24.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1,100]" + "'", str25.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite26);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile29);
// flaky:         org.junit.Assert.assertNotNull(tile35);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board4 = game0.getBoard();
        java.util.Observer observer5 = null;
        try {
// flaky:             game0.attach(observer5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(board4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        player14.die();
        player14.resurrect();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food20 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food20.getSpriteType();
        boolean boolean23 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food20);
        java.lang.String str24 = tile19.toString();
        java.lang.String str25 = tile19.toString();
        org.jpacman.framework.model.Sprite sprite26 = tile19.topSprite();
        player14.occupy(tile19);
        org.jpacman.framework.model.Direction direction28 = player14.getDirection();
        org.jpacman.framework.model.Tile tile29 = null; // flaky: board2.tileAtDirection(tile13, direction28);
        boolean boolean32 = board2.withinBorders((int) (short) 0, 54);
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1,100]" + "'", str24.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1,100]" + "'", str25.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite26);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        player5.resurrect();
        org.jpacman.framework.model.Direction direction14 = player5.getDirection();
        int int16 = player5.addPoints((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 63 + "'", int16 == 63);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        java.util.Observer observer3 = null;
        game0.deleteObserver(observer3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        boolean boolean6 = game0.won();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        boolean boolean7 = game0.hasChanged();
        boolean boolean8 = game0.won();
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        java.lang.Class<?> wildcardClass12 = tile2.getClass();
        int int13 = tile2.getY();
        int int14 = tile2.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        game0.addFood(food9);
        org.jpacman.framework.model.Tile tile13 = food9.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food9.getSpriteType();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNull(tile13);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        int int4 = pointManager3.totalFoodInGame();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        boolean boolean4 = game0.hasChanged();
        java.util.Observer observer5 = null;
        try {
// flaky:             game0.attach(observer5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.PointManager pointManager4 = game0.getPointManager();
        boolean boolean5 = pointManager4.allEaten();
        boolean boolean6 = pointManager4.allEaten();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNotNull(pointManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        boolean boolean3 = pointManager2.allEaten();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = null; // flaky: board2.spriteTypeAt((int) (byte) 1, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        java.util.Observer observer4 = null;
        try {
            game0.addObserver(observer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        java.util.Observer observer4 = null;
        try {
            game0.addObserver(observer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.notifyObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.DOWN;
        int int5 = direction4.getDx();
        try {
// flaky:             game0.movePlayer(direction4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction4.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        int int4 = player0.getPoints();
        org.jpacman.framework.model.Direction direction5 = player0.getDirection();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction5.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(19, 35);
        try {
            org.jpacman.framework.model.Tile tile5 = null; // flaky: board2.tileAt(62, 104);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food11 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food11.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food11.getSpriteType();
        boolean boolean14 = tile10.containsSprite((org.jpacman.framework.model.Sprite) food11);
        java.lang.String str15 = tile10.toString();
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.RIGHT;
        int int17 = direction16.getDx();
        int int18 = direction16.getDy();
        int int19 = direction16.getDy();
        org.jpacman.framework.model.Tile tile20 = null; // flaky: board7.tileAtDirection(tile10, direction16);
        game3.setBoard(board7);
        org.jpacman.framework.model.Player player22 = game3.getPlayer();
        boolean boolean23 = player22.isAlive();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1,100]" + "'", str15.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction16.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile20);
        org.junit.Assert.assertNotNull(player22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        int int14 = player6.addPoints((int) (short) 10);
        player6.resurrect();
        player6.die();
        game0.addPlayer(player6);
        boolean boolean18 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 72 + "'", int14 == 72);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        game0.notifyObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        boolean boolean7 = game0.hasChanged();
        java.util.Observer observer8 = null;
        try {
// flaky:             game0.attach(observer8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(35, 72);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        food0.setPoints((int) (byte) 0);
        int int5 = food0.getPoints();
        food0.setPoints((int) '4');
        food0.setPoints(94);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        level0.setMapFile("FOOD occupying null");
        java.lang.String str4 = level0.getMapFile();
        level0.setMapFile("[9,34]");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor7 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: [9,34] not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        java.util.Observer observer3 = null;
        game0.deleteObserver(observer3);
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(board5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        pointManager0.addPointsToBoard((int) 'a');
        boolean boolean4 = pointManager0.allEaten();
        boolean boolean5 = pointManager0.allEaten();
        int int6 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        org.jpacman.framework.model.Sprite sprite18 = tile13.topSprite();
        player7.occupy(tile13);
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player7.occupy(tile22);
// flaky:         pointManager3.consumePointsOnBoard(player7, (int) 'a');
        player7.deoccupy();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sprite18);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        boolean boolean9 = board2.withinBorders(19, 94);
        try {
            org.jpacman.framework.model.Tile tile12 = null; // flaky: board2.tileAt((int) (short) -1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        boolean boolean15 = player12.isAlive();
        player12.die();
        org.jpacman.framework.model.Player player17 = new org.jpacman.framework.model.Player();
        int int19 = player17.addPoints((int) (short) 10);
        boolean boolean20 = player17.isAlive();
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int24 = tile23.getX();
        int int25 = tile23.getX();
        int int26 = tile23.getX();
        player17.occupy(tile23);
        player12.occupy(tile23);
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.LEFT;
        int int30 = direction29.getDx();
        player12.setDirection(direction29);
        org.jpacman.framework.model.Tile tile32 = player12.getTile();
        int int33 = tile32.getX();
        org.jpacman.framework.model.Direction direction34 = org.jpacman.framework.model.Direction.RIGHT;
        int int35 = direction34.getDx();
        try {
            org.jpacman.framework.model.Tile tile36 = null; // flaky: board9.tileAtDirection(tile32, direction34);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction29.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(tile32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction34.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        java.util.Observer observer10 = null;
        try {
            game0.addObserver(observer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(board9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertNotNull(ghostList6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor5 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Illegal sprite code a");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost3.occupy(tile7);
        org.jpacman.framework.model.Tile tile9 = ghost3.getTile();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(tile9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food0.getSpriteType();
        food0.setPoints((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int13 = player5.addPoints(0);
        player5.die();
        boolean boolean15 = player5.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = player5.getSpriteType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        java.util.Observer observer7 = null;
        try {
// flaky:             game0.attach(observer7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        game0.notifyObservers();
        int int8 = game0.countObservers();
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        food9.setPoints((int) '4');
        int int13 = food9.getPoints();
        game0.addFood(food9);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food8.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food8.getSpriteType();
        boolean boolean11 = tile7.containsSprite((org.jpacman.framework.model.Sprite) food8);
        game0.addFood(food8);
        int int13 = food8.getPoints();
        int int14 = food8.getPoints();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food7 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food7.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food7.getSpriteType();
        boolean boolean10 = tile6.containsSprite((org.jpacman.framework.model.Sprite) food7);
        org.jpacman.framework.model.Sprite sprite11 = tile6.topSprite();
        player0.occupy(tile6);
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player0.occupy(tile15);
        int int18 = player0.addPoints(94);
        org.jpacman.framework.model.Tile tile19 = player0.getTile();
        java.lang.String str20 = player0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(tile19);
// flaky:         org.junit.Assert.assertTrue("'" + str20 + "' != '" + "PLAYER occupying [10,97]" + "'", str20.equals("PLAYER occupying [10,97]"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food7 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food7.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food7.getSpriteType();
        boolean boolean10 = tile6.containsSprite((org.jpacman.framework.model.Sprite) food7);
        org.jpacman.framework.model.Sprite sprite11 = tile6.topSprite();
        player0.occupy(tile6);
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player0.occupy(tile15);
        int int17 = tile15.getY();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.won();
        org.jpacman.framework.model.Player player7 = game0.getPlayer();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(player7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.UP;
        int int1 = direction0.getDx();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction0.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        game0.notifyObservers();
        boolean boolean12 = game0.hasChanged();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        level0.setMapFile("FOOD occupying null");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor10 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: FOOD occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        level0.setMapFile("WALL occupying null");
        java.lang.String str8 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "WALL occupying null" + "'", str8.equals("WALL occupying null"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        java.lang.String str9 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory10 = null;
// flaky:         level0.setFactory(iGameFactory10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying [-1,100]" + "'", str9.equals("PLAYER occupying [-1,100]"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager5 = game0.getPointManager();
        game0.notifyObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertNotNull(pointManager5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        java.lang.String str2 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor3 = level0.parseMap();
        org.jpacman.framework.model.IGameInteractor iGameInteractor4 = level0.parseMap();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "board.txt" + "'", str2.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor3);
        org.junit.Assert.assertNotNull(iGameInteractor4);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        try {
            org.jpacman.framework.model.Sprite sprite7 = null; // flaky: board2.spriteAt(82, 80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        int int3 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        java.lang.String str8 = player4.toString();
// flaky:         pointManager0.consumePointsOnBoard(player4, 72);
        int int11 = pointManager0.getFoodEaten();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        player12.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player12.getSpriteType();
        boolean boolean15 = player12.isAlive();
        player12.resurrect();
        pointManager0.consumePointsOnBoard(player12, (int) (byte) 10);
        player12.die();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "PLAYER occupying null" + "'", str8.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 72 + "'", int11 == 72);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        int int14 = player5.addPoints(62);
        org.jpacman.framework.model.Board board17 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        player21.die();
        player21.resurrect();
        java.lang.String str24 = player21.toString();
        int int25 = player21.getPoints();
        org.jpacman.framework.model.Direction direction26 = org.jpacman.framework.model.Direction.UP;
        player21.setDirection(direction26);
        org.jpacman.framework.model.Tile tile28 = null; // flaky: board17.tileAtDirection(tile20, direction26);
        player5.setDirection(direction26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 124 + "'", int14 == 124);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "PLAYER occupying null" + "'", str24.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + direction26 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction26.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile28);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Direction direction20 = org.jpacman.framework.model.Direction.DOWN;
        int int21 = direction20.getDx();
        int int22 = direction20.getDx();
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board2.tileAtDirection(tile13, direction20);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = board2.spriteTypeAt((int) (short) 0, 10);
        org.jpacman.framework.model.Food food27 = new org.jpacman.framework.model.Food();
        int int28 = food27.getPoints();
        int int29 = food27.getPoints();
        food27.setPoints((int) (byte) 0);
        int int32 = food27.getPoints();
        food27.setPoints((int) '4');
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) food27, 97, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction20.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile23);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        try {
            org.jpacman.framework.model.Tile tile7 = null; // flaky: board3.tileAt(0, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(21, (int) 'a');
        int int3 = tile2.getY();
        org.jpacman.framework.model.Food food4 = new org.jpacman.framework.model.Food();
        int int5 = food4.getPoints();
        int int6 = food4.getPoints();
        int int7 = food4.getPoints();
        java.lang.String str8 = food4.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food4.getSpriteType();
        java.lang.Class<?> wildcardClass10 = food4.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food4.getSpriteType();
        java.lang.String str12 = food4.toString();
        boolean boolean13 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FOOD occupying null" + "'", str8.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "FOOD occupying null" + "'", str12.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board7 = game6.getBoard();
        game6.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game6.getGhosts();
        org.jpacman.framework.model.Game game10 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player11 = game10.getPlayer();
        org.jpacman.framework.model.PointManager pointManager12 = game10.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList13 = game10.getGhosts();
        org.jpacman.framework.model.Game game14 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player15 = game14.getPlayer();
        boolean boolean16 = game14.won();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        org.jpacman.framework.model.Food food22 = new org.jpacman.framework.model.Food();
        int int23 = food22.getPoints();
        int int24 = food22.getPoints();
        boolean boolean25 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food22);
        int int26 = food22.getPoints();
        game14.addFood(food22);
        org.jpacman.framework.model.Ghost ghost28 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost28.getSpriteType();
        game14.addGhost(ghost28);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost28.getSpriteType();
        game10.addGhost(ghost28);
        game6.addGhost(ghost28);
        game0.addGhost(ghost28);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(board7);
        org.junit.Assert.assertNotNull(ghostList9);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertNotNull(pointManager12);
        org.junit.Assert.assertNotNull(ghostList13);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        level0.setMapFile("FOOD occupying null");
        java.lang.String str4 = level0.getMapFile();
        java.lang.String str5 = level0.getMapFile();
        java.lang.String str6 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FOOD occupying null" + "'", str5.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FOOD occupying null" + "'", str6.equals("FOOD occupying null"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game5.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game5.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector9 = game5.getBoardInspector();
        boolean boolean10 = game5.hasChanged();
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        boolean boolean13 = game11.won();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        int int20 = food19.getPoints();
        int int21 = food19.getPoints();
        boolean boolean22 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food19);
        int int23 = food19.getPoints();
        game11.addFood(food19);
        org.jpacman.framework.model.Ghost ghost25 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost25.getSpriteType();
        game11.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost25.getSpriteType();
        game5.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost25.getSpriteType();
        game0.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost25.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNotNull(pointManager7);
        org.junit.Assert.assertNotNull(ghostList8);
        org.junit.Assert.assertNull(iBoardInspector9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        try {
            org.jpacman.framework.model.Tile tile9 = null; // flaky: board2.tileAt((int) (byte) 10, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(100, 94);
        boolean boolean9 = board2.withinBorders(21, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        int int7 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        org.jpacman.framework.model.PointManager pointManager10 = game8.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList11 = game8.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector12 = game8.getBoardInspector();
        boolean boolean13 = game8.hasChanged();
        org.jpacman.framework.model.Game game14 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player15 = game14.getPlayer();
        boolean boolean16 = game14.won();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        org.jpacman.framework.model.Food food22 = new org.jpacman.framework.model.Food();
        int int23 = food22.getPoints();
        int int24 = food22.getPoints();
        boolean boolean25 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food22);
        int int26 = food22.getPoints();
        game14.addFood(food22);
        org.jpacman.framework.model.Ghost ghost28 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost28.getSpriteType();
        game14.addGhost(ghost28);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost28.getSpriteType();
        game8.addGhost(ghost28);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        boolean boolean38 = player35.isAlive();
        game8.addPlayer(player35);
        pointManager0.consumePointsOnBoard(player35, 52);
        org.jpacman.framework.model.Player player42 = null;
        try {
            pointManager0.consumePointsOnBoard(player42, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNotNull(pointManager10);
        org.junit.Assert.assertNotNull(ghostList11);
        org.junit.Assert.assertNull(iBoardInspector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertNotNull(ghostList4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.LEFT;
        int int5 = direction4.getDx();
        player0.setDirection(direction4);
        java.lang.String str7 = player0.toString();
        player0.die();
        java.lang.String str9 = player0.toString();
        org.jpacman.framework.model.Direction direction10 = player0.getDirection();
        int int11 = direction10.getDx();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction10.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        player5.die();
        player5.resurrect();
        int int8 = player5.getPoints();
// flaky:         pointManager0.consumePointsOnBoard(player5, (int) (byte) 1);
        int int11 = pointManager0.getFoodEaten();
        int int12 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        game0.setBoard(board8);
        try {
            org.jpacman.framework.model.Tile tile14 = null; // flaky: board8.tileAt(94, 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        org.jpacman.framework.model.Tile tile7 = player0.getTile();
        boolean boolean8 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(tile7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = null; // flaky: board5.spriteTypeAt((int) (byte) 0, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        game0.addFood(food8);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        food8.occupy(tile13);
        java.lang.String str15 = tile13.toString();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[35,10]" + "'", str15.equals("[35,10]"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        int int4 = board2.getWidth();
        int int5 = board2.getWidth();
        int int6 = board2.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = null; // flaky: board2.spriteTypeAt((int) (byte) 0, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        game0.deleteObservers();
        java.util.Observer observer5 = null;
        try {
// flaky:             game0.attach(observer5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNull(player3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Direction direction20 = org.jpacman.framework.model.Direction.DOWN;
        int int21 = direction20.getDx();
        int int22 = direction20.getDx();
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board2.tileAtDirection(tile13, direction20);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = board2.spriteTypeAt((int) (short) 0, 10);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        boolean boolean30 = player27.isAlive();
        player27.die();
        org.jpacman.framework.model.Player player32 = new org.jpacman.framework.model.Player();
        int int34 = player32.addPoints((int) (short) 10);
        boolean boolean35 = player32.isAlive();
        org.jpacman.framework.model.Tile tile38 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int39 = tile38.getX();
        int int40 = tile38.getX();
        int int41 = tile38.getX();
        player32.occupy(tile38);
        player27.occupy(tile38);
        player27.resurrect();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player27, (int) (byte) 10, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction20.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile23);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.EMPTY));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        java.lang.Class<?> wildcardClass12 = tile2.getClass();
        java.lang.String str13 = tile2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[10,-1]" + "'", str13.equals("[10,-1]"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board(62, 10);
        int int8 = board7.getWidth();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        int int15 = player12.getPoints();
        int int17 = player12.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction18 = player12.getDirection();
        int int19 = direction18.getDy();
        org.jpacman.framework.model.Tile tile20 = null; // flaky: board7.tileAtDirection(tile11, direction18);
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food24 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = food24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = food24.getSpriteType();
        boolean boolean27 = tile23.containsSprite((org.jpacman.framework.model.Sprite) food24);
        org.jpacman.framework.model.Sprite sprite28 = tile23.topSprite();
        org.jpacman.framework.model.Tile tile31 = null; // flaky: board7.tileAtOffset(tile23, 100, (int) '4');
        org.jpacman.framework.model.Direction direction32 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile33 = null; // flaky: board3.tileAtDirection(tile31, direction32);
        org.jpacman.framework.model.Sprite sprite34 = null; // flaky: tile33.topSprite();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 62 + "'", int17 == 62);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction18.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile20);
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sprite28);
// flaky:         org.junit.Assert.assertNotNull(tile31);
        org.junit.Assert.assertTrue("'" + direction32 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction32.equals(org.jpacman.framework.model.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(tile33);
        org.junit.Assert.assertNull(sprite34);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.LEFT;
        int int5 = direction4.getDx();
        player0.setDirection(direction4);
        int int7 = direction4.getDx();
        int int8 = direction4.getDx();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        int int4 = pointManager3.getFoodEaten();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager5 = game0.getPointManager();
        java.lang.Class<?> wildcardClass6 = game0.getClass();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertNotNull(pointManager5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        boolean boolean8 = board2.withinBorders((int) ' ', 35);
        int int9 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        boolean boolean4 = player0.isAlive();
        java.lang.Class<?> wildcardClass5 = player0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        int int4 = board2.getWidth();
        try {
            org.jpacman.framework.model.Sprite sprite7 = null; // flaky: board2.spriteAt((int) (byte) 100, 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        pointManager0.addPointsToBoard((int) 'a');
        boolean boolean4 = pointManager0.allEaten();
        pointManager0.addPointsToBoard(62);
        pointManager0.addPointsToBoard(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        org.jpacman.framework.model.PointManager pointManager13 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager14 = new org.jpacman.framework.model.PointManager();
        pointManager14.addPointsToBoard((int) (byte) 10);
        int int17 = pointManager14.totalFoodInGame();
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = player18.getSpriteType();
        java.lang.String str22 = player18.toString();
// flaky:         pointManager14.consumePointsOnBoard(player18, 72);
// flaky:         pointManager13.consumePointsOnBoard(player18, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player18.getSpriteType();
        org.jpacman.framework.model.Direction direction28 = player18.getDirection();
        int int30 = player18.addPoints((-1));
        try {
// flaky:             board5.put((org.jpacman.framework.model.Sprite) player18, 54, 54);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "PLAYER occupying null" + "'", str22.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 80 + "'", int30 == 80);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.RIGHT;
        int int12 = direction11.getDx();
        int int13 = direction11.getDy();
        int int14 = direction11.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = null; // flaky: board2.spriteTypeAt(80, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction11.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.resurrect();
        java.lang.String str2 = player0.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "PLAYER occupying null" + "'", str2.equals("PLAYER occupying null"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        try {
            org.jpacman.framework.model.Tile tile9 = null; // flaky: board2.tileAt((int) (byte) -1, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        org.jpacman.framework.model.Player player10 = game0.getPlayer();
        boolean boolean11 = game0.hasChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(player10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getHeight();
        game0.setBoard(board6);
        int int9 = board6.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = null; // flaky: board6.spriteTypeAt((-1), 72);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 62 + "'", int9 == 62);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        org.jpacman.framework.model.PointManager pointManager8 = game0.getPointManager();
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int13 = tile12.getX();
        org.jpacman.framework.model.Sprite sprite14 = tile12.topSprite();
        java.lang.String str15 = tile12.toString();
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite22 = tile21.topSprite();
        int int23 = tile21.getY();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board18.tileAtOffset(tile21, 100, 1);
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food36 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = food36.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = food36.getSpriteType();
        boolean boolean39 = tile35.containsSprite((org.jpacman.framework.model.Sprite) food36);
        java.lang.String str40 = tile35.toString();
        java.lang.String str41 = tile35.toString();
        org.jpacman.framework.model.Sprite sprite42 = tile35.topSprite();
        player30.occupy(tile35);
        org.jpacman.framework.model.Direction direction44 = player30.getDirection();
        org.jpacman.framework.model.Tile tile45 = null; // flaky: board18.tileAtDirection(tile29, direction44);
        org.jpacman.framework.model.Tile tile46 = null; // flaky: board9.tileAtDirection(tile12, direction44);
        int int47 = tile12.getY();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(sprite14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[10,-1]" + "'", str15.equals("[10,-1]"));
        org.junit.Assert.assertNull(sprite22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile26);
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[-1,100]" + "'", str40.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[-1,100]" + "'", str41.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite42);
        org.junit.Assert.assertTrue("'" + direction44 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction44.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile45);
// flaky:         org.junit.Assert.assertNotNull(tile46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        org.jpacman.framework.model.IBoardInspector iBoardInspector13 = game0.getBoardInspector();
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        int int15 = food14.getPoints();
        int int16 = food14.getPoints();
        food14.setPoints((int) (byte) 0);
        int int19 = food14.getPoints();
        food14.setPoints((int) '4');
        game0.addFood(food14);
        int int23 = game0.countObservers();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        int int5 = board3.getHeight();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = ghost6.getSpriteType();
        try {
// flaky:             board3.put((org.jpacman.framework.model.Sprite) ghost6, 82, 73);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = null; // flaky: board2.spriteTypeAt((-1), 94);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        boolean boolean3 = pointManager0.allEaten();
        boolean boolean4 = pointManager0.allEaten();
        boolean boolean5 = pointManager0.allEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction13 = player7.getDirection();
        int int14 = direction13.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile6, direction13);
        int int16 = tile6.getY();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector7 = game0.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager8 = new org.jpacman.framework.model.PointManager();
        pointManager8.addPointsToBoard((int) (byte) 10);
        int int11 = pointManager8.totalFoodInGame();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = player12.getSpriteType();
        java.lang.String str16 = player12.toString();
// flaky:         pointManager8.consumePointsOnBoard(player12, 72);
        int int19 = pointManager8.getFoodEaten();
        pointManager8.addPointsToBoard((int) (short) 100);
        game0.notifyObservers((java.lang.Object) (short) 100);
        boolean boolean23 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNull(iBoardInspector7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "PLAYER occupying null" + "'", str16.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 72 + "'", int19 == 72);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        java.lang.Class<?> wildcardClass4 = player0.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite3 = tile2.topSprite();
        int int4 = tile2.getY();
        java.lang.String str5 = tile2.toString();
        org.jpacman.framework.model.Sprite sprite6 = tile2.topSprite();
        org.junit.Assert.assertNull(sprite3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertNull(sprite6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        java.lang.String str10 = player3.toString();
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player3);
        java.lang.Class<?> wildcardClass12 = player3.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player3.getSpriteType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PLAYER occupying null" + "'", str10.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Player player11 = game0.getPlayer();
        game0.notifyObservers();
        org.jpacman.framework.model.Game game13 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList14 = game13.getGhosts();
        game13.notifyObservers();
        boolean boolean16 = game13.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList17 = game13.getGhosts();
        org.jpacman.framework.model.Board board18 = game13.getBoard();
        org.jpacman.framework.model.Ghost ghost19 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost19.getSpriteType();
        game13.addGhost(ghost19);
        game0.addGhost(ghost19);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost19.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertNotNull(ghostList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ghostList17);
        org.junit.Assert.assertNull(board18);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(21, (int) 'a');
        int int3 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        game0.setBoard(board8);
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        boolean boolean15 = player12.isAlive();
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int19 = tile18.getX();
        int int20 = tile18.getX();
        int int21 = tile18.getX();
        player12.occupy(tile18);
        org.jpacman.framework.model.Sprite sprite23 = tile18.topSprite();
        org.jpacman.framework.model.Direction direction24 = org.jpacman.framework.model.Direction.RIGHT;
        java.lang.Class<?> wildcardClass25 = direction24.getClass();
        try {
            org.jpacman.framework.model.Tile tile26 = null; // flaky: board8.tileAtDirection(tile18, direction24);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(sprite23);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction24.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        int int4 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        int int4 = board2.getWidth();
        int int5 = board2.getWidth();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        boolean boolean8 = game6.won();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        int int12 = player9.getPoints();
        int int14 = player9.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = player9.getSpriteType();
        game6.addPlayer(player9);
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player9, 9, 82);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Food food5 = new org.jpacman.framework.model.Food();
        int int6 = food5.getPoints();
        int int7 = food5.getPoints();
        boolean boolean8 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food5);
        int int9 = food5.getPoints();
        org.jpacman.framework.model.Tile tile10 = food5.getTile();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(tile10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int12 = tile2.getY();
        int int13 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game4.getGhosts();
        game4.notifyObservers();
        boolean boolean7 = game4.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game4.getGhosts();
        org.jpacman.framework.model.Board board9 = game4.getBoard();
        boolean boolean10 = game4.won();
        org.jpacman.framework.model.Board board13 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean16 = board13.withinBorders((int) (byte) 10, (int) '4');
        game4.setBoard(board13);
        org.jpacman.framework.model.IBoardInspector iBoardInspector18 = game4.getBoardInspector();
        game0.notifyObservers((java.lang.Object) game4);
        java.util.Observer observer20 = null;
        try {
// flaky:             game4.attach(observer20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ghostList8);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iBoardInspector18);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game0.getGhosts();
        game0.deleteObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(ghostList9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        int int14 = 0; // flaky: tile13.getY();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getHeight();
        int int4 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        int int5 = 0; // flaky: player0.addPoints((int) (short) 1);
        int int7 = 0; // flaky: player0.addPoints(45);
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 46 + "'", int7 == 46);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        java.util.Observer observer13 = null;
        game0.deleteObserver(observer13);
        boolean boolean15 = game0.won();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        int int14 = player6.addPoints((int) (short) 10);
        player6.resurrect();
        player6.die();
        game0.addPlayer(player6);
        java.util.Observer observer18 = null;
        try {
// flaky:             game0.attach(observer18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 72 + "'", int14 == 72);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Direction direction20 = org.jpacman.framework.model.Direction.DOWN;
        int int21 = direction20.getDx();
        int int22 = direction20.getDx();
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board2.tileAtDirection(tile13, direction20);
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        player24.die();
        player24.resurrect();
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food30 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = food30.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = food30.getSpriteType();
        boolean boolean33 = tile29.containsSprite((org.jpacman.framework.model.Sprite) food30);
        java.lang.String str34 = tile29.toString();
        java.lang.String str35 = tile29.toString();
        org.jpacman.framework.model.Sprite sprite36 = tile29.topSprite();
        player24.occupy(tile29);
        org.jpacman.framework.model.Direction direction38 = player24.getDirection();
        org.jpacman.framework.model.Tile tile41 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int42 = tile41.getY();
        int int43 = tile41.getY();
// flaky:         player24.occupy(tile41);
        org.jpacman.framework.model.Tile tile47 = null; // flaky: board2.tileAtOffset(tile41, (int) (byte) 10, (int) '4');
        org.jpacman.framework.model.Game game48 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player49 = game48.getPlayer();
        org.jpacman.framework.model.Player player50 = game48.getPlayer();
        org.jpacman.framework.model.Board board51 = game48.getBoard();
        int int52 = game48.countObservers();
        org.jpacman.framework.model.Game game53 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player54 = game53.getPlayer();
        org.jpacman.framework.model.PointManager pointManager55 = game53.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList56 = game53.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector57 = game53.getBoardInspector();
        boolean boolean58 = game53.hasChanged();
        org.jpacman.framework.model.Game game59 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player60 = game59.getPlayer();
        boolean boolean61 = game59.won();
        org.jpacman.framework.model.Tile tile64 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int65 = tile64.getX();
        int int66 = tile64.getX();
        org.jpacman.framework.model.Food food67 = new org.jpacman.framework.model.Food();
        int int68 = food67.getPoints();
        int int69 = food67.getPoints();
        boolean boolean70 = tile64.containsSprite((org.jpacman.framework.model.Sprite) food67);
        int int71 = food67.getPoints();
        game59.addFood(food67);
        org.jpacman.framework.model.Ghost ghost73 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType74 = ghost73.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType75 = ghost73.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType76 = ghost73.getSpriteType();
        game59.addGhost(ghost73);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType78 = ghost73.getSpriteType();
        game53.addGhost(ghost73);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType80 = ghost73.getSpriteType();
        game48.addGhost(ghost73);
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) ghost73, 9, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction20.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile23);
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[-1,100]" + "'", str34.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[-1,100]" + "'", str35.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite36);
        org.junit.Assert.assertTrue("'" + direction38 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction38.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
// flaky:         org.junit.Assert.assertNotNull(tile47);
        org.junit.Assert.assertNull(player49);
        org.junit.Assert.assertNull(player50);
        org.junit.Assert.assertNull(board51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(player54);
        org.junit.Assert.assertNotNull(pointManager55);
        org.junit.Assert.assertNotNull(ghostList56);
        org.junit.Assert.assertNull(iBoardInspector57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(player60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + spriteType74 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType74.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType75 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType75.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType76 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType76.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType78 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType78.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType80 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType80.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(iBoardInspector4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.totalFoodInGame();
        int int4 = pointManager2.getFoodEaten();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getX();
        int int9 = tile7.getX();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        int int15 = player10.addPoints((int) '4');
        boolean boolean16 = tile7.containsSprite((org.jpacman.framework.model.Sprite) player10);
        int int18 = player10.addPoints(0);
        player10.die();
// flaky:         pointManager2.consumePointsOnBoard(player10, 54);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        try {
            org.jpacman.framework.model.Board board2 = null; // flaky: new org.jpacman.framework.model.Board(124, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        java.util.Observer observer8 = null;
        try {
// flaky:             game0.attach(observer8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(board7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(63, (int) '#');
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        org.jpacman.framework.model.Sprite sprite18 = tile13.topSprite();
        player7.occupy(tile13);
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player7.occupy(tile22);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = player7.getSpriteType();
        pointManager0.consumePointsOnBoard(player7, 9);
        boolean boolean27 = pointManager0.allEaten();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sprite18);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("hi!");
        org.jpacman.framework.factory.IGameFactory iGameFactory7 = null;
// flaky:         level0.setFactory(iGameFactory7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        boolean boolean10 = board2.withinBorders(10, (int) (short) 100);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = null; // flaky: board2.spriteTypeAt((int) (byte) 10, 9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        org.jpacman.framework.model.PointManager pointManager6 = game4.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game4.getGhosts();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        boolean boolean10 = game8.won();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        org.jpacman.framework.model.Food food16 = new org.jpacman.framework.model.Food();
        int int17 = food16.getPoints();
        int int18 = food16.getPoints();
        boolean boolean19 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food16);
        int int20 = food16.getPoints();
        game8.addFood(food16);
        org.jpacman.framework.model.Ghost ghost22 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost22.getSpriteType();
        game8.addGhost(ghost22);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost22.getSpriteType();
        game4.addGhost(ghost22);
        game0.addGhost(ghost22);
        org.jpacman.framework.model.PointManager pointManager32 = game0.getPointManager();
        int int33 = pointManager32.getFoodEaten();
        org.jpacman.framework.model.Player player34 = new org.jpacman.framework.model.Player();
        player34.die();
        player34.resurrect();
        org.jpacman.framework.model.Tile tile39 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int40 = tile39.getX();
        org.jpacman.framework.model.Sprite sprite41 = tile39.topSprite();
        player34.occupy(tile39);
        int int43 = player34.getPoints();
// flaky:         pointManager32.consumePointsOnBoard(player34, (int) (short) 1);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(pointManager32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNull(sprite41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        try {
            org.jpacman.framework.model.Tile tile14 = null; // flaky: board9.tileAt((int) (byte) -1, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        org.jpacman.framework.model.PointManager pointManager8 = game0.getPointManager();
        int int9 = pointManager8.getFoodEaten();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.Board board10 = game7.getBoard();
        int int11 = game7.countObservers();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        org.jpacman.framework.model.PointManager pointManager14 = game12.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList15 = game12.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game12.getBoardInspector();
        boolean boolean17 = game12.hasChanged();
        org.jpacman.framework.model.Game game18 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player19 = game18.getPlayer();
        boolean boolean20 = game18.won();
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int24 = tile23.getX();
        int int25 = tile23.getX();
        org.jpacman.framework.model.Food food26 = new org.jpacman.framework.model.Food();
        int int27 = food26.getPoints();
        int int28 = food26.getPoints();
        boolean boolean29 = tile23.containsSprite((org.jpacman.framework.model.Sprite) food26);
        int int30 = food26.getPoints();
        game18.addFood(food26);
        org.jpacman.framework.model.Ghost ghost32 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost32.getSpriteType();
        game18.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = ghost32.getSpriteType();
        game12.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost32.getSpriteType();
        game7.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = ghost32.getSpriteType();
        game0.addGhost(ghost32);
        boolean boolean43 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(board10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNotNull(pointManager14);
        org.junit.Assert.assertNotNull(ghostList15);
        org.junit.Assert.assertNull(iBoardInspector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(player19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player0.getSpriteType();
        player0.die();
        java.lang.String str10 = player0.toString();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        int int12 = direction11.getDy();
        player0.setDirection(direction11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "PLAYER occupying null" + "'", str10.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.IGameInteractor iGameInteractor3 = level0.parseMap();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(iGameInteractor3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager5 = game0.getPointManager();
        pointManager5.addPointsToBoard(45);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertNotNull(pointManager5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        int int1 = game0.countObservers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        boolean boolean7 = player0.isAlive();
        java.lang.String str8 = player0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "PLAYER occupying null" + "'", str8.equals("PLAYER occupying null"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        game0.setBoard(board8);
        try {
            org.jpacman.framework.model.Sprite sprite14 = null; // flaky: board8.spriteAt((int) (short) 1, 80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        int int18 = direction17.getDx();
        player0.setDirection(direction17);
        boolean boolean20 = player0.isAlive();
        org.jpacman.framework.model.Level level21 = new org.jpacman.framework.model.Level();
        java.lang.String str22 = level21.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor23 = level21.parseMap();
        org.jpacman.framework.model.Game game24 = level21.getGame();
        org.jpacman.framework.model.Board board25 = game24.getBoard();
        org.jpacman.framework.model.Tile tile28 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int29 = tile28.getY();
        int int30 = tile28.getY();
        org.jpacman.framework.model.Direction direction31 = org.jpacman.framework.model.Direction.RIGHT;
        int int32 = direction31.getDx();
        int int33 = direction31.getDy();
        org.jpacman.framework.model.Tile tile34 = null; // flaky: board25.tileAtDirection(tile28, direction31);
        player0.setDirection(direction31);
        int int36 = player0.getPoints();
        player0.deoccupy();
        int int38 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction17.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "board.txt" + "'", str22.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor23);
        org.junit.Assert.assertNotNull(game24);
        org.junit.Assert.assertNotNull(board25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + direction31 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction31.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getWidth();
        org.jpacman.framework.model.Board board10 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite14 = tile13.topSprite();
        int int15 = tile13.getY();
        org.jpacman.framework.model.Tile tile18 = null; // flaky: board10.tileAtOffset(tile13, 100, 1);
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player22 = new org.jpacman.framework.model.Player();
        player22.die();
        player22.resurrect();
        org.jpacman.framework.model.Tile tile27 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food28 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = food28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = food28.getSpriteType();
        boolean boolean31 = tile27.containsSprite((org.jpacman.framework.model.Sprite) food28);
        java.lang.String str32 = tile27.toString();
        java.lang.String str33 = tile27.toString();
        org.jpacman.framework.model.Sprite sprite34 = tile27.topSprite();
        player22.occupy(tile27);
        org.jpacman.framework.model.Direction direction36 = player22.getDirection();
        org.jpacman.framework.model.Tile tile37 = null; // flaky: board10.tileAtDirection(tile21, direction36);
        org.jpacman.framework.model.Tile tile40 = board10.tileAt((int) (short) 1, 1);
        try {
            org.jpacman.framework.model.Tile tile43 = null; // flaky: board2.tileAtOffset(tile40, (int) (byte) 0, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sprite14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile18);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[-1,100]" + "'", str32.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[-1,100]" + "'", str33.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite34);
        org.junit.Assert.assertTrue("'" + direction36 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction36.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile37);
        org.junit.Assert.assertNotNull(tile40);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game0.getGhosts();
        java.lang.Class<?> wildcardClass8 = game0.getClass();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board(62, 10);
        int int8 = board7.getWidth();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        int int15 = player12.getPoints();
        int int17 = player12.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction18 = player12.getDirection();
        int int19 = direction18.getDy();
        org.jpacman.framework.model.Tile tile20 = null; // flaky: board7.tileAtDirection(tile11, direction18);
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food24 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = food24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = food24.getSpriteType();
        boolean boolean27 = tile23.containsSprite((org.jpacman.framework.model.Sprite) food24);
        org.jpacman.framework.model.Sprite sprite28 = tile23.topSprite();
        org.jpacman.framework.model.Tile tile31 = null; // flaky: board7.tileAtOffset(tile23, 100, (int) '4');
        org.jpacman.framework.model.Direction direction32 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile33 = null; // flaky: board3.tileAtDirection(tile31, direction32);
        boolean boolean36 = board3.withinBorders(100, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 62 + "'", int17 == 62);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction18.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile20);
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sprite28);
// flaky:         org.junit.Assert.assertNotNull(tile31);
        org.junit.Assert.assertTrue("'" + direction32 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction32.equals(org.jpacman.framework.model.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(tile33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        int int7 = food0.getPoints();
        food0.setPoints((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        boolean boolean6 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        boolean boolean4 = player0.isAlive();
        int int6 = player0.addPoints((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = player0.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food12.getSpriteType();
        boolean boolean15 = tile11.containsSprite((org.jpacman.framework.model.Sprite) food12);
        player0.occupy(tile11);
        int int17 = tile11.getY();
        int int18 = tile11.getX();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.IBoardInspector iBoardInspector6 = game0.getBoardInspector();
        org.jpacman.framework.model.Food food7 = null;
        try {
            game0.addFood(food7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertNull(iBoardInspector6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        org.jpacman.framework.model.Game game2 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player3 = game2.getPlayer();
        org.jpacman.framework.model.Board board4 = game2.getBoard();
        org.jpacman.framework.model.Ghost ghost5 = new org.jpacman.framework.model.Ghost();
        game2.addGhost(ghost5);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost5.occupy(tile9);
        food0.occupy(tile9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertNull(board4);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        player0.resurrect();
        player0.die();
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        int int16 = tile13.getX();
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        org.jpacman.framework.model.Tile tile18 = null; // flaky: board2.tileAtDirection(tile13, direction17);
        boolean boolean21 = board2.withinBorders(72, 0);
        int int22 = board2.getWidth();
        org.jpacman.framework.model.Tile tile23 = null;
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        int int26 = player24.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player24.getSpriteType();
        org.jpacman.framework.model.Direction direction28 = org.jpacman.framework.model.Direction.LEFT;
        int int29 = direction28.getDx();
        player24.setDirection(direction28);
        int int31 = direction28.getDx();
        try {
            org.jpacman.framework.model.Tile tile32 = null; // flaky: board2.tileAtDirection(tile23, direction28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction17.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(104, 100);
        org.jpacman.framework.model.Sprite sprite5 = board2.spriteAt(0, 35);
        int int6 = board2.getHeight();
        org.junit.Assert.assertNull(sprite5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        level0.setMapFile("WALL occupying null");
        level0.setMapFile("[-1,20]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.Ghost ghost12 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost12);
        org.jpacman.framework.model.Board board14 = game0.getBoard();
        try {
            org.jpacman.framework.model.Sprite sprite17 = null; // flaky: board14.spriteAt((int) (short) 10, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(board14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game5.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game5.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector9 = game5.getBoardInspector();
        boolean boolean10 = game5.hasChanged();
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        boolean boolean13 = game11.won();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        int int20 = food19.getPoints();
        int int21 = food19.getPoints();
        boolean boolean22 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food19);
        int int23 = food19.getPoints();
        game11.addFood(food19);
        org.jpacman.framework.model.Ghost ghost25 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost25.getSpriteType();
        game11.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost25.getSpriteType();
        game5.addGhost(ghost25);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost25.getSpriteType();
        game0.addGhost(ghost25);
        org.jpacman.framework.model.Player player34 = game0.getPlayer();
        org.jpacman.framework.model.Player player35 = game0.getPlayer();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNotNull(pointManager7);
        org.junit.Assert.assertNotNull(ghostList8);
        org.junit.Assert.assertNull(iBoardInspector9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(player34);
        org.junit.Assert.assertNull(player35);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction13 = player7.getDirection();
        int int14 = direction13.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile6, direction13);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food19.getSpriteType();
        boolean boolean22 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food19);
        org.jpacman.framework.model.Sprite sprite23 = tile18.topSprite();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board2.tileAtOffset(tile18, 100, (int) '4');
        java.lang.String str27 = null; // flaky: tile26.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sprite23);
// flaky:         org.junit.Assert.assertNotNull(tile26);
// flaky:         org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[37,2]" + "'", str27.equals("[37,2]"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getHeight();
        game0.setBoard(board6);
        int int9 = board6.getWidth();
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int13 = tile12.getX();
        int int14 = tile12.getX();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        int int18 = player15.getPoints();
        int int20 = player15.addPoints((int) '4');
        boolean boolean21 = tile12.containsSprite((org.jpacman.framework.model.Sprite) player15);
        player15.resurrect();
        int int24 = player15.addPoints(62);
        try {
// flaky:             board6.put((org.jpacman.framework.model.Sprite) player15, (int) (byte) -1, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 62 + "'", int9 == 62);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 62 + "'", int20 == 62);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 124 + "'", int24 == 124);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Ghost ghost6 = null;
        game0.addGhost(ghost6);
        boolean boolean8 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(19, 35);
        int int3 = board2.getHeight();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        org.jpacman.framework.model.PointManager pointManager6 = game4.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game4.getGhosts();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        boolean boolean10 = game8.won();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        org.jpacman.framework.model.Food food16 = new org.jpacman.framework.model.Food();
        int int17 = food16.getPoints();
        int int18 = food16.getPoints();
        boolean boolean19 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food16);
        int int20 = food16.getPoints();
        game8.addFood(food16);
        org.jpacman.framework.model.Ghost ghost22 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost22.getSpriteType();
        game8.addGhost(ghost22);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost22.getSpriteType();
        game4.addGhost(ghost22);
        org.jpacman.framework.model.Tile tile31 = ghost22.getTile();
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) ghost22, 0, (int) (short) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(tile31);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        player5.resurrect();
        org.jpacman.framework.model.Direction direction14 = player5.getDirection();
        int int15 = player5.getPoints();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        java.lang.String str4 = player0.toString();
        java.lang.String str5 = player0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "PLAYER occupying null" + "'", str4.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "PLAYER occupying null" + "'", str5.equals("PLAYER occupying null"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        boolean boolean5 = game3.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        game3.addPlayer(player6);
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = food17.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = food17.getSpriteType();
        boolean boolean20 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food17);
        java.lang.String str21 = tile16.toString();
        java.lang.String str22 = tile16.toString();
        org.jpacman.framework.model.Sprite sprite23 = tile16.topSprite();
        player6.occupy(tile16);
// flaky:         pointManager0.consumePointsOnBoard(player6, 19);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        int int30 = player27.getPoints();
        int int32 = player27.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = player27.getSpriteType();
        int int35 = player27.addPoints((int) (short) 10);
        player27.resurrect();
        player27.die();
// flaky:         pointManager0.consumePointsOnBoard(player27, 0);
        java.lang.String str40 = player27.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType18 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType18.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1,100]" + "'", str21.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1,100]" + "'", str22.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 62 + "'", int32 == 62);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 72 + "'", int35 == 72);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "PLAYER occupying null" + "'", str40.equals("PLAYER occupying null"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        food0.setPoints((-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        level0.setMapFile("[-1,100]");
        level0.setMapFile("hi!");
        level0.setMapFile("WALL occupying null");
        level0.setMapFile("FOOD occupying null");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = board2.tileAt(10, 0);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        int int9 = tile6.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertNotNull(tile6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        game0.addPlayer(player3);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Sprite sprite20 = tile13.topSprite();
        player3.occupy(tile13);
        player3.resurrect();
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        int int25 = player23.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = player23.getSpriteType();
        org.jpacman.framework.model.Direction direction27 = org.jpacman.framework.model.Direction.LEFT;
        int int28 = direction27.getDx();
        player23.setDirection(direction27);
        int int30 = direction27.getDx();
        player3.setDirection(direction27);
        int int32 = direction27.getDy();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction27.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        game0.deleteObservers();
        java.util.Observer observer4 = null;
        try {
// flaky:             game0.attach(observer4);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = food6.getSpriteType();
        boolean boolean9 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food6);
        java.lang.String str10 = tile5.toString();
        java.lang.String str11 = tile5.toString();
        org.jpacman.framework.model.Sprite sprite12 = tile5.topSprite();
        player0.occupy(tile5);
        org.jpacman.framework.model.Tile tile14 = player0.getTile();
        player0.die();
        org.jpacman.framework.model.Board board18 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite22 = tile21.topSprite();
        int int23 = tile21.getY();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board18.tileAtOffset(tile21, 100, 1);
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int30 = tile29.getX();
        int int31 = tile29.getX();
        int int32 = tile29.getX();
        org.jpacman.framework.model.Direction direction33 = org.jpacman.framework.model.Direction.LEFT;
        org.jpacman.framework.model.Tile tile34 = null; // flaky: board18.tileAtDirection(tile29, direction33);
        player0.setDirection(direction33);
        player0.die();
        int int38 = 0; // flaky: player0.addPoints((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,100]" + "'", str10.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1,100]" + "'", str11.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite12);
        org.junit.Assert.assertNotNull(tile14);
        org.junit.Assert.assertNull(sprite22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + direction33 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction33.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(80, (int) ' ');
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        boolean boolean6 = player3.isAlive();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        int int12 = tile9.getX();
        player3.occupy(tile9);
        org.jpacman.framework.model.Sprite sprite14 = tile9.topSprite();
        try {
// flaky:             board2.put(sprite14, 94, 19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(sprite14);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        java.util.Observer observer3 = null;
        game0.deleteObserver(observer3);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(20, 23);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager1 = new org.jpacman.framework.model.PointManager();
        pointManager1.addPointsToBoard((int) (byte) 10);
        int int4 = pointManager1.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player5.getSpriteType();
        java.lang.String str9 = player5.toString();
// flaky:         pointManager1.consumePointsOnBoard(player5, 72);
// flaky:         pointManager0.consumePointsOnBoard(player5, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player5.getSpriteType();
        org.jpacman.framework.model.Direction direction15 = player5.getDirection();
        int int17 = player5.addPoints(54);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction15.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 135 + "'", int17 == 135);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getY();
        int int9 = tile7.getY();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.RIGHT;
        int int11 = direction10.getDx();
        int int12 = direction10.getDy();
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board4.tileAtDirection(tile7, direction10);
        int int14 = tile7.getY();
        java.lang.String str15 = tile7.toString();
        int int16 = tile7.getY();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction10.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[10,-1]" + "'", str15.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        org.jpacman.framework.model.PointManager pointManager8 = game0.getPointManager();
        org.jpacman.framework.model.Board board11 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean14 = board11.withinBorders((int) (byte) 10, (int) '4');
        int int15 = board11.getHeight();
        boolean boolean18 = board11.withinBorders((int) (short) 1, (int) (byte) 1);
        boolean boolean21 = board11.withinBorders(0, (int) '#');
        game0.setBoard(board11);
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        player23.die();
        player23.resurrect();
        org.jpacman.framework.model.Player player26 = new org.jpacman.framework.model.Player();
        int int28 = player26.addPoints((int) (short) 10);
        boolean boolean29 = player26.isAlive();
        player26.die();
        org.jpacman.framework.model.Player player31 = new org.jpacman.framework.model.Player();
        int int33 = player31.addPoints((int) (short) 10);
        boolean boolean34 = player31.isAlive();
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int38 = tile37.getX();
        int int39 = tile37.getX();
        int int40 = tile37.getX();
        player31.occupy(tile37);
        player26.occupy(tile37);
        player23.occupy(tile37);
        org.jpacman.framework.model.Sprite sprite44 = tile37.topSprite();
        org.jpacman.framework.model.Player player45 = new org.jpacman.framework.model.Player();
        int int47 = player45.addPoints((int) (short) 10);
        boolean boolean48 = player45.isAlive();
        org.jpacman.framework.model.Direction direction49 = player45.getDirection();
        try {
            org.jpacman.framework.model.Tile tile50 = null; // flaky: board11.tileAtDirection(tile37, direction49);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(sprite44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + direction49 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction49.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(0, 20);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        game0.setBoard(board6);
        try {
            org.jpacman.framework.model.Tile tile12 = null; // flaky: board6.tileAt(124, 80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 124");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        game0.addPlayer(player3);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Sprite sprite20 = tile13.topSprite();
        player3.occupy(tile13);
        player3.resurrect();
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        int int25 = player23.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = player23.getSpriteType();
        org.jpacman.framework.model.Direction direction27 = org.jpacman.framework.model.Direction.LEFT;
        int int28 = direction27.getDx();
        player23.setDirection(direction27);
        int int30 = direction27.getDx();
        player3.setDirection(direction27);
        int int32 = direction27.getDx();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction27 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction27.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        food6.setPoints((int) (short) 10);
        game0.addFood(food6);
        int int10 = food6.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food6.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        game0.setBoard(board8);
        boolean boolean14 = board8.withinBorders(10, (int) '#');
        int int15 = board8.getWidth();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) (short) 1, 52);
        int int10 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        org.jpacman.framework.model.Sprite sprite18 = tile13.topSprite();
        player7.occupy(tile13);
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player7.occupy(tile22);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = player7.getSpriteType();
        pointManager0.consumePointsOnBoard(player7, 9);
        player7.deoccupy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sprite18);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.hasChanged();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean12 = board9.withinBorders((int) (byte) 10, (int) '4');
        int int13 = board9.getHeight();
        int int14 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.Game game16 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player17 = game16.getPlayer();
        org.jpacman.framework.model.Board board18 = game16.getBoard();
        org.jpacman.framework.model.Ghost ghost19 = new org.jpacman.framework.model.Ghost();
        game16.addGhost(ghost19);
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost19.occupy(tile23);
        org.jpacman.framework.model.PointManager pointManager25 = new org.jpacman.framework.model.PointManager();
        boolean boolean26 = pointManager25.allEaten();
        int int27 = pointManager25.totalFoodInGame();
        int int28 = pointManager25.getFoodEaten();
        int int29 = pointManager25.totalFoodInGame();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        int int33 = player30.getPoints();
// flaky:         pointManager25.consumePointsOnBoard(player30, (int) (byte) 1);
        boolean boolean36 = tile23.containsSprite((org.jpacman.framework.model.Sprite) player30);
        try {
            org.jpacman.framework.model.Tile tile39 = null; // flaky: board9.tileAtOffset(tile23, 1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNull(player17);
        org.junit.Assert.assertNull(board18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        game0.deleteObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNull(iBoardInspector4);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getX();
        int int9 = tile7.getX();
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        int int11 = food10.getPoints();
        int int12 = food10.getPoints();
        boolean boolean13 = tile7.containsSprite((org.jpacman.framework.model.Sprite) food10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food10.getSpriteType();
        game3.addFood(food10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food10.getSpriteType();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(0, 20);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        game0.setBoard(board6);
        java.util.Observer observer10 = null;
        try {
            game0.addObserver(observer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        player5.die();
        player5.resurrect();
        int int8 = player5.getPoints();
// flaky:         pointManager0.consumePointsOnBoard(player5, (int) (byte) 1);
        boolean boolean11 = player5.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player5.getSpriteType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        int int1 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        boolean boolean11 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food8);
        int int12 = food8.getPoints();
        game0.addFood(food8);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        int int19 = player14.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = player14.getSpriteType();
        game0.addPlayer(player14);
        org.jpacman.framework.model.Game game22 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board25 = new org.jpacman.framework.model.Board(62, 10);
        game22.setBoard(board25);
        org.jpacman.framework.model.Board board29 = new org.jpacman.framework.model.Board(62, 10);
        int int30 = board29.getWidth();
        org.jpacman.framework.model.Tile tile33 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player34 = new org.jpacman.framework.model.Player();
        int int36 = player34.addPoints((int) (short) 10);
        int int37 = player34.getPoints();
        int int39 = player34.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction40 = player34.getDirection();
        int int41 = direction40.getDy();
        org.jpacman.framework.model.Tile tile42 = null; // flaky: board29.tileAtDirection(tile33, direction40);
        org.jpacman.framework.model.Tile tile45 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food46 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = food46.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = food46.getSpriteType();
        boolean boolean49 = tile45.containsSprite((org.jpacman.framework.model.Sprite) food46);
        org.jpacman.framework.model.Sprite sprite50 = tile45.topSprite();
        org.jpacman.framework.model.Tile tile53 = null; // flaky: board29.tileAtOffset(tile45, 100, (int) '4');
        org.jpacman.framework.model.Direction direction54 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile55 = null; // flaky: board25.tileAtDirection(tile53, direction54);
        int int56 = direction54.getDx();
        player14.setDirection(direction54);
        int int59 = player14.addPoints(94);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 62 + "'", int19 == 62);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 62 + "'", int30 == 62);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 62 + "'", int39 == 62);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction40.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile42);
        org.junit.Assert.assertTrue("'" + spriteType47 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType47.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(sprite50);
// flaky:         org.junit.Assert.assertNotNull(tile53);
        org.junit.Assert.assertTrue("'" + direction54 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction54.equals(org.jpacman.framework.model.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(tile55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 156 + "'", int59 == 156);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        int int5 = food0.getPoints();
        int int6 = food0.getPoints();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.model.IGameInteractor iGameInteractor1 = level0.parseMap();
        org.junit.Assert.assertNotNull(iGameInteractor1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        org.jpacman.framework.model.Sprite sprite9 = null;
        try {
// flaky:             board2.put(sprite9, (int) (byte) 1, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(19, 35);
        boolean boolean5 = board2.withinBorders((int) '4', 54);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board2.tileAtDirection(tile5, direction11);
        try {
            org.jpacman.framework.model.Sprite sprite16 = null; // flaky: board2.spriteAt(19, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + direction11 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction11.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        int int9 = board8.getWidth();
        int int10 = board8.getHeight();
        game0.setBoard(board8);
        org.jpacman.framework.model.Tile tile14 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int15 = tile14.getX();
        int int16 = tile14.getX();
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        int int18 = food17.getPoints();
        int int19 = food17.getPoints();
        boolean boolean20 = tile14.containsSprite((org.jpacman.framework.model.Sprite) food17);
        org.jpacman.framework.model.Sprite sprite21 = tile14.topSprite();
        org.jpacman.framework.model.Sprite sprite22 = tile14.topSprite();
        org.jpacman.framework.model.Sprite sprite23 = tile14.topSprite();
        try {
            org.jpacman.framework.model.Tile tile26 = null; // flaky: board8.tileAtOffset(tile14, (int) (byte) 0, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sprite21);
        org.junit.Assert.assertNull(sprite22);
        org.junit.Assert.assertNull(sprite23);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction13 = player7.getDirection();
        int int14 = direction13.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile6, direction13);
        int int16 = board2.getWidth();
        try {
            org.jpacman.framework.model.Sprite sprite19 = null; // flaky: board2.spriteAt(35, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 62 + "'", int16 == 62);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        boolean boolean10 = game0.hasChanged();
        org.jpacman.framework.model.Board board11 = game0.getBoard();
        game0.notifyObservers((java.lang.Object) "[37,2]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(board11);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        int int7 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        org.jpacman.framework.model.PointManager pointManager10 = game8.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList11 = game8.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector12 = game8.getBoardInspector();
        boolean boolean13 = game8.hasChanged();
        org.jpacman.framework.model.Game game14 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player15 = game14.getPlayer();
        boolean boolean16 = game14.won();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        org.jpacman.framework.model.Food food22 = new org.jpacman.framework.model.Food();
        int int23 = food22.getPoints();
        int int24 = food22.getPoints();
        boolean boolean25 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food22);
        int int26 = food22.getPoints();
        game14.addFood(food22);
        org.jpacman.framework.model.Ghost ghost28 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost28.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost28.getSpriteType();
        game14.addGhost(ghost28);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost28.getSpriteType();
        game8.addGhost(ghost28);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        boolean boolean38 = player35.isAlive();
        game8.addPlayer(player35);
        pointManager0.consumePointsOnBoard(player35, 52);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = player35.getSpriteType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNotNull(pointManager10);
        org.junit.Assert.assertNotNull(ghostList11);
        org.junit.Assert.assertNull(iBoardInspector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + spriteType42 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType42.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        player4.die();
        player4.resurrect();
// flaky:         pointManager0.consumePointsOnBoard(player4, (int) (short) 1);
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food12.getSpriteType();
        boolean boolean15 = tile11.containsSprite((org.jpacman.framework.model.Sprite) food12);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int19 = tile18.getX();
        int int20 = tile18.getX();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        int int23 = player21.addPoints((int) (short) 10);
        int int24 = player21.getPoints();
        int int26 = player21.addPoints((int) '4');
        boolean boolean27 = tile18.containsSprite((org.jpacman.framework.model.Sprite) player21);
        boolean boolean28 = tile11.containsSprite((org.jpacman.framework.model.Sprite) player21);
        java.lang.String str29 = player21.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = player21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = player21.getSpriteType();
// flaky:         pointManager0.consumePointsOnBoard(player21, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 62 + "'", int26 == 62);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "PLAYER occupying null" + "'", str29.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        game0.addPlayer(player3);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        java.lang.String str19 = tile13.toString();
        org.jpacman.framework.model.Sprite sprite20 = tile13.topSprite();
        player3.occupy(tile13);
        int int23 = player3.addPoints(10);
        org.jpacman.framework.model.Direction direction24 = org.jpacman.framework.model.Direction.RIGHT;
        int int25 = direction24.getDx();
        int int26 = direction24.getDy();
        int int27 = direction24.getDy();
        player3.setDirection(direction24);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 72 + "'", int23 == 72);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction24.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        org.jpacman.framework.model.IBoardInspector iBoardInspector12 = game0.getBoardInspector();
        boolean boolean13 = game0.won();
        org.jpacman.framework.model.Board board16 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int17 = board16.getWidth();
        boolean boolean20 = board16.withinBorders(100, 94);
        game0.setBoard(board16);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(iBoardInspector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        int int5 = board4.getWidth();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = null; // flaky: board4.spriteTypeAt(9, 54);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getHeight();
        game0.setBoard(board6);
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player9.getSpriteType();
        org.jpacman.framework.model.Direction direction13 = org.jpacman.framework.model.Direction.LEFT;
        int int14 = direction13.getDx();
        player9.setDirection(direction13);
        java.lang.String str16 = player9.toString();
        boolean boolean17 = player9.isAlive();
        player9.die();
        try {
// flaky:             board6.put((org.jpacman.framework.model.Sprite) player9, (int) (short) -1, 73);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "PLAYER occupying null" + "'", str16.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        boolean boolean11 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food8);
        int int12 = food8.getPoints();
        game0.addFood(food8);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food8.getSpriteType();
        java.lang.String str15 = food8.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food8.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FOOD occupying null" + "'", str15.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        org.jpacman.framework.model.Board board13 = game11.getBoard();
        org.jpacman.framework.model.Ghost ghost14 = new org.jpacman.framework.model.Ghost();
        game11.addGhost(ghost14);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost14.occupy(tile18);
        try {
            org.jpacman.framework.model.Tile tile22 = null; // flaky: board5.tileAtOffset(tile18, 0, 135);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertNull(board13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        game0.addPlayer(player3);
        org.jpacman.framework.model.Game game11 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player12 = game11.getPlayer();
        org.jpacman.framework.model.PointManager pointManager13 = game11.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList14 = game11.getGhosts();
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        boolean boolean17 = game15.won();
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int21 = tile20.getX();
        int int22 = tile20.getX();
        org.jpacman.framework.model.Food food23 = new org.jpacman.framework.model.Food();
        int int24 = food23.getPoints();
        int int25 = food23.getPoints();
        boolean boolean26 = tile20.containsSprite((org.jpacman.framework.model.Sprite) food23);
        int int27 = food23.getPoints();
        game15.addFood(food23);
        org.jpacman.framework.model.Ghost ghost29 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost29.getSpriteType();
        game15.addGhost(ghost29);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost29.getSpriteType();
        game11.addGhost(ghost29);
        org.jpacman.framework.model.Tile tile38 = ghost29.getTile();
        game0.addGhost(ghost29);
        java.util.Observer observer40 = null;
        try {
            game0.addObserver(observer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(player12);
        org.junit.Assert.assertNotNull(pointManager13);
        org.junit.Assert.assertNotNull(ghostList14);
        org.junit.Assert.assertNull(player16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(tile38);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction13 = player7.getDirection();
        int int14 = direction13.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile6, direction13);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food19.getSpriteType();
        boolean boolean22 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food19);
        org.jpacman.framework.model.Sprite sprite23 = tile18.topSprite();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board2.tileAtOffset(tile18, 100, (int) '4');
        int int27 = board2.getWidth();
        int int28 = board2.getWidth();
        org.jpacman.framework.model.Tile tile31 = new org.jpacman.framework.model.Tile(62, (int) (short) 100);
        org.jpacman.framework.model.Tile tile34 = null; // flaky: board2.tileAtOffset(tile31, (int) '#', (int) (byte) 0);
        boolean boolean37 = board2.withinBorders(100, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sprite23);
// flaky:         org.junit.Assert.assertNotNull(tile26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
// flaky:         org.junit.Assert.assertNotNull(tile34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        org.jpacman.framework.model.Food food7 = null;
        try {
            game0.addFood(food7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        int int4 = board2.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 62 + "'", int4 == 62);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        level0.setMapFile("FOOD occupying null");
        java.lang.String str4 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory5 = null;
// flaky:         level0.setFactory(iGameFactory5);
        org.jpacman.framework.model.Game game7 = level0.getGame();
        java.lang.String str8 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertNull(game7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FOOD occupying null" + "'", str8.equals("FOOD occupying null"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        org.jpacman.framework.factory.IGameFactory iGameFactory8 = null;
// flaky:         level0.setFactory(iGameFactory8);
        org.jpacman.framework.model.Game game10 = level0.getGame();
        level0.setMapFile("[-1,20]");
        org.jpacman.framework.model.Game game13 = level0.getGame();
        java.lang.String str14 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,20]" + "'", str14.equals("[-1,20]"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.LEFT;
        int int5 = direction4.getDx();
        player0.setDirection(direction4);
        java.lang.String str7 = player0.toString();
        player0.die();
        java.lang.String str9 = player0.toString();
        org.jpacman.framework.model.Direction direction10 = player0.getDirection();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction10.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.Tile tile2 = player0.getTile();
        player0.resurrect();
        org.junit.Assert.assertNull(tile2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        player0.resurrect();
        int int18 = player0.getPoints();
        int int20 = player0.addPoints(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        java.util.Observer observer10 = null;
        try {
            game0.addObserver(observer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite11 = tile10.topSprite();
        int int12 = tile10.getY();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board7.tileAtOffset(tile10, 100, 1);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food19.getSpriteType();
        boolean boolean22 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food19);
        java.lang.String str23 = tile18.toString();
        java.lang.String str24 = tile18.toString();
        org.jpacman.framework.model.Direction direction25 = org.jpacman.framework.model.Direction.DOWN;
        int int26 = direction25.getDx();
        int int27 = direction25.getDx();
        org.jpacman.framework.model.Tile tile28 = null; // flaky: board7.tileAtDirection(tile18, direction25);
        game0.notifyObservers((java.lang.Object) tile28);
        org.jpacman.framework.model.Game game30 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player31 = game30.getPlayer();
        org.jpacman.framework.model.Player player32 = game30.getPlayer();
        org.jpacman.framework.model.Board board33 = game30.getBoard();
        org.jpacman.framework.model.Player player34 = game30.getPlayer();
        org.jpacman.framework.model.Ghost ghost35 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost35.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = ghost35.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = ghost35.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost35.getSpriteType();
        game30.addGhost(ghost35);
        org.jpacman.framework.model.Tile tile41 = ghost35.getTile();
        boolean boolean42 = false; // flaky: tile28.containsSprite((org.jpacman.framework.model.Sprite) ghost35);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[-1,100]" + "'", str23.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1,100]" + "'", str24.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction25 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction25.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile28);
        org.junit.Assert.assertNull(player31);
        org.junit.Assert.assertNull(player32);
        org.junit.Assert.assertNull(board33);
        org.junit.Assert.assertNull(player34);
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(tile41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        int int10 = player0.addPoints(10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 72 + "'", int10 == 72);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        int int18 = direction17.getDx();
        player0.setDirection(direction17);
        org.jpacman.framework.model.Tile tile20 = player0.getTile();
        org.jpacman.framework.model.Tile tile21 = player0.getTile();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction17.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(tile20);
        org.junit.Assert.assertNotNull(tile21);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        game0.notifyObservers((java.lang.Object) pointManager8);
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        game0.addPlayer(player10);
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.Board board17 = game15.getBoard();
        boolean boolean18 = game15.won();
        game15.deleteObservers();
        game0.notifyObservers((java.lang.Object) game15);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(player16);
        org.junit.Assert.assertNull(board17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        food0.setPoints((int) (byte) -1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(104, 100);
        org.jpacman.framework.model.Sprite sprite5 = board2.spriteAt(0, 35);
        boolean boolean8 = board2.withinBorders((int) (short) 0, 73);
        org.junit.Assert.assertNull(sprite5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, (int) (byte) 10);
        int int3 = board2.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite11 = tile10.topSprite();
        int int12 = tile10.getY();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board7.tileAtOffset(tile10, 100, 1);
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        player16.die();
        player16.resurrect();
        java.lang.String str19 = player16.toString();
        int int20 = player16.getPoints();
        org.jpacman.framework.model.Direction direction21 = org.jpacman.framework.model.Direction.UP;
        player16.setDirection(direction21);
        java.lang.Class<?> wildcardClass23 = direction21.getClass();
        org.jpacman.framework.model.Tile tile24 = null; // flaky: board3.tileAtDirection(tile15, direction21);
        int int25 = direction21.getDy();
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PLAYER occupying null" + "'", str19.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction21.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass23);
// flaky:         org.junit.Assert.assertNotNull(tile24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int6 = tile5.getX();
        int int7 = tile5.getX();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        boolean boolean11 = tile5.containsSprite((org.jpacman.framework.model.Sprite) food8);
        int int12 = food8.getPoints();
        game0.addFood(food8);
        org.jpacman.framework.model.Ghost ghost14 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = ghost14.getSpriteType();
        game0.addGhost(ghost14);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = ghost14.getSpriteType();
        java.lang.Class<?> wildcardClass21 = ghost14.getClass();
        java.lang.String str22 = ghost14.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost14.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType17 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType17.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "GHOST occupying null" + "'", str22.equals("GHOST occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Food food5 = new org.jpacman.framework.model.Food();
        int int6 = food5.getPoints();
        int int7 = food5.getPoints();
        boolean boolean8 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food5);
        int int9 = food5.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food5.getSpriteType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        int int2 = player0.getPoints();
        player0.die();
        int int4 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Board board13 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite17 = tile16.topSprite();
        int int18 = tile16.getY();
        org.jpacman.framework.model.Tile tile21 = null; // flaky: board13.tileAtOffset(tile16, 100, 1);
        org.jpacman.framework.model.Tile tile24 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player25 = new org.jpacman.framework.model.Player();
        player25.die();
        player25.resurrect();
        org.jpacman.framework.model.Tile tile30 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food31 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = food31.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = food31.getSpriteType();
        boolean boolean34 = tile30.containsSprite((org.jpacman.framework.model.Sprite) food31);
        java.lang.String str35 = tile30.toString();
        java.lang.String str36 = tile30.toString();
        org.jpacman.framework.model.Sprite sprite37 = tile30.topSprite();
        player25.occupy(tile30);
        org.jpacman.framework.model.Direction direction39 = player25.getDirection();
        org.jpacman.framework.model.Tile tile40 = null; // flaky: board13.tileAtDirection(tile24, direction39);
        try {
            org.jpacman.framework.model.Tile tile43 = null; // flaky: board5.tileAtOffset(tile40, 52, 46);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(sprite17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile21);
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "[-1,100]" + "'", str35.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1,100]" + "'", str36.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite37);
        org.junit.Assert.assertTrue("'" + direction39 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction39.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile40);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        boolean boolean4 = game0.hasChanged();
        int int5 = game0.countObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        int int5 = game0.countObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        player4.die();
        player4.resurrect();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food10.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food10.getSpriteType();
        boolean boolean13 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food10);
        java.lang.String str14 = tile9.toString();
        java.lang.String str15 = tile9.toString();
        org.jpacman.framework.model.Sprite sprite16 = tile9.topSprite();
        player4.occupy(tile9);
        org.jpacman.framework.model.Direction direction18 = player4.getDirection();
        game0.addPlayer(player4);
        org.jpacman.framework.model.Board board20 = game0.getBoard();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,100]" + "'", str14.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1,100]" + "'", str15.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite16);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction18.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertNull(board20);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        int int10 = player0.addPoints(10);
        int int12 = player0.addPoints(0);
        int int13 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 72 + "'", int10 == 72);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 72 + "'", int13 == 72);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game6.getGhosts();
        org.jpacman.framework.model.Game game10 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player11 = game10.getPlayer();
        boolean boolean12 = game10.won();
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int16 = tile15.getX();
        int int17 = tile15.getX();
        org.jpacman.framework.model.Food food18 = new org.jpacman.framework.model.Food();
        int int19 = food18.getPoints();
        int int20 = food18.getPoints();
        boolean boolean21 = tile15.containsSprite((org.jpacman.framework.model.Sprite) food18);
        int int22 = food18.getPoints();
        game10.addFood(food18);
        org.jpacman.framework.model.Ghost ghost24 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost24.getSpriteType();
        game10.addGhost(ghost24);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost24.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost24.getSpriteType();
        game6.addGhost(ghost24);
        game0.addGhost(ghost24);
        org.jpacman.framework.model.Game game34 = new org.jpacman.framework.model.Game();
        game34.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList36 = game34.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList37 = game34.getGhosts();
        org.jpacman.framework.model.Game game38 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board41 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean44 = board41.withinBorders((int) (byte) 10, (int) '4');
        int int45 = board41.getHeight();
        game38.setBoard(board41);
        org.jpacman.framework.model.Ghost ghost47 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = ghost47.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = ghost47.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType50 = ghost47.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType51 = ghost47.getSpriteType();
        game38.addGhost(ghost47);
        game34.addGhost(ghost47);
        game0.addGhost(ghost47);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = ghost47.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertNotNull(ghostList9);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType26 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType26.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(ghostList36);
        org.junit.Assert.assertNotNull(ghostList37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType49 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType49.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType50 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType50.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType51 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType51.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType55 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType55.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.Direction direction6 = player0.getDirection();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction6.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        food6.setPoints((int) (short) 10);
        game0.addFood(food6);
        java.util.Observer observer10 = null;
        try {
            game0.addObserver(observer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Board board4 = game3.getBoard();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getY();
        int int9 = tile7.getY();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.RIGHT;
        int int11 = direction10.getDx();
        int int12 = direction10.getDy();
        org.jpacman.framework.model.Tile tile13 = null; // flaky: board4.tileAtDirection(tile7, direction10);
        try {
            org.jpacman.framework.model.Tile tile16 = null; // flaky: board4.tileAt(71, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 71");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(board4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction10.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile13);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.Food food7 = new org.jpacman.framework.model.Food();
        int int8 = food7.getPoints();
        int int9 = food7.getPoints();
        int int10 = food7.getPoints();
        game0.addFood(food7);
        org.jpacman.framework.model.Board board14 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite18 = tile17.topSprite();
        int int19 = tile17.getY();
        org.jpacman.framework.model.Tile tile22 = null; // flaky: board14.tileAtOffset(tile17, 100, 1);
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getX();
        int int27 = tile25.getX();
        int int28 = tile25.getX();
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.LEFT;
        org.jpacman.framework.model.Tile tile30 = null; // flaky: board14.tileAtDirection(tile25, direction29);
        game0.setBoard(board14);
        org.jpacman.framework.model.Game game32 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player33 = game32.getPlayer();
        boolean boolean34 = game32.won();
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int38 = tile37.getX();
        int int39 = tile37.getX();
        org.jpacman.framework.model.Food food40 = new org.jpacman.framework.model.Food();
        int int41 = food40.getPoints();
        int int42 = food40.getPoints();
        boolean boolean43 = tile37.containsSprite((org.jpacman.framework.model.Sprite) food40);
        int int44 = food40.getPoints();
        game32.addFood(food40);
        org.jpacman.framework.model.Ghost ghost46 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = ghost46.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = ghost46.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = ghost46.getSpriteType();
        game32.addGhost(ghost46);
        try {
// flaky:             board14.put((org.jpacman.framework.model.Sprite) ghost46, (int) (short) 10, (int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(sprite18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction29.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile30);
        org.junit.Assert.assertNull(player33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + spriteType47 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType47.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType49 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType49.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector7 = game0.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager8 = new org.jpacman.framework.model.PointManager();
        pointManager8.addPointsToBoard((int) (byte) 10);
        int int11 = pointManager8.totalFoodInGame();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = player12.getSpriteType();
        java.lang.String str16 = player12.toString();
// flaky:         pointManager8.consumePointsOnBoard(player12, 72);
        int int19 = pointManager8.getFoodEaten();
        pointManager8.addPointsToBoard((int) (short) 100);
        game0.notifyObservers((java.lang.Object) (short) 100);
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getX();
        int int27 = tile25.getX();
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        int int30 = player28.addPoints((int) (short) 10);
        int int31 = player28.getPoints();
        int int33 = player28.addPoints((int) '4');
        boolean boolean34 = tile25.containsSprite((org.jpacman.framework.model.Sprite) player28);
        player28.resurrect();
        player28.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = player28.getSpriteType();
        game0.addPlayer(player28);
        int int39 = game0.countObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNull(iBoardInspector7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "PLAYER occupying null" + "'", str16.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 72 + "'", int19 == 72);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 62 + "'", int33 == 62);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        try {
            java.lang.Class<?> wildcardClass3 = player2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        java.util.Observer observer3 = null;
        game0.deleteObserver(observer3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.IBoardInspector iBoardInspector9 = game0.getBoardInspector();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(iBoardInspector9);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        boolean boolean5 = board2.withinBorders(0, (int) (byte) 1);
        try {
            org.jpacman.framework.model.Tile tile8 = null; // flaky: board2.tileAt((int) '#', 52);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        player5.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player5.getSpriteType();
        boolean boolean15 = player5.isAlive();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        game0.addFood(food9);
        org.jpacman.framework.model.Board board15 = new org.jpacman.framework.model.Board(0, 20);
        int int16 = board15.getHeight();
        int int17 = board15.getWidth();
        int int18 = board15.getWidth();
        game0.setBoard(board15);
        int int20 = board15.getHeight();
        int int21 = board15.getWidth();
        int int22 = board15.getWidth();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        int int18 = direction17.getDx();
        player0.setDirection(direction17);
        boolean boolean20 = player0.isAlive();
        org.jpacman.framework.model.Level level21 = new org.jpacman.framework.model.Level();
        java.lang.String str22 = level21.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor23 = level21.parseMap();
        org.jpacman.framework.model.Game game24 = level21.getGame();
        org.jpacman.framework.model.Board board25 = game24.getBoard();
        org.jpacman.framework.model.Tile tile28 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int29 = tile28.getY();
        int int30 = tile28.getY();
        org.jpacman.framework.model.Direction direction31 = org.jpacman.framework.model.Direction.RIGHT;
        int int32 = direction31.getDx();
        int int33 = direction31.getDy();
        org.jpacman.framework.model.Tile tile34 = null; // flaky: board25.tileAtDirection(tile28, direction31);
        player0.setDirection(direction31);
        int int36 = player0.getPoints();
        player0.resurrect();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction17.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "board.txt" + "'", str22.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor23);
        org.junit.Assert.assertNotNull(game24);
        org.junit.Assert.assertNotNull(board25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + direction31 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction31.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        int int7 = game0.countObservers();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        boolean boolean10 = game0.hasChanged();
        java.util.Observer observer11 = null;
        try {
// flaky:             game0.attach(observer11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game0.getGhosts();
        java.util.Observer observer10 = null;
        game0.deleteObserver(observer10);
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList13 = game12.getGhosts();
        game12.notifyObservers();
        boolean boolean15 = game12.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList16 = game12.getGhosts();
        org.jpacman.framework.model.Board board17 = game12.getBoard();
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        game12.addGhost(ghost18);
        java.lang.String str21 = ghost18.toString();
        org.jpacman.framework.model.Player player22 = new org.jpacman.framework.model.Player();
        int int24 = player22.addPoints((int) (short) 10);
        boolean boolean25 = player22.isAlive();
        int int27 = player22.addPoints((int) (short) 0);
        org.jpacman.framework.model.Direction direction28 = player22.getDirection();
        int int29 = direction28.getDy();
        try {
            game0.moveGhost(ghost18, direction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(ghostList9);
        org.junit.Assert.assertNotNull(ghostList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ghostList16);
        org.junit.Assert.assertNull(board17);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "GHOST occupying null" + "'", str21.equals("GHOST occupying null"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.Player player5 = game0.getPlayer();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(player5);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getHeight();
        game0.setBoard(board6);
        int int9 = board6.getWidth();
        boolean boolean12 = board6.withinBorders(82, (int) (byte) -1);
        try {
            org.jpacman.framework.model.Sprite sprite15 = null; // flaky: board6.spriteAt((int) 'a', 20);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 62 + "'", int9 == 62);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food11 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food11.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food11.getSpriteType();
        boolean boolean14 = tile10.containsSprite((org.jpacman.framework.model.Sprite) food11);
        java.lang.String str15 = tile10.toString();
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.RIGHT;
        int int17 = direction16.getDx();
        int int18 = direction16.getDy();
        int int19 = direction16.getDy();
        org.jpacman.framework.model.Tile tile20 = null; // flaky: board7.tileAtDirection(tile10, direction16);
        game3.setBoard(board7);
        org.jpacman.framework.model.Board board22 = game3.getBoard();
        org.jpacman.framework.model.Game game23 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player24 = game23.getPlayer();
        boolean boolean25 = game23.won();
        org.jpacman.framework.model.Tile tile28 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int29 = tile28.getX();
        int int30 = tile28.getX();
        org.jpacman.framework.model.Food food31 = new org.jpacman.framework.model.Food();
        int int32 = food31.getPoints();
        int int33 = food31.getPoints();
        boolean boolean34 = tile28.containsSprite((org.jpacman.framework.model.Sprite) food31);
        int int35 = food31.getPoints();
        game23.addFood(food31);
        java.lang.String str37 = food31.toString();
        try {
// flaky:             board22.put((org.jpacman.framework.model.Sprite) food31, 63, 61);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1,100]" + "'", str15.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction16.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile20);
        org.junit.Assert.assertNotNull(board22);
        org.junit.Assert.assertNull(player24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "FOOD occupying null" + "'", str37.equals("FOOD occupying null"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying null");
        level0.setMapFile("PLAYER occupying null");
        java.lang.String str11 = level0.getMapFile();
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor12 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: PLAYER occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "PLAYER occupying null" + "'", str11.equals("PLAYER occupying null"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int8 = tile7.getX();
        int int9 = tile7.getX();
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        int int11 = food10.getPoints();
        int int12 = food10.getPoints();
        boolean boolean13 = tile7.containsSprite((org.jpacman.framework.model.Sprite) food10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food10.getSpriteType();
        game3.addFood(food10);
        org.jpacman.framework.model.PointManager pointManager16 = game3.getPointManager();
        org.jpacman.framework.model.Game game17 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board20 = new org.jpacman.framework.model.Board(62, 10);
        game17.setBoard(board20);
        int int22 = board20.getHeight();
        game3.setBoard(board20);
        org.jpacman.framework.model.Ghost ghost24 = new org.jpacman.framework.model.Ghost();
        game3.addGhost(ghost24);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(pointManager16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Board board4 = game0.getBoard();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(board4);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = null; // flaky: board3.spriteTypeAt(72, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Player player11 = game0.getPlayer();
        game0.notifyObservers();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList14 = game0.getGhosts();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertNotNull(ghostList14);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager1 = new org.jpacman.framework.model.PointManager();
        pointManager1.addPointsToBoard((int) (byte) 10);
        int int4 = pointManager1.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player5.getSpriteType();
        java.lang.String str9 = player5.toString();
// flaky:         pointManager1.consumePointsOnBoard(player5, 72);
// flaky:         pointManager0.consumePointsOnBoard(player5, (-1));
        int int14 = pointManager0.getFoodEaten();
        boolean boolean15 = pointManager0.allEaten();
        pointManager0.addPointsToBoard(94);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.won();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(62, 10);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        boolean boolean12 = game0.won();
        game0.notifyObservers();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.hasChanged();
        boolean boolean7 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        int int7 = pointManager3.totalFoodInGame();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        player8.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player8.getSpriteType();
        boolean boolean11 = player8.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player8.getSpriteType();
        player8.die();
        int int14 = player8.getPoints();
// flaky:         pointManager3.consumePointsOnBoard(player8, 1);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game4.getGhosts();
        game4.notifyObservers();
        boolean boolean7 = game4.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game4.getGhosts();
        org.jpacman.framework.model.Board board9 = game4.getBoard();
        boolean boolean10 = game4.won();
        org.jpacman.framework.model.Board board13 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean16 = board13.withinBorders((int) (byte) 10, (int) '4');
        game4.setBoard(board13);
        org.jpacman.framework.model.IBoardInspector iBoardInspector18 = game4.getBoardInspector();
        game0.notifyObservers((java.lang.Object) game4);
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board(0, 20);
        int int23 = board22.getWidth();
        int int24 = board22.getWidth();
        int int25 = board22.getHeight();
        game4.setBoard(board22);
        org.junit.Assert.assertNotNull(ghostList2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ghostList8);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iBoardInspector18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        int int1 = pointManager0.getFoodEaten();
        int int2 = pointManager0.totalFoodInGame();
        boolean boolean3 = pointManager0.allEaten();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        game0.notifyObservers((java.lang.Object) pointManager8);
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        game0.addPlayer(player10);
        boolean boolean15 = game0.won();
        game0.deleteObservers();
        java.util.Observer observer17 = null;
        try {
// flaky:             game0.attach(observer17);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int10 = tile9.getX();
        int int11 = tile9.getX();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        int int15 = player12.getPoints();
        int int17 = player12.addPoints((int) '4');
        boolean boolean18 = tile9.containsSprite((org.jpacman.framework.model.Sprite) player12);
        boolean boolean19 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player12);
        java.lang.String str20 = player12.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = player12.getSpriteType();
        int int23 = player12.addPoints((int) (short) -1);
        org.jpacman.framework.model.Direction direction24 = player12.getDirection();
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 62 + "'", int17 == 62);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "PLAYER occupying null" + "'", str20.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 61 + "'", int23 == 61);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction24.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.Board board10 = game7.getBoard();
        int int11 = game7.countObservers();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        org.jpacman.framework.model.PointManager pointManager14 = game12.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList15 = game12.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game12.getBoardInspector();
        boolean boolean17 = game12.hasChanged();
        org.jpacman.framework.model.Game game18 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player19 = game18.getPlayer();
        boolean boolean20 = game18.won();
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int24 = tile23.getX();
        int int25 = tile23.getX();
        org.jpacman.framework.model.Food food26 = new org.jpacman.framework.model.Food();
        int int27 = food26.getPoints();
        int int28 = food26.getPoints();
        boolean boolean29 = tile23.containsSprite((org.jpacman.framework.model.Sprite) food26);
        int int30 = food26.getPoints();
        game18.addFood(food26);
        org.jpacman.framework.model.Ghost ghost32 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost32.getSpriteType();
        game18.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = ghost32.getSpriteType();
        game12.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost32.getSpriteType();
        game7.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = ghost32.getSpriteType();
        game0.addGhost(ghost32);
        java.util.Observer observer43 = null;
        try {
            game0.addObserver(observer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(board10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNotNull(pointManager14);
        org.junit.Assert.assertNotNull(ghostList15);
        org.junit.Assert.assertNull(iBoardInspector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(player19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        java.util.Observer observer9 = null;
        game0.deleteObserver(observer9);
        game0.notifyObservers();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        boolean boolean14 = game12.won();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        boolean boolean18 = player15.isAlive();
        org.jpacman.framework.model.Direction direction19 = player15.getDirection();
        player15.die();
        game12.addPlayer(player15);
        game0.addPlayer(player15);
        boolean boolean23 = player15.isAlive();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction19.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying null");
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor9 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: PLAYER occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food0.getSpriteType();
        java.lang.String str8 = food0.toString();
        food0.setPoints((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FOOD occupying null" + "'", str8.equals("FOOD occupying null"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board10 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food14.getSpriteType();
        boolean boolean17 = tile13.containsSprite((org.jpacman.framework.model.Sprite) food14);
        java.lang.String str18 = tile13.toString();
        org.jpacman.framework.model.Direction direction19 = org.jpacman.framework.model.Direction.RIGHT;
        int int20 = direction19.getDx();
        int int21 = direction19.getDy();
        int int22 = direction19.getDy();
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board10.tileAtDirection(tile13, direction19);
        int int24 = board10.getHeight();
        org.jpacman.framework.model.Tile tile27 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int28 = tile27.getX();
        int int29 = tile27.getX();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        int int32 = player30.addPoints((int) (short) 10);
        int int33 = player30.getPoints();
        int int35 = player30.addPoints((int) '4');
        boolean boolean36 = tile27.containsSprite((org.jpacman.framework.model.Sprite) player30);
        int int37 = tile27.getY();
        org.jpacman.framework.model.Player player38 = new org.jpacman.framework.model.Player();
        player38.die();
        player38.resurrect();
        int int41 = player38.getPoints();
        org.jpacman.framework.model.Direction direction42 = player38.getDirection();
        org.jpacman.framework.model.Tile tile43 = null; // flaky: board10.tileAtDirection(tile27, direction42);
        game0.setBoard(board10);
        try {
            org.jpacman.framework.model.Tile tile47 = null; // flaky: board10.tileAt(82, 80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction19.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 62 + "'", int35 == 62);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + direction42 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction42.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile43);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.die();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        int int14 = tile11.getX();
        player5.occupy(tile11);
        player0.occupy(tile11);
        player0.resurrect();
        org.jpacman.framework.model.Direction direction18 = player0.getDirection();
        player0.die();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction18.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        food0.setPoints((int) (byte) 0);
        int int5 = food0.getPoints();
        int int6 = food0.getPoints();
        food0.setPoints(0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        int int5 = tile2.getX();
        java.lang.String str6 = tile2.toString();
        java.lang.String str7 = tile2.toString();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int11 = tile10.getX();
        int int12 = tile10.getX();
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        int int16 = player13.getPoints();
        int int18 = player13.addPoints((int) '4');
        boolean boolean19 = tile10.containsSprite((org.jpacman.framework.model.Sprite) player13);
        boolean boolean20 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player13);
        java.lang.String str21 = tile2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10,-1]" + "'", str6.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[10,-1]" + "'", str7.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[10,-1]" + "'", str21.equals("[10,-1]"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile4 = null;
        try {
            org.jpacman.framework.model.Tile tile7 = null; // flaky: board2.tileAtOffset(tile4, (-1), 21);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        boolean boolean15 = board5.withinBorders((int) (byte) 100, 62);
        try {
            org.jpacman.framework.model.Tile tile18 = null; // flaky: board5.tileAt((int) (byte) 100, 21);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player0.getSpriteType();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        int int12 = player9.getPoints();
        int int14 = player9.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction15 = player9.getDirection();
        int int16 = direction15.getDy();
        player0.setDirection(direction15);
        org.jpacman.framework.model.Direction direction18 = player0.getDirection();
        int int20 = player0.addPoints((int) (short) 10);
        int int22 = player0.addPoints((int) (byte) 1);
        int int24 = player0.addPoints(19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction15.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction18.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 72 + "'", int20 == 72);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 92 + "'", int24 == 92);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getHeight();
        int int10 = board2.getWidth();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int14 = tile13.getX();
        int int15 = tile13.getX();
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        int int18 = player16.addPoints((int) (short) 10);
        int int19 = player16.getPoints();
        int int21 = player16.addPoints((int) '4');
        boolean boolean22 = tile13.containsSprite((org.jpacman.framework.model.Sprite) player16);
        try {
// flaky:             board2.put((org.jpacman.framework.model.Sprite) player16, 104, (int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 62 + "'", int21 == 62);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        game0.setBoard(board5);
        org.jpacman.framework.model.Player player11 = game0.getPlayer();
        game0.notifyObservers();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        int int15 = food14.getPoints();
        int int16 = food14.getPoints();
        int int17 = food14.getPoints();
        java.lang.String str18 = food14.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = food14.getSpriteType();
        java.lang.Class<?> wildcardClass20 = food14.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food14.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = food14.getSpriteType();
        game0.addFood(food14);
        org.jpacman.framework.model.Board board27 = new org.jpacman.framework.model.Board(62, 10);
        int int28 = board27.getWidth();
        org.jpacman.framework.model.Tile tile31 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player32 = new org.jpacman.framework.model.Player();
        int int34 = player32.addPoints((int) (short) 10);
        int int35 = player32.getPoints();
        int int37 = player32.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction38 = player32.getDirection();
        int int39 = direction38.getDy();
        org.jpacman.framework.model.Tile tile40 = null; // flaky: board27.tileAtDirection(tile31, direction38);
        food14.occupy(tile31);
        java.lang.String str42 = tile31.toString();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "FOOD occupying null" + "'", str18.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 62 + "'", int37 == 62);
        org.junit.Assert.assertTrue("'" + direction38 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction38.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile40);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[10,-1]" + "'", str42.equals("[10,-1]"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager1 = new org.jpacman.framework.model.PointManager();
        pointManager1.addPointsToBoard((int) (byte) 10);
        int int4 = pointManager1.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player5.getSpriteType();
        java.lang.String str9 = player5.toString();
// flaky:         pointManager1.consumePointsOnBoard(player5, 72);
// flaky:         pointManager0.consumePointsOnBoard(player5, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player5.getSpriteType();
        java.lang.String str15 = player5.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = player5.getSpriteType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "PLAYER occupying null" + "'", str15.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.IGameFactory iGameFactory1 = null;
// flaky:         level0.setFactory(iGameFactory1);
        org.jpacman.framework.factory.IGameFactory iGameFactory3 = null;
// flaky:         level0.setFactory(iGameFactory3);
        org.jpacman.framework.model.Game game5 = level0.getGame();
        org.junit.Assert.assertNull(game5);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.won();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean12 = board9.withinBorders((int) (byte) 10, (int) '4');
        game0.setBoard(board9);
        try {
            org.jpacman.framework.model.Sprite sprite16 = null; // flaky: board9.spriteAt((int) 'a', 156);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        boolean boolean8 = game6.won();
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int12 = tile11.getX();
        int int13 = tile11.getX();
        org.jpacman.framework.model.Food food14 = new org.jpacman.framework.model.Food();
        int int15 = food14.getPoints();
        int int16 = food14.getPoints();
        boolean boolean17 = tile11.containsSprite((org.jpacman.framework.model.Sprite) food14);
        int int18 = food14.getPoints();
        game6.addFood(food14);
        org.jpacman.framework.model.Ghost ghost20 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = ghost20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = ghost20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost20.getSpriteType();
        game6.addGhost(ghost20);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost20.getSpriteType();
        game0.addGhost(ghost20);
        org.jpacman.framework.model.Game game27 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player28 = game27.getPlayer();
        org.jpacman.framework.model.PointManager pointManager29 = game27.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList30 = game27.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector31 = game27.getBoardInspector();
        game27.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board36 = new org.jpacman.framework.model.Board(0, 20);
        int int37 = board36.getHeight();
        game27.setBoard(board36);
        game0.notifyObservers((java.lang.Object) board36);
        int int40 = board36.getWidth();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(player28);
        org.junit.Assert.assertNotNull(pointManager29);
        org.junit.Assert.assertNotNull(ghostList30);
        org.junit.Assert.assertNull(iBoardInspector31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        int int12 = board9.getWidth();
        java.lang.Class<?> wildcardClass13 = board9.getClass();
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        player14.die();
        player14.resurrect();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food20 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food20.getSpriteType();
        boolean boolean23 = tile19.containsSprite((org.jpacman.framework.model.Sprite) food20);
        java.lang.String str24 = tile19.toString();
        java.lang.String str25 = tile19.toString();
        org.jpacman.framework.model.Sprite sprite26 = tile19.topSprite();
        player14.occupy(tile19);
        org.jpacman.framework.model.Direction direction28 = player14.getDirection();
        org.jpacman.framework.model.Tile tile31 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int32 = tile31.getY();
        int int33 = tile31.getY();
// flaky:         player14.occupy(tile31);
        try {
// flaky:             board9.put((org.jpacman.framework.model.Sprite) player14, 45, 104);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1,100]" + "'", str24.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1,100]" + "'", str25.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite26);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.Board board10 = game7.getBoard();
        int int11 = game7.countObservers();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        org.jpacman.framework.model.PointManager pointManager14 = game12.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList15 = game12.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game12.getBoardInspector();
        boolean boolean17 = game12.hasChanged();
        org.jpacman.framework.model.Game game18 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player19 = game18.getPlayer();
        boolean boolean20 = game18.won();
        org.jpacman.framework.model.Tile tile23 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int24 = tile23.getX();
        int int25 = tile23.getX();
        org.jpacman.framework.model.Food food26 = new org.jpacman.framework.model.Food();
        int int27 = food26.getPoints();
        int int28 = food26.getPoints();
        boolean boolean29 = tile23.containsSprite((org.jpacman.framework.model.Sprite) food26);
        int int30 = food26.getPoints();
        game18.addFood(food26);
        org.jpacman.framework.model.Ghost ghost32 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost32.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost32.getSpriteType();
        game18.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = ghost32.getSpriteType();
        game12.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost32.getSpriteType();
        game7.addGhost(ghost32);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = ghost32.getSpriteType();
        game0.addGhost(ghost32);
        java.util.Observer observer43 = null;
        try {
// flaky:             game0.attach(observer43);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(board10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNotNull(pointManager14);
        org.junit.Assert.assertNotNull(ghostList15);
        org.junit.Assert.assertNull(iBoardInspector16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(player19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        java.util.Observer observer6 = null;
        game0.deleteObserver(observer6);
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        int int9 = food8.getPoints();
        int int10 = food8.getPoints();
        int int11 = food8.getPoints();
        java.lang.String str12 = food8.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food8.getSpriteType();
        int int14 = food8.getPoints();
        game0.addFood(food8);
        int int16 = food8.getPoints();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "FOOD occupying null" + "'", str12.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        boolean boolean9 = board2.withinBorders((int) (short) 1, (int) (byte) 1);
        boolean boolean12 = board2.withinBorders(0, (int) '#');
        int int13 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        level0.setMapFile("[-1,100]");
        org.jpacman.framework.factory.IGameFactory iGameFactory3 = null;
// flaky:         level0.setFactory(iGameFactory3);
        java.lang.Class<?> wildcardClass5 = level0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite6 = tile5.topSprite();
        int int7 = tile5.getY();
        org.jpacman.framework.model.Tile tile10 = null; // flaky: board2.tileAtOffset(tile5, 100, 1);
        try {
            org.jpacman.framework.model.Sprite sprite13 = null; // flaky: board2.spriteAt(63, (int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int13 = player5.addPoints(0);
        player5.die();
        boolean boolean15 = player5.isAlive();
        org.jpacman.framework.model.Direction direction16 = player5.getDirection();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction16.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean11 = board8.withinBorders(100, 10);
        boolean boolean14 = board8.withinBorders(52, 62);
        game0.setBoard(board8);
        int int16 = board8.getWidth();
        java.lang.Class<?> wildcardClass17 = board8.getClass();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager1 = new org.jpacman.framework.model.PointManager();
        pointManager1.addPointsToBoard((int) (byte) 10);
        int int4 = pointManager1.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player5.getSpriteType();
        java.lang.String str9 = player5.toString();
// flaky:         pointManager1.consumePointsOnBoard(player5, 72);
// flaky:         pointManager0.consumePointsOnBoard(player5, (-1));
        int int14 = pointManager0.getFoodEaten();
        boolean boolean15 = pointManager0.allEaten();
        org.jpacman.framework.model.Game game16 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList17 = game16.getGhosts();
        game16.notifyObservers();
        boolean boolean19 = game16.hasChanged();
        org.jpacman.framework.model.Game game20 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player21 = game20.getPlayer();
        boolean boolean22 = game20.won();
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        int int25 = player23.addPoints((int) (short) 10);
        int int26 = player23.getPoints();
        int int28 = player23.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = player23.getSpriteType();
        game20.addPlayer(player23);
        org.jpacman.framework.model.Tile tile33 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food34 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = food34.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = food34.getSpriteType();
        boolean boolean37 = tile33.containsSprite((org.jpacman.framework.model.Sprite) food34);
        java.lang.String str38 = tile33.toString();
        java.lang.String str39 = tile33.toString();
        org.jpacman.framework.model.Sprite sprite40 = tile33.topSprite();
        player23.occupy(tile33);
        player23.resurrect();
        org.jpacman.framework.model.Player player43 = new org.jpacman.framework.model.Player();
        int int45 = player43.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = player43.getSpriteType();
        org.jpacman.framework.model.Direction direction47 = org.jpacman.framework.model.Direction.LEFT;
        int int48 = direction47.getDx();
        player43.setDirection(direction47);
        int int50 = direction47.getDx();
        player23.setDirection(direction47);
        player23.die();
        player23.resurrect();
        game16.addPlayer(player23);
// flaky:         pointManager0.consumePointsOnBoard(player23, 72);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ghostList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(player21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[-1,100]" + "'", str38.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[-1,100]" + "'", str39.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + spriteType46 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType46.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction47 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction47.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        boolean boolean6 = player3.isAlive();
        player3.die();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        boolean boolean11 = player8.isAlive();
        org.jpacman.framework.model.Tile tile14 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int15 = tile14.getX();
        int int16 = tile14.getX();
        int int17 = tile14.getX();
        player8.occupy(tile14);
        player3.occupy(tile14);
        org.jpacman.framework.model.Direction direction20 = org.jpacman.framework.model.Direction.DOWN;
        player3.setDirection(direction20);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player3.getSpriteType();
        game0.addPlayer(player3);
        player3.die();
        org.junit.Assert.assertNotNull(ghostList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + direction20 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction20.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        int int10 = board9.getHeight();
        game0.setBoard(board9);
        boolean boolean14 = board9.withinBorders(71, 92);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        game0.notifyObservers();
        boolean boolean7 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction13 = player7.getDirection();
        int int14 = direction13.getDy();
        org.jpacman.framework.model.Tile tile15 = null; // flaky: board2.tileAtDirection(tile6, direction13);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food19.getSpriteType();
        boolean boolean22 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food19);
        org.jpacman.framework.model.Sprite sprite23 = tile18.topSprite();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board2.tileAtOffset(tile18, 100, (int) '4');
        boolean boolean29 = board2.withinBorders(0, (int) 'a');
        try {
            org.jpacman.framework.model.Tile tile32 = null; // flaky: board2.tileAt(1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sprite23);
// flaky:         org.junit.Assert.assertNotNull(tile26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        game0.addFood(food9);
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        player13.die();
        player13.resurrect();
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food19.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = food19.getSpriteType();
        boolean boolean22 = tile18.containsSprite((org.jpacman.framework.model.Sprite) food19);
        java.lang.String str23 = tile18.toString();
        java.lang.String str24 = tile18.toString();
        org.jpacman.framework.model.Sprite sprite25 = tile18.topSprite();
        player13.occupy(tile18);
        game0.notifyObservers((java.lang.Object) player13);
        java.util.Observer observer28 = null;
        try {
// flaky:             game0.attach(observer28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[-1,100]" + "'", str23.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1,100]" + "'", str24.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite25);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        boolean boolean8 = board2.withinBorders(20, (int) (byte) 10);
        int int9 = board2.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite12 = null; // flaky: board2.spriteAt(156, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 156");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        org.jpacman.framework.model.Player player7 = game0.getPlayer();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        org.jpacman.framework.model.PointManager pointManager10 = game8.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList11 = game8.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector12 = game8.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList13 = game8.getGhosts();
        org.jpacman.framework.model.Player player14 = game8.getPlayer();
        org.jpacman.framework.model.Food food15 = new org.jpacman.framework.model.Food();
        int int16 = food15.getPoints();
        int int17 = food15.getPoints();
        int int18 = food15.getPoints();
        game8.addFood(food15);
        int int20 = food15.getPoints();
        game0.notifyObservers((java.lang.Object) food15);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNotNull(pointManager10);
        org.junit.Assert.assertNotNull(ghostList11);
        org.junit.Assert.assertNull(iBoardInspector12);
        org.junit.Assert.assertNotNull(ghostList13);
        org.junit.Assert.assertNull(player14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        game0.deleteObservers();
        game0.notifyObservers();
        int int11 = game0.countObservers();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        game12.deleteObservers();
        int int14 = game12.countObservers();
        java.util.Observer observer15 = null;
        game12.deleteObserver(observer15);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList17 = game12.getGhosts();
        org.jpacman.framework.model.Ghost ghost18 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = ghost18.getSpriteType();
        game12.addGhost(ghost18);
        org.jpacman.framework.model.Game game21 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board22 = game21.getBoard();
        org.jpacman.framework.model.Ghost ghost23 = new org.jpacman.framework.model.Ghost();
        game21.addGhost(ghost23);
        org.jpacman.framework.model.IBoardInspector iBoardInspector25 = game21.getBoardInspector();
        org.jpacman.framework.model.Game game26 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player27 = game26.getPlayer();
        boolean boolean28 = game26.won();
        org.jpacman.framework.model.Player player29 = new org.jpacman.framework.model.Player();
        int int31 = player29.addPoints((int) (short) 10);
        int int32 = player29.getPoints();
        int int34 = player29.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = player29.getSpriteType();
        game26.addPlayer(player29);
        game21.addPlayer(player29);
        org.jpacman.framework.model.Direction direction38 = player29.getDirection();
        try {
            game0.moveGhost(ghost18, direction38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(ghostList17);
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(board22);
        org.junit.Assert.assertNull(iBoardInspector25);
        org.junit.Assert.assertNull(player27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 62 + "'", int34 == 62);
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction38 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction38.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.jpacman.framework.model.Direction direction0 = org.jpacman.framework.model.Direction.UP;
        int int1 = direction0.getDy();
        int int2 = direction0.getDx();
        int int3 = direction0.getDx();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction0.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        game0.deleteObservers();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        boolean boolean5 = game3.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        game3.addPlayer(player6);
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food17 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = food17.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType19 = food17.getSpriteType();
        boolean boolean20 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food17);
        java.lang.String str21 = tile16.toString();
        java.lang.String str22 = tile16.toString();
        org.jpacman.framework.model.Sprite sprite23 = tile16.topSprite();
        player6.occupy(tile16);
// flaky:         pointManager0.consumePointsOnBoard(player6, 19);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        int int30 = player27.getPoints();
        int int32 = player27.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = player27.getSpriteType();
        int int35 = player27.addPoints((int) (short) 10);
        player27.resurrect();
        player27.die();
// flaky:         pointManager0.consumePointsOnBoard(player27, 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = player27.getSpriteType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType18 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType18.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType19 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType19.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[-1,100]" + "'", str21.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1,100]" + "'", str22.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 62 + "'", int32 == 62);
        org.junit.Assert.assertTrue("'" + spriteType33 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType33.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 72 + "'", int35 == 72);
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) 'a', 46);
    }
}
