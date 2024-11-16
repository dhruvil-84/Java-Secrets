class Box
{
    double width, height, depth;
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
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class BoxWeight extends Box
{
    double mass;
    BoxWeight()
    {
        super();
        mass = -1;
    }
    BoxWeight(double side, double m)
    {
        super(side);
        mass = m;
    }
    BoxWeight(double w, double h, double d, double m)
    {
        super(w, h, d);
        mass = m;
    }
    BoxWeight(BoxWeight obj)
    {
        super(obj);
        this.mass = obj.mass;
    }
}

class SuperOne
{
    public static void main(String[] args)
    {
        BoxWeight box1 = new BoxWeight();
        System.out.println("The volume of the box1 is: " + box1.volume());
        System.out.println("The mass of the box1 is: " + box1.mass + "\n");

        BoxWeight box2 = new BoxWeight(3, 2);
        System.out.println("The volume of the box2 is: " + box2.volume());
        System.out.println("The mass of the box2 is: " + box2.mass + "\n");

        BoxWeight box3 = new BoxWeight(2, 3, 4, 0.076);
        System.out.println("The volume of the box3 is: " + box3.volume());
        System.out.println("The mass of the box3 is: " + box3.mass + "\n");

        BoxWeight box4 = new BoxWeight(box2);
        System.out.println("The volume of the box4 is: " + box4.volume());
        System.out.println("The mass of the box4 is: " + box4.mass + "\n");
    }
}
