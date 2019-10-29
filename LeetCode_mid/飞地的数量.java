/*
给出一个二维数组 A，每个单元格为 0（代表海）或 1（代表陆地）。

移动是指在陆地上从一个地方走到另一个地方（朝四个方向之一）或离开网格的边界。

返回网格中无法在任意次数的移动中离开网格边界的陆地单元格的数量。

*/

class Solution {
    public int numEnclaves(int[][] A) {
        int sum = 0;
        int height = A.length;
        int width = A[0].length;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if((i == 0 || j == 0 || i == height-1 || j == width-1) && A[i][j] == 1){
                    findPath(A, i, j);
                }
            }
        }
        for(int i = 0; i<height; i++){
            for(int j = 0; j < width; j++){
                if(A[i][j] == 1){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void findPath(int[][] array, int i, int j){
        if(i < 0 || j < 0 || i >= array.length || j >= array[0].length ||array[i][j] == 0){
            return;
        }
        if(array[i][j] == 1){
            array[i][j] = 0;
        }
        findPath(array, i+1, j);
        findPath(array, i-1, j);
        findPath(array, i, j-1);
        findPath(array, i, j+1);
    }
}
