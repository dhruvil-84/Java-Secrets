class JaggedArr
{
    public static void main(String[] args)
    {
        int k = 10;
        int[][] jag1 = new int[4][];
        jag1[0] = new int[1];
        jag1[1] = new int[4];
        jag1[2] = new int[2];
        jag1[3] = new int[3];
        for(int i = 0; i < jag1.length; i++) {
            for(int j = 0; j < jag1[i].length; j++) {
                jag1[i][j] = k--;
                System.out.print(jag1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        double[][] jag2 = {{1.1,  2.2}, {3.3, 4.4, 5.5, 6.6}, {7.7}, {8.8, 9.9, 9.8}};
        for(int i = 0; i < jag2.length; i++) {
            for(int j = 0; j < jag2[i].length; j++) {
                System.out.print(jag2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
