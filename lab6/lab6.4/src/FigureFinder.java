import java.util.HashSet;

public class FigureFinder {

    private int[][] grid;
    private int rows;
    private int cols;
    private HashSet<HashSet<String>> figures;

    public FigureFinder(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.figures = new HashSet<>();
    }

    public HashSet<HashSet<String>> findFigures() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    HashSet<String> figure = new HashSet<>();
                    dfs(i, j, figure);
                    if (!isFigureDuplicate(figure)) {
                        figures.add(figure);
                    }
                }
            }
        }
        return figures;
    }

    private void dfs(int i, int j, HashSet<String> figure) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0 || figure.contains(i + "," + j)) {
            return;
        }
        figure.add(i + "," + j);
        dfs(i - 1, j, figure);
        dfs(i + 1, j, figure);
        dfs(i, j - 1, figure);
        dfs(i, j + 1, figure);
    }

    private boolean isFigureDuplicate(HashSet<String> figure) {
        for (HashSet<String> existingFigure : figures) {
            if (existingFigure.containsAll(figure)) {
                return true;
            }
        }
        return false;
    }
}