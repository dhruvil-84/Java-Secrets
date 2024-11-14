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
    BoxWeight(double w, double h, double d, double m)
    {
        width = w;
        height = h;
        depth = d;
        mass = m;
    }
}

class BoxColour extends Box
{
    String colour;
    BoxColour(double w, double h, double d, String c)
    {
        width = w;
        height = h;
        depth = d;
        colour = c;
    }
}

class HierarIn
{
    public static void main(String[] args)
    {
        BoxWeight box1 = new BoxWeight(10, 15, 20, 12.25);
        BoxColour box2 = new BoxColour(3, 2, 5, "brown"); 

        double vol1 = box1.volume();
        System.out.println("The volume of the box1 is: " + vol1);
        System.out.println("The volume of the box2 is: " + box2.volume());

        System.out.println("The mass of the box1 is: " + box1.mass);
        System.out.println("The colour of the box2 is: " + box2.colour);
    }
}
