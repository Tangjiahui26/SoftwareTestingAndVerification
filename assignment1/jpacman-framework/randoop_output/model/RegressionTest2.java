import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        level0.setMapFile("[-1,100]");
        org.jpacman.framework.model.Game game11 = level0.getGame();
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor12 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: [-1,100] not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        java.lang.String str7 = tile2.toString();
        java.lang.String str8 = tile2.toString();
        org.jpacman.framework.model.Level level9 = new org.jpacman.framework.model.Level();
        java.lang.String str10 = level9.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor11 = level9.parseMap();
        org.jpacman.framework.model.Game game12 = level9.getGame();
        game12.notifyObservers();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        org.jpacman.framework.model.Food food19 = new org.jpacman.framework.model.Food();
        int int20 = food19.getPoints();
        int int21 = food19.getPoints();
        boolean boolean22 = tile16.containsSprite((org.jpacman.framework.model.Sprite) food19);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = food19.getSpriteType();
        game12.addFood(food19);
        java.lang.String str25 = food19.toString();
        boolean boolean26 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food19);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,100]" + "'", str7.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,100]" + "'", str8.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "board.txt" + "'", str10.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor11);
        org.junit.Assert.assertNotNull(game12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "FOOD occupying null" + "'", str25.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
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
        int int19 = 0; // flaky: player6.addPoints((int) (byte) 1);
        boolean boolean20 = player6.isAlive();
        org.jpacman.framework.model.Direction direction21 = player6.getDirection();
        boolean boolean22 = player6.isAlive();
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
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 73 + "'", int19 == 73);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction21.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory5 = null;
// flaky:         level0.setFactory(iGameFactory5);
        org.jpacman.framework.model.Game game7 = level0.getGame();
        level0.setMapFile("board.txt");
        org.jpacman.framework.factory.IGameFactory iGameFactory10 = null;
// flaky:         level0.setFactory(iGameFactory10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
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
        food6.setPoints(10);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(110, (int) ' ');
        org.jpacman.framework.model.Sprite sprite3 = tile2.topSprite();
        java.lang.String str4 = tile2.toString();
        org.junit.Assert.assertNull(sprite3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[110,32]" + "'", str4.equals("[110,32]"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
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
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game0.getBoardInspector();
        boolean boolean15 = game0.hasChanged();
        boolean boolean16 = game0.hasChanged();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.PointManager pointManager4 = game0.getPointManager();
        pointManager4.addPointsToBoard(1);
        pointManager4.addPointsToBoard(97);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNotNull(pointManager4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        boolean boolean32 = player3.isAlive();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard(63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
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
        org.jpacman.framework.model.Player player34 = new org.jpacman.framework.model.Player();
        player34.die();
        player34.resurrect();
        org.jpacman.framework.model.Player player37 = new org.jpacman.framework.model.Player();
        int int39 = player37.addPoints((int) (short) 10);
        boolean boolean40 = player37.isAlive();
        player37.die();
        org.jpacman.framework.model.Player player42 = new org.jpacman.framework.model.Player();
        int int44 = player42.addPoints((int) (short) 10);
        boolean boolean45 = player42.isAlive();
        org.jpacman.framework.model.Tile tile48 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int49 = tile48.getX();
        int int50 = tile48.getX();
        int int51 = tile48.getX();
        player42.occupy(tile48);
        player37.occupy(tile48);
        player34.occupy(tile48);
        org.jpacman.framework.model.Sprite sprite55 = tile48.topSprite();
        org.jpacman.framework.model.Tile tile58 = null; // flaky: board3.tileAtOffset(tile48, (-1), 71);
        org.jpacman.framework.model.Game game59 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board62 = new org.jpacman.framework.model.Board(62, 10);
        game59.setBoard(board62);
        org.jpacman.framework.model.Board board66 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile69 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite70 = tile69.topSprite();
        int int71 = tile69.getY();
        org.jpacman.framework.model.Tile tile74 = null; // flaky: board66.tileAtOffset(tile69, 100, 1);
        org.jpacman.framework.model.Player player75 = new org.jpacman.framework.model.Player();
        player75.die();
        player75.resurrect();
        java.lang.String str78 = player75.toString();
        int int79 = player75.getPoints();
        org.jpacman.framework.model.Direction direction80 = org.jpacman.framework.model.Direction.UP;
        player75.setDirection(direction80);
        java.lang.Class<?> wildcardClass82 = direction80.getClass();
        org.jpacman.framework.model.Tile tile83 = null; // flaky: board62.tileAtDirection(tile74, direction80);
        int int84 = 0; // flaky: tile74.getX();
        int int85 = 0; // flaky: tile74.getX();
        int int86 = 0; // flaky: tile74.getX();
        org.jpacman.framework.model.Direction direction87 = org.jpacman.framework.model.Direction.RIGHT;
        java.lang.Class<?> wildcardClass88 = direction87.getClass();
        int int89 = direction87.getDy();
        int int90 = direction87.getDy();
        int int91 = direction87.getDy();
        org.jpacman.framework.model.Tile tile92 = null; // flaky: board3.tileAtDirection(tile74, direction87);
        int int93 = board3.getHeight();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(sprite55);
// flaky:         org.junit.Assert.assertNotNull(tile58);
        org.junit.Assert.assertNull(sprite70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20 + "'", int71 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile74);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "PLAYER occupying null" + "'", str78.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + direction80 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction80.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass82);
// flaky:         org.junit.Assert.assertNotNull(tile83);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + 9 + "'", int84 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 9 + "'", int85 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 9 + "'", int86 == 9);
        org.junit.Assert.assertTrue("'" + direction87 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction87.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        boolean boolean5 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector10 = game7.getBoardInspector();
        game7.deleteObservers();
        org.jpacman.framework.model.Board board12 = game7.getBoard();
        org.jpacman.framework.model.Player player13 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game7.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager15 = new org.jpacman.framework.model.PointManager();
        pointManager15.addPointsToBoard((int) (byte) 10);
        int int18 = pointManager15.totalFoodInGame();
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player19.getSpriteType();
        java.lang.String str23 = player19.toString();
// flaky:         pointManager15.consumePointsOnBoard(player19, 72);
        int int26 = pointManager15.getFoodEaten();
        pointManager15.addPointsToBoard((int) (short) 100);
        game7.notifyObservers((java.lang.Object) (short) 100);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getX();
        int int34 = tile32.getX();
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        int int38 = player35.getPoints();
        int int40 = player35.addPoints((int) '4');
        boolean boolean41 = tile32.containsSprite((org.jpacman.framework.model.Sprite) player35);
        player35.resurrect();
        player35.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = player35.getSpriteType();
        game7.addPlayer(player35);
        game0.notifyObservers((java.lang.Object) player35);
        org.jpacman.framework.model.Player player47 = new org.jpacman.framework.model.Player();
        int int49 = player47.addPoints((int) (short) 10);
        int int50 = player47.getPoints();
        boolean boolean51 = player47.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType52 = player47.getSpriteType();
        java.lang.String str53 = player47.toString();
        org.jpacman.framework.model.Player player54 = new org.jpacman.framework.model.Player();
        int int56 = player54.addPoints((int) (short) 10);
        boolean boolean57 = player54.isAlive();
        org.jpacman.framework.model.Direction direction58 = player54.getDirection();
        player47.setDirection(direction58);
        player35.setDirection(direction58);
        int int61 = direction58.getDx();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostList6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(iBoardInspector10);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PLAYER occupying null" + "'", str23.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 72 + "'", int26 == 72);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 62 + "'", int40 == 62);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + spriteType52 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType52.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "PLAYER occupying null" + "'", str53.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + direction58 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction58.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        int int3 = pointManager0.totalFoodInGame();
        int int4 = pointManager0.totalFoodInGame();
        int int5 = pointManager0.getFoodEaten();
        java.lang.Class<?> wildcardClass6 = pointManager0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = ghost14.getSpriteType();
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
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers();
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
        org.jpacman.framework.model.Tile tile33 = ghost24.getTile();
        game0.addGhost(ghost24);
        game0.deleteObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
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
        org.junit.Assert.assertNull(tile33);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
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
        org.jpacman.framework.model.Game game13 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board14 = game13.getBoard();
        game13.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager16 = game13.getPointManager();
        boolean boolean17 = pointManager16.allEaten();
        pointManager16.addPointsToBoard(0);
        org.jpacman.framework.model.Player player20 = new org.jpacman.framework.model.Player();
        int int22 = player20.addPoints((int) (short) 10);
        int int23 = player20.getPoints();
        org.jpacman.framework.model.Tile tile26 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food27 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = food27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = food27.getSpriteType();
        boolean boolean30 = tile26.containsSprite((org.jpacman.framework.model.Sprite) food27);
        org.jpacman.framework.model.Sprite sprite31 = tile26.topSprite();
        player20.occupy(tile26);
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player20.occupy(tile35);
// flaky:         pointManager16.consumePointsOnBoard(player20, (int) 'a');
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Level level40 = new org.jpacman.framework.model.Level();
        java.lang.String str41 = level40.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor42 = level40.parseMap();
        java.lang.String str43 = level40.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory44 = null;
// flaky:         level40.setFactory(iGameFactory44);
        org.jpacman.framework.model.Game game46 = level40.getGame();
        org.jpacman.framework.model.PointManager pointManager47 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager48 = new org.jpacman.framework.model.PointManager();
        pointManager48.addPointsToBoard((int) (byte) 10);
        int int51 = pointManager48.totalFoodInGame();
        org.jpacman.framework.model.Player player52 = new org.jpacman.framework.model.Player();
        int int54 = player52.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = player52.getSpriteType();
        java.lang.String str56 = player52.toString();
// flaky:         pointManager48.consumePointsOnBoard(player52, 72);
// flaky:         pointManager47.consumePointsOnBoard(player52, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType61 = player52.getSpriteType();
        game46.addPlayer(player52);
        game0.notifyObservers((java.lang.Object) game46);
        boolean boolean64 = game0.hasChanged();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(iBoardInspector12);
        org.junit.Assert.assertNull(board14);
        org.junit.Assert.assertNotNull(pointManager16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(sprite31);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "board.txt" + "'", str41.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "board.txt" + "'", str43.equals("board.txt"));
        org.junit.Assert.assertNotNull(game46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + spriteType55 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType55.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "PLAYER occupying null" + "'", str56.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType61 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType61.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
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
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile(62, (-1));
        org.jpacman.framework.model.Direction direction22 = org.jpacman.framework.model.Direction.UP;
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board2.tileAtDirection(tile21, direction22);
        try {
            org.jpacman.framework.model.Tile tile26 = null; // flaky: board2.tileAt(154, 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 154");
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
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction22.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile23);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
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
        boolean boolean22 = game3.won();
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = food31.getSpriteType();
        game3.addFood(food31);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(player24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
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
        int int15 = player5.getPoints();
        org.jpacman.framework.model.Tile tile16 = player5.getTile();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertNull(tile16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
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
        java.lang.String str11 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory12 = null;
// flaky:         level0.setFactory(iGameFactory12);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        java.lang.String str3 = level0.getMapFile();
        java.lang.String str4 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor5 = level0.parseMap();
        org.jpacman.framework.model.IGameInteractor iGameInteractor6 = level0.parseMap();
        org.jpacman.framework.factory.IGameFactory iGameFactory7 = null;
// flaky:         level0.setFactory(iGameFactory7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "board.txt" + "'", str3.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "board.txt" + "'", str4.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor5);
        org.junit.Assert.assertNotNull(iGameInteractor6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
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
        org.jpacman.framework.model.Board board19 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        player23.die();
        player23.resurrect();
        java.lang.String str26 = player23.toString();
        int int27 = player23.getPoints();
        org.jpacman.framework.model.Direction direction28 = org.jpacman.framework.model.Direction.UP;
        player23.setDirection(direction28);
        org.jpacman.framework.model.Tile tile30 = null; // flaky: board19.tileAtDirection(tile22, direction28);
// flaky:         player0.occupy(tile22);
        java.lang.String str32 = player0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "PLAYER occupying null" + "'", str26.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction28.equals(org.jpacman.framework.model.Direction.UP));
// flaky:         org.junit.Assert.assertNotNull(tile30);
// flaky:         org.junit.Assert.assertTrue("'" + str32 + "' != '" + "PLAYER occupying [-1,20]" + "'", str32.equals("PLAYER occupying [-1,20]"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        org.jpacman.framework.factory.IGameFactory iGameFactory1 = null;
// flaky:         level0.setFactory(iGameFactory1);
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.junit.Assert.assertNull(game3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board4 = game0.getBoard();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        player8.die();
        player8.resurrect();
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        boolean boolean14 = player11.isAlive();
        player11.die();
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        int int18 = player16.addPoints((int) (short) 10);
        boolean boolean19 = player16.isAlive();
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int23 = tile22.getX();
        int int24 = tile22.getX();
        int int25 = tile22.getX();
        player16.occupy(tile22);
        player11.occupy(tile22);
        player8.occupy(tile22);
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.DOWN;
        org.jpacman.framework.model.Tile tile30 = null; // flaky: board7.tileAtDirection(tile22, direction29);
        game0.setBoard(board7);
        org.jpacman.framework.model.Board board32 = game0.getBoard();
        org.jpacman.framework.model.Tile tile33 = null;
        org.jpacman.framework.model.Direction direction34 = org.jpacman.framework.model.Direction.UP;
        int int35 = direction34.getDy();
        int int36 = direction34.getDx();
        try {
            org.jpacman.framework.model.Tile tile37 = null; // flaky: board32.tileAtDirection(tile33, direction34);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(board4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction29.equals(org.jpacman.framework.model.Direction.DOWN));
// flaky:         org.junit.Assert.assertNotNull(tile30);
        org.junit.Assert.assertNotNull(board32);
        org.junit.Assert.assertTrue("'" + direction34 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction34.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = player0.getDirection();
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(0, 20);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        game0.setBoard(board6);
        org.jpacman.framework.model.Board board10 = game0.getBoard();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = null; // flaky: board10.spriteTypeAt(35, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(board10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
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
        try {
            org.jpacman.framework.model.Sprite sprite27 = null; // flaky: board3.spriteAt(154, (int) (byte) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 154");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PLAYER occupying null" + "'", str19.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + direction21 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction21.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass23);
// flaky:         org.junit.Assert.assertNotNull(tile24);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        player0.resurrect();
        boolean boolean4 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
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
        org.jpacman.framework.model.Sprite sprite20 = tile2.topSprite();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        player21.die();
        player21.resurrect();
        org.jpacman.framework.model.Tile tile26 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food27 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = food27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = food27.getSpriteType();
        boolean boolean30 = tile26.containsSprite((org.jpacman.framework.model.Sprite) food27);
        java.lang.String str31 = tile26.toString();
        java.lang.String str32 = tile26.toString();
        org.jpacman.framework.model.Sprite sprite33 = tile26.topSprite();
        player21.occupy(tile26);
        org.jpacman.framework.model.Tile tile35 = player21.getTile();
        player21.die();
        player21.resurrect();
        boolean boolean38 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player21);
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
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1,100]" + "'", str31.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[-1,100]" + "'", str32.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite33);
        org.junit.Assert.assertNotNull(tile35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(46, (int) '4');
        java.lang.String str3 = tile2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[46,52]" + "'", str3.equals("[46,52]"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.PointManager pointManager6 = game0.getPointManager();
        int int7 = pointManager6.totalFoodInGame();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        game0.deleteObservers();
        game0.deleteObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        int int7 = player4.getPoints();
        int int9 = player4.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player4.getSpriteType();
        java.lang.String str11 = player4.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player4.getSpriteType();
        player4.die();
        game0.addPlayer(player4);
        org.jpacman.framework.model.Ghost ghost15 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = ghost15.getSpriteType();
        game0.addGhost(ghost15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 62 + "'", int9 == 62);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "PLAYER occupying null" + "'", str11.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = ghost31.getSpriteType();
        boolean boolean38 = tile11.containsSprite((org.jpacman.framework.model.Sprite) ghost31);
        org.jpacman.framework.model.Player player39 = new org.jpacman.framework.model.Player();
        int int41 = player39.addPoints((int) (short) 10);
        int int42 = player39.getPoints();
        org.jpacman.framework.model.Direction direction43 = org.jpacman.framework.model.Direction.UP;
        int int44 = direction43.getDy();
        int int45 = direction43.getDx();
        player39.setDirection(direction43);
        boolean boolean47 = tile11.containsSprite((org.jpacman.framework.model.Sprite) player39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertTrue("'" + spriteType37 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType37.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + direction43 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction43.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
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
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board15 = game0.getBoard();
        int int16 = board15.getHeight();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertNotNull(iBoardInspector14);
        org.junit.Assert.assertNotNull(board15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
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
        org.jpacman.framework.model.Board board16 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite20 = tile19.topSprite();
        int int21 = tile19.getY();
        org.jpacman.framework.model.Tile tile24 = null; // flaky: board16.tileAtOffset(tile19, 100, 1);
        org.jpacman.framework.model.Tile tile27 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        player28.die();
        player28.resurrect();
        org.jpacman.framework.model.Tile tile33 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food34 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = food34.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = food34.getSpriteType();
        boolean boolean37 = tile33.containsSprite((org.jpacman.framework.model.Sprite) food34);
        java.lang.String str38 = tile33.toString();
        java.lang.String str39 = tile33.toString();
        org.jpacman.framework.model.Sprite sprite40 = tile33.topSprite();
        player28.occupy(tile33);
        org.jpacman.framework.model.Direction direction42 = player28.getDirection();
        org.jpacman.framework.model.Tile tile43 = null; // flaky: board16.tileAtDirection(tile27, direction42);
        org.jpacman.framework.model.Tile tile46 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile49 = null; // flaky: board16.tileAtOffset(tile46, (int) (short) 10, 35);
        game0.setBoard(board16);
        boolean boolean53 = board16.withinBorders(20, 74);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile24);
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[-1,100]" + "'", str38.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[-1,100]" + "'", str39.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite40);
        org.junit.Assert.assertTrue("'" + direction42 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction42.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile43);
// flaky:         org.junit.Assert.assertNotNull(tile49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
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
            game0.addObserver(observer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
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
        java.lang.Class<?> wildcardClass36 = null; // flaky: tile35.getClass();
        org.jpacman.framework.model.Sprite sprite37 = null; // flaky: tile35.topSprite();
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
// flaky:         org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(sprite37);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
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
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getY();
        int int27 = tile25.getY();
// flaky:         player8.occupy(tile25);
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.RIGHT;
        int int30 = direction29.getDy();
        org.jpacman.framework.model.Tile tile31 = null; // flaky: board7.tileAtDirection(tile25, direction29);
        java.lang.Class<?> wildcardClass32 = board7.getClass();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction22.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction29.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        org.jpacman.framework.factory.IGameFactory iGameFactory8 = null;
// flaky:         level0.setFactory(iGameFactory8);
        org.jpacman.framework.factory.IGameFactory iGameFactory10 = null;
// flaky:         level0.setFactory(iGameFactory10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        player3.die();
        player3.resurrect();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        boolean boolean9 = player6.isAlive();
        player6.die();
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        boolean boolean14 = player11.isAlive();
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int18 = tile17.getX();
        int int19 = tile17.getX();
        int int20 = tile17.getX();
        player11.occupy(tile17);
        player6.occupy(tile17);
        player3.occupy(tile17);
        org.jpacman.framework.model.Direction direction24 = org.jpacman.framework.model.Direction.DOWN;
        org.jpacman.framework.model.Tile tile25 = null; // flaky: board2.tileAtDirection(tile17, direction24);
        int int26 = board2.getWidth();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction24.equals(org.jpacman.framework.model.Direction.DOWN));
// flaky:         org.junit.Assert.assertNotNull(tile25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 62 + "'", int26 == 62);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
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
        org.jpacman.framework.model.Sprite sprite21 = tile14.topSprite();
        java.lang.Class<?> wildcardClass22 = tile14.getClass();
        org.jpacman.framework.model.Sprite sprite23 = tile14.topSprite();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(sprite21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(sprite23);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        int int4 = player0.getPoints();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.UP;
        player0.setDirection(direction5);
        java.lang.Class<?> wildcardClass7 = direction5.getClass();
        int int8 = direction5.getDx();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + direction5 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction5.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        java.util.Observer observer6 = null;
        try {
// flaky:             game0.attach(observer6);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(board5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (short) 10, (int) ' ');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        boolean boolean4 = game0.hasChanged();
        boolean boolean5 = game0.hasChanged();
        boolean boolean6 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        int int9 = player6.getPoints();
        int int11 = player6.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = player6.getSpriteType();
        game0.addPlayer(player6);
        org.jpacman.framework.model.Tile tile14 = player6.getTile();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 62 + "'", int11 == 62);
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(tile14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        int int9 = player0.getPoints();
        org.jpacman.framework.model.Direction direction10 = player0.getDirection();
        player0.resurrect();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 72 + "'", int9 == 72);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction10.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
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
        try {
            org.jpacman.framework.model.Tile tile30 = null; // flaky: board2.tileAt((int) (short) 0, 97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = ghost0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction6 = player0.getDirection();
        int int7 = direction6.getDy();
        int int8 = direction6.getDx();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + direction6 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction6.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        int int4 = game0.countObservers();
        game0.deleteObservers();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(104, 100);
        org.jpacman.framework.model.Game game10 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player11 = game10.getPlayer();
        org.jpacman.framework.model.PointManager pointManager12 = game10.getPointManager();
        org.jpacman.framework.model.Player player13 = game10.getPlayer();
        game10.deleteObservers();
        org.jpacman.framework.model.Board board17 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite21 = tile20.topSprite();
        int int22 = tile20.getY();
        org.jpacman.framework.model.Tile tile25 = null; // flaky: board17.tileAtOffset(tile20, 100, 1);
        org.jpacman.framework.model.Tile tile28 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food29 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = food29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = food29.getSpriteType();
        boolean boolean32 = tile28.containsSprite((org.jpacman.framework.model.Sprite) food29);
        java.lang.String str33 = tile28.toString();
        java.lang.String str34 = tile28.toString();
        org.jpacman.framework.model.Direction direction35 = org.jpacman.framework.model.Direction.DOWN;
        int int36 = direction35.getDx();
        int int37 = direction35.getDx();
        org.jpacman.framework.model.Tile tile38 = null; // flaky: board17.tileAtDirection(tile28, direction35);
        game10.notifyObservers((java.lang.Object) tile38);
        org.jpacman.framework.model.Tile tile42 = null; // flaky: board9.tileAtOffset(tile38, (int) (byte) 10, 0);
        game0.notifyObservers((java.lang.Object) board9);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(player11);
        org.junit.Assert.assertNotNull(pointManager12);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNull(sprite21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile25);
        org.junit.Assert.assertTrue("'" + spriteType30 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType30.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[-1,100]" + "'", str33.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[-1,100]" + "'", str34.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction35 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction35.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile38);
// flaky:         org.junit.Assert.assertNotNull(tile42);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        int int4 = pointManager0.totalFoodInGame();
        pointManager0.addPointsToBoard((int) (short) 100);
        int int7 = pointManager0.totalFoodInGame();
        int int8 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food3.getSpriteType();
        boolean boolean6 = tile2.containsSprite((org.jpacman.framework.model.Sprite) food3);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite10 = tile9.topSprite();
        int int11 = tile9.getY();
        int int12 = tile9.getX();
        food3.occupy(tile9);
        int int14 = food3.getPoints();
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sprite10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
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
        int int35 = board2.getHeight();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        boolean boolean6 = game0.hasChanged();
        int int7 = game0.countObservers();
        org.jpacman.framework.model.Board board8 = game0.getBoard();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(board8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        game0.deleteObservers();
        org.jpacman.framework.model.Food food5 = new org.jpacman.framework.model.Food();
        food5.setPoints(20);
        game0.addFood(food5);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        java.lang.String str36 = null; // flaky: tile35.toString();
        org.jpacman.framework.model.Sprite sprite37 = null; // flaky: tile35.topSprite();
        org.jpacman.framework.model.Sprite sprite38 = null; // flaky: tile35.topSprite();
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
// flaky:         org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[9,34]" + "'", str36.equals("[9,34]"));
        org.junit.Assert.assertNull(sprite37);
        org.junit.Assert.assertNull(sprite38);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        java.util.Observer observer3 = null;
        game0.deleteObserver(observer3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNotNull(ghostList6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        level0.setMapFile("[-1,100]");
        org.jpacman.framework.model.Game game11 = level0.getGame();
        int int12 = game11.countObservers();
        java.util.Observer observer13 = null;
        game11.deleteObserver(observer13);
        org.jpacman.framework.model.Player player15 = game11.getPlayer();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(player15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(46, 10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
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
        java.util.Observer observer12 = null;
        game0.deleteObserver(observer12);
        org.jpacman.framework.model.Player player14 = game0.getPlayer();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(player14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        boolean boolean5 = board2.withinBorders(0, (int) (byte) 1);
        int int6 = board2.getHeight();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food13 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food13.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food13.getSpriteType();
        boolean boolean16 = tile12.containsSprite((org.jpacman.framework.model.Sprite) food13);
        java.lang.String str17 = tile12.toString();
        org.jpacman.framework.model.Direction direction18 = org.jpacman.framework.model.Direction.RIGHT;
        int int19 = direction18.getDx();
        int int20 = direction18.getDy();
        int int21 = direction18.getDy();
        org.jpacman.framework.model.Tile tile22 = null; // flaky: board9.tileAtDirection(tile12, direction18);
        int int23 = board9.getHeight();
        org.jpacman.framework.model.Tile tile26 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int27 = tile26.getX();
        int int28 = tile26.getX();
        org.jpacman.framework.model.Player player29 = new org.jpacman.framework.model.Player();
        int int31 = player29.addPoints((int) (short) 10);
        int int32 = player29.getPoints();
        int int34 = player29.addPoints((int) '4');
        boolean boolean35 = tile26.containsSprite((org.jpacman.framework.model.Sprite) player29);
        int int36 = tile26.getY();
        org.jpacman.framework.model.Player player37 = new org.jpacman.framework.model.Player();
        player37.die();
        player37.resurrect();
        int int40 = player37.getPoints();
        org.jpacman.framework.model.Direction direction41 = player37.getDirection();
        org.jpacman.framework.model.Tile tile42 = null; // flaky: board9.tileAtDirection(tile26, direction41);
        org.jpacman.framework.model.Tile tile45 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int46 = tile45.getX();
        int int47 = tile45.getX();
        org.jpacman.framework.model.Player player48 = new org.jpacman.framework.model.Player();
        int int50 = player48.addPoints((int) (short) 10);
        int int51 = player48.getPoints();
        int int53 = player48.addPoints((int) '4');
        boolean boolean54 = tile45.containsSprite((org.jpacman.framework.model.Sprite) player48);
        int int56 = player48.addPoints(0);
        player48.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType58 = player48.getSpriteType();
        org.jpacman.framework.model.Direction direction59 = player48.getDirection();
        org.jpacman.framework.model.Tile tile60 = null; // flaky: board2.tileAtDirection(tile26, direction59);
        org.jpacman.framework.model.Sprite sprite61 = null; // flaky: tile60.topSprite();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[-1,100]" + "'", str17.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction18 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction18.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 62 + "'", int34 == 62);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + direction41 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction41.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 62 + "'", int53 == 62);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 62 + "'", int56 == 62);
        org.junit.Assert.assertTrue("'" + spriteType58 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType58.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction59 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction59.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile60);
        org.junit.Assert.assertNull(sprite61);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        int int3 = game0.countObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Player player5 = game0.getPlayer();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertNull(player6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.LEFT;
        int int5 = direction4.getDx();
        player0.setDirection(direction4);
        java.lang.String str7 = player0.toString();
        boolean boolean8 = player0.isAlive();
        int int9 = player0.getPoints();
        org.jpacman.framework.model.Tile tile10 = player0.getTile();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(tile10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
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
        org.jpacman.framework.model.Game game23 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player24 = game23.getPlayer();
        boolean boolean25 = game23.won();
        org.jpacman.framework.model.Player player26 = new org.jpacman.framework.model.Player();
        int int28 = player26.addPoints((int) (short) 10);
        boolean boolean29 = player26.isAlive();
        org.jpacman.framework.model.Direction direction30 = player26.getDirection();
        player26.die();
        game23.addPlayer(player26);
        game0.addPlayer(player26);
        org.jpacman.framework.model.Board board36 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile39 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite40 = tile39.topSprite();
        int int41 = tile39.getY();
        org.jpacman.framework.model.Tile tile44 = null; // flaky: board36.tileAtOffset(tile39, 100, 1);
        org.jpacman.framework.model.Tile tile47 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player48 = new org.jpacman.framework.model.Player();
        player48.die();
        player48.resurrect();
        org.jpacman.framework.model.Tile tile53 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food54 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = food54.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType56 = food54.getSpriteType();
        boolean boolean57 = tile53.containsSprite((org.jpacman.framework.model.Sprite) food54);
        java.lang.String str58 = tile53.toString();
        java.lang.String str59 = tile53.toString();
        org.jpacman.framework.model.Sprite sprite60 = tile53.topSprite();
        player48.occupy(tile53);
        org.jpacman.framework.model.Direction direction62 = player48.getDirection();
        org.jpacman.framework.model.Tile tile63 = null; // flaky: board36.tileAtDirection(tile47, direction62);
        int int64 = direction62.getDx();
        player26.setDirection(direction62);
        java.lang.String str66 = player26.toString();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(player24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + direction30 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction30.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertNull(sprite40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile44);
        org.junit.Assert.assertTrue("'" + spriteType55 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType55.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType56 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType56.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[-1,100]" + "'", str58.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[-1,100]" + "'", str59.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite60);
        org.junit.Assert.assertTrue("'" + direction62 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction62.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "PLAYER occupying null" + "'", str66.equals("PLAYER occupying null"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        int int3 = tile2.getY();
        org.jpacman.framework.model.Sprite sprite4 = tile2.topSprite();
        java.lang.String str5 = tile2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNull(sprite4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
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
        org.jpacman.framework.model.Player player15 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector16 = game0.getBoardInspector();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertNotNull(iBoardInspector16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager4 = new org.jpacman.framework.model.PointManager();
        boolean boolean5 = pointManager4.allEaten();
        int int6 = pointManager4.totalFoodInGame();
        int int7 = pointManager4.getFoodEaten();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player8.getSpriteType();
        org.jpacman.framework.model.Direction direction12 = org.jpacman.framework.model.Direction.LEFT;
        int int13 = direction12.getDx();
        player8.setDirection(direction12);
// flaky:         pointManager4.consumePointsOnBoard(player8, 94);
// flaky:         pointManager2.consumePointsOnBoard(player8, 100);
        pointManager2.addPointsToBoard(154);
        boolean boolean21 = pointManager2.allEaten();
        int int22 = pointManager2.getFoodEaten();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction12.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
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
        java.lang.String str14 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory15 = null;
// flaky:         level0.setFactory(iGameFactory15);
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor17 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: FOOD occupying null not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
        org.junit.Assert.assertNotNull(game13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "FOOD occupying null" + "'", str14.equals("FOOD occupying null"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        org.jpacman.framework.model.Game game7 = level0.getGame();
        java.lang.String str8 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory9 = null;
// flaky:         level0.setFactory(iGameFactory9);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "board.txt" + "'", str8.equals("board.txt"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass4 = spriteType3.getClass();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
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
        game13.deleteObservers();
        game13.deleteObservers();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
        org.junit.Assert.assertNotNull(game13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        boolean boolean4 = player0.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = player0.getSpriteType();
        player0.die();
        java.lang.String str7 = player0.toString();
        int int8 = player0.getPoints();
        java.lang.String str9 = player0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(73, (int) (short) 10);
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        player3.resurrect();
        boolean boolean5 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player3);
        java.lang.String str6 = tile2.toString();
        java.lang.Class<?> wildcardClass7 = tile2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[73,10]" + "'", str6.equals("[73,10]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        int int7 = pointManager3.totalFoodInGame();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        boolean boolean11 = player8.isAlive();
        player8.die();
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        boolean boolean16 = player13.isAlive();
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int20 = tile19.getX();
        int int21 = tile19.getX();
        int int22 = tile19.getX();
        player13.occupy(tile19);
        player8.occupy(tile19);
        player8.resurrect();
        player8.resurrect();
        pointManager3.consumePointsOnBoard(player8, 0);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        org.jpacman.framework.model.Direction direction8 = org.jpacman.framework.model.Direction.LEFT;
        int int9 = direction8.getDx();
        player4.setDirection(direction8);
// flaky:         pointManager0.consumePointsOnBoard(player4, 94);
        java.lang.String str13 = player4.toString();
        player4.resurrect();
        int int15 = player4.getPoints();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction8.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PLAYER occupying null" + "'", str13.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = ghost0.getSpriteType();
        java.lang.String str3 = ghost0.toString();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GHOST occupying null" + "'", str3.equals("GHOST occupying null"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Tile tile8 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food9 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = food9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food9.getSpriteType();
        boolean boolean12 = tile8.containsSprite((org.jpacman.framework.model.Sprite) food9);
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int16 = tile15.getX();
        int int17 = tile15.getX();
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        int int21 = player18.getPoints();
        int int23 = player18.addPoints((int) '4');
        boolean boolean24 = tile15.containsSprite((org.jpacman.framework.model.Sprite) player18);
        boolean boolean25 = tile8.containsSprite((org.jpacman.framework.model.Sprite) player18);
        java.lang.String str26 = player18.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player18.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = player18.getSpriteType();
        game0.addPlayer(player18);
        game0.notifyObservers();
        java.util.Observer observer31 = null;
        try {
// flaky:             game0.attach(observer31);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 62 + "'", int23 == 62);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "PLAYER occupying null" + "'", str26.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
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
        boolean boolean33 = game0.won();
        org.jpacman.framework.model.PointManager pointManager34 = game0.getPointManager();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(pointManager34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
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
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        boolean boolean30 = player27.isAlive();
        game0.addPlayer(player27);
        java.lang.Class<?> wildcardClass32 = player27.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        game0.deleteObservers();
        org.jpacman.framework.model.PointManager pointManager5 = game0.getPointManager();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(pointManager5);
        org.junit.Assert.assertNull(player6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food8 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = food8.getSpriteType();
        food8.setPoints((int) '4');
        int int12 = food8.getPoints();
        game0.addFood(food8);
        int int14 = food8.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = food8.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player0.getSpriteType();
        org.jpacman.framework.model.Board board10 = new org.jpacman.framework.model.Board(19, 35);
        int int11 = board10.getHeight();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        org.jpacman.framework.model.PointManager pointManager14 = game12.getPointManager();
        int int15 = pointManager14.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager16 = new org.jpacman.framework.model.PointManager();
        boolean boolean17 = pointManager16.allEaten();
        int int18 = pointManager16.totalFoodInGame();
        int int19 = pointManager16.getFoodEaten();
        org.jpacman.framework.model.Player player20 = new org.jpacman.framework.model.Player();
        int int22 = player20.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = player20.getSpriteType();
        org.jpacman.framework.model.Direction direction24 = org.jpacman.framework.model.Direction.LEFT;
        int int25 = direction24.getDx();
        player20.setDirection(direction24);
// flaky:         pointManager16.consumePointsOnBoard(player20, 94);
// flaky:         pointManager14.consumePointsOnBoard(player20, 100);
        org.jpacman.framework.model.Tile tile33 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int34 = tile33.getX();
        int int35 = tile33.getX();
        int int36 = tile33.getX();
        java.lang.String str37 = tile33.toString();
        java.lang.String str38 = tile33.toString();
        player20.occupy(tile33);
        org.jpacman.framework.model.Board board42 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile45 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food46 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = food46.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = food46.getSpriteType();
        boolean boolean49 = tile45.containsSprite((org.jpacman.framework.model.Sprite) food46);
        java.lang.String str50 = tile45.toString();
        org.jpacman.framework.model.Direction direction51 = org.jpacman.framework.model.Direction.RIGHT;
        int int52 = direction51.getDx();
        int int53 = direction51.getDy();
        int int54 = direction51.getDy();
        org.jpacman.framework.model.Tile tile55 = null; // flaky: board42.tileAtDirection(tile45, direction51);
        int int56 = board42.getHeight();
        org.jpacman.framework.model.Tile tile59 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int60 = tile59.getX();
        int int61 = tile59.getX();
        org.jpacman.framework.model.Player player62 = new org.jpacman.framework.model.Player();
        int int64 = player62.addPoints((int) (short) 10);
        int int65 = player62.getPoints();
        int int67 = player62.addPoints((int) '4');
        boolean boolean68 = tile59.containsSprite((org.jpacman.framework.model.Sprite) player62);
        int int69 = tile59.getY();
        org.jpacman.framework.model.Player player70 = new org.jpacman.framework.model.Player();
        player70.die();
        player70.resurrect();
        int int73 = player70.getPoints();
        org.jpacman.framework.model.Direction direction74 = player70.getDirection();
        org.jpacman.framework.model.Tile tile75 = null; // flaky: board42.tileAtDirection(tile59, direction74);
        org.jpacman.framework.model.Tile tile76 = null; // flaky: board10.tileAtDirection(tile33, direction74);
        player0.setDirection(direction74);
        int int78 = direction74.getDx();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNotNull(pointManager14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction24.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[10,-1]" + "'", str37.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[10,-1]" + "'", str38.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + spriteType47 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType47.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[-1,100]" + "'", str50.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction51 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction51.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 62 + "'", int67 == 62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + direction74 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction74.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile75);
// flaky:         org.junit.Assert.assertNotNull(tile76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        boolean boolean8 = board2.withinBorders(20, (int) (byte) 10);
        int int9 = board2.getHeight();
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = null; // flaky: board2.spriteTypeAt((int) (short) 100, 63);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
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
        player5.die();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        level0.setMapFile("[-1,100]");
        level0.setMapFile("hi!");
        org.jpacman.framework.model.Game game5 = level0.getGame();
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        org.junit.Assert.assertNull(game5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        java.lang.String str3 = level0.getMapFile();
        java.lang.String str4 = level0.getMapFile();
        org.jpacman.framework.model.Game game5 = level0.getGame();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "board.txt" + "'", str3.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "board.txt" + "'", str4.equals("board.txt"));
        org.junit.Assert.assertNotNull(game5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        boolean boolean6 = game4.won();
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        int int9 = player7.addPoints((int) (short) 10);
        int int10 = player7.getPoints();
        int int12 = player7.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player7.getSpriteType();
        game4.addPlayer(player7);
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.PointManager pointManager17 = game15.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game15.getGhosts();
        org.jpacman.framework.model.Game game19 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player20 = game19.getPlayer();
        boolean boolean21 = game19.won();
        org.jpacman.framework.model.Tile tile24 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int25 = tile24.getX();
        int int26 = tile24.getX();
        org.jpacman.framework.model.Food food27 = new org.jpacman.framework.model.Food();
        int int28 = food27.getPoints();
        int int29 = food27.getPoints();
        boolean boolean30 = tile24.containsSprite((org.jpacman.framework.model.Sprite) food27);
        int int31 = food27.getPoints();
        game19.addFood(food27);
        org.jpacman.framework.model.Ghost ghost33 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost33.getSpriteType();
        game19.addGhost(ghost33);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost33.getSpriteType();
        game15.addGhost(ghost33);
        org.jpacman.framework.model.Tile tile42 = ghost33.getTile();
        game4.addGhost(ghost33);
        java.lang.String str44 = ghost33.toString();
        game0.addGhost(ghost33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(player16);
        org.junit.Assert.assertNotNull(pointManager17);
        org.junit.Assert.assertNotNull(ghostList18);
        org.junit.Assert.assertNull(player20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(tile42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "GHOST occupying null" + "'", str44.equals("GHOST occupying null"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game0.getGhosts();
        org.jpacman.framework.model.PointManager pointManager8 = game0.getPointManager();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNotNull(pointManager8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.getFoodEaten();
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
        int int40 = player4.getPoints();
// flaky:         pointManager2.consumePointsOnBoard(player4, (int) '4');
        int int44 = 0; // flaky: player4.addPoints((int) '4');
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 114 + "'", int44 == 114);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int12 = tile2.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        int int3 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        java.lang.String str8 = player4.toString();
// flaky:         pointManager0.consumePointsOnBoard(player4, 72);
        pointManager0.addPointsToBoard(19);
        pointManager0.addPointsToBoard(21);
        boolean boolean15 = pointManager0.allEaten();
        int int16 = pointManager0.getFoodEaten();
        int int17 = pointManager0.getFoodEaten();
        boolean boolean18 = pointManager0.allEaten();
        boolean boolean19 = pointManager0.allEaten();
        org.jpacman.framework.model.Game game20 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList21 = game20.getGhosts();
        game20.deleteObservers();
        org.jpacman.framework.model.Game game23 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player24 = game23.getPlayer();
        org.jpacman.framework.model.PointManager pointManager25 = game23.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList26 = game23.getGhosts();
        org.jpacman.framework.model.Game game27 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player28 = game27.getPlayer();
        boolean boolean29 = game27.won();
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getX();
        int int34 = tile32.getX();
        org.jpacman.framework.model.Food food35 = new org.jpacman.framework.model.Food();
        int int36 = food35.getPoints();
        int int37 = food35.getPoints();
        boolean boolean38 = tile32.containsSprite((org.jpacman.framework.model.Sprite) food35);
        int int39 = food35.getPoints();
        game27.addFood(food35);
        org.jpacman.framework.model.Ghost ghost41 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = ghost41.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = ghost41.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = ghost41.getSpriteType();
        game27.addGhost(ghost41);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = ghost41.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = ghost41.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = ghost41.getSpriteType();
        game23.addGhost(ghost41);
        game20.addGhost(ghost41);
        org.jpacman.framework.model.Board board51 = game20.getBoard();
        org.jpacman.framework.model.Player player52 = new org.jpacman.framework.model.Player();
        int int54 = player52.addPoints((int) (short) 10);
        int int55 = player52.getPoints();
        boolean boolean56 = player52.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType57 = player52.getSpriteType();
        player52.die();
        player52.die();
        game20.addPlayer(player52);
// flaky:         pointManager0.consumePointsOnBoard(player52, 20);
        org.jpacman.framework.model.Direction direction63 = player52.getDirection();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "PLAYER occupying null" + "'", str8.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 72 + "'", int16 == 72);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 72 + "'", int17 == 72);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ghostList21);
        org.junit.Assert.assertNull(player24);
        org.junit.Assert.assertNotNull(pointManager25);
        org.junit.Assert.assertNotNull(ghostList26);
        org.junit.Assert.assertNull(player28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + spriteType42 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType42.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType43 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType43.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType46 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType46.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType47 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType47.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(board51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + spriteType57 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType57.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction63 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction63.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        org.jpacman.framework.model.PointManager pointManager13 = new org.jpacman.framework.model.PointManager();
        pointManager13.addPointsToBoard((int) (byte) 10);
        int int16 = pointManager13.totalFoodInGame();
        org.jpacman.framework.model.Player player17 = new org.jpacman.framework.model.Player();
        int int19 = player17.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = player17.getSpriteType();
        java.lang.String str21 = player17.toString();
// flaky:         pointManager13.consumePointsOnBoard(player17, 72);
        int int24 = pointManager13.getFoodEaten();
        org.jpacman.framework.model.Player player25 = new org.jpacman.framework.model.Player();
        player25.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player25.getSpriteType();
        boolean boolean28 = player25.isAlive();
        player25.resurrect();
        pointManager13.consumePointsOnBoard(player25, (int) (byte) 10);
        game0.notifyObservers((java.lang.Object) pointManager13);
        org.jpacman.framework.model.Board board33 = game0.getBoard();
        int int34 = board33.getWidth();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "PLAYER occupying null" + "'", str21.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(board33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(45, (int) (byte) 0);
        int int3 = board2.getWidth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        boolean boolean4 = player0.isAlive();
        int int6 = player0.addPoints((int) (byte) 0);
        boolean boolean7 = player0.isAlive();
        player0.resurrect();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
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
        player0.deoccupy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        boolean boolean5 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector10 = game7.getBoardInspector();
        game7.deleteObservers();
        org.jpacman.framework.model.Board board12 = game7.getBoard();
        org.jpacman.framework.model.Player player13 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game7.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager15 = new org.jpacman.framework.model.PointManager();
        pointManager15.addPointsToBoard((int) (byte) 10);
        int int18 = pointManager15.totalFoodInGame();
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player19.getSpriteType();
        java.lang.String str23 = player19.toString();
// flaky:         pointManager15.consumePointsOnBoard(player19, 72);
        int int26 = pointManager15.getFoodEaten();
        pointManager15.addPointsToBoard((int) (short) 100);
        game7.notifyObservers((java.lang.Object) (short) 100);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getX();
        int int34 = tile32.getX();
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        int int38 = player35.getPoints();
        int int40 = player35.addPoints((int) '4');
        boolean boolean41 = tile32.containsSprite((org.jpacman.framework.model.Sprite) player35);
        player35.resurrect();
        player35.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = player35.getSpriteType();
        game7.addPlayer(player35);
        game0.notifyObservers((java.lang.Object) player35);
        org.jpacman.framework.model.Game game47 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player48 = game47.getPlayer();
        org.jpacman.framework.model.Board board49 = game47.getBoard();
        boolean boolean50 = game47.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector51 = game47.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector52 = game47.getBoardInspector();
        org.jpacman.framework.model.Board board55 = new org.jpacman.framework.model.Board(0, 20);
        int int56 = board55.getWidth();
        int int57 = board55.getHeight();
        game47.setBoard(board55);
        boolean boolean61 = board55.withinBorders(10, (int) '#');
        game0.setBoard(board55);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType65 = null; // flaky: board55.spriteTypeAt(114, 50);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 114");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostList6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(iBoardInspector10);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PLAYER occupying null" + "'", str23.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 72 + "'", int26 == 72);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 62 + "'", int40 == 62);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(player48);
        org.junit.Assert.assertNull(board49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(iBoardInspector51);
        org.junit.Assert.assertNull(iBoardInspector52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20 + "'", int57 == 20);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("PLAYER occupying [-1,20]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory5 = null;
// flaky:         level0.setFactory(iGameFactory5);
        org.jpacman.framework.model.Game game7 = level0.getGame();
        org.jpacman.framework.factory.IGameFactory iGameFactory8 = null;
// flaky:         level0.setFactory(iGameFactory8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = wall0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        org.jpacman.framework.model.Ghost ghost9 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = ghost9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = ghost9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = ghost9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = ghost9.getSpriteType();
        game0.addGhost(ghost9);
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.PointManager pointManager17 = game15.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game15.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector19 = game15.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList20 = game15.getGhosts();
        org.jpacman.framework.model.Game game21 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player22 = game21.getPlayer();
        org.jpacman.framework.model.PointManager pointManager23 = game21.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList24 = game21.getGhosts();
        org.jpacman.framework.model.Game game25 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player26 = game25.getPlayer();
        boolean boolean27 = game25.won();
        org.jpacman.framework.model.Tile tile30 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int31 = tile30.getX();
        int int32 = tile30.getX();
        org.jpacman.framework.model.Food food33 = new org.jpacman.framework.model.Food();
        int int34 = food33.getPoints();
        int int35 = food33.getPoints();
        boolean boolean36 = tile30.containsSprite((org.jpacman.framework.model.Sprite) food33);
        int int37 = food33.getPoints();
        game25.addFood(food33);
        org.jpacman.framework.model.Ghost ghost39 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost39.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = ghost39.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = ghost39.getSpriteType();
        game25.addGhost(ghost39);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = ghost39.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType45 = ghost39.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = ghost39.getSpriteType();
        game21.addGhost(ghost39);
        game15.addGhost(ghost39);
        game0.addGhost(ghost39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNull(player16);
        org.junit.Assert.assertNotNull(pointManager17);
        org.junit.Assert.assertNotNull(ghostList18);
        org.junit.Assert.assertNull(iBoardInspector19);
        org.junit.Assert.assertNotNull(ghostList20);
        org.junit.Assert.assertNull(player22);
        org.junit.Assert.assertNotNull(pointManager23);
        org.junit.Assert.assertNotNull(ghostList24);
        org.junit.Assert.assertNull(player26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType42 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType42.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType45 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType45.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType46 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType46.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
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
        java.lang.Class<?> wildcardClass45 = tile37.getClass();
        player15.occupy(tile37);
        org.jpacman.framework.model.Tile tile47 = player15.getTile();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + direction19 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction19.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(sprite44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(tile47);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player12.getSpriteType();
        player12.die();
        org.jpacman.framework.model.Tile tile24 = player12.getTile();
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
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(tile24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
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
        food8.setPoints((int) (short) 100);
        int int17 = food8.getPoints();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
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
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = null; // flaky: board14.spriteTypeAt(72, 110);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
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
        java.lang.String str16 = null; // flaky: tile15.toString();
        org.jpacman.framework.model.Sprite sprite17 = null;
        boolean boolean18 = false; // flaky: tile15.containsSprite(sprite17);
        int int19 = 0; // flaky: tile15.getX();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
// flaky:         org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[9,9]" + "'", str16.equals("[9,9]"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getWidth();
        int int9 = board2.getWidth();
        try {
            org.jpacman.framework.model.Tile tile12 = null; // flaky: board2.tileAt(110, 35);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game0.getGhosts();
        boolean boolean8 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player0.getSpriteType();
        int int9 = player0.getPoints();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player10.getSpriteType();
        org.jpacman.framework.model.Direction direction14 = org.jpacman.framework.model.Direction.LEFT;
        int int15 = direction14.getDx();
        player10.setDirection(direction14);
        int int17 = direction14.getDx();
        player0.setDirection(direction14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 62 + "'", int9 == 62);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(10, (int) (short) 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
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
        player12.resurrect();
        int int22 = player12.getPoints();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 62 + "'", int22 == 62);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager5 = game3.getPointManager();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(pointManager5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
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
        int int16 = direction15.getDy();
        int int17 = direction15.getDx();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction15.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite3 = tile2.topSprite();
        int int4 = tile2.getY();
        int int5 = tile2.getY();
        org.junit.Assert.assertNull(sprite3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        java.lang.String str3 = level0.getMapFile();
        level0.setMapFile("[10,-1]");
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        org.jpacman.framework.model.Game game8 = level0.getGame();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "board.txt" + "'", str3.equals("board.txt"));
        org.junit.Assert.assertNotNull(game8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.LEFT;
        int int5 = direction4.getDx();
        player0.setDirection(direction4);
        java.lang.String str7 = player0.toString();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction4 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction4.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        java.lang.String str1 = wall0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = wall0.getSpriteType();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "WALL occupying null" + "'", str1.equals("WALL occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
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
        int int30 = direction28.getDx();
        int int31 = direction28.getDy();
        int int32 = direction28.getDx();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
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
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        int int14 = player11.getPoints();
        boolean boolean15 = player11.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = player11.getSpriteType();
        player11.die();
        java.lang.String str18 = player11.toString();
        game0.notifyObservers((java.lang.Object) str18);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "PLAYER occupying null" + "'", str18.equals("PLAYER occupying null"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(46, 23);
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game3.getGhosts();
        game3.notifyObservers();
        boolean boolean6 = game3.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList7 = game3.getGhosts();
        org.jpacman.framework.model.Board board8 = game3.getBoard();
        org.jpacman.framework.model.Ghost ghost9 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = ghost9.getSpriteType();
        game3.addGhost(ghost9);
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food12.getSpriteType();
        game3.addFood(food12);
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        player16.die();
        player16.resurrect();
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food22 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = food22.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = food22.getSpriteType();
        boolean boolean25 = tile21.containsSprite((org.jpacman.framework.model.Sprite) food22);
        java.lang.String str26 = tile21.toString();
        java.lang.String str27 = tile21.toString();
        org.jpacman.framework.model.Sprite sprite28 = tile21.topSprite();
        player16.occupy(tile21);
        game3.notifyObservers((java.lang.Object) player16);
        org.jpacman.framework.model.Board board33 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile36 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food37 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = food37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = food37.getSpriteType();
        boolean boolean40 = tile36.containsSprite((org.jpacman.framework.model.Sprite) food37);
        java.lang.String str41 = tile36.toString();
        org.jpacman.framework.model.Direction direction42 = org.jpacman.framework.model.Direction.RIGHT;
        int int43 = direction42.getDx();
        int int44 = direction42.getDy();
        int int45 = direction42.getDy();
        org.jpacman.framework.model.Tile tile46 = null; // flaky: board33.tileAtDirection(tile36, direction42);
        game3.setBoard(board33);
        org.jpacman.framework.model.Tile tile50 = new org.jpacman.framework.model.Tile(21, (int) 'a');
        java.lang.String str51 = tile50.toString();
        org.jpacman.framework.model.Tile tile54 = null; // flaky: board33.tileAtOffset(tile50, 156, 23);
        org.jpacman.framework.model.Direction direction55 = org.jpacman.framework.model.Direction.DOWN;
        int int56 = direction55.getDx();
        int int57 = direction55.getDx();
        int int58 = direction55.getDy();
        org.jpacman.framework.model.Tile tile59 = null; // flaky: board2.tileAtDirection(tile54, direction55);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ghostList7);
        org.junit.Assert.assertNull(board8);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1,100]" + "'", str26.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[-1,100]" + "'", str27.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite28);
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[-1,100]" + "'", str41.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction42 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction42.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile46);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[21,97]" + "'", str51.equals("[21,97]"));
// flaky:         org.junit.Assert.assertNotNull(tile54);
        org.junit.Assert.assertTrue("'" + direction55 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction55.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
// flaky:         org.junit.Assert.assertNotNull(tile59);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(19, 35);
        int int3 = board2.getHeight();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        org.jpacman.framework.model.PointManager pointManager6 = game4.getPointManager();
        int int7 = pointManager6.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager8 = new org.jpacman.framework.model.PointManager();
        boolean boolean9 = pointManager8.allEaten();
        int int10 = pointManager8.totalFoodInGame();
        int int11 = pointManager8.getFoodEaten();
        org.jpacman.framework.model.Player player12 = new org.jpacman.framework.model.Player();
        int int14 = player12.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = player12.getSpriteType();
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.LEFT;
        int int17 = direction16.getDx();
        player12.setDirection(direction16);
// flaky:         pointManager8.consumePointsOnBoard(player12, 94);
// flaky:         pointManager6.consumePointsOnBoard(player12, 100);
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getX();
        int int27 = tile25.getX();
        int int28 = tile25.getX();
        java.lang.String str29 = tile25.toString();
        java.lang.String str30 = tile25.toString();
        player12.occupy(tile25);
        org.jpacman.framework.model.Board board34 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food38 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = food38.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = food38.getSpriteType();
        boolean boolean41 = tile37.containsSprite((org.jpacman.framework.model.Sprite) food38);
        java.lang.String str42 = tile37.toString();
        org.jpacman.framework.model.Direction direction43 = org.jpacman.framework.model.Direction.RIGHT;
        int int44 = direction43.getDx();
        int int45 = direction43.getDy();
        int int46 = direction43.getDy();
        org.jpacman.framework.model.Tile tile47 = null; // flaky: board34.tileAtDirection(tile37, direction43);
        int int48 = board34.getHeight();
        org.jpacman.framework.model.Tile tile51 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int52 = tile51.getX();
        int int53 = tile51.getX();
        org.jpacman.framework.model.Player player54 = new org.jpacman.framework.model.Player();
        int int56 = player54.addPoints((int) (short) 10);
        int int57 = player54.getPoints();
        int int59 = player54.addPoints((int) '4');
        boolean boolean60 = tile51.containsSprite((org.jpacman.framework.model.Sprite) player54);
        int int61 = tile51.getY();
        org.jpacman.framework.model.Player player62 = new org.jpacman.framework.model.Player();
        player62.die();
        player62.resurrect();
        int int65 = player62.getPoints();
        org.jpacman.framework.model.Direction direction66 = player62.getDirection();
        org.jpacman.framework.model.Tile tile67 = null; // flaky: board34.tileAtDirection(tile51, direction66);
        org.jpacman.framework.model.Tile tile68 = null; // flaky: board2.tileAtDirection(tile25, direction66);
        int int69 = direction66.getDx();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(player5);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction16.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[10,-1]" + "'", str29.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[10,-1]" + "'", str30.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[-1,100]" + "'", str42.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction43 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction43.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 62 + "'", int59 == 62);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + direction66 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction66.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile67);
// flaky:         org.junit.Assert.assertNotNull(tile68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory6 = null;
// flaky:         level0.setFactory(iGameFactory6);
        org.jpacman.framework.factory.IGameFactory iGameFactory8 = null;
// flaky:         level0.setFactory(iGameFactory8);
        level0.setMapFile("board.txt");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        food0.setPoints(21);
        org.jpacman.framework.model.Tile tile8 = new org.jpacman.framework.model.Tile(52, 73);
        food0.occupy(tile8);
        food0.setPoints(21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(23, 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player0.getSpriteType();
        org.jpacman.framework.model.Direction direction9 = player0.getDirection();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction9.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        boolean boolean3 = game0.hasChanged();
        game0.notifyObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        boolean boolean5 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector10 = game7.getBoardInspector();
        game7.deleteObservers();
        org.jpacman.framework.model.Board board12 = game7.getBoard();
        org.jpacman.framework.model.Player player13 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game7.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager15 = new org.jpacman.framework.model.PointManager();
        pointManager15.addPointsToBoard((int) (byte) 10);
        int int18 = pointManager15.totalFoodInGame();
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player19.getSpriteType();
        java.lang.String str23 = player19.toString();
// flaky:         pointManager15.consumePointsOnBoard(player19, 72);
        int int26 = pointManager15.getFoodEaten();
        pointManager15.addPointsToBoard((int) (short) 100);
        game7.notifyObservers((java.lang.Object) (short) 100);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getX();
        int int34 = tile32.getX();
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        int int38 = player35.getPoints();
        int int40 = player35.addPoints((int) '4');
        boolean boolean41 = tile32.containsSprite((org.jpacman.framework.model.Sprite) player35);
        player35.resurrect();
        player35.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = player35.getSpriteType();
        game7.addPlayer(player35);
        game0.notifyObservers((java.lang.Object) player35);
        org.jpacman.framework.model.Game game47 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player48 = game47.getPlayer();
        org.jpacman.framework.model.Board board49 = game47.getBoard();
        boolean boolean50 = game47.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector51 = game47.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector52 = game47.getBoardInspector();
        org.jpacman.framework.model.Board board55 = new org.jpacman.framework.model.Board(0, 20);
        int int56 = board55.getWidth();
        int int57 = board55.getHeight();
        game47.setBoard(board55);
        boolean boolean61 = board55.withinBorders(10, (int) '#');
        game0.setBoard(board55);
        int int63 = board55.getHeight();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostList6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(iBoardInspector10);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PLAYER occupying null" + "'", str23.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 72 + "'", int26 == 72);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 62 + "'", int40 == 62);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNull(player48);
        org.junit.Assert.assertNull(board49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(iBoardInspector51);
        org.junit.Assert.assertNull(iBoardInspector52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20 + "'", int57 == 20);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20 + "'", int63 == 20);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        java.lang.String str7 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "board.txt" + "'", str7.equals("board.txt"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.totalFoodInGame();
        int int3 = pointManager0.getFoodEaten();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        org.jpacman.framework.model.Direction direction8 = org.jpacman.framework.model.Direction.LEFT;
        int int9 = direction8.getDx();
        player4.setDirection(direction8);
// flaky:         pointManager0.consumePointsOnBoard(player4, 94);
        boolean boolean13 = pointManager0.allEaten();
        int int14 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        player15.die();
        int int17 = player15.getPoints();
// flaky:         pointManager0.consumePointsOnBoard(player15, 92);
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board(19, 35);
        int int23 = board22.getHeight();
        org.jpacman.framework.model.Game game24 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player25 = game24.getPlayer();
        org.jpacman.framework.model.PointManager pointManager26 = game24.getPointManager();
        int int27 = pointManager26.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager28 = new org.jpacman.framework.model.PointManager();
        boolean boolean29 = pointManager28.allEaten();
        int int30 = pointManager28.totalFoodInGame();
        int int31 = pointManager28.getFoodEaten();
        org.jpacman.framework.model.Player player32 = new org.jpacman.framework.model.Player();
        int int34 = player32.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = player32.getSpriteType();
        org.jpacman.framework.model.Direction direction36 = org.jpacman.framework.model.Direction.LEFT;
        int int37 = direction36.getDx();
        player32.setDirection(direction36);
// flaky:         pointManager28.consumePointsOnBoard(player32, 94);
// flaky:         pointManager26.consumePointsOnBoard(player32, 100);
        org.jpacman.framework.model.Tile tile45 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int46 = tile45.getX();
        int int47 = tile45.getX();
        int int48 = tile45.getX();
        java.lang.String str49 = tile45.toString();
        java.lang.String str50 = tile45.toString();
        player32.occupy(tile45);
        org.jpacman.framework.model.Board board54 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile57 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food58 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType59 = food58.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType60 = food58.getSpriteType();
        boolean boolean61 = tile57.containsSprite((org.jpacman.framework.model.Sprite) food58);
        java.lang.String str62 = tile57.toString();
        org.jpacman.framework.model.Direction direction63 = org.jpacman.framework.model.Direction.RIGHT;
        int int64 = direction63.getDx();
        int int65 = direction63.getDy();
        int int66 = direction63.getDy();
        org.jpacman.framework.model.Tile tile67 = null; // flaky: board54.tileAtDirection(tile57, direction63);
        int int68 = board54.getHeight();
        org.jpacman.framework.model.Tile tile71 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int72 = tile71.getX();
        int int73 = tile71.getX();
        org.jpacman.framework.model.Player player74 = new org.jpacman.framework.model.Player();
        int int76 = player74.addPoints((int) (short) 10);
        int int77 = player74.getPoints();
        int int79 = player74.addPoints((int) '4');
        boolean boolean80 = tile71.containsSprite((org.jpacman.framework.model.Sprite) player74);
        int int81 = tile71.getY();
        org.jpacman.framework.model.Player player82 = new org.jpacman.framework.model.Player();
        player82.die();
        player82.resurrect();
        int int85 = player82.getPoints();
        org.jpacman.framework.model.Direction direction86 = player82.getDirection();
        org.jpacman.framework.model.Tile tile87 = null; // flaky: board54.tileAtDirection(tile71, direction86);
        org.jpacman.framework.model.Tile tile88 = null; // flaky: board22.tileAtDirection(tile45, direction86);
        player15.setDirection(direction86);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction8 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction8.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNull(player25);
        org.junit.Assert.assertNotNull(pointManager26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction36 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction36.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "[10,-1]" + "'", str49.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[10,-1]" + "'", str50.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + spriteType59 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType59.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType60 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType60.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[-1,100]" + "'", str62.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction63 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction63.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 62 + "'", int79 == 62);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + direction86 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction86.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile87);
// flaky:         org.junit.Assert.assertNotNull(tile88);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
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
        boolean boolean18 = board2.withinBorders(1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager4 = new org.jpacman.framework.model.PointManager();
        boolean boolean5 = pointManager4.allEaten();
        int int6 = pointManager4.totalFoodInGame();
        int int7 = pointManager4.getFoodEaten();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player8.getSpriteType();
        org.jpacman.framework.model.Direction direction12 = org.jpacman.framework.model.Direction.LEFT;
        int int13 = direction12.getDx();
        player8.setDirection(direction12);
// flaky:         pointManager4.consumePointsOnBoard(player8, 94);
// flaky:         pointManager2.consumePointsOnBoard(player8, 100);
        org.jpacman.framework.model.Board board21 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int22 = board21.getWidth();
        boolean boolean25 = board21.withinBorders(100, 94);
        int int26 = board21.getHeight();
        org.jpacman.framework.model.Board board29 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite33 = tile32.topSprite();
        int int34 = tile32.getY();
        org.jpacman.framework.model.Tile tile37 = null; // flaky: board29.tileAtOffset(tile32, 100, 1);
        org.jpacman.framework.model.Tile tile40 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player41 = new org.jpacman.framework.model.Player();
        player41.die();
        player41.resurrect();
        org.jpacman.framework.model.Tile tile46 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food47 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType48 = food47.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = food47.getSpriteType();
        boolean boolean50 = tile46.containsSprite((org.jpacman.framework.model.Sprite) food47);
        java.lang.String str51 = tile46.toString();
        java.lang.String str52 = tile46.toString();
        org.jpacman.framework.model.Sprite sprite53 = tile46.topSprite();
        player41.occupy(tile46);
        org.jpacman.framework.model.Direction direction55 = player41.getDirection();
        org.jpacman.framework.model.Tile tile56 = null; // flaky: board29.tileAtDirection(tile40, direction55);
        org.jpacman.framework.model.Player player57 = new org.jpacman.framework.model.Player();
        int int59 = player57.addPoints((int) (short) 10);
        int int60 = player57.getPoints();
        int int62 = player57.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType63 = player57.getSpriteType();
        int int65 = player57.addPoints((int) (short) 10);
        player57.resurrect();
        org.jpacman.framework.model.Direction direction67 = player57.getDirection();
        org.jpacman.framework.model.Tile tile68 = null; // flaky: board21.tileAtDirection(tile56, direction67);
        player8.setDirection(direction67);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction12.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(sprite33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile37);
        org.junit.Assert.assertTrue("'" + spriteType48 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType48.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType49 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType49.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[-1,100]" + "'", str51.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[-1,100]" + "'", str52.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite53);
        org.junit.Assert.assertTrue("'" + direction55 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction55.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 62 + "'", int62 == 62);
        org.junit.Assert.assertTrue("'" + spriteType63 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType63.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 72 + "'", int65 == 72);
        org.junit.Assert.assertTrue("'" + direction67 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction67.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile68);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
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
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        org.jpacman.framework.model.Tile tile21 = new org.jpacman.framework.model.Tile(0, 1);
        org.jpacman.framework.model.Tile tile24 = board2.tileAtOffset(tile21, 63, 45);
        try {
            org.jpacman.framework.model.Tile tile27 = null; // flaky: board2.tileAt(94, 110);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(tile24);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
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
        boolean boolean13 = game0.won();
        java.util.Observer observer14 = null;
        try {
// flaky:             game0.attach(observer14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager4 = game0.getPointManager();
        int int5 = pointManager4.getFoodEaten();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(pointManager4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int13 = player5.addPoints(0);
        player5.resurrect();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        boolean boolean18 = player15.isAlive();
        int int20 = player15.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = player15.getSpriteType();
        org.jpacman.framework.model.Direction direction22 = player15.getDirection();
        player5.setDirection(direction22);
        int int24 = direction22.getDx();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction22.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = player5.getSpriteType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        food0.setPoints(0);
        int int4 = food0.getPoints();
        food0.setPoints(52);
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
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
        boolean boolean34 = pointManager32.allEaten();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
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
        int int17 = board2.getHeight();
        int int18 = board2.getWidth();
        org.jpacman.framework.model.Game game19 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board(62, 10);
        game19.setBoard(board22);
        org.jpacman.framework.model.Board board26 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite30 = tile29.topSprite();
        int int31 = tile29.getY();
        org.jpacman.framework.model.Tile tile34 = null; // flaky: board26.tileAtOffset(tile29, 100, 1);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        player35.die();
        player35.resurrect();
        java.lang.String str38 = player35.toString();
        int int39 = player35.getPoints();
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.UP;
        player35.setDirection(direction40);
        java.lang.Class<?> wildcardClass42 = direction40.getClass();
        org.jpacman.framework.model.Tile tile43 = null; // flaky: board22.tileAtDirection(tile34, direction40);
        int int44 = 0; // flaky: tile34.getX();
        int int45 = 0; // flaky: tile34.getX();
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
        org.jpacman.framework.model.Tile tile61 = null; // flaky: board2.tileAtDirection(tile34, direction60);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType64 = null; // flaky: board2.spriteTypeAt(159, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 159");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(sprite30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile34);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "PLAYER occupying null" + "'", str38.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction40.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass42);
// flaky:         org.junit.Assert.assertNotNull(tile43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(54, (int) '#');
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(62, 10);
        int int6 = board5.getWidth();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        int int15 = player10.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction16 = player10.getDirection();
        int int17 = direction16.getDy();
        org.jpacman.framework.model.Tile tile18 = null; // flaky: board5.tileAtDirection(tile9, direction16);
        java.lang.String str19 = null; // flaky: tile18.toString();
        org.jpacman.framework.model.Sprite sprite20 = null;
        boolean boolean21 = false; // flaky: tile18.containsSprite(sprite20);
        org.jpacman.framework.model.Tile tile24 = null; // flaky: board2.tileAtOffset(tile18, 71, 156);
        java.lang.String str25 = null; // flaky: tile18.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 62 + "'", int15 == 62);
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction16.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile18);
// flaky:         org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[9,9]" + "'", str19.equals("[9,9]"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertNotNull(tile24);
// flaky:         org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[9,9]" + "'", str25.equals("[9,9]"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
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
        int int40 = game0.countObservers();
        java.util.Observer observer41 = null;
        game0.deleteObserver(observer41);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
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
        java.lang.Class<?> wildcardClass23 = game0.getClass();
        java.util.Observer observer24 = null;
        try {
// flaky:             game0.attach(observer24);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        org.jpacman.framework.model.Game game7 = level0.getGame();
        java.lang.String str8 = level0.getMapFile();
        java.lang.String str9 = level0.getMapFile();
        org.jpacman.framework.model.Game game10 = level0.getGame();
        game10.notifyObservers();
        boolean boolean12 = game10.won();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "board.txt" + "'", str8.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "board.txt" + "'", str9.equals("board.txt"));
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        food0.setPoints((int) '4');
        int int4 = food0.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = food0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int3 = board2.getWidth();
        boolean boolean6 = board2.withinBorders(100, 94);
        int int7 = board2.getHeight();
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
        org.jpacman.framework.model.Player player38 = new org.jpacman.framework.model.Player();
        int int40 = player38.addPoints((int) (short) 10);
        int int41 = player38.getPoints();
        int int43 = player38.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = player38.getSpriteType();
        int int46 = player38.addPoints((int) (short) 10);
        player38.resurrect();
        org.jpacman.framework.model.Direction direction48 = player38.getDirection();
        org.jpacman.framework.model.Tile tile49 = null; // flaky: board2.tileAtDirection(tile37, direction48);
        int int50 = direction48.getDy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 62 + "'", int43 == 62);
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 72 + "'", int46 == 72);
        org.junit.Assert.assertTrue("'" + direction48 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction48.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(19, 35);
        org.jpacman.framework.model.Tile tile5 = new org.jpacman.framework.model.Tile((int) (short) 10, 0);
        int int6 = tile5.getY();
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        player7.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player7.getSpriteType();
        player7.die();
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player11.getSpriteType();
        java.lang.String str15 = player11.toString();
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.DOWN;
        int int17 = direction16.getDx();
        player11.setDirection(direction16);
        player7.setDirection(direction16);
        org.jpacman.framework.model.Tile tile20 = board2.tileAtDirection(tile5, direction16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "PLAYER occupying null" + "'", str15.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction16 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction16.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(tile20);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        java.lang.Object obj7 = null;
        game0.notifyObservers(obj7);
        org.jpacman.framework.model.PointManager pointManager9 = new org.jpacman.framework.model.PointManager();
        boolean boolean10 = pointManager9.allEaten();
        int int11 = pointManager9.totalFoodInGame();
        int int12 = pointManager9.totalFoodInGame();
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        player13.die();
        player13.resurrect();
// flaky:         pointManager9.consumePointsOnBoard(player13, (int) (short) 1);
        game0.addPlayer(player13);
        game0.notifyObservers();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList10 = game0.getGhosts();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertNotNull(ghostList10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.PointManager pointManager4 = game0.getPointManager();
        boolean boolean5 = pointManager4.allEaten();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        boolean boolean10 = player6.isAlive();
        int int12 = player6.addPoints((int) (byte) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player6.getSpriteType();
// flaky:         pointManager4.consumePointsOnBoard(player6, 72);
        int int17 = player6.addPoints(94);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNotNull(pointManager4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 166 + "'", int17 == 166);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
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
        boolean boolean24 = board7.withinBorders(72, 10);
        org.jpacman.framework.model.Tile tile27 = new org.jpacman.framework.model.Tile(21, (int) 'a');
        int int28 = tile27.getY();
        org.jpacman.framework.model.Tile tile31 = null; // flaky: board7.tileAtOffset(tile27, (int) (byte) -1, 61);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
// flaky:         org.junit.Assert.assertNotNull(tile31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        food0.setPoints((int) (byte) 0);
        int int5 = food0.getPoints();
        int int6 = food0.getPoints();
        food0.setPoints(0);
        food0.setPoints(19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
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
        level0.setMapFile("[10,-1]");
        java.lang.String str15 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[10,-1]" + "'", str15.equals("[10,-1]"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        java.lang.String str1 = wall0.toString();
        org.jpacman.framework.model.Game game2 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player3 = game2.getPlayer();
        org.jpacman.framework.model.Board board4 = game2.getBoard();
        org.jpacman.framework.model.Ghost ghost5 = new org.jpacman.framework.model.Ghost();
        game2.addGhost(ghost5);
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost5.occupy(tile9);
        org.jpacman.framework.model.PointManager pointManager11 = new org.jpacman.framework.model.PointManager();
        boolean boolean12 = pointManager11.allEaten();
        int int13 = pointManager11.totalFoodInGame();
        int int14 = pointManager11.getFoodEaten();
        int int15 = pointManager11.totalFoodInGame();
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        player16.die();
        player16.resurrect();
        int int19 = player16.getPoints();
// flaky:         pointManager11.consumePointsOnBoard(player16, (int) (byte) 1);
        boolean boolean22 = tile9.containsSprite((org.jpacman.framework.model.Sprite) player16);
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        int int25 = player23.addPoints((int) (short) 10);
        boolean boolean26 = player23.isAlive();
        player23.die();
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        int int30 = player28.addPoints((int) (short) 10);
        boolean boolean31 = player28.isAlive();
        org.jpacman.framework.model.Tile tile34 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int35 = tile34.getX();
        int int36 = tile34.getX();
        int int37 = tile34.getX();
        player28.occupy(tile34);
        player23.occupy(tile34);
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.LEFT;
        int int41 = direction40.getDx();
        player23.setDirection(direction40);
        boolean boolean43 = tile9.containsSprite((org.jpacman.framework.model.Sprite) player23);
        wall0.occupy(tile9);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "WALL occupying null" + "'", str1.equals("WALL occupying null"));
        org.junit.Assert.assertNull(player3);
        org.junit.Assert.assertNull(board4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction40.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
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
        java.util.Observer observer32 = null;
        try {
            game0.addObserver(observer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.Tile tile6 = player0.getTile();
        player0.resurrect();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(tile6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        player0.resurrect();
        player0.die();
        int int11 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 72 + "'", int11 == 72);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
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
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        int int21 = player18.getPoints();
        int int23 = player18.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = player18.getSpriteType();
        java.lang.String str25 = player18.toString();
        boolean boolean26 = tile17.containsSprite((org.jpacman.framework.model.Sprite) player18);
// flaky:         pointManager0.consumePointsOnBoard(player18, 9);
        boolean boolean29 = player18.isAlive();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 62 + "'", int23 == 62);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "PLAYER occupying null" + "'", str25.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = board2.tileAt(10, 0);
        int int7 = tile6.getX();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int11 = tile10.getX();
        int int12 = tile10.getX();
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        int int16 = player13.getPoints();
        int int18 = player13.addPoints((int) '4');
        boolean boolean19 = tile10.containsSprite((org.jpacman.framework.model.Sprite) player13);
        int int21 = player13.addPoints(0);
        player13.die();
        boolean boolean23 = player13.isAlive();
        int int25 = 0; // flaky: player13.addPoints(9);
        player13.die();
        boolean boolean27 = tile6.containsSprite((org.jpacman.framework.model.Sprite) player13);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = player13.getSpriteType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertNotNull(tile6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 62 + "'", int21 == 62);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 71 + "'", int25 == 71);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + spriteType28 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType28.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food10.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food10.getSpriteType();
        boolean boolean13 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food10);
        game0.addFood(food10);
        org.jpacman.framework.model.Food food15 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food15.getSpriteType();
        food15.setPoints((int) '4');
        int int19 = food15.getPoints();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = food15.getSpriteType();
        food15.setPoints((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = food15.getClass();
        game0.addFood(food15);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = food15.getSpriteType();
        java.lang.String str26 = food15.toString();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "FOOD occupying null" + "'", str26.equals("FOOD occupying null"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        boolean boolean9 = player0.isAlive();
        int int11 = player0.addPoints(34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        food0.setPoints((-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        food0.setPoints(45);
        food0.setPoints(135);
        food0.setPoints((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = game0.getClass();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        int int5 = game0.countObservers();
        org.jpacman.framework.model.PointManager pointManager6 = new org.jpacman.framework.model.PointManager();
        boolean boolean7 = pointManager6.allEaten();
        int int8 = pointManager6.totalFoodInGame();
        int int9 = pointManager6.getFoodEaten();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player10.getSpriteType();
        org.jpacman.framework.model.Direction direction14 = org.jpacman.framework.model.Direction.LEFT;
        int int15 = direction14.getDx();
        player10.setDirection(direction14);
// flaky:         pointManager6.consumePointsOnBoard(player10, 94);
        boolean boolean19 = pointManager6.allEaten();
        int int20 = pointManager6.totalFoodInGame();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        player21.die();
        int int23 = player21.getPoints();
// flaky:         pointManager6.consumePointsOnBoard(player21, 92);
        boolean boolean26 = player21.isAlive();
        game0.addPlayer(player21);
        int int29 = 0; // flaky: player21.addPoints(97);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction14.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 189 + "'", int29 == 189);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager4 = new org.jpacman.framework.model.PointManager();
        boolean boolean5 = pointManager4.allEaten();
        int int6 = pointManager4.totalFoodInGame();
        int int7 = pointManager4.getFoodEaten();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player8.getSpriteType();
        org.jpacman.framework.model.Direction direction12 = org.jpacman.framework.model.Direction.LEFT;
        int int13 = direction12.getDx();
        player8.setDirection(direction12);
// flaky:         pointManager4.consumePointsOnBoard(player8, 94);
// flaky:         pointManager2.consumePointsOnBoard(player8, 100);
        pointManager2.addPointsToBoard(154);
        int int21 = pointManager2.totalFoodInGame();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction12.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 154 + "'", int21 == 154);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
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
        player0.resurrect();
        java.lang.String str21 = player0.toString();
        boolean boolean22 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(tile19);
// flaky:         org.junit.Assert.assertTrue("'" + str21 + "' != '" + "PLAYER occupying [10,97]" + "'", str21.equals("PLAYER occupying [10,97]"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(159, 100);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = null; // flaky: board2.spriteTypeAt(124, 114);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 114");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
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
        org.jpacman.framework.model.Board board14 = game0.getBoard();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(iBoardInspector12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(board14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food6.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.Player player8 = game6.getPlayer();
        org.jpacman.framework.model.Board board9 = game6.getBoard();
        org.jpacman.framework.model.Player player10 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager11 = game6.getPointManager();
        game6.deleteObservers();
        org.jpacman.framework.model.Board board15 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite19 = tile18.topSprite();
        int int20 = tile18.getY();
        org.jpacman.framework.model.Tile tile23 = null; // flaky: board15.tileAtOffset(tile18, 100, 1);
        int int24 = board15.getWidth();
        game6.setBoard(board15);
        game0.notifyObservers((java.lang.Object) game6);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertNull(player10);
        org.junit.Assert.assertNotNull(pointManager11);
        org.junit.Assert.assertNull(sprite19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
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
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getY();
        int int27 = tile25.getY();
// flaky:         player8.occupy(tile25);
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.RIGHT;
        int int30 = direction29.getDy();
        org.jpacman.framework.model.Tile tile31 = null; // flaky: board7.tileAtDirection(tile25, direction29);
        int int32 = direction29.getDx();
        int int33 = direction29.getDy();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertTrue("'" + spriteType15 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType15.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,100]" + "'", str18.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1,100]" + "'", str19.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction22.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction29.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        java.lang.String str2 = level0.getMapFile();
        level0.setMapFile("PLAYER occupying [-1,100]");
        java.lang.String str5 = level0.getMapFile();
        org.jpacman.framework.model.Game game6 = level0.getGame();
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor7 = level0.parseMap();
            org.junit.Assert.fail("Expected exception of type org.jpacman.framework.factory.FactoryException; message: Resource: PLAYER occupying [-1,100] not found on classpath:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/target/classes/:/Users/tangjiahui/eclipse-workspace/group8/assignment1/jpacman-framework/randoop-all-4.1.1.jar");
        } catch (org.jpacman.framework.factory.FactoryException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "board.txt" + "'", str2.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "PLAYER occupying [-1,100]" + "'", str5.equals("PLAYER occupying [-1,100]"));
        org.junit.Assert.assertNull(game6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
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
        org.jpacman.framework.model.Board board16 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile19 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite20 = tile19.topSprite();
        int int21 = tile19.getY();
        org.jpacman.framework.model.Tile tile24 = null; // flaky: board16.tileAtOffset(tile19, 100, 1);
        org.jpacman.framework.model.Tile tile27 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        player28.die();
        player28.resurrect();
        org.jpacman.framework.model.Tile tile33 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food34 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = food34.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = food34.getSpriteType();
        boolean boolean37 = tile33.containsSprite((org.jpacman.framework.model.Sprite) food34);
        java.lang.String str38 = tile33.toString();
        java.lang.String str39 = tile33.toString();
        org.jpacman.framework.model.Sprite sprite40 = tile33.topSprite();
        player28.occupy(tile33);
        org.jpacman.framework.model.Direction direction42 = player28.getDirection();
        org.jpacman.framework.model.Tile tile43 = null; // flaky: board16.tileAtDirection(tile27, direction42);
        org.jpacman.framework.model.Tile tile46 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile49 = null; // flaky: board16.tileAtOffset(tile46, (int) (short) 10, 35);
        game0.setBoard(board16);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList51 = game0.getGhosts();
        org.jpacman.framework.model.Game game52 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player53 = game52.getPlayer();
        org.jpacman.framework.model.Board board54 = game52.getBoard();
        boolean boolean55 = game52.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector56 = game52.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector57 = game52.getBoardInspector();
        org.jpacman.framework.model.Board board60 = new org.jpacman.framework.model.Board(0, 20);
        int int61 = board60.getWidth();
        int int62 = board60.getHeight();
        game52.setBoard(board60);
        game0.setBoard(board60);
        int int65 = board60.getHeight();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector13);
        org.junit.Assert.assertNull(sprite20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile24);
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType36 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType36.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[-1,100]" + "'", str38.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[-1,100]" + "'", str39.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite40);
        org.junit.Assert.assertTrue("'" + direction42 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction42.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile43);
// flaky:         org.junit.Assert.assertNotNull(tile49);
        org.junit.Assert.assertNotNull(ghostList51);
        org.junit.Assert.assertNull(player53);
        org.junit.Assert.assertNull(board54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(iBoardInspector56);
        org.junit.Assert.assertNull(iBoardInspector57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 20 + "'", int62 == 20);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20 + "'", int65 == 20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        int int5 = board3.getHeight();
        boolean boolean8 = board3.withinBorders(0, 159);
        org.jpacman.framework.model.Game game9 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board10 = game9.getBoard();
        game9.notifyObservers();
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        food12.setPoints((int) '4');
        int int16 = food12.getPoints();
        game9.addFood(food12);
        java.util.Observer observer18 = null;
        game9.deleteObserver(observer18);
        game9.notifyObservers();
        org.jpacman.framework.model.Game game21 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player22 = game21.getPlayer();
        boolean boolean23 = game21.won();
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        int int26 = player24.addPoints((int) (short) 10);
        boolean boolean27 = player24.isAlive();
        org.jpacman.framework.model.Direction direction28 = player24.getDirection();
        player24.die();
        game21.addPlayer(player24);
        game9.addPlayer(player24);
        try {
// flaky:             board3.put((org.jpacman.framework.model.Sprite) player24, (int) (byte) 100, 94);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(board10);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(player22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + direction28 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction28.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (byte) 100, 72);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = null; // flaky: board2.spriteTypeAt(104, 21);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Player player8 = game0.getPlayer();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        player9.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player9.getSpriteType();
        boolean boolean12 = player9.isAlive();
        int int13 = player9.getPoints();
        game0.addPlayer(player9);
        java.lang.Class<?> wildcardClass15 = game0.getClass();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        game0.deleteObservers();
        java.util.Observer observer10 = null;
        try {
// flaky:             game0.attach(observer10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = wall0.getSpriteType();
        org.junit.Assert.assertTrue("'" + spriteType1 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType1.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType3 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType3.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.WALL + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.WALL));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNull(iBoardInspector3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
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
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        int int19 = player14.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = player14.getSpriteType();
        java.lang.String str21 = player14.toString();
        player14.resurrect();
        int int24 = player14.addPoints(10);
        board4.put((org.jpacman.framework.model.Sprite) player14, 0, 0);
        org.jpacman.framework.model.Board board30 = new org.jpacman.framework.model.Board(62, 10);
        int int31 = board30.getWidth();
        org.jpacman.framework.model.Tile tile34 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        int int38 = player35.getPoints();
        int int40 = player35.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction41 = player35.getDirection();
        int int42 = direction41.getDy();
        org.jpacman.framework.model.Tile tile43 = null; // flaky: board30.tileAtDirection(tile34, direction41);
        java.lang.String str44 = null; // flaky: tile43.toString();
        org.jpacman.framework.model.Food food45 = new org.jpacman.framework.model.Food();
        int int46 = food45.getPoints();
        int int47 = food45.getPoints();
        int int48 = food45.getPoints();
        java.lang.String str49 = food45.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType50 = food45.getSpriteType();
        org.jpacman.framework.model.Tile tile51 = food45.getTile();
        food45.setPoints(35);
        boolean boolean54 = false; // flaky: tile43.containsSprite((org.jpacman.framework.model.Sprite) food45);
        org.jpacman.framework.model.Tile tile57 = null; // flaky: board4.tileAtOffset(tile43, 100, 100);
        int int58 = 0; // flaky: tile43.getY();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 62 + "'", int19 == 62);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "PLAYER occupying null" + "'", str21.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 62 + "'", int31 == 62);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 62 + "'", int40 == 62);
        org.junit.Assert.assertTrue("'" + direction41 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction41.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile43);
// flaky:         org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[9,9]" + "'", str44.equals("[9,9]"));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "FOOD occupying null" + "'", str49.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType50 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType50.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNull(tile51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky:         org.junit.Assert.assertNotNull(tile57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        java.util.Observer observer5 = null;
        game0.deleteObserver(observer5);
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        org.jpacman.framework.model.PointManager pointManager8 = game0.getPointManager();
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        boolean boolean13 = player10.isAlive();
        org.jpacman.framework.model.Tile tile16 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int17 = tile16.getX();
        int int18 = tile16.getX();
        int int19 = tile16.getX();
        player10.occupy(tile16);
        org.jpacman.framework.model.Sprite sprite21 = tile16.topSprite();
        int int22 = tile16.getX();
        org.jpacman.framework.model.Tile tile25 = null; // flaky: board9.tileAtOffset(tile16, (int) (short) 100, 73);
        int int26 = tile16.getX();
        org.junit.Assert.assertNotNull(board7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertNotNull(board9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(sprite21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
// flaky:         org.junit.Assert.assertNotNull(tile25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        boolean boolean4 = game0.hasChanged();
        boolean boolean5 = game0.won();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
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
        try {
            org.jpacman.framework.model.Sprite sprite30 = null; // flaky: board2.spriteAt(96, 50);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        org.jpacman.framework.model.Tile tile6 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int7 = tile6.getX();
        int int8 = tile6.getX();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        int int12 = player9.getPoints();
        int int14 = player9.addPoints((int) '4');
        boolean boolean15 = tile6.containsSprite((org.jpacman.framework.model.Sprite) player9);
        int int17 = player9.addPoints(0);
        player9.die();
        game0.addPlayer(player9);
        org.jpacman.framework.model.Game game20 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board21 = game20.getBoard();
        game20.notifyObservers();
        org.jpacman.framework.model.Board board25 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean28 = board25.withinBorders((int) (byte) 10, (int) '4');
        int int29 = board25.getHeight();
        int int30 = board25.getHeight();
        int int31 = board25.getWidth();
        game20.setBoard(board25);
        org.jpacman.framework.model.IBoardInspector iBoardInspector33 = game20.getBoardInspector();
        org.jpacman.framework.model.Board board36 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile39 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite40 = tile39.topSprite();
        int int41 = tile39.getY();
        org.jpacman.framework.model.Tile tile44 = null; // flaky: board36.tileAtOffset(tile39, 100, 1);
        org.jpacman.framework.model.Tile tile47 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player48 = new org.jpacman.framework.model.Player();
        player48.die();
        player48.resurrect();
        org.jpacman.framework.model.Tile tile53 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food54 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = food54.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType56 = food54.getSpriteType();
        boolean boolean57 = tile53.containsSprite((org.jpacman.framework.model.Sprite) food54);
        java.lang.String str58 = tile53.toString();
        java.lang.String str59 = tile53.toString();
        org.jpacman.framework.model.Sprite sprite60 = tile53.topSprite();
        player48.occupy(tile53);
        org.jpacman.framework.model.Direction direction62 = player48.getDirection();
        org.jpacman.framework.model.Tile tile63 = null; // flaky: board36.tileAtDirection(tile47, direction62);
        org.jpacman.framework.model.Tile tile66 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile69 = null; // flaky: board36.tileAtOffset(tile66, (int) (short) 10, 35);
        game20.setBoard(board36);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList71 = game20.getGhosts();
        org.jpacman.framework.model.Game game72 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player73 = game72.getPlayer();
        org.jpacman.framework.model.Board board74 = game72.getBoard();
        boolean boolean75 = game72.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector76 = game72.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector77 = game72.getBoardInspector();
        org.jpacman.framework.model.Board board80 = new org.jpacman.framework.model.Board(0, 20);
        int int81 = board80.getWidth();
        int int82 = board80.getHeight();
        game72.setBoard(board80);
        game20.setBoard(board80);
        game0.setBoard(board80);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 62 + "'", int17 == 62);
        org.junit.Assert.assertNull(board21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector33);
        org.junit.Assert.assertNull(sprite40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile44);
        org.junit.Assert.assertTrue("'" + spriteType55 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType55.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType56 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType56.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[-1,100]" + "'", str58.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[-1,100]" + "'", str59.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite60);
        org.junit.Assert.assertTrue("'" + direction62 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction62.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile63);
// flaky:         org.junit.Assert.assertNotNull(tile69);
        org.junit.Assert.assertNotNull(ghostList71);
        org.junit.Assert.assertNull(player73);
        org.junit.Assert.assertNull(board74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(iBoardInspector76);
        org.junit.Assert.assertNull(iBoardInspector77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 20 + "'", int82 == 20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
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
        org.jpacman.framework.model.Direction direction15 = player10.getDirection();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(player7);
        org.junit.Assert.assertNotNull(pointManager8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction15.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        player0.die();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        java.lang.String str8 = player4.toString();
        org.jpacman.framework.model.Direction direction9 = org.jpacman.framework.model.Direction.DOWN;
        int int10 = direction9.getDx();
        player4.setDirection(direction9);
        player0.setDirection(direction9);
        int int13 = direction9.getDy();
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "PLAYER occupying null" + "'", str8.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction9.equals(org.jpacman.framework.model.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        boolean boolean3 = pointManager0.allEaten();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        player4.die();
        player4.resurrect();
        java.lang.String str7 = player4.toString();
        int int8 = player4.getPoints();
        org.jpacman.framework.model.Direction direction9 = org.jpacman.framework.model.Direction.UP;
        player4.setDirection(direction9);
        pointManager0.consumePointsOnBoard(player4, 0);
        int int13 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        boolean boolean17 = player14.isAlive();
        int int19 = player14.addPoints((int) (short) 0);
        org.jpacman.framework.model.Game game20 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board23 = new org.jpacman.framework.model.Board(62, 10);
        game20.setBoard(board23);
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
        org.jpacman.framework.model.Tile tile43 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food44 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType45 = food44.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = food44.getSpriteType();
        boolean boolean47 = tile43.containsSprite((org.jpacman.framework.model.Sprite) food44);
        org.jpacman.framework.model.Sprite sprite48 = tile43.topSprite();
        org.jpacman.framework.model.Tile tile51 = null; // flaky: board27.tileAtOffset(tile43, 100, (int) '4');
        org.jpacman.framework.model.Direction direction52 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile53 = null; // flaky: board23.tileAtDirection(tile51, direction52);
        player14.setDirection(direction52);
// flaky:         pointManager0.consumePointsOnBoard(player14, (int) (short) -1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType57 = player14.getSpriteType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.jpacman.framework.model.Direction.UP + "'", direction9.equals(org.jpacman.framework.model.Direction.UP));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 62 + "'", int28 == 62);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 62 + "'", int37 == 62);
        org.junit.Assert.assertTrue("'" + direction38 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction38.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile40);
        org.junit.Assert.assertTrue("'" + spriteType45 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType45.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType46 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType46.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(sprite48);
// flaky:         org.junit.Assert.assertNotNull(tile51);
        org.junit.Assert.assertTrue("'" + direction52 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction52.equals(org.jpacman.framework.model.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(tile53);
        org.junit.Assert.assertTrue("'" + spriteType57 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType57.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        org.jpacman.framework.model.Game game7 = level0.getGame();
        java.lang.String str8 = level0.getMapFile();
        java.lang.String str9 = level0.getMapFile();
        org.jpacman.framework.model.Game game10 = level0.getGame();
        org.jpacman.framework.model.Food food11 = new org.jpacman.framework.model.Food();
        int int12 = food11.getPoints();
        int int13 = food11.getPoints();
        int int14 = food11.getPoints();
        java.lang.String str15 = food11.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = food11.getSpriteType();
        org.jpacman.framework.model.Tile tile17 = food11.getTile();
        game10.addFood(food11);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "board.txt" + "'", str8.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "board.txt" + "'", str9.equals("board.txt"));
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FOOD occupying null" + "'", str15.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType16 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType16.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertNull(tile17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
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
        player0.die();
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        pointManager0.addPointsToBoard((int) (byte) 10);
        int int3 = pointManager0.totalFoodInGame();
        int int4 = pointManager0.totalFoodInGame();
        int int5 = pointManager0.getFoodEaten();
        pointManager0.addPointsToBoard(72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Level level6 = new org.jpacman.framework.model.Level();
        java.lang.String str7 = level6.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor8 = level6.parseMap();
        org.jpacman.framework.model.Game game9 = level6.getGame();
        game0.notifyObservers((java.lang.Object) game9);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "board.txt" + "'", str7.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor8);
        org.junit.Assert.assertNotNull(game9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        java.lang.String str3 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory4 = null;
// flaky:         level0.setFactory(iGameFactory4);
        org.jpacman.framework.model.Game game6 = level0.getGame();
        try {
            org.jpacman.framework.model.IGameInteractor iGameInteractor7 = level0.parseMap();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "board.txt" + "'", str3.equals("board.txt"));
        org.junit.Assert.assertNotNull(game6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        int int4 = game0.countObservers();
        game0.deleteObservers();
        org.jpacman.framework.model.PointManager pointManager6 = game0.getPointManager();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(pointManager6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
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
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int19 = tile18.getX();
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        int int23 = board22.getHeight();
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        int int26 = player24.addPoints((int) (short) 10);
        int int27 = player24.getPoints();
        boolean boolean28 = player24.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = player24.getSpriteType();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        org.jpacman.framework.model.Player player33 = new org.jpacman.framework.model.Player();
        int int35 = player33.addPoints((int) (short) 10);
        boolean boolean36 = player33.isAlive();
        player33.die();
        org.jpacman.framework.model.Player player38 = new org.jpacman.framework.model.Player();
        int int40 = player38.addPoints((int) (short) 10);
        boolean boolean41 = player38.isAlive();
        org.jpacman.framework.model.Tile tile44 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int45 = tile44.getX();
        int int46 = tile44.getX();
        int int47 = tile44.getX();
        player38.occupy(tile44);
        player33.occupy(tile44);
        player30.occupy(tile44);
        player24.occupy(tile44);
        org.jpacman.framework.model.Player player52 = new org.jpacman.framework.model.Player();
        int int54 = player52.addPoints((int) (short) 10);
        boolean boolean55 = player52.isAlive();
        player52.die();
        org.jpacman.framework.model.Player player57 = new org.jpacman.framework.model.Player();
        int int59 = player57.addPoints((int) (short) 10);
        boolean boolean60 = player57.isAlive();
        org.jpacman.framework.model.Tile tile63 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int64 = tile63.getX();
        int int65 = tile63.getX();
        int int66 = tile63.getX();
        player57.occupy(tile63);
        player52.occupy(tile63);
        org.jpacman.framework.model.Direction direction69 = org.jpacman.framework.model.Direction.LEFT;
        int int70 = direction69.getDx();
        player52.setDirection(direction69);
        org.jpacman.framework.model.Tile tile72 = null; // flaky: board22.tileAtDirection(tile44, direction69);
        org.jpacman.framework.model.Tile tile73 = null; // flaky: board2.tileAtDirection(tile18, direction69);
        org.jpacman.framework.model.Player player74 = new org.jpacman.framework.model.Player();
        int int76 = player74.addPoints((int) (short) 10);
        boolean boolean77 = player74.isAlive();
        player74.die();
        org.jpacman.framework.model.Player player79 = new org.jpacman.framework.model.Player();
        int int81 = player79.addPoints((int) (short) 10);
        boolean boolean82 = player79.isAlive();
        org.jpacman.framework.model.Tile tile85 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int86 = tile85.getX();
        int int87 = tile85.getX();
        int int88 = tile85.getX();
        player79.occupy(tile85);
        player74.occupy(tile85);
        player74.resurrect();
        boolean boolean92 = false; // flaky: tile73.containsSprite((org.jpacman.framework.model.Sprite) player74);
        org.jpacman.framework.model.Sprite sprite93 = null; // flaky: tile73.topSprite();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + direction69 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction69.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
// flaky:         org.junit.Assert.assertNotNull(tile72);
// flaky:         org.junit.Assert.assertNotNull(tile73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(sprite93);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FOOD occupying null" + "'", str4.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FOOD occupying null" + "'", str5.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FOOD occupying null" + "'", str6.equals("FOOD occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType7 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType7.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
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
        int int40 = game0.countObservers();
        boolean boolean41 = game0.hasChanged();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
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
        game0.deleteObservers();
        org.jpacman.framework.model.Game game28 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player29 = game28.getPlayer();
        org.jpacman.framework.model.Player player30 = game28.getPlayer();
        game28.deleteObservers();
        boolean boolean32 = game28.won();
        org.jpacman.framework.model.Player player33 = game28.getPlayer();
        org.jpacman.framework.model.Food food34 = new org.jpacman.framework.model.Food();
        food34.setPoints(20);
        game28.addFood(food34);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = food34.getSpriteType();
        game0.addFood(food34);
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
        org.junit.Assert.assertNull(player29);
        org.junit.Assert.assertNull(player30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(player33);
        org.junit.Assert.assertTrue("'" + spriteType38 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType38.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
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
        player5.die();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
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
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile((int) '#', (int) (byte) 10);
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        int int21 = player18.getPoints();
        int int23 = player18.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = player18.getSpriteType();
        java.lang.String str25 = player18.toString();
        boolean boolean26 = tile17.containsSprite((org.jpacman.framework.model.Sprite) player18);
// flaky:         pointManager0.consumePointsOnBoard(player18, 9);
        pointManager0.addPointsToBoard(46);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 62 + "'", int23 == 62);
        org.junit.Assert.assertTrue("'" + spriteType24 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType24.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "PLAYER occupying null" + "'", str25.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.totalFoodInGame();
        int int4 = pointManager2.getFoodEaten();
        pointManager2.addPointsToBoard(100);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
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
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game0.getBoardInspector();
        boolean boolean15 = game0.hasChanged();
        java.util.Observer observer16 = null;
        game0.deleteObserver(observer16);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        int int10 = game0.countObservers();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(board9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(62, 10);
        int int3 = board2.getWidth();
        org.jpacman.framework.model.Tile tile6 = board2.tileAt(10, 0);
        java.lang.String str7 = tile6.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertNotNull(tile6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[10,0]" + "'", str7.equals("[10,0]"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        boolean boolean8 = board2.withinBorders(20, (int) (byte) 10);
        int int9 = board2.getHeight();
        org.jpacman.framework.model.Tile tile12 = new org.jpacman.framework.model.Tile(20, (int) (short) 100);
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        boolean boolean16 = player13.isAlive();
        player13.die();
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        boolean boolean21 = player18.isAlive();
        org.jpacman.framework.model.Tile tile24 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int25 = tile24.getX();
        int int26 = tile24.getX();
        int int27 = tile24.getX();
        player18.occupy(tile24);
        player13.occupy(tile24);
        org.jpacman.framework.model.Direction direction30 = org.jpacman.framework.model.Direction.LEFT;
        int int31 = direction30.getDx();
        player13.setDirection(direction30);
        try {
            org.jpacman.framework.model.Tile tile33 = null; // flaky: board2.tileAtDirection(tile12, direction30);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + direction30 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction30.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        java.lang.String str2 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor3 = level0.parseMap();
        java.lang.Class<?> wildcardClass4 = iGameInteractor3.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "board.txt" + "'", str2.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        java.util.Observer observer2 = null;
        game0.deleteObserver(observer2);
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getHeight();
        game0.setBoard(board6);
        org.jpacman.framework.model.Player player9 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager10 = game0.getPointManager();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNotNull(pointManager10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        int int5 = game0.countObservers();
        int int6 = game0.countObservers();
        org.jpacman.framework.model.Board board7 = game0.getBoard();
        java.util.Observer observer8 = null;
        try {
// flaky:             game0.attach(observer8);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(board7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        org.jpacman.framework.factory.IGameFactory iGameFactory5 = null;
// flaky:         level0.setFactory(iGameFactory5);
        org.jpacman.framework.model.Game game7 = level0.getGame();
        level0.setMapFile("board.txt");
        org.jpacman.framework.model.Game game10 = level0.getGame();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertNotNull(game10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
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
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        boolean boolean30 = player27.isAlive();
        game0.addPlayer(player27);
        game0.notifyObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector33 = game0.getBoardInspector();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(iBoardInspector33);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector2 = game0.getBoardInspector();
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
        int int20 = tile14.getX();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        int int23 = player21.addPoints((int) (short) 10);
        int int24 = player21.getPoints();
        int int26 = player21.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player21.getSpriteType();
        int int29 = player21.addPoints((int) (short) 10);
        player21.resurrect();
        boolean boolean31 = tile14.containsSprite((org.jpacman.framework.model.Sprite) player21);
        game0.addPlayer(player21);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNull(iBoardInspector2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 62 + "'", int26 == 62);
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 72 + "'", int29 == 72);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board8 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile11 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food12 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food12.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food12.getSpriteType();
        boolean boolean15 = tile11.containsSprite((org.jpacman.framework.model.Sprite) food12);
        java.lang.String str16 = tile11.toString();
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.RIGHT;
        int int18 = direction17.getDx();
        int int19 = direction17.getDy();
        int int20 = direction17.getDy();
        org.jpacman.framework.model.Tile tile21 = null; // flaky: board8.tileAtDirection(tile11, direction17);
        int int22 = board8.getHeight();
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int26 = tile25.getX();
        int int27 = tile25.getX();
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        int int30 = player28.addPoints((int) (short) 10);
        int int31 = player28.getPoints();
        int int33 = player28.addPoints((int) '4');
        boolean boolean34 = tile25.containsSprite((org.jpacman.framework.model.Sprite) player28);
        int int35 = tile25.getY();
        org.jpacman.framework.model.Player player36 = new org.jpacman.framework.model.Player();
        player36.die();
        player36.resurrect();
        int int39 = player36.getPoints();
        org.jpacman.framework.model.Direction direction40 = player36.getDirection();
        org.jpacman.framework.model.Tile tile41 = null; // flaky: board8.tileAtDirection(tile25, direction40);
        java.lang.String str42 = null; // flaky: tile41.toString();
        game0.notifyObservers((java.lang.Object) tile41);
        java.util.Observer observer44 = null;
        try {
            game0.addObserver(observer44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNull(iBoardInspector5);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1,100]" + "'", str16.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction17 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction17.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 62 + "'", int33 == 62);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + direction40 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction40.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile41);
// flaky:         org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[9,34]" + "'", str42.equals("[9,34]"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
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
        org.jpacman.framework.model.Player player25 = new org.jpacman.framework.model.Player();
        int int27 = player25.addPoints((int) (short) 10);
        int int29 = player25.addPoints((int) (short) 10);
        int int31 = player25.addPoints((-1));
        int int33 = player25.addPoints((int) '#');
        game0.notifyObservers((java.lang.Object) int33);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 54 + "'", int33 == 54);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertNotNull(ghostList5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(63, (int) (byte) -1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        boolean boolean4 = player0.isAlive();
        int int6 = player0.addPoints((int) (byte) 0);
        int int7 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PLAYER occupying null" + "'", str3.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        boolean boolean3 = game0.hasChanged();
        org.jpacman.framework.model.PointManager pointManager4 = game0.getPointManager();
        game0.notifyObservers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(pointManager4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        int int5 = player0.addPoints((int) (short) 0);
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(62, 10);
        game6.setBoard(board9);
        org.jpacman.framework.model.Board board13 = new org.jpacman.framework.model.Board(62, 10);
        int int14 = board13.getWidth();
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        int int21 = player18.getPoints();
        int int23 = player18.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction24 = player18.getDirection();
        int int25 = direction24.getDy();
        org.jpacman.framework.model.Tile tile26 = null; // flaky: board13.tileAtDirection(tile17, direction24);
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food30 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = food30.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = food30.getSpriteType();
        boolean boolean33 = tile29.containsSprite((org.jpacman.framework.model.Sprite) food30);
        org.jpacman.framework.model.Sprite sprite34 = tile29.topSprite();
        org.jpacman.framework.model.Tile tile37 = null; // flaky: board13.tileAtOffset(tile29, 100, (int) '4');
        org.jpacman.framework.model.Direction direction38 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile39 = null; // flaky: board9.tileAtDirection(tile37, direction38);
        player0.setDirection(direction38);
        org.jpacman.framework.model.PointManager pointManager41 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager42 = new org.jpacman.framework.model.PointManager();
        pointManager42.addPointsToBoard((int) (byte) 10);
        int int45 = pointManager42.totalFoodInGame();
        org.jpacman.framework.model.Player player46 = new org.jpacman.framework.model.Player();
        int int48 = player46.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = player46.getSpriteType();
        java.lang.String str50 = player46.toString();
// flaky:         pointManager42.consumePointsOnBoard(player46, 72);
// flaky:         pointManager41.consumePointsOnBoard(player46, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = player46.getSpriteType();
        org.jpacman.framework.model.Direction direction56 = player46.getDirection();
        player0.setDirection(direction56);
        org.jpacman.framework.model.Direction direction58 = player0.getDirection();
        int int59 = direction58.getDx();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 62 + "'", int23 == 62);
        org.junit.Assert.assertTrue("'" + direction24 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction24.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile26);
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sprite34);
// flaky:         org.junit.Assert.assertNotNull(tile37);
        org.junit.Assert.assertTrue("'" + direction38 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction38.equals(org.jpacman.framework.model.Direction.RIGHT));
// flaky:         org.junit.Assert.assertNotNull(tile39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + spriteType49 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType49.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "PLAYER occupying null" + "'", str50.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + spriteType55 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType55.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction56 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction56.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + direction58 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction58.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        int int13 = player5.addPoints(0);
        player5.resurrect();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        boolean boolean18 = player15.isAlive();
        int int20 = player15.addPoints((int) (short) 0);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = player15.getSpriteType();
        org.jpacman.framework.model.Direction direction22 = player15.getDirection();
        player5.setDirection(direction22);
        int int24 = direction22.getDy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 62 + "'", int10 == 62);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 62 + "'", int13 == 62);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction22 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction22.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
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
        org.jpacman.framework.model.Player player14 = null;
        game13.addPlayer(player14);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FOOD occupying null" + "'", str10.equals("FOOD occupying null"));
        org.junit.Assert.assertNotNull(game13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board((int) (byte) 0, (int) '4');
        int int3 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
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
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int19 = tile18.getX();
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        int int23 = board22.getHeight();
        org.jpacman.framework.model.Player player24 = new org.jpacman.framework.model.Player();
        int int26 = player24.addPoints((int) (short) 10);
        int int27 = player24.getPoints();
        boolean boolean28 = player24.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = player24.getSpriteType();
        org.jpacman.framework.model.Player player30 = new org.jpacman.framework.model.Player();
        player30.die();
        player30.resurrect();
        org.jpacman.framework.model.Player player33 = new org.jpacman.framework.model.Player();
        int int35 = player33.addPoints((int) (short) 10);
        boolean boolean36 = player33.isAlive();
        player33.die();
        org.jpacman.framework.model.Player player38 = new org.jpacman.framework.model.Player();
        int int40 = player38.addPoints((int) (short) 10);
        boolean boolean41 = player38.isAlive();
        org.jpacman.framework.model.Tile tile44 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int45 = tile44.getX();
        int int46 = tile44.getX();
        int int47 = tile44.getX();
        player38.occupy(tile44);
        player33.occupy(tile44);
        player30.occupy(tile44);
        player24.occupy(tile44);
        org.jpacman.framework.model.Player player52 = new org.jpacman.framework.model.Player();
        int int54 = player52.addPoints((int) (short) 10);
        boolean boolean55 = player52.isAlive();
        player52.die();
        org.jpacman.framework.model.Player player57 = new org.jpacman.framework.model.Player();
        int int59 = player57.addPoints((int) (short) 10);
        boolean boolean60 = player57.isAlive();
        org.jpacman.framework.model.Tile tile63 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int64 = tile63.getX();
        int int65 = tile63.getX();
        int int66 = tile63.getX();
        player57.occupy(tile63);
        player52.occupy(tile63);
        org.jpacman.framework.model.Direction direction69 = org.jpacman.framework.model.Direction.LEFT;
        int int70 = direction69.getDx();
        player52.setDirection(direction69);
        org.jpacman.framework.model.Tile tile72 = null; // flaky: board22.tileAtDirection(tile44, direction69);
        org.jpacman.framework.model.Tile tile73 = null; // flaky: board2.tileAtDirection(tile18, direction69);
        org.jpacman.framework.model.Player player74 = new org.jpacman.framework.model.Player();
        int int76 = player74.addPoints((int) (short) 10);
        boolean boolean77 = player74.isAlive();
        player74.die();
        org.jpacman.framework.model.Player player79 = new org.jpacman.framework.model.Player();
        int int81 = player79.addPoints((int) (short) 10);
        boolean boolean82 = player79.isAlive();
        org.jpacman.framework.model.Tile tile85 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int86 = tile85.getX();
        int int87 = tile85.getX();
        int int88 = tile85.getX();
        player79.occupy(tile85);
        player74.occupy(tile85);
        player74.resurrect();
        boolean boolean92 = false; // flaky: tile73.containsSprite((org.jpacman.framework.model.Sprite) player74);
        java.lang.String str93 = null; // flaky: tile73.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + spriteType29 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType29.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + direction69 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction69.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
// flaky:         org.junit.Assert.assertNotNull(tile72);
// flaky:         org.junit.Assert.assertNotNull(tile73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
// flaky:         org.junit.Assert.assertTrue("'" + str93 + "' != '" + "[9,9]" + "'", str93.equals("[9,9]"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(20, (int) (short) 10);
        java.lang.String str3 = tile2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[20,10]" + "'", str3.equals("[20,10]"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(23, 204);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.hasChanged();
        int int7 = game0.countObservers();
        org.jpacman.framework.model.Board board8 = game0.getBoard();
        java.util.Observer observer9 = null;
        try {
            game0.addObserver(observer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(board8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        int int3 = board2.getHeight();
        boolean boolean6 = board2.withinBorders((int) '4', (int) (short) -1);
        boolean boolean9 = board2.withinBorders(19, 94);
        int int10 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        boolean boolean9 = player0.isAlive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(0, 20);
        int int7 = board6.getHeight();
        int int8 = board6.getWidth();
        int int9 = board6.getWidth();
        int int10 = board6.getWidth();
        game0.setBoard(board6);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        java.lang.Object obj7 = null;
        game0.notifyObservers(obj7);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game0.getGhosts();
        org.jpacman.framework.model.PointManager pointManager10 = game0.getPointManager();
        java.util.Observer observer11 = null;
        try {
            game0.addObserver(observer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertNotNull(ghostList9);
        org.junit.Assert.assertNotNull(pointManager10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.hasChanged();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        int int10 = board9.getWidth();
        boolean boolean13 = board9.withinBorders(100, 94);
        int int14 = board9.getHeight();
        game0.setBoard(board9);
        int int16 = board9.getHeight();
        try {
            org.jpacman.framework.model.Sprite sprite19 = null; // flaky: board9.spriteAt(35, 61);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food10.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food10.getSpriteType();
        boolean boolean13 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food10);
        java.lang.String str14 = tile9.toString();
        org.jpacman.framework.model.Direction direction15 = org.jpacman.framework.model.Direction.RIGHT;
        int int16 = direction15.getDx();
        int int17 = direction15.getDy();
        int int18 = direction15.getDy();
        org.jpacman.framework.model.Tile tile19 = null; // flaky: board6.tileAtDirection(tile9, direction15);
        int int20 = board6.getHeight();
        boolean boolean23 = board6.withinBorders((int) ' ', (int) '#');
        game0.setBoard(board6);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,100]" + "'", str14.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction15 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction15.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
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
        org.jpacman.framework.model.Game game14 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList15 = game14.getGhosts();
        game14.notifyObservers();
        boolean boolean17 = game14.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game14.getGhosts();
        org.jpacman.framework.model.Board board19 = game14.getBoard();
        boolean boolean20 = game14.won();
        org.jpacman.framework.model.Food food21 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food21.getSpriteType();
        food21.setPoints((int) (byte) -1);
// flaky:         game14.addFood(food21);
        boolean boolean26 = tile7.containsSprite((org.jpacman.framework.model.Sprite) food21);
        java.lang.String str27 = food21.toString();
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
        org.junit.Assert.assertNotNull(ghostList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ghostList18);
        org.junit.Assert.assertNull(board19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "FOOD occupying null" + "'", str27.equals("FOOD occupying null"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        int int16 = board9.getWidth();
        try {
            org.jpacman.framework.model.Tile tile19 = null; // flaky: board9.tileAt(45, 156);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ghostList4);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(21, (int) (short) 0);
        java.lang.String str3 = tile2.toString();
        int int4 = tile2.getX();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[21,0]" + "'", str3.equals("[21,0]"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        level0.setMapFile("[-1,100]");
        org.jpacman.framework.model.Game game11 = level0.getGame();
        boolean boolean12 = game11.died();
        java.util.Observer observer13 = null;
        try {
            game11.addObserver(observer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        org.jpacman.framework.model.PointManager pointManager13 = new org.jpacman.framework.model.PointManager();
        pointManager13.addPointsToBoard((int) (byte) 10);
        int int16 = pointManager13.totalFoodInGame();
        org.jpacman.framework.model.Player player17 = new org.jpacman.framework.model.Player();
        int int19 = player17.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType20 = player17.getSpriteType();
        java.lang.String str21 = player17.toString();
// flaky:         pointManager13.consumePointsOnBoard(player17, 72);
        int int24 = pointManager13.getFoodEaten();
        org.jpacman.framework.model.Player player25 = new org.jpacman.framework.model.Player();
        player25.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = player25.getSpriteType();
        boolean boolean28 = player25.isAlive();
        player25.resurrect();
        pointManager13.consumePointsOnBoard(player25, (int) (byte) 10);
        game0.notifyObservers((java.lang.Object) pointManager13);
        org.jpacman.framework.model.Board board33 = game0.getBoard();
        org.jpacman.framework.model.Game game34 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player35 = game34.getPlayer();
        org.jpacman.framework.model.Player player36 = game34.getPlayer();
        org.jpacman.framework.model.Board board37 = game34.getBoard();
        int int38 = game34.countObservers();
        org.jpacman.framework.model.Game game39 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player40 = game39.getPlayer();
        org.jpacman.framework.model.PointManager pointManager41 = game39.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList42 = game39.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector43 = game39.getBoardInspector();
        boolean boolean44 = game39.hasChanged();
        org.jpacman.framework.model.Game game45 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player46 = game45.getPlayer();
        boolean boolean47 = game45.won();
        org.jpacman.framework.model.Tile tile50 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int51 = tile50.getX();
        int int52 = tile50.getX();
        org.jpacman.framework.model.Food food53 = new org.jpacman.framework.model.Food();
        int int54 = food53.getPoints();
        int int55 = food53.getPoints();
        boolean boolean56 = tile50.containsSprite((org.jpacman.framework.model.Sprite) food53);
        int int57 = food53.getPoints();
        game45.addFood(food53);
        org.jpacman.framework.model.Ghost ghost59 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType60 = ghost59.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType61 = ghost59.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType62 = ghost59.getSpriteType();
        game45.addGhost(ghost59);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType64 = ghost59.getSpriteType();
        game39.addGhost(ghost59);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType66 = ghost59.getSpriteType();
        game34.addGhost(ghost59);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType68 = ghost59.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType69 = ghost59.getSpriteType();
        game0.notifyObservers((java.lang.Object) spriteType69);
        org.jpacman.framework.model.Game game71 = new org.jpacman.framework.model.Game();
        game71.deleteObservers();
        int int73 = game71.countObservers();
        java.util.Observer observer74 = null;
        game71.deleteObserver(observer74);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList76 = game71.getGhosts();
        org.jpacman.framework.model.Ghost ghost77 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType78 = ghost77.getSpriteType();
        game71.addGhost(ghost77);
        game0.addGhost(ghost77);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + spriteType20 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType20.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "PLAYER occupying null" + "'", str21.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + spriteType27 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType27.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(board33);
        org.junit.Assert.assertNull(player35);
        org.junit.Assert.assertNull(player36);
        org.junit.Assert.assertNull(board37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(player40);
        org.junit.Assert.assertNotNull(pointManager41);
        org.junit.Assert.assertNotNull(ghostList42);
        org.junit.Assert.assertNull(iBoardInspector43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(player46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + spriteType60 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType60.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType61 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType61.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType62 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType62.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType64 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType64.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType66 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType66.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType68 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType68.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType69 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType69.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(ghostList76);
        org.junit.Assert.assertTrue("'" + spriteType78 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType78.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        boolean boolean5 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game0.getGhosts();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.Player player9 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector10 = game7.getBoardInspector();
        game7.deleteObservers();
        org.jpacman.framework.model.Board board12 = game7.getBoard();
        org.jpacman.framework.model.Player player13 = game7.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector14 = game7.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager15 = new org.jpacman.framework.model.PointManager();
        pointManager15.addPointsToBoard((int) (byte) 10);
        int int18 = pointManager15.totalFoodInGame();
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player19.getSpriteType();
        java.lang.String str23 = player19.toString();
// flaky:         pointManager15.consumePointsOnBoard(player19, 72);
        int int26 = pointManager15.getFoodEaten();
        pointManager15.addPointsToBoard((int) (short) 100);
        game7.notifyObservers((java.lang.Object) (short) 100);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int33 = tile32.getX();
        int int34 = tile32.getX();
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        int int37 = player35.addPoints((int) (short) 10);
        int int38 = player35.getPoints();
        int int40 = player35.addPoints((int) '4');
        boolean boolean41 = tile32.containsSprite((org.jpacman.framework.model.Sprite) player35);
        player35.resurrect();
        player35.resurrect();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = player35.getSpriteType();
        game7.addPlayer(player35);
        game0.notifyObservers((java.lang.Object) player35);
        org.jpacman.framework.model.Direction direction47 = null;
        player35.setDirection(direction47);
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(player4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ghostList6);
        org.junit.Assert.assertNull(player8);
        org.junit.Assert.assertNull(player9);
        org.junit.Assert.assertNull(iBoardInspector10);
        org.junit.Assert.assertNull(board12);
        org.junit.Assert.assertNull(player13);
        org.junit.Assert.assertNull(iBoardInspector14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PLAYER occupying null" + "'", str23.equals("PLAYER occupying null"));
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 72 + "'", int26 == 72);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 62 + "'", int40 == 62);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + spriteType44 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType44.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
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
        level0.setMapFile("[-1,20]");
        java.lang.String str15 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(game10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1,20]" + "'", str15.equals("[-1,20]"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
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
        org.jpacman.framework.model.Board board31 = game0.getBoard();
        org.jpacman.framework.model.IBoardInspector iBoardInspector32 = game0.getBoardInspector();
        org.jpacman.framework.model.PointManager pointManager33 = new org.jpacman.framework.model.PointManager();
        boolean boolean34 = pointManager33.allEaten();
        int int35 = pointManager33.totalFoodInGame();
        int int36 = pointManager33.getFoodEaten();
        int int37 = pointManager33.totalFoodInGame();
        pointManager33.addPointsToBoard((int) (short) 100);
        int int40 = pointManager33.totalFoodInGame();
        org.jpacman.framework.model.Game game41 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player42 = game41.getPlayer();
        org.jpacman.framework.model.PointManager pointManager43 = game41.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList44 = game41.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector45 = game41.getBoardInspector();
        boolean boolean46 = game41.hasChanged();
        org.jpacman.framework.model.Game game47 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player48 = game47.getPlayer();
        boolean boolean49 = game47.won();
        org.jpacman.framework.model.Tile tile52 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int53 = tile52.getX();
        int int54 = tile52.getX();
        org.jpacman.framework.model.Food food55 = new org.jpacman.framework.model.Food();
        int int56 = food55.getPoints();
        int int57 = food55.getPoints();
        boolean boolean58 = tile52.containsSprite((org.jpacman.framework.model.Sprite) food55);
        int int59 = food55.getPoints();
        game47.addFood(food55);
        org.jpacman.framework.model.Ghost ghost61 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType62 = ghost61.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType63 = ghost61.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType64 = ghost61.getSpriteType();
        game47.addGhost(ghost61);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType66 = ghost61.getSpriteType();
        game41.addGhost(ghost61);
        org.jpacman.framework.model.Player player68 = new org.jpacman.framework.model.Player();
        int int70 = player68.addPoints((int) (short) 10);
        boolean boolean71 = player68.isAlive();
        game41.addPlayer(player68);
        pointManager33.consumePointsOnBoard(player68, 52);
        game0.notifyObservers((java.lang.Object) player68);
        org.jpacman.framework.model.PointManager pointManager76 = new org.jpacman.framework.model.PointManager();
        boolean boolean77 = pointManager76.allEaten();
        int int78 = pointManager76.totalFoodInGame();
        int int79 = pointManager76.getFoodEaten();
        org.jpacman.framework.model.Player player80 = new org.jpacman.framework.model.Player();
        int int82 = player80.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType83 = player80.getSpriteType();
        org.jpacman.framework.model.Direction direction84 = org.jpacman.framework.model.Direction.LEFT;
        int int85 = direction84.getDx();
        player80.setDirection(direction84);
// flaky:         pointManager76.consumePointsOnBoard(player80, 94);
        java.lang.String str89 = player80.toString();
        player80.resurrect();
        java.lang.String str91 = player80.toString();
        game0.addPlayer(player80);
        org.jpacman.framework.model.Direction direction93 = player80.getDirection();
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
        org.junit.Assert.assertNull(board31);
        org.junit.Assert.assertNull(iBoardInspector32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNull(player42);
        org.junit.Assert.assertNotNull(pointManager43);
        org.junit.Assert.assertNotNull(ghostList44);
        org.junit.Assert.assertNull(iBoardInspector45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(player48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + spriteType62 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType62.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType63 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType63.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType64 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType64.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType66 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType66.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertTrue("'" + spriteType83 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType83.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction84 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction84.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "PLAYER occupying null" + "'", str89.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "PLAYER occupying null" + "'", str91.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction93 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction93.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        int int1 = pointManager0.getFoodEaten();
        int int2 = pointManager0.totalFoodInGame();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        org.jpacman.framework.model.Tile tile9 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food10 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = food10.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = food10.getSpriteType();
        boolean boolean13 = tile9.containsSprite((org.jpacman.framework.model.Sprite) food10);
        org.jpacman.framework.model.Sprite sprite14 = tile9.topSprite();
        player3.occupy(tile9);
        org.jpacman.framework.model.Tile tile18 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player3.occupy(tile18);
// flaky:         pointManager0.consumePointsOnBoard(player3, (int) (byte) 1);
        int int22 = pointManager0.getFoodEaten();
        int int23 = pointManager0.getFoodEaten();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType12 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType12.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sprite14);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
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
        int int14 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PLAYER occupying null" + "'", str9.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.PointManager pointManager4 = game3.getPointManager();
        org.jpacman.framework.model.PointManager pointManager5 = game3.getPointManager();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game3);
        org.junit.Assert.assertNotNull(pointManager4);
        org.junit.Assert.assertNotNull(pointManager5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int4 = player0.addPoints((int) (short) 10);
        int int6 = player0.addPoints((-1));
        int int8 = player0.addPoints((int) '#');
        boolean boolean9 = player0.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = player0.getSpriteType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 54 + "'", int8 == 54);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
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
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        player15.die();
        player15.resurrect();
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int21 = tile20.getX();
        org.jpacman.framework.model.Sprite sprite22 = tile20.topSprite();
        player15.occupy(tile20);
        int int24 = player15.getPoints();
        int int26 = player15.addPoints(72);
        game0.addPlayer(player15);
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(sprite22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 72 + "'", int26 == 72);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
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
        org.jpacman.framework.model.Game game23 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player24 = game23.getPlayer();
        org.jpacman.framework.model.Board board25 = game23.getBoard();
        org.jpacman.framework.model.Ghost ghost26 = new org.jpacman.framework.model.Ghost();
        game23.addGhost(ghost26);
        org.jpacman.framework.model.Tile tile30 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        ghost26.occupy(tile30);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType32 = ghost26.getSpriteType();
        java.lang.String str33 = ghost26.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost26.getSpriteType();
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food38 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = food38.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = food38.getSpriteType();
        boolean boolean41 = tile37.containsSprite((org.jpacman.framework.model.Sprite) food38);
        java.lang.String str42 = tile37.toString();
        java.lang.String str43 = tile37.toString();
        org.jpacman.framework.model.Sprite sprite44 = tile37.topSprite();
// flaky:         ghost26.occupy(tile37);
        org.jpacman.framework.model.Player player46 = new org.jpacman.framework.model.Player();
        int int48 = player46.addPoints((int) (short) 10);
        boolean boolean49 = player46.isAlive();
        org.jpacman.framework.model.Tile tile52 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int53 = tile52.getX();
        int int54 = tile52.getX();
        int int55 = tile52.getX();
        player46.occupy(tile52);
        java.lang.String str57 = tile52.toString();
// flaky:         ghost26.occupy(tile52);
        game0.addGhost(ghost26);
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
        org.junit.Assert.assertNull(player24);
        org.junit.Assert.assertNull(board25);
        org.junit.Assert.assertTrue("'" + spriteType32 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType32.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "GHOST occupying [-1,20]" + "'", str33.equals("GHOST occupying [-1,20]"));
        org.junit.Assert.assertTrue("'" + spriteType34 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType34.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType39 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType39.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "[-1,100]" + "'", str42.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[-1,100]" + "'", str43.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[10,-1]" + "'", str57.equals("[10,-1]"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        org.jpacman.framework.model.Game game9 = level0.getGame();
        org.jpacman.framework.model.Player player10 = game9.getPlayer();
        player10.resurrect();
        java.lang.Class<?> wildcardClass12 = player10.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game9);
        org.junit.Assert.assertNotNull(player10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
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
        boolean boolean49 = board9.withinBorders(107, 9);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(54, (int) '4');
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = null; // flaky: board2.spriteTypeAt(46, (int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.PointManager pointManager6 = game0.getPointManager();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board10 = new org.jpacman.framework.model.Board(104, 100);
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(73, (int) (short) 10);
        org.jpacman.framework.model.Direction direction14 = org.jpacman.framework.model.Direction.RIGHT;
        int int15 = direction14.getDx();
        int int16 = direction14.getDx();
        org.jpacman.framework.model.Tile tile17 = board10.tileAtDirection(tile13, direction14);
        game0.setBoard(board10);
        int int19 = board10.getHeight();
        int int20 = board10.getHeight();
        int int21 = board10.getHeight();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pointManager6);
        org.junit.Assert.assertTrue("'" + direction14 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction14.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(tile17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        boolean boolean6 = game0.hasChanged();
        game0.deleteObservers();
        int int8 = game0.countObservers();
        org.jpacman.framework.model.Game game9 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player10 = game9.getPlayer();
        org.jpacman.framework.model.PointManager pointManager11 = game9.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList12 = game9.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector13 = game9.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList14 = game9.getGhosts();
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
        game9.addGhost(ghost29);
        game0.addGhost(ghost29);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(player10);
        org.junit.Assert.assertNotNull(pointManager11);
        org.junit.Assert.assertNotNull(ghostList12);
        org.junit.Assert.assertNull(iBoardInspector13);
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
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
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
        org.jpacman.framework.model.Tile tile32 = board2.tileAt((int) (short) 1, 1);
        try {
            org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = null; // flaky: board2.spriteTypeAt(37, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
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
        org.junit.Assert.assertNotNull(tile32);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
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
        player0.resurrect();
        int int21 = player0.getPoints();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + spriteType8 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType8.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sprite11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(tile19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104 + "'", int21 == 104);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        int int9 = player0.getPoints();
        int int11 = player0.addPoints((int) '#');
        player0.resurrect();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 72 + "'", int8 == 72);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 72 + "'", int9 == 72);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 107 + "'", int11 == 107);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean8 = board5.withinBorders((int) (byte) 10, (int) '4');
        int int9 = board5.getHeight();
        int int10 = board5.getHeight();
        int int11 = board5.getWidth();
        game0.setBoard(board5);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList13 = game0.getGhosts();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(ghostList13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        boolean boolean1 = pointManager0.allEaten();
        int int2 = pointManager0.getFoodEaten();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        int int6 = player3.getPoints();
        int int8 = player3.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player3.getSpriteType();
        int int11 = player3.addPoints((int) (short) 10);
        int int12 = player3.getPoints();
        pointManager0.consumePointsOnBoard(player3, (int) (byte) 0);
        int int15 = pointManager0.totalFoodInGame();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 72 + "'", int11 == 72);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = game0.getClass();
        boolean boolean4 = game0.hasChanged();
        int int5 = game0.countObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector6 = game0.getBoardInspector();
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(iBoardInspector6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
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
        try {
            org.jpacman.framework.model.Sprite sprite29 = null; // flaky: board2.spriteAt(82, (int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82");
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
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
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
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food21 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = food21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = food21.getSpriteType();
        boolean boolean24 = tile20.containsSprite((org.jpacman.framework.model.Sprite) food21);
        org.jpacman.framework.model.Sprite sprite25 = tile20.topSprite();
        player14.occupy(tile20);
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile(10, (int) 'a');
// flaky:         player14.occupy(tile29);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = player14.getSpriteType();
        java.lang.Class<?> wildcardClass32 = player14.getClass();
        boolean boolean33 = false; // flaky: tile13.containsSprite((org.jpacman.framework.model.Sprite) player14);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType23 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType23.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(sprite25);
        org.junit.Assert.assertTrue("'" + spriteType31 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType31.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 46);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        org.jpacman.framework.model.Game game7 = level0.getGame();
        java.lang.String str8 = level0.getMapFile();
        java.lang.String str9 = level0.getMapFile();
        org.jpacman.framework.factory.IGameFactory iGameFactory10 = null;
// flaky:         level0.setFactory(iGameFactory10);
        org.jpacman.framework.model.Game game12 = level0.getGame();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "board.txt" + "'", str1.equals("board.txt"));
        org.junit.Assert.assertNotNull(iGameInteractor2);
        org.junit.Assert.assertNotNull(game7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "board.txt" + "'", str8.equals("board.txt"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "board.txt" + "'", str9.equals("board.txt"));
        org.junit.Assert.assertNotNull(game12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        org.jpacman.framework.model.IBoardInspector iBoardInspector23 = game3.getBoardInspector();
        org.jpacman.framework.model.Game game24 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player25 = game24.getPlayer();
        org.jpacman.framework.model.PointManager pointManager26 = game24.getPointManager();
        int int27 = pointManager26.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager28 = new org.jpacman.framework.model.PointManager();
        boolean boolean29 = pointManager28.allEaten();
        int int30 = pointManager28.totalFoodInGame();
        int int31 = pointManager28.getFoodEaten();
        org.jpacman.framework.model.Player player32 = new org.jpacman.framework.model.Player();
        int int34 = player32.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = player32.getSpriteType();
        org.jpacman.framework.model.Direction direction36 = org.jpacman.framework.model.Direction.LEFT;
        int int37 = direction36.getDx();
        player32.setDirection(direction36);
// flaky:         pointManager28.consumePointsOnBoard(player32, 94);
// flaky:         pointManager26.consumePointsOnBoard(player32, 100);
        player32.die();
        org.jpacman.framework.model.Tile tile44 = player32.getTile();
        int int45 = player32.getPoints();
        game3.addPlayer(player32);
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
        org.junit.Assert.assertNotNull(iBoardInspector23);
        org.junit.Assert.assertNull(player25);
        org.junit.Assert.assertNotNull(pointManager26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + spriteType35 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType35.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction36 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction36.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(tile44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 204 + "'", int45 == 204);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board6 = game5.getBoard();
        game5.notifyObservers();
        org.jpacman.framework.model.Board board10 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean13 = board10.withinBorders((int) (byte) 10, (int) '4');
        int int14 = board10.getHeight();
        int int15 = board10.getHeight();
        int int16 = board10.getWidth();
        game5.setBoard(board10);
        org.jpacman.framework.model.IBoardInspector iBoardInspector18 = game5.getBoardInspector();
        org.jpacman.framework.model.Board board21 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile24 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite25 = tile24.topSprite();
        int int26 = tile24.getY();
        org.jpacman.framework.model.Tile tile29 = null; // flaky: board21.tileAtOffset(tile24, 100, 1);
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player33 = new org.jpacman.framework.model.Player();
        player33.die();
        player33.resurrect();
        org.jpacman.framework.model.Tile tile38 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food39 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = food39.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType41 = food39.getSpriteType();
        boolean boolean42 = tile38.containsSprite((org.jpacman.framework.model.Sprite) food39);
        java.lang.String str43 = tile38.toString();
        java.lang.String str44 = tile38.toString();
        org.jpacman.framework.model.Sprite sprite45 = tile38.topSprite();
        player33.occupy(tile38);
        org.jpacman.framework.model.Direction direction47 = player33.getDirection();
        org.jpacman.framework.model.Tile tile48 = null; // flaky: board21.tileAtDirection(tile32, direction47);
        org.jpacman.framework.model.Tile tile51 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile54 = null; // flaky: board21.tileAtOffset(tile51, (int) (short) 10, 35);
        game5.setBoard(board21);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList56 = game5.getGhosts();
        int int57 = game5.countObservers();
        game0.notifyObservers((java.lang.Object) int57);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNull(board6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(iBoardInspector18);
        org.junit.Assert.assertNull(sprite25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
// flaky:         org.junit.Assert.assertNotNull(tile29);
        org.junit.Assert.assertTrue("'" + spriteType40 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType40.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType41 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType41.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[-1,100]" + "'", str43.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[-1,100]" + "'", str44.equals("[-1,100]"));
        org.junit.Assert.assertNull(sprite45);
        org.junit.Assert.assertTrue("'" + direction47 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction47.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile48);
// flaky:         org.junit.Assert.assertNotNull(tile54);
        org.junit.Assert.assertNotNull(ghostList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.won();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        org.jpacman.framework.model.Direction direction9 = player0.getDirection();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 62 + "'", int5 == 62);
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "PLAYER occupying null" + "'", str7.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + direction9 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction9.equals(org.jpacman.framework.model.Direction.LEFT));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
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
        boolean boolean31 = game0.won();
        org.jpacman.framework.model.Board board32 = game0.getBoard();
        org.jpacman.framework.model.IBoardInspector iBoardInspector33 = game0.getBoardInspector();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(board32);
        org.junit.Assert.assertNull(iBoardInspector33);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game0.getPointManager();
        pointManager7.addPointsToBoard(0);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertNotNull(ghostList3);
        org.junit.Assert.assertNull(iBoardInspector4);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertNull(player6);
        org.junit.Assert.assertNotNull(pointManager7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = ghost2.getSpriteType();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertTrue("'" + spriteType4 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType4.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType5 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType5.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
        org.junit.Assert.assertTrue("'" + spriteType6 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST + "'", spriteType6.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.GHOST));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        player0.resurrect();
        org.jpacman.framework.model.Tile tile7 = new org.jpacman.framework.model.Tile(46, (int) '4');
        player0.occupy(tile7);
        org.junit.Assert.assertTrue("'" + spriteType2 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType2.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders(100, 10);
        boolean boolean8 = board2.withinBorders(0, 114);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
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
        boolean boolean19 = board2.withinBorders(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
        org.junit.Assert.assertTrue("'" + direction13 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction13.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 62 + "'", int16 == 62);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean6 = board3.withinBorders((int) (byte) 10, (int) '4');
        int int7 = board3.getHeight();
        game0.setBoard(board3);
        boolean boolean9 = game0.hasChanged();
        org.jpacman.framework.model.Player player10 = game0.getPlayer();
        java.util.Observer observer11 = null;
        game0.deleteObserver(observer11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(player10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        org.jpacman.framework.model.Board board2 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean5 = board2.withinBorders((int) (byte) 10, (int) '4');
        int int6 = board2.getHeight();
        int int7 = board2.getHeight();
        int int8 = board2.getHeight();
        int int9 = board2.getHeight();
        int int10 = board2.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        level0.setMapFile("[-1,100]");
        java.lang.String str3 = level0.getMapFile();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[-1,100]" + "'", str3.equals("[-1,100]"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        boolean boolean6 = player3.isAlive();
        org.jpacman.framework.model.Direction direction7 = player3.getDirection();
        player3.die();
        game0.addPlayer(player3);
        org.jpacman.framework.model.Board board12 = new org.jpacman.framework.model.Board(19, 35);
        int int13 = board12.getHeight();
        org.jpacman.framework.model.Game game14 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player15 = game14.getPlayer();
        org.jpacman.framework.model.PointManager pointManager16 = game14.getPointManager();
        int int17 = pointManager16.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager18 = new org.jpacman.framework.model.PointManager();
        boolean boolean19 = pointManager18.allEaten();
        int int20 = pointManager18.totalFoodInGame();
        int int21 = pointManager18.getFoodEaten();
        org.jpacman.framework.model.Player player22 = new org.jpacman.framework.model.Player();
        int int24 = player22.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = player22.getSpriteType();
        org.jpacman.framework.model.Direction direction26 = org.jpacman.framework.model.Direction.LEFT;
        int int27 = direction26.getDx();
        player22.setDirection(direction26);
// flaky:         pointManager18.consumePointsOnBoard(player22, 94);
// flaky:         pointManager16.consumePointsOnBoard(player22, 100);
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int36 = tile35.getX();
        int int37 = tile35.getX();
        int int38 = tile35.getX();
        java.lang.String str39 = tile35.toString();
        java.lang.String str40 = tile35.toString();
        player22.occupy(tile35);
        org.jpacman.framework.model.Board board44 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile47 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food48 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = food48.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType50 = food48.getSpriteType();
        boolean boolean51 = tile47.containsSprite((org.jpacman.framework.model.Sprite) food48);
        java.lang.String str52 = tile47.toString();
        org.jpacman.framework.model.Direction direction53 = org.jpacman.framework.model.Direction.RIGHT;
        int int54 = direction53.getDx();
        int int55 = direction53.getDy();
        int int56 = direction53.getDy();
        org.jpacman.framework.model.Tile tile57 = null; // flaky: board44.tileAtDirection(tile47, direction53);
        int int58 = board44.getHeight();
        org.jpacman.framework.model.Tile tile61 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int62 = tile61.getX();
        int int63 = tile61.getX();
        org.jpacman.framework.model.Player player64 = new org.jpacman.framework.model.Player();
        int int66 = player64.addPoints((int) (short) 10);
        int int67 = player64.getPoints();
        int int69 = player64.addPoints((int) '4');
        boolean boolean70 = tile61.containsSprite((org.jpacman.framework.model.Sprite) player64);
        int int71 = tile61.getY();
        org.jpacman.framework.model.Player player72 = new org.jpacman.framework.model.Player();
        player72.die();
        player72.resurrect();
        int int75 = player72.getPoints();
        org.jpacman.framework.model.Direction direction76 = player72.getDirection();
        org.jpacman.framework.model.Tile tile77 = null; // flaky: board44.tileAtDirection(tile61, direction76);
        org.jpacman.framework.model.Tile tile78 = null; // flaky: board12.tileAtDirection(tile35, direction76);
        game0.notifyObservers((java.lang.Object) board12);
        java.util.Observer observer80 = null;
        try {
// flaky:             game0.attach(observer80);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction7.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(player15);
        org.junit.Assert.assertNotNull(pointManager16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + spriteType25 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType25.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction26 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction26.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[10,-1]" + "'", str39.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[10,-1]" + "'", str40.equals("[10,-1]"));
        org.junit.Assert.assertTrue("'" + spriteType49 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType49.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType50 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType50.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[-1,100]" + "'", str52.equals("[-1,100]"));
        org.junit.Assert.assertTrue("'" + direction53 + "' != '" + org.jpacman.framework.model.Direction.RIGHT + "'", direction53.equals(org.jpacman.framework.model.Direction.RIGHT));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
// flaky:         org.junit.Assert.assertNotNull(tile57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 62 + "'", int69 == 62);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + direction76 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction76.equals(org.jpacman.framework.model.Direction.LEFT));
// flaky:         org.junit.Assert.assertNotNull(tile77);
// flaky:         org.junit.Assert.assertNotNull(tile78);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Board board4 = game0.getBoard();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        player8.die();
        player8.resurrect();
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        boolean boolean14 = player11.isAlive();
        player11.die();
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        int int18 = player16.addPoints((int) (short) 10);
        boolean boolean19 = player16.isAlive();
        org.jpacman.framework.model.Tile tile22 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int23 = tile22.getX();
        int int24 = tile22.getX();
        int int25 = tile22.getX();
        player16.occupy(tile22);
        player11.occupy(tile22);
        player8.occupy(tile22);
        org.jpacman.framework.model.Direction direction29 = org.jpacman.framework.model.Direction.DOWN;
        org.jpacman.framework.model.Tile tile30 = null; // flaky: board7.tileAtDirection(tile22, direction29);
        game0.setBoard(board7);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList32 = game0.getGhosts();
        boolean boolean33 = game0.hasChanged();
        java.util.Observer observer34 = null;
        try {
// flaky:             game0.attach(observer34);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(ghostList1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertNull(board4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + direction29 + "' != '" + org.jpacman.framework.model.Direction.DOWN + "'", direction29.equals(org.jpacman.framework.model.Direction.DOWN));
// flaky:         org.junit.Assert.assertNotNull(tile30);
        org.junit.Assert.assertNotNull(ghostList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
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
        food6.setPoints(97);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = food6.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(board2);
        org.junit.Assert.assertNotNull(ghostList5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType13 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType13.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        java.util.Observer observer4 = null;
        game0.deleteObserver(observer4);
        org.junit.Assert.assertNull(board1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        boolean boolean4 = pointManager3.allEaten();
        pointManager3.addPointsToBoard(0);
        int int7 = pointManager3.totalFoodInGame();
        pointManager3.addPointsToBoard(0);
        int int10 = pointManager3.totalFoodInGame();
        org.junit.Assert.assertNull(board1);
        org.junit.Assert.assertNotNull(pointManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        int int3 = pointManager2.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager4 = new org.jpacman.framework.model.PointManager();
        boolean boolean5 = pointManager4.allEaten();
        int int6 = pointManager4.totalFoodInGame();
        int int7 = pointManager4.getFoodEaten();
        org.jpacman.framework.model.Player player8 = new org.jpacman.framework.model.Player();
        int int10 = player8.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = player8.getSpriteType();
        org.jpacman.framework.model.Direction direction12 = org.jpacman.framework.model.Direction.LEFT;
        int int13 = direction12.getDx();
        player8.setDirection(direction12);
// flaky:         pointManager4.consumePointsOnBoard(player8, 94);
// flaky:         pointManager2.consumePointsOnBoard(player8, 100);
        pointManager2.addPointsToBoard(154);
        boolean boolean21 = pointManager2.allEaten();
        org.jpacman.framework.model.Player player22 = null;
        try {
            pointManager2.consumePointsOnBoard(player22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNotNull(pointManager2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + spriteType11 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType11.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction12 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction12.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
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
        org.jpacman.framework.model.Tile tile13 = food8.getTile();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = food8.getSpriteType();
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(board3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + spriteType10 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType10.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(tile13);
        org.junit.Assert.assertTrue("'" + spriteType14 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD + "'", spriteType14.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.FOOD));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player6.getSpriteType();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.LEFT;
        int int11 = direction10.getDx();
        player6.setDirection(direction10);
        java.lang.String str13 = player6.toString();
        game0.notifyObservers((java.lang.Object) str13);
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        int int17 = player15.addPoints((int) (short) 10);
        int int18 = player15.getPoints();
        int int20 = player15.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType21 = player15.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = player15.getSpriteType();
        game0.addPlayer(player15);
        org.junit.Assert.assertNull(player1);
        org.junit.Assert.assertNull(player2);
        org.junit.Assert.assertNull(iBoardInspector3);
        org.junit.Assert.assertNull(board5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + spriteType9 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType9.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + org.jpacman.framework.model.Direction.LEFT + "'", direction10.equals(org.jpacman.framework.model.Direction.LEFT));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PLAYER occupying null" + "'", str13.equals("PLAYER occupying null"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 62 + "'", int20 == 62);
        org.junit.Assert.assertTrue("'" + spriteType21 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType21.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
        org.junit.Assert.assertTrue("'" + spriteType22 + "' != '" + org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER + "'", spriteType22.equals(org.jpacman.framework.model.IBoardInspector.SpriteType.PLAYER));
    }
}
