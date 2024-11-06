class Box
{
    int width, height, depth;
    void volume()
    {
        System.out.println("The volume of the box is: " + (width * height * depth));
    }
}

class BoxDemo3
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

        mybox2.width = 10;
        mybox2.height = 15;
        mybox2.depth = 20;

        mybox1.volume();
        mybox2.volume();
    }
}
