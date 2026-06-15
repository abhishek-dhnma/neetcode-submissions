class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // The Core Concept: Using Corners as Decision Tree RootsFor this algorithm to work,
        // the matrix must be sorted in two specific ways:Each row is sorted from left to right.Each column is sorted from top to bottom.
        //When you stand at the top-right element $(row = 0, col = matrix[0].length - 1)$, you are at a very unique strategic position. 
        //It acts like the root of a Binary Search Tree:
        //Everything to its left in the same row is smaller.Everything below it in the same column is greater.

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m-1;

        while(col >=0  && row <n && col < m && row >=0 ){
            
            if(target == matrix[row][col] ){
                return true;
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }

        }

        return false;
        
    }
}
