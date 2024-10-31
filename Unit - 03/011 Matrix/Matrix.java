class Matrix
{
    public static void main(String[] args)
    {
        int i, j, k = 1;
        int[][] mat = new int[2][4];
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 4; j++) {
                mat[i][j] = k++;
            }
        }
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
