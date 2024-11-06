class Box
{
    int width, height, depth;
}

class BoxDemo2
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.height = 20;
        mybox1.width = 10;
        mybox1.depth = 30;

        mybox2.width = 10;
        mybox2.height = 15;
        mybox2.depth = 20;

        int vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume of the box1 is: " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume of the box2 is: " + vol);
    }
}
