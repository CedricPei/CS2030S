import java.util.List;
import java.util.ArrayList;

public class RubikFront extends Rubik implements Cloneable {
    private final Face top;
    private final Face left;
    private final Face front;
    private final Face right;
    private final Face down;
    private final Face back;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int ELEVEN = 11;
    
    /**
     * this method is used to create a Rubik.
     */
    public RubikFront(int[][][] grid) {
        top = new Face(grid[0]);
        left = new Face(grid[1]);
        front = new Face(grid[2]);
        right = new Face(grid[THREE]);
        down = new Face(grid[FOUR]);
        back = new Face(grid[FIVE]); 
    }

    /**
     * this method is used to turn the Rubik left.
     */
    public RubikFront left() {
        int[][] gridFront = this.front.clone().left().toIntArray();
        int[][] gridTop = this.top.clone().toIntArray();    
        int[][] gridLeft = this.left.clone().toIntArray();
        int[][] gridRight = this.right.clone().toIntArray();
        int[][] gridDown = this.down.clone().toIntArray();
        int[][] gridBack = this.back.clone().toIntArray();

        List<Integer> faceSides = new ArrayList<>();
        //add top to faceSides
        for (int i = 0; i <= 2; i++) {
            faceSides.add(gridTop[2][i]);
        }
        //add right to faceSides
        for (int i = 0; i <= 2; i++) {
            faceSides.add(gridRight[i][0]);
        }
        //add bottom to faceSides
        for (int i = 0; i <= 2; i++) {
            faceSides.add(gridDown[0][i]);
        }
        //add left to faceSides
        for (int i = 0; i <= 2; i++) {
            faceSides.add(gridLeft[i][2]);
        }
        //rotate faceSides clockwise
        for (int i = 0; i <= 2; i++) {
            int current = faceSides.remove(0);
            faceSides.add(current);
        }
        for (int i = 0; i <= ELEVEN; i++) {
            switch (i) {
                case 0: case 1: case 2:
                    gridTop[2][i] = faceSides.get(i);
                    break;
                case THREE: case FOUR: case FIVE:
                    gridRight[FIVE - i][0] = faceSides.get(i);
                    break;
                case SIX: case SEVEN: case EIGHT:
                    gridDown[0][i - SIX] = faceSides.get(i);
                    break;
                case NINE: case TEN: case ELEVEN:
                    gridLeft[ELEVEN - i][2] = faceSides.get(i);
                    break;
                default:
                    break;
            }
        }
        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to turn the Rubik half.
     */
    public RubikFront half() {
        return this.left().left(); 
    }

    /**
     * this method is used to turn the Rubik right.
     */
    public RubikFront right() {
        return this.left().left().left();
    }

    /**
     * this method is used to turn the Rubik to Array.
     */
    public int[][][] toIntArray() {
        int[][] gridFront = this.front.toIntArray();
        int[][] gridTop = this.top.toIntArray();
        int[][] gridLeft = this.left.toIntArray();
        int[][] gridRight = this.right.toIntArray();
        int[][] gridDown = this.down.toIntArray();
        int[][] gridBack = this.back.toIntArray();
        return new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack};
    }

    @Override
    /**
     * this methos is used to clone a Rubik.
     */
    public RubikFront clone() {
        return new RubikFront(this.toIntArray());
    }

    @Override
    public String toString() {
        int[][] gridFront = this.front.clone().toIntArray();
        int[][] gridTop = this.top.clone().toIntArray();    
        int[][] gridLeft = this.left.clone().toIntArray();
        int[][] gridRight = this.right.clone().toIntArray();
        int[][] gridDown = this.down.clone().toIntArray();
        int[][] gridBack = this.back.clone().toIntArray();

        StringBuilder output = new StringBuilder();
        //...Top...
        for (int i = 0; i <= 2; i++) {
            output.append("\n");
            output.append("......");
            for (int j = 0; j <= 2; j++) {
                if (gridTop[i][j] < TEN) {
                    output.append(0);
                }
                output.append(gridTop[i][j]);
            }
            output.append("......");
        }
        //LeftFrontRight
        for (int i = 0; i <= 2; i++) {
            output.append("\n");
            for (int j = 0; j <= EIGHT; j++) {
                switch (j) {
                    case 0: case 1: case 2:
                        if (gridLeft[i][j] < TEN) {
                            output.append(0);
                        }
                        output.append(gridLeft[i][j]);
                        break;
                    case THREE: case FOUR: case FIVE:
                        if (gridFront[i][j - THREE] < TEN) {
                            output.append(0);
                        }
                        output.append(gridFront[i][j - THREE]);
                        break;
                    case SIX: case SEVEN: case EIGHT:
                        if (gridRight[i][j - SIX] < TEN) {
                            output.append(0);
                        }
                        output.append(gridRight[i][j - SIX]);
                        break;
                    default:
                        break;
                }
            }
        }
        //Bottom
        for (int i = 0; i <= 2; i++) {
            output.append("\n");
            output.append("......");
            for (int j = 0; j <= 2; j++) {
                if (gridDown[i][j] < TEN) {
                    output.append(0);
                }
                output.append(gridDown[i][j]);
            }
            output.append("......");
        }
        //Back        
        for (int i = 0; i <= 2; i++) {
            output.append("\n");
            output.append("......");
            for (int j = 0; j <= 2; j++) {
                if (gridBack[i][j] < TEN) {
                    output.append(0);
                }
                output.append(gridBack[i][j]);
            }
            output.append("......");
        }
        output.append("\n");
        return output.toString();
    }

    /**
     * this method is used to rightview the Rubik.
     */
    public RubikFront rightView() {
        int[][] gridFront = this.right.clone().toIntArray();
        int[][] gridTop = this.top.clone().right().toIntArray();
        int[][] gridLeft = this.front.clone().toIntArray();
        int[][] gridRight = this.back.clone().half().toIntArray();
        int[][] gridDown = this.down.clone().left().toIntArray();
        int[][] gridBack = this.left.clone().half().toIntArray();

        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to leftview the Rubik.
     */
    public RubikFront leftView() {
        int[][] gridFront = this.left.clone().toIntArray();
        int[][] gridTop = this.top.clone().left().toIntArray();
        int[][] gridLeft = this.back.clone().half().toIntArray();
        int[][] gridRight = this.front.clone().toIntArray();
        int[][] gridDown = this.down.clone().right().toIntArray();
        int[][] gridBack = this.right.clone().half().toIntArray();

        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to backview the Rubik.
     */
    public RubikFront backView() {
        int[][] gridFront = this.back.clone().half().toIntArray();
        int[][] gridTop = this.top.clone().half().toIntArray();
        int[][] gridLeft = this.right.clone().toIntArray();
        int[][] gridRight = this.left.clone().toIntArray();
        int[][] gridDown = this.down.clone().half().toIntArray();
        int[][] gridBack = this.front.clone().half().toIntArray();

        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to frontview the Rubik.
     */
    public RubikFront frontView() {
        int[][] gridFront = this.front.clone().toIntArray();
        int[][] gridTop = this.top.clone().toIntArray();
        int[][] gridLeft = this.left.clone().toIntArray();
        int[][] gridRight = this.right.clone().toIntArray();
        int[][] gridDown = this.down.clone().toIntArray();
        int[][] gridBack = this.back.clone().toIntArray();

        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to upview the Rubik.
     */
    public RubikFront upView() {
        int[][] gridFront = this.top.clone().toIntArray();
        int[][] gridTop = this.back.clone().toIntArray();
        int[][] gridLeft = this.left.clone().right().toIntArray();
        int[][] gridRight = this.right.clone().left().toIntArray();
        int[][] gridDown = this.front.clone().toIntArray();
        int[][] gridBack = this.down.clone().toIntArray();
        
        return new RubikFront(new int[][][]{gridTop, gridLeft, gridFront, gridRight,
            gridDown, gridBack});
    }

    /**
     * this method is used to downview the Rubik.
     */
    public RubikFront downView() {
        return this.upView().upView().upView();
    }
}
