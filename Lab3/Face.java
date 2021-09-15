public class Face implements Cloneable {
    private final int[][] grid;
    private static final int THREE = 3;
    private static final int TEN = 10;
    
    public Face(int[][] grid) {
        this.grid = grid;
    }

    /**
     * this method is used to turn the Face right.
     */
    public Face right() {
        int [][] newGrid = new int[THREE][THREE];
        for (int i = 0; i < THREE; i++) {
            for (int j = 0; j < THREE; j++) {
                newGrid[i][j] = this.grid[2 - j][i];
            }
        }
        return new Face(newGrid);
    }

    /**
     * this method is used to turn the Face left.
     */
    public Face left() {
        int[][] newGrid = new int[THREE][THREE];
        for (int i = 0; i < THREE; i++) {
            for (int j = 0; j < THREE; j++) {
                newGrid[i][j] = this.grid[j][2 - i];
            }
        }
        return new Face(newGrid);
    }

    /**
     * this method is used to turn the Face half.
     */
    public Face half() {
        int[][] newGrid = new int[THREE][THREE];
        for (int i = 0; i < THREE; i++) {
            for (int j = 0; j < THREE; j++) {
                newGrid[i][j] = this.grid[2 - i][2 - j];
            }
        }
        return new Face(newGrid);
    }

    /**
     * this method is used to turn the Face to Array.
     */
    public int[][] toIntArray() { 
        int[][] newGrid = new int[THREE][THREE];
        for (int i = 0;i < this.grid.length;i++) {
            for (int j = 0;j < this.grid[i].length;j++) {
                newGrid[i][j] = this.grid[i][j];
            }
        }
        return newGrid;
    }

    @Override
    /**
     * this method is used to clone a Face.
     */
    public Face clone() {
        return new Face(this.toIntArray());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < THREE; i++) {
            output.append("\n");
            for (int j = 0; j < THREE; j++) {
                if (this.grid[i][j] < TEN) {
                    output.append(0);
                }
                output.append(this.grid[i][j]);
            }
        }
        output.append("\n");
        return output.toString();
    }
}

