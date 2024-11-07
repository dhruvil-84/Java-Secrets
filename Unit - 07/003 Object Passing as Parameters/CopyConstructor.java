class Box
{
    double width, height, depth;
    // Box obj;
    Box()
    {
        width = height = depth = -1;
    }
    Box(double s)
    {
        width = height = depth = s;
    }
    Box(double width, double depth, double height)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box obj)
    {
        // this.obj = obj; // shallow copy --> mybox2 and mybox4 points to same objects. (so any changes in box 2 will affect box 4 and vice - versa).
        
        // Deep copy --> mybox 4 has the copy of mybox2 so mybox2 & mybox4 are different. (so any changes in box 2 will not affect box 4 and vice - versa).
        width = obj.width;
        height = obj.height;
        depth = obj.depth;

        // There is one more Lazy copy... (You can also use clone() method)
    }
    double volume()
    {
        return width * height * depth;
    }
}

class CopyConstructor
{
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box(11);
        Box mybox3 = new Box(10, 20, 30);
        Box mybox4 = new Box(mybox2); 

        double vol1 = mybox1.volume();
        System.out.println("The volume of the box1 is: " + vol1);
        System.out.println("The volume of the box2 is: " + mybox2.volume());
        System.out.println("The volume of the box3 is: " + mybox3.volume());
        System.out.println("The volume of the box4 is: " + mybox4.volume());
    }
}
