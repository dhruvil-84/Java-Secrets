class ForEach // also known as Enhanced for loop.
{
    public static void main(String[] args)
    {
        String str = "Hello";
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int mat[][] = {{4, 6, 8, 7}, {3, 6, 5, 8}, {8, 4, 3, 6}};
        
        // Iterating over String.
        for(char c : str.toCharArray()) System.out.println(c);
        System.out.println();

        // Iterating over array.
        int sum = 0;
        for(int num : arr)
        {
            System.out.println("Number: " + num);
            sum += num;
        }
        System.out.println("Summation: " + sum);
        System.out.println();

        // Iterating over matrix.
        for(int x[] : mat) 
        {
            for(int n : x) System.out.print(n + " ");
            System.out.println();
        }

        // Iterating over array to show that for each loop is essentially read-only i.e., it cant change the original value.
        for(int num : arr)
        {
            num *= 10;
            System.out.println("Number: " + num);
            num /= 2; // this will change the num but bcoz of for(num : arr) num will be changed to next val of array.
        }
        for(int num : arr) System.out.println("Number: " + num);
    }
}
