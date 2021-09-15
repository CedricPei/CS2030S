import java.util.Scanner;

class Main {
    static final int NFACES = 6;
    static final int NROWS = 3;
    static final int NCOLS = 3;

    static Rubik oneMove(Rubik rubik, String move) {
        if (move.length() == 1) {
            switch (move) {
                case "F":
                    rubik = new RubikFront(rubik.toIntArray()).right();
                    break;
                case "R":
                    rubik = new RubikRight(rubik).right();
                    break;
                case "U":
                    rubik = new RubikUp(rubik).right();
                    break;
                case "L":
                    rubik = new RubikLeft(rubik).right();
                    break;
                case "B":
                    rubik = new RubikBack(rubik).right();
                    break;
                case "D":
                    rubik = new RubikDown(rubik).right();
                    break;
                default:
                    break;
            }
        } else {
            if (move.charAt(1) == '\'') {
                switch (move) {
                    case "F\'":
                        rubik = new RubikFront(rubik.toIntArray()).left();
                        break;
                    case "R\'":
                        rubik = new RubikRight(rubik).left();
                        break;
                    case "U\'":
                        rubik = new RubikUp(rubik).left();
                        break;
                    case "L\'":
                        rubik = new RubikLeft(rubik).left();
                        break;
                    case "B\'":
                        rubik = new RubikBack(rubik).left();
                        break;
                    case "D\'":
                        rubik = new RubikDown(rubik).left();
                        break;
                    default:
                        break;
                }
            } else {
                switch (move)  {
                    case "F2":
                        rubik = new RubikFront(rubik.toIntArray()).half();
                        break;
                    case "R2":
                        rubik = new RubikRight(rubik).half();
                        break;
                    case "U2":
                        rubik = new RubikUp(rubik).half();
                        break;
                    case "L2":
                        rubik = new RubikLeft(rubik).half();
                        break;
                    case "B2":
                        rubik = new RubikBack(rubik).half();
                        break;
                    case "D2":
                        rubik = new RubikDown(rubik).half();
                        break;
                    default:
                        break;
                }
            }
        }
        return rubik;
    }


    public static void main(String[] args) {
        int[][][] grid = new int[NFACES][NROWS][NCOLS];

        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < NFACES; k++) {
            for (int i = 0; i < NROWS; i++) {
                for (int j = 0; j < NCOLS; j++) {
                    grid[k][i][j] = sc.nextInt();
                }
            }
        }
        Rubik rubik = new RubikFront(grid);

        while (sc.hasNext()) {
            rubik = oneMove(rubik, sc.next());
        }
        System.out.println(rubik);
    }
}
