package Chapter04_arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sum = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                sum += grid[i][j];
            }
        }

        System.out.println(sum);
    }
}
