class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++)
        s+=mat[i][i];
        System.out.println(s);
        for(int i=mat.length-1,j=0;i>=0  ;i--,j++)
        if( i!=j)
        s+=mat[i][j];
        System.out.println(s);
        return s;
    }
}