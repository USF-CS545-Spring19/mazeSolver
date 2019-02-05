package maze;

import draw.StdDraw;

import java.awt.*;

/** The class that stores the maze, and has methods to read it from the
 * file, to draw it, and to solve it using a "follow left hand" method,
 * as well as helper methods.
 */
public class MazeSolver {
    public static Color YELLOW = new Color(255, 255, 0);
    public static Color BLACK = new Color(0, 0, 0);

    private int[][] maze; // 0 represents the space, 1 represents the wall

    /**
     * Draw a square to represent a cell of the maze at row i and column j
     * (draw using a given color).
     *
     * @param i row id
     * @param j column id
     * @param color color
     */
    public void drawSquare(int i, int j, Color color) {
        int x = j;
        int y = i;
        int rows = maze.length;
        int cols = maze[0].length;
        double sqSizeY = 1.0 / rows;
        double sqSizeX = 1.0 / cols;
        StdDraw.setPenColor(color);
        double centerX = x * sqSizeX + sqSizeX / 2.0;
        double centerY = 1 - y * sqSizeY - sqSizeY / 2.0;
        StdDraw.filledRectangle(centerX, centerY, sqSizeX / 2.0, sqSizeY / 2.0);
    }

    /** Draw the maze: draw wall in black, and passages in white. */
    public void displayMaze() {
        int rows = maze.length;
        int cols = maze[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // draw a black square at (i,j) if there is a wall at that cell
                // don't draw anything otherwise (equivalent to drawing a "white
                // square")
                int res = maze[i][j];
                if (res == 1) {
                    drawSquare(i, j, StdDraw.BLACK);

                }
            }
        }
    }


    // FILL IN CODE: add a method to read the maze from the file;
    // add a method solve the maze and add helper methods as needed.


}
