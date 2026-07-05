class Solution {
    public void setZeroes(int[][] matrix) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        boolean[] rows = new boolean[totalRows];
        boolean[] cols = new boolean[totalCols];

        for(int i = 0; i < totalRows;i++){
            for(int j = 0; j < totalCols;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i = 0; i < totalRows;i++){
            for(int j = 0; j < totalCols;j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}