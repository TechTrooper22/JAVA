import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {

        // Counting possible paths to get out of the maze
//            int n = countPath(3,3);
//            System.out.println(n);

        // Displaying all possible paths
//            getPath("", 3, 3);

//            ArrayList<String> paths = new ArrayList<>();
//            displayPath02("", 3, 3, paths);
//            for(String path : paths) {
//                System.out.println(path);
//            }

//            System.out.println(displayPath01("", 3, 3));

        // Displaying all possible paths including diagonal
//            ArrayList<String> paths = new ArrayList<>();
//            findPath("", 3, 3, paths);
//            for(String path : paths) {
//               System.out.print(path + " ");
//            }
//            System.out.println("\n" + paths.size());

        // Displaying all possible paths in the presence of obstacle
//            boolean[][] maze = {
//                    {true, true, true},
//                    {true, false, true},
//                    {true, true, true}
//            };
//
//            findPathObst(maze, 0,0, "");

        // Finding all possible paths in 4 directions
//            boolean[][] maze = {
//                    {true, true, true},
//                    {true, true, true},
//                    {true, true, true}
//            };
//
//            findAllPaths(maze, 0, 0, "");

    }

    static int countPath(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int left = countPath(row-1, col);
        int right = countPath(row, col-1);

        return left + right;
    }

    static void getPath(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1) {
            getPath(p + 'D', row - 1, col);
        }

        if(col > 1) {
            getPath(p + 'R', row, col - 1);
        }

    }

    static ArrayList<String> displayPath01(String p, int row, int col) {

        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(row > 1) {
            list.addAll(displayPath01(p + 'D', row - 1, col));
        }

        if(col > 1) {
            list.addAll(displayPath01(p + 'R', row, col - 1));
        }
        return list;
    }

    static void displayPath02(String p, int row, int col, ArrayList<String> list) {
        if(row == 1 && col == 1) {
            list.add(p);
            return;
        }

        if(row > 1) {
            displayPath02(p + 'D', row - 1, col, list);
        }

        if(col > 1) {
            displayPath02(p + 'R', row, col - 1, list);
        }
    }


    static void findPath(String p, int r, int c, ArrayList<String> list) {
        if(r==1 && c==1) {
            list.add(p);
            return;
        }

        if(r > 1) {
            findPath(p + 'V', r-1, c, list);
        }

        if(c > 1) {
            findPath(p + 'H', r, c - 1, list);
        }

        if(c>1 && r>1) {
            findPath(p + 'D', r-1, c-1, list);
        }
    }

    static void findPathObst(boolean[][] board, int r, int c, String p) {
        if(r == board.length-1 && c == board[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c]) {
            return;
        }

        if(r < board.length-1) {
            findPathObst(board, r+1, c, p+'D');
        }

        if(c < board[0].length-1) {
            findPathObst(board, r, c+1, p+'R');
        }
    }

    static void findAllPaths(boolean[][] board, int r, int c, String p) {
        if(r == board.length-1 && c == board[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c]) {
            return;
        }
        // if we arrived at the position were we already visited, we will return to the previous position and check for the another path

        board[r][c] = false;    // marking the position were we visited, so that we don't need to visit that place again,

        if(r < board.length-1) {
            findAllPaths(board, r+1, c, p+'D');
        }

        if(c < board[0].length-1) {
            findAllPaths(board, r, c+1, p+'R');
        }

        if(r > 0) {
            findAllPaths(board, r-1, c, p+'U');
        }

        if(c > 0) {
            findAllPaths(board, r, c-1, p+'L');
        }

        board[r][c] = true;
        // Before returning from the function, the current cell (r,c) is unmarked (set back to true) to allow other paths to traverse through it.
    }

}
