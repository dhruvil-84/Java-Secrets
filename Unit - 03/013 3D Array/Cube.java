class Cube
{
    public static void main(String[] args)
    {
        int arr3d[][][] = new int[3][4][5];
        // visualize a cube with 3 layers back & forth, with 4 rows and 1 column.
        for(int i = 0; i < arr3d.length; i++)
        {
            for(int j = 0; j < arr3d[i].length; j++)
            {
                for(int k = 0; k < arr3d[i][j].length; k++)
                {
                        arr3d[i][j][k] = 8 - i;
                        System.out.print(arr3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
