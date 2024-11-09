class RecursionDemo
{
    void printArr(int idx, int[] arr)
    {
        if(idx < 0) return;
        else printArr(idx - 1, arr);
        System.out.println("arr[" + idx + "] = " + arr[idx]);
    }
}

class Recursion
{
    public static void main(String[] args)
    {
        RecursionDemo obj = new RecursionDemo();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.printArr(arr.length - 1, arr);
    }
}
