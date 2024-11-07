class Box
{
    int width, height, depth;
    double volume(int width, int height, int depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
        return (width * height * depth);
    }
}

class BoxDemo6
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol1 = mybox1.volume(10, 20, 30);
        System.out.println("The volume of the box is: " + vol1);
        
        System.out.println("The volume of the box is: " + mybox2.volume(10, 15, 20));
    }
}
