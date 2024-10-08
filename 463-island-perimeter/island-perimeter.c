
int islandPerimeter(int** grid, int gridSize, int* gridColSize) {
    int perimeter = 0;
    int rows = gridSize;
    int cols = *gridColSize;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (grid[i][j] == 1) {
                perimeter += 4;
                if (i > 0 && grid[i - 1][j] == 1) {
                    perimeter -= 2;
                }
                if (j > 0 && grid[i][j - 1] == 1) {
                    perimeter -= 2; 
                }
            }
        }
    }

    return perimeter;
}