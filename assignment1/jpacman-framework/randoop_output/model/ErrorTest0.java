import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        player0.die();
        player0.deoccupy();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        boolean boolean3 = player0.isAlive();
        player0.deoccupy();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        boolean boolean1 = game0.died();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost2.getSpriteType();
        org.jpacman.framework.model.Direction direction6 = org.jpacman.framework.model.Direction.RIGHT;
        int int7 = direction6.getDy();
        game0.moveGhost(ghost2, direction6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.died();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        boolean boolean3 = game0.died();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = ghost2.getSpriteType();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        int int7 = player4.getPoints();
        int int9 = player4.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction10 = player4.getDirection();
        game0.moveGhost(ghost2, direction10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        food0.deoccupy();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        int int8 = player0.addPoints((int) (short) 10);
        player0.deoccupy();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Ghost ghost1 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.Direction direction2 = org.jpacman.framework.model.Direction.LEFT;
        int int3 = direction2.getDx();
        game0.moveGhost(ghost1, direction2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost3.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = ghost3.getSpriteType();
        org.jpacman.framework.model.Direction direction7 = org.jpacman.framework.model.Direction.LEFT;
        game0.moveGhost(ghost3, direction7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        boolean boolean3 = game0.died();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = game0.getClass();
        boolean boolean4 = game0.died();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
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
        org.jpacman.framework.model.Player player23 = new org.jpacman.framework.model.Player();
        player23.die();
        player23.resurrect();
        org.jpacman.framework.model.Tile tile28 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food29 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = food29.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = food29.getSpriteType();
        boolean boolean32 = tile28.containsSprite((org.jpacman.framework.model.Sprite) food29);
        java.lang.String str33 = tile28.toString();
        java.lang.String str34 = tile28.toString();
        org.jpacman.framework.model.Sprite sprite35 = tile28.topSprite();
        player23.occupy(tile28);
        org.jpacman.framework.model.Direction direction37 = player23.getDirection();
        game0.moveGhost(ghost18, direction37);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost2.getSpriteType();
        java.lang.Class<?> wildcardClass5 = ghost2.getClass();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        player6.die();
        player6.resurrect();
        java.lang.String str9 = player6.toString();
        int int10 = player6.getPoints();
        org.jpacman.framework.model.Direction direction11 = org.jpacman.framework.model.Direction.UP;
        player6.setDirection(direction11);
        game0.moveGhost(ghost2, direction11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = ghost6.getSpriteType();
        org.jpacman.framework.model.Player player9 = new org.jpacman.framework.model.Player();
        int int11 = player9.addPoints((int) (short) 10);
        int int12 = player9.getPoints();
        int int14 = player9.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction15 = player9.getDirection();
        int int16 = direction15.getDy();
        game0.moveGhost(ghost6, direction15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        boolean boolean4 = player0.isAlive();
        player0.deoccupy();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Game game2 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player3 = game2.getPlayer();
        org.jpacman.framework.model.Board board4 = game2.getBoard();
        org.jpacman.framework.model.Ghost ghost5 = new org.jpacman.framework.model.Ghost();
        game2.addGhost(ghost5);
        org.jpacman.framework.model.Player player7 = new org.jpacman.framework.model.Player();
        player7.die();
        player7.resurrect();
        int int10 = player7.getPoints();
        org.jpacman.framework.model.Direction direction11 = player7.getDirection();
        game0.moveGhost(ghost5, direction11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Direction direction6 = org.jpacman.framework.model.Direction.LEFT;
        int int7 = direction6.getDx();
        game0.movePlayer(direction6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Ghost ghost9 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = ghost9.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = ghost9.getSpriteType();
        java.lang.Class<?> wildcardClass12 = ghost9.getClass();
        org.jpacman.framework.model.Direction direction13 = org.jpacman.framework.model.Direction.RIGHT;
        int int14 = direction13.getDx();
        int int15 = direction13.getDy();
        int int16 = direction13.getDy();
        game0.moveGhost(ghost9, direction13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.died();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.died();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        ghost0.deoccupy();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        food0.setPoints((-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food0.getSpriteType();
        food0.deoccupy();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        org.jpacman.framework.model.Direction direction4 = org.jpacman.framework.model.Direction.UP;
        game0.movePlayer(direction4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = food0.getSpriteType();
        food0.deoccupy();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.DOWN;
        int int6 = direction5.getDx();
        game0.movePlayer(direction5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
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
        org.jpacman.framework.model.Board board29 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile32 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food33 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = food33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = food33.getSpriteType();
        boolean boolean36 = tile32.containsSprite((org.jpacman.framework.model.Sprite) food33);
        java.lang.String str37 = tile32.toString();
        org.jpacman.framework.model.Direction direction38 = org.jpacman.framework.model.Direction.RIGHT;
        int int39 = direction38.getDx();
        int int40 = direction38.getDy();
        int int41 = direction38.getDy();
        org.jpacman.framework.model.Tile tile42 = board29.tileAtDirection(tile32, direction38);
        int int43 = board29.getHeight();
        org.jpacman.framework.model.Tile tile46 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int47 = tile46.getX();
        int int48 = tile46.getX();
        org.jpacman.framework.model.Player player49 = new org.jpacman.framework.model.Player();
        int int51 = player49.addPoints((int) (short) 10);
        int int52 = player49.getPoints();
        int int54 = player49.addPoints((int) '4');
        boolean boolean55 = tile46.containsSprite((org.jpacman.framework.model.Sprite) player49);
        int int56 = tile46.getY();
        org.jpacman.framework.model.Player player57 = new org.jpacman.framework.model.Player();
        player57.die();
        player57.resurrect();
        int int60 = player57.getPoints();
        org.jpacman.framework.model.Direction direction61 = player57.getDirection();
        org.jpacman.framework.model.Tile tile62 = board29.tileAtDirection(tile46, direction61);
        game0.moveGhost(ghost21, direction61);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        org.jpacman.framework.model.Player player4 = new org.jpacman.framework.model.Player();
        int int6 = player4.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = player4.getSpriteType();
        org.jpacman.framework.model.Direction direction8 = org.jpacman.framework.model.Direction.LEFT;
        int int9 = direction8.getDx();
        player4.setDirection(direction8);
        game0.movePlayer(direction8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        food0.setPoints((int) (byte) 0);
        int int5 = food0.getPoints();
        food0.setPoints((int) '4');
        food0.deoccupy();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        player5.die();
        player5.resurrect();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int11 = tile10.getX();
        org.jpacman.framework.model.Sprite sprite12 = tile10.topSprite();
        player5.occupy(tile10);
        int int14 = player5.getPoints();
        org.jpacman.framework.model.Direction direction15 = player5.getDirection();
        game0.movePlayer(direction15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        org.jpacman.framework.model.PointManager pointManager5 = game3.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList6 = game3.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector7 = game3.getBoardInspector();
        boolean boolean8 = game3.hasChanged();
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
        game3.addGhost(ghost23);
        org.jpacman.framework.model.Board board32 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food36 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType37 = food36.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = food36.getSpriteType();
        boolean boolean39 = tile35.containsSprite((org.jpacman.framework.model.Sprite) food36);
        java.lang.String str40 = tile35.toString();
        org.jpacman.framework.model.Direction direction41 = org.jpacman.framework.model.Direction.RIGHT;
        int int42 = direction41.getDx();
        int int43 = direction41.getDy();
        int int44 = direction41.getDy();
        org.jpacman.framework.model.Tile tile45 = board32.tileAtDirection(tile35, direction41);
        int int46 = board32.getHeight();
        org.jpacman.framework.model.Tile tile49 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int50 = tile49.getX();
        int int51 = tile49.getX();
        org.jpacman.framework.model.Player player52 = new org.jpacman.framework.model.Player();
        int int54 = player52.addPoints((int) (short) 10);
        int int55 = player52.getPoints();
        int int57 = player52.addPoints((int) '4');
        boolean boolean58 = tile49.containsSprite((org.jpacman.framework.model.Sprite) player52);
        int int59 = tile49.getY();
        org.jpacman.framework.model.Player player60 = new org.jpacman.framework.model.Player();
        player60.die();
        player60.resurrect();
        int int63 = player60.getPoints();
        org.jpacman.framework.model.Direction direction64 = player60.getDirection();
        org.jpacman.framework.model.Tile tile65 = board32.tileAtDirection(tile49, direction64);
        game0.moveGhost(ghost23, direction64);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        boolean boolean3 = game0.died();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.RIGHT;
        game0.movePlayer(direction5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        boolean boolean2 = game0.died();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector6 = game0.getBoardInspector();
        org.jpacman.framework.model.Direction direction7 = org.jpacman.framework.model.Direction.LEFT;
        int int8 = direction7.getDx();
        game0.movePlayer(direction7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = player13.getSpriteType();
        org.jpacman.framework.model.Direction direction17 = org.jpacman.framework.model.Direction.LEFT;
        int int18 = direction17.getDx();
        player13.setDirection(direction17);
        game0.movePlayer(direction17);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        game0.notifyObservers();
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost20.getSpriteType();
        java.lang.Class<?> wildcardClass27 = ghost20.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost20.getSpriteType();
        org.jpacman.framework.model.Board board31 = new org.jpacman.framework.model.Board(62, 10);
        int int32 = board31.getWidth();
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player36 = new org.jpacman.framework.model.Player();
        int int38 = player36.addPoints((int) (short) 10);
        int int39 = player36.getPoints();
        int int41 = player36.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction42 = player36.getDirection();
        int int43 = direction42.getDy();
        org.jpacman.framework.model.Tile tile44 = board31.tileAtDirection(tile35, direction42);
        game0.moveGhost(ghost20, direction42);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = game0.getClass();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        int int5 = game0.countObservers();
        org.jpacman.framework.model.Direction direction6 = org.jpacman.framework.model.Direction.DOWN;
        int int7 = direction6.getDx();
        game0.movePlayer(direction6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        org.jpacman.framework.model.Direction direction3 = org.jpacman.framework.model.Direction.RIGHT;
        int int4 = direction3.getDx();
        int int5 = direction3.getDy();
        int int6 = direction3.getDy();
        game0.movePlayer(direction3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board3 = new org.jpacman.framework.model.Board(62, 10);
        game0.setBoard(board3);
        boolean boolean5 = game0.died();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.jpacman.framework.model.Board board12 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player16 = new org.jpacman.framework.model.Player();
        player16.die();
        player16.resurrect();
        java.lang.String str19 = player16.toString();
        int int20 = player16.getPoints();
        org.jpacman.framework.model.Direction direction21 = org.jpacman.framework.model.Direction.UP;
        player16.setDirection(direction21);
        org.jpacman.framework.model.Tile tile23 = board12.tileAtDirection(tile15, direction21);
        game0.movePlayer(direction21);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        food6.setPoints((int) (short) 10);
        game0.addFood(food6);
        food6.deoccupy();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.UP;
        int int11 = direction10.getDy();
        int int12 = direction10.getDx();
        game0.movePlayer(direction10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        boolean boolean6 = game0.hasChanged();
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
        java.lang.Class<?> wildcardClass28 = ghost21.getClass();
        org.jpacman.framework.model.Board board31 = new org.jpacman.framework.model.Board(62, 10);
        int int32 = board31.getWidth();
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player36 = new org.jpacman.framework.model.Player();
        int int38 = player36.addPoints((int) (short) 10);
        int int39 = player36.getPoints();
        int int41 = player36.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction42 = player36.getDirection();
        int int43 = direction42.getDy();
        org.jpacman.framework.model.Tile tile44 = board31.tileAtDirection(tile35, direction42);
        game0.moveGhost(ghost21, direction42);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.died();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        int int10 = player0.addPoints(10);
        int int12 = player0.addPoints(0);
        player0.deoccupy();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        boolean boolean27 = game0.died();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        boolean boolean20 = game4.died();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        player0.resurrect();
        player0.deoccupy();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = player0.getSpriteType();
        player0.resurrect();
        player0.deoccupy();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        ghost3.deoccupy();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        int int17 = tile11.getX();
        org.jpacman.framework.model.Player player18 = new org.jpacman.framework.model.Player();
        int int20 = player18.addPoints((int) (short) 10);
        int int21 = player18.getPoints();
        int int23 = player18.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = player18.getSpriteType();
        int int26 = player18.addPoints((int) (short) 10);
        player18.resurrect();
        boolean boolean28 = tile11.containsSprite((org.jpacman.framework.model.Sprite) player18);
        player18.deoccupy();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.deleteObservers();
        game0.notifyObservers((java.lang.Object) (byte) 1);
        boolean boolean8 = game0.died();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = new org.jpacman.framework.model.Player();
        int int8 = player6.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = player6.getSpriteType();
        org.jpacman.framework.model.Direction direction10 = org.jpacman.framework.model.Direction.LEFT;
        int int11 = direction10.getDx();
        player6.setDirection(direction10);
        game0.movePlayer(direction10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector7 = game0.getBoardInspector();
        org.jpacman.framework.model.Direction direction8 = org.jpacman.framework.model.Direction.DOWN;
        int int9 = direction8.getDx();
        int int10 = direction8.getDx();
        int int11 = direction8.getDx();
        int int12 = direction8.getDx();
        game0.movePlayer(direction8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.PointManager pointManager17 = game15.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game15.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector19 = game15.getBoardInspector();
        game15.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board24 = new org.jpacman.framework.model.Board(0, 20);
        int int25 = board24.getHeight();
        game15.setBoard(board24);
        org.jpacman.framework.model.Ghost ghost27 = new org.jpacman.framework.model.Ghost();
        game15.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost27.getSpriteType();
        org.jpacman.framework.model.Level level30 = new org.jpacman.framework.model.Level();
        java.lang.String str31 = level30.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor32 = level30.parseMap();
        org.jpacman.framework.model.Game game33 = level30.getGame();
        org.jpacman.framework.model.Board board34 = game33.getBoard();
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int38 = tile37.getY();
        int int39 = tile37.getY();
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.RIGHT;
        int int41 = direction40.getDx();
        int int42 = direction40.getDy();
        org.jpacman.framework.model.Tile tile43 = board34.tileAtDirection(tile37, direction40);
        game0.moveGhost(ghost27, direction40);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jpacman.framework.model.Player player13 = new org.jpacman.framework.model.Player();
        int int15 = player13.addPoints((int) (short) 10);
        int int16 = player13.getPoints();
        boolean boolean17 = player13.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = player13.getSpriteType();
        org.jpacman.framework.model.Game game19 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board22 = new org.jpacman.framework.model.Board(62, 10);
        game19.setBoard(board22);
        org.jpacman.framework.model.Board board26 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile29 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite30 = tile29.topSprite();
        int int31 = tile29.getY();
        org.jpacman.framework.model.Tile tile34 = board26.tileAtOffset(tile29, 100, 1);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        player35.die();
        player35.resurrect();
        java.lang.String str38 = player35.toString();
        int int39 = player35.getPoints();
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.UP;
        player35.setDirection(direction40);
        java.lang.Class<?> wildcardClass42 = direction40.getClass();
        org.jpacman.framework.model.Tile tile43 = board22.tileAtDirection(tile34, direction40);
        player13.setDirection(direction40);
        game0.movePlayer(direction40);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player5 = game4.getPlayer();
        org.jpacman.framework.model.Player player6 = game4.getPlayer();
        org.jpacman.framework.model.Board board7 = game4.getBoard();
        int int8 = game4.countObservers();
        org.jpacman.framework.model.Game game9 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player10 = game9.getPlayer();
        org.jpacman.framework.model.PointManager pointManager11 = game9.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList12 = game9.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector13 = game9.getBoardInspector();
        boolean boolean14 = game9.hasChanged();
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost29.getSpriteType();
        game4.addGhost(ghost29);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = ghost29.getSpriteType();
        org.jpacman.framework.model.Level level39 = new org.jpacman.framework.model.Level();
        java.lang.String str40 = level39.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor41 = level39.parseMap();
        org.jpacman.framework.model.Game game42 = level39.getGame();
        org.jpacman.framework.model.Board board43 = game42.getBoard();
        org.jpacman.framework.model.Tile tile46 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int47 = tile46.getY();
        int int48 = tile46.getY();
        org.jpacman.framework.model.Direction direction49 = org.jpacman.framework.model.Direction.RIGHT;
        int int50 = direction49.getDx();
        int int51 = direction49.getDy();
        org.jpacman.framework.model.Tile tile52 = board43.tileAtDirection(tile46, direction49);
        game3.moveGhost(ghost29, direction49);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        boolean boolean32 = game0.died();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.PointManager pointManager9 = game7.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList10 = game7.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector11 = game7.getBoardInspector();
        boolean boolean12 = game7.hasChanged();
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
        game7.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost27.getSpriteType();
        org.jpacman.framework.model.PointManager pointManager35 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager36 = new org.jpacman.framework.model.PointManager();
        pointManager36.addPointsToBoard((int) (byte) 10);
        int int39 = pointManager36.totalFoodInGame();
        org.jpacman.framework.model.Player player40 = new org.jpacman.framework.model.Player();
        int int42 = player40.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = player40.getSpriteType();
        java.lang.String str44 = player40.toString();
        pointManager36.consumePointsOnBoard(player40, 72);
        pointManager35.consumePointsOnBoard(player40, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = player40.getSpriteType();
        org.jpacman.framework.model.Direction direction50 = player40.getDirection();
        game0.moveGhost(ghost27, direction50);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        game0.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Direction direction7 = org.jpacman.framework.model.Direction.LEFT;
        int int8 = direction7.getDx();
        game0.movePlayer(direction7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jpacman.framework.model.Direction direction16 = org.jpacman.framework.model.Direction.RIGHT;
        game0.movePlayer(direction16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        game0.deleteObservers();
        boolean boolean5 = game0.died();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        food14.deoccupy();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        int int4 = game0.countObservers();
        boolean boolean5 = game0.died();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.PointManager pointManager6 = game0.getPointManager();
        boolean boolean7 = game0.died();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jpacman.framework.model.Ghost ghost0 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = ghost0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = ghost0.getSpriteType();
        ghost0.deoccupy();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = player0.getSpriteType();
        boolean boolean3 = player0.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = player0.getSpriteType();
        player0.deoccupy();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost2.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = ghost2.getSpriteType();
        ghost2.deoccupy();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.PointManager pointManager6 = game0.getPointManager();
        boolean boolean7 = game0.died();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.Game game4 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean10 = board7.withinBorders((int) (byte) 10, (int) '4');
        int int11 = board7.getHeight();
        game4.setBoard(board7);
        org.jpacman.framework.model.Ghost ghost13 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = ghost13.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType15 = ghost13.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = ghost13.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = ghost13.getSpriteType();
        game4.addGhost(ghost13);
        game0.addGhost(ghost13);
        org.jpacman.framework.model.Game game20 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player21 = game20.getPlayer();
        org.jpacman.framework.model.Player player22 = game20.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector23 = game20.getBoardInspector();
        game20.deleteObservers();
        boolean boolean25 = game20.won();
        org.jpacman.framework.model.Player player26 = game20.getPlayer();
        boolean boolean27 = game20.hasChanged();
        org.jpacman.framework.model.Ghost ghost28 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost28.getSpriteType();
        game20.addGhost(ghost28);
        org.jpacman.framework.model.Direction direction31 = org.jpacman.framework.model.Direction.DOWN;
        int int32 = direction31.getDx();
        game0.moveGhost(ghost28, direction31);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        org.jpacman.framework.model.Player player3 = game0.getPlayer();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board7 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite11 = tile10.topSprite();
        int int12 = tile10.getY();
        org.jpacman.framework.model.Tile tile15 = board7.tileAtOffset(tile10, 100, 1);
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
        org.jpacman.framework.model.Tile tile28 = board7.tileAtDirection(tile18, direction25);
        game0.notifyObservers((java.lang.Object) tile28);
        org.jpacman.framework.model.Game game30 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player31 = game30.getPlayer();
        boolean boolean32 = game30.won();
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int36 = tile35.getX();
        int int37 = tile35.getX();
        org.jpacman.framework.model.Food food38 = new org.jpacman.framework.model.Food();
        int int39 = food38.getPoints();
        int int40 = food38.getPoints();
        boolean boolean41 = tile35.containsSprite((org.jpacman.framework.model.Sprite) food38);
        int int42 = food38.getPoints();
        game30.addFood(food38);
        org.jpacman.framework.model.Ghost ghost44 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType45 = ghost44.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = ghost44.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = ghost44.getSpriteType();
        game30.addGhost(ghost44);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType49 = ghost44.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType50 = ghost44.getSpriteType();
        java.lang.Class<?> wildcardClass51 = ghost44.getClass();
        org.jpacman.framework.model.Game game52 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player53 = game52.getPlayer();
        org.jpacman.framework.model.PointManager pointManager54 = game52.getPointManager();
        org.jpacman.framework.model.PointManager pointManager55 = game52.getPointManager();
        org.jpacman.framework.model.Tile tile58 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int59 = tile58.getX();
        int int60 = tile58.getX();
        org.jpacman.framework.model.Player player61 = new org.jpacman.framework.model.Player();
        int int63 = player61.addPoints((int) (short) 10);
        int int64 = player61.getPoints();
        int int66 = player61.addPoints((int) '4');
        boolean boolean67 = tile58.containsSprite((org.jpacman.framework.model.Sprite) player61);
        int int69 = player61.addPoints(0);
        player61.die();
        pointManager55.consumePointsOnBoard(player61, 0);
        boolean boolean73 = player61.isAlive();
        org.jpacman.framework.model.Direction direction74 = player61.getDirection();
        game0.moveGhost(ghost44, direction74);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        org.jpacman.framework.model.Tile tile2 = player0.getTile();
        player0.deoccupy();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList9 = game6.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector10 = game6.getBoardInspector();
        boolean boolean11 = game6.hasChanged();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        boolean boolean14 = game12.won();
        org.jpacman.framework.model.Tile tile17 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int18 = tile17.getX();
        int int19 = tile17.getX();
        org.jpacman.framework.model.Food food20 = new org.jpacman.framework.model.Food();
        int int21 = food20.getPoints();
        int int22 = food20.getPoints();
        boolean boolean23 = tile17.containsSprite((org.jpacman.framework.model.Sprite) food20);
        int int24 = food20.getPoints();
        game12.addFood(food20);
        org.jpacman.framework.model.Ghost ghost26 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost26.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost26.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost26.getSpriteType();
        game12.addGhost(ghost26);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost26.getSpriteType();
        game6.addGhost(ghost26);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = ghost26.getSpriteType();
        org.jpacman.framework.model.Direction direction34 = org.jpacman.framework.model.Direction.DOWN;
        int int35 = direction34.getDx();
        int int36 = direction34.getDx();
        int int37 = direction34.getDx();
        int int38 = direction34.getDx();
        game0.moveGhost(ghost26, direction34);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost3 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost3);
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Food food6 = new org.jpacman.framework.model.Food();
        food6.setPoints((int) (short) 10);
        game0.addFood(food6);
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType13 = player10.getSpriteType();
        org.jpacman.framework.model.Direction direction14 = org.jpacman.framework.model.Direction.LEFT;
        int int15 = direction14.getDx();
        player10.setDirection(direction14);
        java.lang.String str17 = player10.toString();
        player10.die();
        java.lang.String str19 = player10.toString();
        org.jpacman.framework.model.Direction direction20 = player10.getDirection();
        game0.movePlayer(direction20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Food food3 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = food3.getSpriteType();
        food3.setPoints((int) '4');
        int int7 = food3.getPoints();
        game0.addFood(food3);
        org.jpacman.framework.model.Board board9 = game0.getBoard();
        boolean boolean10 = game0.died();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.won();
        boolean boolean7 = game0.died();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.Board board3 = game0.getBoard();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        boolean boolean8 = player5.isAlive();
        int int10 = player5.addPoints((int) (short) 0);
        org.jpacman.framework.model.Direction direction11 = player5.getDirection();
        game0.movePlayer(direction11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.deoccupy();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost24.getSpriteType();
        ghost24.deoccupy();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        org.jpacman.framework.model.IBoardInspector iBoardInspector5 = game0.getBoardInspector();
        org.jpacman.framework.model.Board board6 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        org.jpacman.framework.model.Board board10 = game8.getBoard();
        boolean boolean11 = game8.won();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board15 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean18 = board15.withinBorders((int) (byte) 10, (int) '4');
        int int19 = board15.getHeight();
        game12.setBoard(board15);
        org.jpacman.framework.model.Ghost ghost21 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType22 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType23 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType24 = ghost21.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = ghost21.getSpriteType();
        game12.addGhost(ghost21);
        game8.addGhost(ghost21);
        org.jpacman.framework.model.Player player28 = new org.jpacman.framework.model.Player();
        int int30 = player28.addPoints((int) (short) 10);
        boolean boolean31 = player28.isAlive();
        player28.die();
        org.jpacman.framework.model.Player player33 = new org.jpacman.framework.model.Player();
        int int35 = player33.addPoints((int) (short) 10);
        boolean boolean36 = player33.isAlive();
        org.jpacman.framework.model.Tile tile39 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int40 = tile39.getX();
        int int41 = tile39.getX();
        int int42 = tile39.getX();
        player33.occupy(tile39);
        player28.occupy(tile39);
        org.jpacman.framework.model.Direction direction45 = org.jpacman.framework.model.Direction.LEFT;
        int int46 = direction45.getDx();
        player28.setDirection(direction45);
        org.jpacman.framework.model.Tile tile48 = player28.getTile();
        int int49 = tile48.getX();
        ghost21.occupy(tile48);
        org.jpacman.framework.model.Player player51 = new org.jpacman.framework.model.Player();
        int int53 = player51.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType54 = player51.getSpriteType();
        org.jpacman.framework.model.Direction direction55 = org.jpacman.framework.model.Direction.LEFT;
        int int56 = direction55.getDx();
        player51.setDirection(direction55);
        int int58 = direction55.getDx();
        game0.moveGhost(ghost21, direction55);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.jpacman.framework.model.Tile tile40 = board27.tileAtDirection(tile31, direction38);
        org.jpacman.framework.model.Tile tile43 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food44 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType45 = food44.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = food44.getSpriteType();
        boolean boolean47 = tile43.containsSprite((org.jpacman.framework.model.Sprite) food44);
        org.jpacman.framework.model.Sprite sprite48 = tile43.topSprite();
        org.jpacman.framework.model.Tile tile51 = board27.tileAtOffset(tile43, 100, (int) '4');
        org.jpacman.framework.model.Direction direction52 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile53 = board23.tileAtDirection(tile51, direction52);
        player14.setDirection(direction52);
        pointManager0.consumePointsOnBoard(player14, (int) (short) -1);
        player14.deoccupy();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        player0.die();
        player0.resurrect();
        java.lang.String str3 = player0.toString();
        int int4 = player0.getPoints();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.UP;
        player0.setDirection(direction5);
        int int7 = player0.getPoints();
        player0.deoccupy();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        ghost18.deoccupy();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        org.jpacman.framework.model.Player player14 = game13.getPlayer();
        org.jpacman.framework.model.PointManager pointManager15 = game13.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList16 = game13.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector17 = game13.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game13.getGhosts();
        org.jpacman.framework.model.Game game19 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player20 = game19.getPlayer();
        org.jpacman.framework.model.PointManager pointManager21 = game19.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList22 = game19.getGhosts();
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
        org.jpacman.framework.model.Ghost ghost37 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost37.getSpriteType();
        game23.addGhost(ghost37);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = ghost37.getSpriteType();
        game19.addGhost(ghost37);
        game13.addGhost(ghost37);
        game0.addGhost(ghost37);
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
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType82 = ghost73.getSpriteType();
        org.jpacman.framework.model.Player player83 = new org.jpacman.framework.model.Player();
        player83.die();
        player83.resurrect();
        org.jpacman.framework.model.Tile tile88 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food89 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType90 = food89.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType91 = food89.getSpriteType();
        boolean boolean92 = tile88.containsSprite((org.jpacman.framework.model.Sprite) food89);
        java.lang.String str93 = tile88.toString();
        java.lang.String str94 = tile88.toString();
        org.jpacman.framework.model.Sprite sprite95 = tile88.topSprite();
        player83.occupy(tile88);
        org.jpacman.framework.model.Direction direction97 = player83.getDirection();
        int int98 = direction97.getDx();
        game0.moveGhost(ghost73, direction97);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.Game game7 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player8 = game7.getPlayer();
        org.jpacman.framework.model.PointManager pointManager9 = game7.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList10 = game7.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector11 = game7.getBoardInspector();
        boolean boolean12 = game7.hasChanged();
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
        game7.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType34 = ghost27.getSpriteType();
        org.jpacman.framework.model.Board board37 = new org.jpacman.framework.model.Board(1, (int) (byte) 100);
        boolean boolean40 = board37.withinBorders(0, (int) (byte) 1);
        int int41 = board37.getHeight();
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
        org.jpacman.framework.model.Tile tile57 = board44.tileAtDirection(tile47, direction53);
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
        org.jpacman.framework.model.Tile tile77 = board44.tileAtDirection(tile61, direction76);
        org.jpacman.framework.model.Tile tile80 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int81 = tile80.getX();
        int int82 = tile80.getX();
        org.jpacman.framework.model.Player player83 = new org.jpacman.framework.model.Player();
        int int85 = player83.addPoints((int) (short) 10);
        int int86 = player83.getPoints();
        int int88 = player83.addPoints((int) '4');
        boolean boolean89 = tile80.containsSprite((org.jpacman.framework.model.Sprite) player83);
        int int91 = player83.addPoints(0);
        player83.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType93 = player83.getSpriteType();
        org.jpacman.framework.model.Direction direction94 = player83.getDirection();
        org.jpacman.framework.model.Tile tile95 = board37.tileAtDirection(tile61, direction94);
        game0.moveGhost(ghost27, direction94);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        org.jpacman.framework.model.Game game3 = level0.getGame();
        game3.notifyObservers();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board6 = game5.getBoard();
        org.jpacman.framework.model.Ghost ghost7 = new org.jpacman.framework.model.Ghost();
        game5.addGhost(ghost7);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = ghost7.getSpriteType();
        org.jpacman.framework.model.Player player10 = new org.jpacman.framework.model.Player();
        int int12 = player10.addPoints((int) (short) 10);
        int int13 = player10.getPoints();
        int int15 = player10.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType16 = player10.getSpriteType();
        java.lang.String str17 = player10.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = player10.getSpriteType();
        org.jpacman.framework.model.Player player19 = new org.jpacman.framework.model.Player();
        int int21 = player19.addPoints((int) (short) 10);
        int int22 = player19.getPoints();
        int int24 = player19.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction25 = player19.getDirection();
        int int26 = direction25.getDy();
        player10.setDirection(direction25);
        org.jpacman.framework.model.Direction direction28 = player10.getDirection();
        game3.moveGhost(ghost7, direction28);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        game0.deleteObservers();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player7 = game6.getPlayer();
        org.jpacman.framework.model.PointManager pointManager8 = game6.getPointManager();
        int int9 = pointManager8.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager10 = new org.jpacman.framework.model.PointManager();
        boolean boolean11 = pointManager10.allEaten();
        int int12 = pointManager10.totalFoodInGame();
        int int13 = pointManager10.getFoodEaten();
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = player14.getSpriteType();
        org.jpacman.framework.model.Direction direction18 = org.jpacman.framework.model.Direction.LEFT;
        int int19 = direction18.getDx();
        player14.setDirection(direction18);
        pointManager10.consumePointsOnBoard(player14, 94);
        pointManager8.consumePointsOnBoard(player14, 100);
        org.jpacman.framework.model.Direction direction25 = org.jpacman.framework.model.Direction.DOWN;
        int int26 = direction25.getDx();
        int int27 = direction25.getDx();
        int int28 = direction25.getDy();
        player14.setDirection(direction25);
        game0.movePlayer(direction25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        boolean boolean4 = player0.isAlive();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = player0.getSpriteType();
        player0.die();
        java.lang.String str7 = player0.toString();
        int int8 = player0.getPoints();
        player0.deoccupy();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        game0.deleteObservers();
        int int2 = game0.countObservers();
        boolean boolean3 = game0.hasChanged();
        boolean boolean4 = game0.died();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.jpacman.framework.model.Game game16 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board17 = game16.getBoard();
        game16.notifyObservers();
        org.jpacman.framework.model.Board board21 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean24 = board21.withinBorders((int) (byte) 10, (int) '4');
        int int25 = board21.getHeight();
        int int26 = board21.getHeight();
        int int27 = board21.getWidth();
        game16.setBoard(board21);
        org.jpacman.framework.model.IBoardInspector iBoardInspector29 = game16.getBoardInspector();
        org.jpacman.framework.model.Board board32 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile35 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Sprite sprite36 = tile35.topSprite();
        int int37 = tile35.getY();
        org.jpacman.framework.model.Tile tile40 = board32.tileAtOffset(tile35, 100, 1);
        org.jpacman.framework.model.Tile tile43 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player44 = new org.jpacman.framework.model.Player();
        player44.die();
        player44.resurrect();
        org.jpacman.framework.model.Tile tile49 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food50 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType51 = food50.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType52 = food50.getSpriteType();
        boolean boolean53 = tile49.containsSprite((org.jpacman.framework.model.Sprite) food50);
        java.lang.String str54 = tile49.toString();
        java.lang.String str55 = tile49.toString();
        org.jpacman.framework.model.Sprite sprite56 = tile49.topSprite();
        player44.occupy(tile49);
        org.jpacman.framework.model.Direction direction58 = player44.getDirection();
        org.jpacman.framework.model.Tile tile59 = board32.tileAtDirection(tile43, direction58);
        org.jpacman.framework.model.Tile tile62 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Tile tile65 = board32.tileAtOffset(tile62, (int) (short) 10, 35);
        game16.setBoard(board32);
        game0.setBoard(board32);
        boolean boolean68 = game0.died();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        org.jpacman.framework.model.Player player2 = new org.jpacman.framework.model.Player();
        int int4 = player2.addPoints((int) (short) 10);
        int int5 = player2.getPoints();
        int int7 = player2.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player2.getSpriteType();
        org.jpacman.framework.model.Direction direction9 = org.jpacman.framework.model.Direction.RIGHT;
        int int10 = direction9.getDx();
        player2.setDirection(direction9);
        game0.movePlayer(direction9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        game0.deleteObservers();
        boolean boolean5 = game0.died();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Game game2 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board5 = new org.jpacman.framework.model.Board(62, 10);
        game2.setBoard(board5);
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(62, 10);
        int int10 = board9.getWidth();
        org.jpacman.framework.model.Tile tile13 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player14 = new org.jpacman.framework.model.Player();
        int int16 = player14.addPoints((int) (short) 10);
        int int17 = player14.getPoints();
        int int19 = player14.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction20 = player14.getDirection();
        int int21 = direction20.getDy();
        org.jpacman.framework.model.Tile tile22 = board9.tileAtDirection(tile13, direction20);
        org.jpacman.framework.model.Tile tile25 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food26 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = food26.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = food26.getSpriteType();
        boolean boolean29 = tile25.containsSprite((org.jpacman.framework.model.Sprite) food26);
        org.jpacman.framework.model.Sprite sprite30 = tile25.topSprite();
        org.jpacman.framework.model.Tile tile33 = board9.tileAtOffset(tile25, 100, (int) '4');
        org.jpacman.framework.model.Direction direction34 = org.jpacman.framework.model.Direction.RIGHT;
        org.jpacman.framework.model.Tile tile35 = board5.tileAtDirection(tile33, direction34);
        game0.movePlayer(direction34);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        java.lang.Class<?> wildcardClass3 = game0.getClass();
        org.jpacman.framework.model.Player player4 = game0.getPlayer();
        org.jpacman.framework.model.Level level5 = new org.jpacman.framework.model.Level();
        java.lang.String str6 = level5.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor7 = level5.parseMap();
        org.jpacman.framework.model.Game game8 = level5.getGame();
        game8.notifyObservers();
        org.jpacman.framework.model.Board board12 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile15 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food16 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType17 = food16.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType18 = food16.getSpriteType();
        boolean boolean19 = tile15.containsSprite((org.jpacman.framework.model.Sprite) food16);
        java.lang.String str20 = tile15.toString();
        org.jpacman.framework.model.Direction direction21 = org.jpacman.framework.model.Direction.RIGHT;
        int int22 = direction21.getDx();
        int int23 = direction21.getDy();
        int int24 = direction21.getDy();
        org.jpacman.framework.model.Tile tile25 = board12.tileAtDirection(tile15, direction21);
        game8.setBoard(board12);
        org.jpacman.framework.model.Board board27 = game8.getBoard();
        boolean boolean30 = board27.withinBorders(82, 156);
        org.jpacman.framework.model.Board board33 = new org.jpacman.framework.model.Board(62, 10);
        int int34 = board33.getWidth();
        org.jpacman.framework.model.Tile tile37 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player38 = new org.jpacman.framework.model.Player();
        int int40 = player38.addPoints((int) (short) 10);
        int int41 = player38.getPoints();
        int int43 = player38.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction44 = player38.getDirection();
        int int45 = direction44.getDy();
        org.jpacman.framework.model.Tile tile46 = board33.tileAtDirection(tile37, direction44);
        org.jpacman.framework.model.Tile tile49 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food50 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType51 = food50.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType52 = food50.getSpriteType();
        boolean boolean53 = tile49.containsSprite((org.jpacman.framework.model.Sprite) food50);
        org.jpacman.framework.model.Sprite sprite54 = tile49.topSprite();
        org.jpacman.framework.model.Tile tile57 = board33.tileAtOffset(tile49, 100, (int) '4');
        org.jpacman.framework.model.Direction direction58 = org.jpacman.framework.model.Direction.DOWN;
        int int59 = direction58.getDx();
        int int60 = direction58.getDx();
        int int61 = direction58.getDx();
        int int62 = direction58.getDy();
        org.jpacman.framework.model.Tile tile63 = board27.tileAtDirection(tile57, direction58);
        game0.movePlayer(direction58);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Board board2 = game0.getBoard();
        boolean boolean3 = game0.won();
        org.jpacman.framework.model.Board board6 = new org.jpacman.framework.model.Board(62, 10);
        int int7 = board6.getWidth();
        org.jpacman.framework.model.Tile tile10 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        org.jpacman.framework.model.Player player11 = new org.jpacman.framework.model.Player();
        int int13 = player11.addPoints((int) (short) 10);
        int int14 = player11.getPoints();
        int int16 = player11.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction17 = player11.getDirection();
        int int18 = direction17.getDy();
        org.jpacman.framework.model.Tile tile19 = board6.tileAtDirection(tile10, direction17);
        game0.movePlayer(direction17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        int int7 = food0.getPoints();
        food0.deoccupy();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        org.jpacman.framework.model.Game game25 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player26 = game25.getPlayer();
        org.jpacman.framework.model.Player player27 = game25.getPlayer();
        org.jpacman.framework.model.Board board28 = game25.getBoard();
        int int29 = game25.countObservers();
        org.jpacman.framework.model.Game game30 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player31 = game30.getPlayer();
        org.jpacman.framework.model.PointManager pointManager32 = game30.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList33 = game30.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector34 = game30.getBoardInspector();
        boolean boolean35 = game30.hasChanged();
        org.jpacman.framework.model.Game game36 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player37 = game36.getPlayer();
        boolean boolean38 = game36.won();
        org.jpacman.framework.model.Tile tile41 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int42 = tile41.getX();
        int int43 = tile41.getX();
        org.jpacman.framework.model.Food food44 = new org.jpacman.framework.model.Food();
        int int45 = food44.getPoints();
        int int46 = food44.getPoints();
        boolean boolean47 = tile41.containsSprite((org.jpacman.framework.model.Sprite) food44);
        int int48 = food44.getPoints();
        game36.addFood(food44);
        org.jpacman.framework.model.Ghost ghost50 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType51 = ghost50.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType52 = ghost50.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType53 = ghost50.getSpriteType();
        game36.addGhost(ghost50);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType55 = ghost50.getSpriteType();
        game30.addGhost(ghost50);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType57 = ghost50.getSpriteType();
        game25.addGhost(ghost50);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType59 = ghost50.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType60 = ghost50.getSpriteType();
        game0.addGhost(ghost50);
        boolean boolean62 = game0.died();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Direction direction5 = org.jpacman.framework.model.Direction.RIGHT;
        int int6 = direction5.getDy();
        game0.movePlayer(direction5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jpacman.framework.model.Board board37 = new org.jpacman.framework.model.Board((int) (short) 10, (int) '#');
        org.jpacman.framework.model.Tile tile40 = new org.jpacman.framework.model.Tile((int) (byte) -1, 100);
        org.jpacman.framework.model.Food food41 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = food41.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = food41.getSpriteType();
        boolean boolean44 = tile40.containsSprite((org.jpacman.framework.model.Sprite) food41);
        java.lang.String str45 = tile40.toString();
        org.jpacman.framework.model.Direction direction46 = org.jpacman.framework.model.Direction.RIGHT;
        int int47 = direction46.getDx();
        int int48 = direction46.getDy();
        int int49 = direction46.getDy();
        org.jpacman.framework.model.Tile tile50 = board37.tileAtDirection(tile40, direction46);
        int int51 = board37.getHeight();
        org.jpacman.framework.model.Tile tile54 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int55 = tile54.getX();
        int int56 = tile54.getX();
        org.jpacman.framework.model.Player player57 = new org.jpacman.framework.model.Player();
        int int59 = player57.addPoints((int) (short) 10);
        int int60 = player57.getPoints();
        int int62 = player57.addPoints((int) '4');
        boolean boolean63 = tile54.containsSprite((org.jpacman.framework.model.Sprite) player57);
        int int64 = tile54.getY();
        org.jpacman.framework.model.Player player65 = new org.jpacman.framework.model.Player();
        player65.die();
        player65.resurrect();
        int int68 = player65.getPoints();
        org.jpacman.framework.model.Direction direction69 = player65.getDirection();
        org.jpacman.framework.model.Tile tile70 = board37.tileAtDirection(tile54, direction69);
        java.lang.String str71 = tile54.toString();
        java.lang.String str72 = tile54.toString();
        game0.notifyObservers((java.lang.Object) str72);
        boolean boolean74 = game0.died();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = food0.getSpriteType();
        food0.setPoints((int) (byte) -1);
        food0.setPoints(0);
        food0.deoccupy();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Game game6 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board9 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean12 = board9.withinBorders((int) (byte) 10, (int) '4');
        int int13 = board9.getHeight();
        game6.setBoard(board9);
        game0.notifyObservers((java.lang.Object) game6);
        org.jpacman.framework.model.Game game16 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board19 = new org.jpacman.framework.model.Board(0, 20);
        boolean boolean22 = board19.withinBorders((int) (byte) 10, (int) '4');
        int int23 = board19.getHeight();
        game16.setBoard(board19);
        org.jpacman.framework.model.Ghost ghost25 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType26 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = ghost25.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost25.getSpriteType();
        game16.addGhost(ghost25);
        org.jpacman.framework.model.Player player31 = new org.jpacman.framework.model.Player();
        int int33 = player31.addPoints((int) (short) 10);
        boolean boolean34 = player31.isAlive();
        player31.die();
        org.jpacman.framework.model.Player player36 = new org.jpacman.framework.model.Player();
        int int38 = player36.addPoints((int) (short) 10);
        boolean boolean39 = player36.isAlive();
        org.jpacman.framework.model.Tile tile42 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int43 = tile42.getX();
        int int44 = tile42.getX();
        int int45 = tile42.getX();
        player36.occupy(tile42);
        player31.occupy(tile42);
        org.jpacman.framework.model.Direction direction48 = org.jpacman.framework.model.Direction.DOWN;
        player31.setDirection(direction48);
        int int50 = direction48.getDx();
        int int51 = direction48.getDy();
        game6.moveGhost(ghost25, direction48);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        game0.notifyObservers();
        org.jpacman.framework.model.PointManager pointManager3 = game0.getPointManager();
        pointManager3.addPointsToBoard(104);
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
        pointManager3.consumePointsOnBoard(player18, 97);
        player18.deoccupy();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jpacman.framework.model.Tile tile2 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int3 = tile2.getX();
        int int4 = tile2.getX();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        int int8 = player5.getPoints();
        int int10 = player5.addPoints((int) '4');
        boolean boolean11 = tile2.containsSprite((org.jpacman.framework.model.Sprite) player5);
        player5.resurrect();
        player5.deoccupy();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager2 = game0.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList3 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList5 = game0.getGhosts();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game0.getPointManager();
        org.jpacman.framework.model.Game game8 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player9 = game8.getPlayer();
        org.jpacman.framework.model.Player player10 = game8.getPlayer();
        org.jpacman.framework.model.Board board11 = game8.getBoard();
        int int12 = game8.countObservers();
        org.jpacman.framework.model.Game game13 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player14 = game13.getPlayer();
        org.jpacman.framework.model.PointManager pointManager15 = game13.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList16 = game13.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector17 = game13.getBoardInspector();
        boolean boolean18 = game13.hasChanged();
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
        game13.addGhost(ghost33);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost33.getSpriteType();
        game8.addGhost(ghost33);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType43 = ghost33.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = ghost33.getSpriteType();
        org.jpacman.framework.model.Direction direction45 = org.jpacman.framework.model.Direction.DOWN;
        int int46 = direction45.getDx();
        int int47 = direction45.getDx();
        int int48 = direction45.getDx();
        int int49 = direction45.getDy();
        game0.moveGhost(ghost33, direction45);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jpacman.framework.model.Player player0 = new org.jpacman.framework.model.Player();
        int int2 = player0.addPoints((int) (short) 10);
        int int3 = player0.getPoints();
        int int5 = player0.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType6 = player0.getSpriteType();
        java.lang.String str7 = player0.toString();
        player0.resurrect();
        player0.deoccupy();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.PointManager pointManager17 = game15.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game15.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector19 = game15.getBoardInspector();
        game15.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board24 = new org.jpacman.framework.model.Board(0, 20);
        int int25 = board24.getHeight();
        game15.setBoard(board24);
        org.jpacman.framework.model.Ghost ghost27 = new org.jpacman.framework.model.Ghost();
        game15.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost27.getSpriteType();
        java.lang.String str31 = ghost27.toString();
        org.jpacman.framework.model.Direction direction32 = org.jpacman.framework.model.Direction.DOWN;
        int int33 = direction32.getDx();
        int int34 = direction32.getDy();
        game0.moveGhost(ghost27, direction32);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jpacman.framework.model.Food food0 = new org.jpacman.framework.model.Food();
        int int1 = food0.getPoints();
        int int2 = food0.getPoints();
        int int3 = food0.getPoints();
        java.lang.String str4 = food0.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType5 = food0.getSpriteType();
        food0.deoccupy();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.Game game3 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player4 = game3.getPlayer();
        org.jpacman.framework.model.Player player5 = game3.getPlayer();
        org.jpacman.framework.model.Board board6 = game3.getBoard();
        org.jpacman.framework.model.Player player7 = game3.getPlayer();
        org.jpacman.framework.model.Ghost ghost8 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType9 = ghost8.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType10 = ghost8.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType11 = ghost8.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType12 = ghost8.getSpriteType();
        game3.addGhost(ghost8);
        org.jpacman.framework.model.Tile tile14 = ghost8.getTile();
        org.jpacman.framework.model.Player player15 = new org.jpacman.framework.model.Player();
        player15.die();
        player15.resurrect();
        org.jpacman.framework.model.Tile tile20 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int21 = tile20.getX();
        org.jpacman.framework.model.Sprite sprite22 = tile20.topSprite();
        player15.occupy(tile20);
        int int24 = player15.getPoints();
        org.jpacman.framework.model.Direction direction25 = player15.getDirection();
        game0.moveGhost(ghost8, direction25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        pointManager6.consumePointsOnBoard(player10, 94);
        boolean boolean19 = pointManager6.allEaten();
        int int20 = pointManager6.totalFoodInGame();
        org.jpacman.framework.model.Player player21 = new org.jpacman.framework.model.Player();
        player21.die();
        int int23 = player21.getPoints();
        pointManager6.consumePointsOnBoard(player21, 92);
        boolean boolean26 = player21.isAlive();
        game0.addPlayer(player21);
        org.jpacman.framework.model.Game game28 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player29 = game28.getPlayer();
        org.jpacman.framework.model.PointManager pointManager30 = game28.getPointManager();
        int int31 = pointManager30.getFoodEaten();
        org.jpacman.framework.model.PointManager pointManager32 = new org.jpacman.framework.model.PointManager();
        boolean boolean33 = pointManager32.allEaten();
        int int34 = pointManager32.totalFoodInGame();
        int int35 = pointManager32.getFoodEaten();
        org.jpacman.framework.model.Player player36 = new org.jpacman.framework.model.Player();
        int int38 = player36.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = player36.getSpriteType();
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.LEFT;
        int int41 = direction40.getDx();
        player36.setDirection(direction40);
        pointManager32.consumePointsOnBoard(player36, 94);
        pointManager30.consumePointsOnBoard(player36, 100);
        org.jpacman.framework.model.Direction direction47 = org.jpacman.framework.model.Direction.DOWN;
        int int48 = direction47.getDx();
        int int49 = direction47.getDx();
        int int50 = direction47.getDy();
        player36.setDirection(direction47);
        game0.movePlayer(direction47);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        game0.deleteObservers();
        boolean boolean5 = game0.won();
        org.jpacman.framework.model.Player player6 = game0.getPlayer();
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
        org.jpacman.framework.model.Direction direction43 = org.jpacman.framework.model.Direction.LEFT;
        int int44 = direction43.getDx();
        player26.setDirection(direction43);
        boolean boolean46 = player26.isAlive();
        org.jpacman.framework.model.Level level47 = new org.jpacman.framework.model.Level();
        java.lang.String str48 = level47.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor49 = level47.parseMap();
        org.jpacman.framework.model.Game game50 = level47.getGame();
        org.jpacman.framework.model.Board board51 = game50.getBoard();
        org.jpacman.framework.model.Tile tile54 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int55 = tile54.getY();
        int int56 = tile54.getY();
        org.jpacman.framework.model.Direction direction57 = org.jpacman.framework.model.Direction.RIGHT;
        int int58 = direction57.getDx();
        int int59 = direction57.getDy();
        org.jpacman.framework.model.Tile tile60 = board51.tileAtDirection(tile54, direction57);
        player26.setDirection(direction57);
        int int62 = direction57.getDy();
        game0.moveGhost(ghost21, direction57);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost6 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType7 = ghost6.getSpriteType();
        game0.addGhost(ghost6);
        java.lang.String str9 = ghost6.toString();
        ghost6.deoccupy();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector iBoardInspector4 = game0.getBoardInspector();
        boolean boolean5 = game0.hasChanged();
        game0.notifyObservers();
        boolean boolean7 = game0.died();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        int int28 = game0.countObservers();
        org.jpacman.framework.model.Board board31 = new org.jpacman.framework.model.Board(62, 10);
        org.jpacman.framework.model.Tile tile34 = new org.jpacman.framework.model.Tile((int) (short) -1, 20);
        org.jpacman.framework.model.Player player35 = new org.jpacman.framework.model.Player();
        player35.die();
        player35.resurrect();
        java.lang.String str38 = player35.toString();
        int int39 = player35.getPoints();
        org.jpacman.framework.model.Direction direction40 = org.jpacman.framework.model.Direction.UP;
        player35.setDirection(direction40);
        org.jpacman.framework.model.Tile tile42 = board31.tileAtDirection(tile34, direction40);
        int int43 = direction40.getDx();
        game0.movePlayer(direction40);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        pointManager8.consumePointsOnBoard(player12, 72);
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
        int int39 = player28.getPoints();
        player28.deoccupy();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        boolean boolean3 = game0.hasChanged();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Game game5 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player6 = game5.getPlayer();
        org.jpacman.framework.model.PointManager pointManager7 = game5.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList8 = game5.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector9 = game5.getBoardInspector();
        boolean boolean10 = game5.hasChanged();
        org.jpacman.framework.model.Board board11 = game5.getBoard();
        org.jpacman.framework.model.Game game12 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player13 = game12.getPlayer();
        org.jpacman.framework.model.Player player14 = game12.getPlayer();
        org.jpacman.framework.model.Board board15 = game12.getBoard();
        int int16 = game12.countObservers();
        org.jpacman.framework.model.Game game17 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player18 = game17.getPlayer();
        org.jpacman.framework.model.PointManager pointManager19 = game17.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList20 = game17.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector21 = game17.getBoardInspector();
        boolean boolean22 = game17.hasChanged();
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
        org.jpacman.framework.model.Ghost ghost37 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType38 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = ghost37.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType40 = ghost37.getSpriteType();
        game23.addGhost(ghost37);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType42 = ghost37.getSpriteType();
        game17.addGhost(ghost37);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType44 = ghost37.getSpriteType();
        game12.addGhost(ghost37);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType46 = ghost37.getSpriteType();
        game5.addGhost(ghost37);
        org.jpacman.framework.model.Player player48 = new org.jpacman.framework.model.Player();
        int int50 = player48.addPoints((int) (short) 10);
        boolean boolean51 = player48.isAlive();
        player48.die();
        org.jpacman.framework.model.Player player53 = new org.jpacman.framework.model.Player();
        int int55 = player53.addPoints((int) (short) 10);
        boolean boolean56 = player53.isAlive();
        org.jpacman.framework.model.Tile tile59 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int60 = tile59.getX();
        int int61 = tile59.getX();
        int int62 = tile59.getX();
        player53.occupy(tile59);
        player48.occupy(tile59);
        org.jpacman.framework.model.Direction direction65 = org.jpacman.framework.model.Direction.DOWN;
        player48.setDirection(direction65);
        int int67 = direction65.getDx();
        int int68 = direction65.getDy();
        game0.moveGhost(ghost37, direction65);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType1 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType2 = wall0.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType3 = wall0.getSpriteType();
        wall0.deoccupy();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        food8.deoccupy();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        game0.notifyObservers();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        boolean boolean4 = game0.died();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        boolean boolean2 = game0.won();
        org.jpacman.framework.model.Player player3 = new org.jpacman.framework.model.Player();
        int int5 = player3.addPoints((int) (short) 10);
        boolean boolean6 = player3.isAlive();
        org.jpacman.framework.model.Direction direction7 = player3.getDirection();
        player3.die();
        game0.addPlayer(player3);
        player3.deoccupy();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player1 = game0.getPlayer();
        org.jpacman.framework.model.Player player2 = game0.getPlayer();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList4 = game0.getGhosts();
        org.jpacman.framework.model.Board board5 = game0.getBoard();
        boolean boolean6 = game0.hasChanged();
        int int7 = game0.countObservers();
        org.jpacman.framework.model.Board board8 = game0.getBoard();
        org.jpacman.framework.model.IBoardInspector iBoardInspector9 = game0.getBoardInspector();
        boolean boolean10 = game0.died();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jpacman.framework.model.Level level0 = new org.jpacman.framework.model.Level();
        java.lang.String str1 = level0.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor2 = level0.parseMap();
        level0.setMapFile("");
        level0.setMapFile("board.txt");
        level0.setMapFile("PLAYER occupying [-1,100]");
        level0.setMapFile("[-1,100]");
        org.jpacman.framework.model.Game game11 = level0.getGame();
        level0.setMapFile("WALL occupying null");
        org.jpacman.framework.model.Game game14 = level0.getGame();
        org.jpacman.framework.model.Game game15 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Player player16 = game15.getPlayer();
        org.jpacman.framework.model.PointManager pointManager17 = game15.getPointManager();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList18 = game15.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector19 = game15.getBoardInspector();
        game15.notifyObservers((java.lang.Object) 'a');
        org.jpacman.framework.model.Board board24 = new org.jpacman.framework.model.Board(0, 20);
        int int25 = board24.getHeight();
        game15.setBoard(board24);
        org.jpacman.framework.model.Ghost ghost27 = new org.jpacman.framework.model.Ghost();
        game15.addGhost(ghost27);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType30 = ghost27.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType31 = ghost27.getSpriteType();
        org.jpacman.framework.model.Player player32 = new org.jpacman.framework.model.Player();
        int int34 = player32.addPoints((int) (short) 10);
        int int35 = player32.getPoints();
        int int37 = player32.addPoints((int) '4');
        org.jpacman.framework.model.Direction direction38 = player32.getDirection();
        int int39 = direction38.getDy();
        game14.moveGhost(ghost27, direction38);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        org.jpacman.framework.model.Board board1 = game0.getBoard();
        org.jpacman.framework.model.Ghost ghost2 = new org.jpacman.framework.model.Ghost();
        game0.addGhost(ghost2);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType4 = ghost2.getSpriteType();
        ghost2.deoccupy();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        java.lang.String str1 = wall0.toString();
        wall0.deoccupy();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jpacman.framework.model.Wall wall0 = new org.jpacman.framework.model.Wall();
        java.lang.String str1 = wall0.toString();
        java.lang.Class<?> wildcardClass2 = wall0.getClass();
        wall0.deoccupy();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.jpacman.framework.model.Food food20 = new org.jpacman.framework.model.Food();
        int int21 = food20.getPoints();
        int int22 = food20.getPoints();
        int int23 = food20.getPoints();
        java.lang.String str24 = food20.toString();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType25 = food20.getSpriteType();
        java.lang.Class<?> wildcardClass26 = food20.getClass();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType27 = food20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType28 = food20.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType29 = food20.getSpriteType();
        food20.setPoints((int) '4');
        int int32 = food20.getPoints();
        java.lang.String str33 = food20.toString();
        game0.addFood(food20);
        org.jpacman.framework.model.Level level35 = new org.jpacman.framework.model.Level();
        java.lang.String str36 = level35.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor37 = level35.parseMap();
        org.jpacman.framework.model.Game game38 = level35.getGame();
        org.jpacman.framework.model.Board board39 = game38.getBoard();
        org.jpacman.framework.model.Tile tile42 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int43 = tile42.getY();
        int int44 = tile42.getY();
        org.jpacman.framework.model.Direction direction45 = org.jpacman.framework.model.Direction.RIGHT;
        int int46 = direction45.getDx();
        int int47 = direction45.getDy();
        org.jpacman.framework.model.Tile tile48 = board39.tileAtDirection(tile42, direction45);
        game0.movePlayer(direction45);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jpacman.framework.model.PointManager pointManager0 = new org.jpacman.framework.model.PointManager();
        org.jpacman.framework.model.PointManager pointManager1 = new org.jpacman.framework.model.PointManager();
        pointManager1.addPointsToBoard((int) (byte) 10);
        int int4 = pointManager1.totalFoodInGame();
        org.jpacman.framework.model.Player player5 = new org.jpacman.framework.model.Player();
        int int7 = player5.addPoints((int) (short) 10);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType8 = player5.getSpriteType();
        java.lang.String str9 = player5.toString();
        pointManager1.consumePointsOnBoard(player5, 72);
        pointManager0.consumePointsOnBoard(player5, (-1));
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType14 = player5.getSpriteType();
        player5.deoccupy();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jpacman.framework.model.Game game0 = new org.jpacman.framework.model.Game();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList1 = game0.getGhosts();
        java.util.List<org.jpacman.framework.model.Ghost> ghostList2 = game0.getGhosts();
        org.jpacman.framework.model.IBoardInspector iBoardInspector3 = game0.getBoardInspector();
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
        game0.movePlayer(direction18);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jpacman.framework.model.Player player33 = new org.jpacman.framework.model.Player();
        player33.die();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = player33.getSpriteType();
        boolean boolean36 = player33.isAlive();
        int int38 = player33.addPoints((int) (short) 1);
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType39 = player33.getSpriteType();
        game0.addPlayer(player33);
        org.jpacman.framework.model.Player player41 = new org.jpacman.framework.model.Player();
        int int43 = player41.addPoints((int) (short) 10);
        int int44 = player41.getPoints();
        int int46 = player41.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType47 = player41.getSpriteType();
        int int49 = player41.addPoints((int) (short) 10);
        player41.resurrect();
        org.jpacman.framework.model.Direction direction51 = player41.getDirection();
        game0.movePlayer(direction51);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        org.jpacman.framework.model.Player player33 = game0.getPlayer();
        org.jpacman.framework.model.Ghost ghost34 = new org.jpacman.framework.model.Ghost();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType35 = ghost34.getSpriteType();
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType36 = ghost34.getSpriteType();
        org.jpacman.framework.model.Tile tile39 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int40 = tile39.getX();
        int int41 = tile39.getX();
        org.jpacman.framework.model.Player player42 = new org.jpacman.framework.model.Player();
        int int44 = player42.addPoints((int) (short) 10);
        int int45 = player42.getPoints();
        int int47 = player42.addPoints((int) '4');
        boolean boolean48 = tile39.containsSprite((org.jpacman.framework.model.Sprite) player42);
        java.lang.Class<?> wildcardClass49 = tile39.getClass();
        ghost34.occupy(tile39);
        game0.addGhost(ghost34);
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
        boolean boolean72 = player52.isAlive();
        org.jpacman.framework.model.Level level73 = new org.jpacman.framework.model.Level();
        java.lang.String str74 = level73.getMapFile();
        org.jpacman.framework.model.IGameInteractor iGameInteractor75 = level73.parseMap();
        org.jpacman.framework.model.Game game76 = level73.getGame();
        org.jpacman.framework.model.Board board77 = game76.getBoard();
        org.jpacman.framework.model.Tile tile80 = new org.jpacman.framework.model.Tile(10, (int) (short) -1);
        int int81 = tile80.getY();
        int int82 = tile80.getY();
        org.jpacman.framework.model.Direction direction83 = org.jpacman.framework.model.Direction.RIGHT;
        int int84 = direction83.getDx();
        int int85 = direction83.getDy();
        org.jpacman.framework.model.Tile tile86 = board77.tileAtDirection(tile80, direction83);
        player52.setDirection(direction83);
        game0.movePlayer(direction83);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        pointManager0.consumePointsOnBoard(player6, 19);
        org.jpacman.framework.model.Player player27 = new org.jpacman.framework.model.Player();
        int int29 = player27.addPoints((int) (short) 10);
        int int30 = player27.getPoints();
        int int32 = player27.addPoints((int) '4');
        org.jpacman.framework.model.IBoardInspector.SpriteType spriteType33 = player27.getSpriteType();
        int int35 = player27.addPoints((int) (short) 10);
        player27.resurrect();
        player27.die();
        pointManager0.consumePointsOnBoard(player27, 0);
        player27.die();
        player27.deoccupy();
    }
}

