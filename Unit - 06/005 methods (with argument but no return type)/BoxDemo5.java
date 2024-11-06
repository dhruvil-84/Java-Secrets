class Box
{
    int width, height, depth;
    double volume()
    {
        return (width * height * depth);
    }
    void setDimensions(int w, int h, int d)
    {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDimensions(10, 20, 30);
        mybox2.setDimensions(10, 15, 20);

        double vol1 = mybox1.volume();
        System.out.println("The volume of the box is: " + vol1);
        
        System.out.println("The volume of the box is: " + mybox2.volume());
    }
}
