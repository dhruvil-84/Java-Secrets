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

class Shipment extends BoxWeight
{
    double cost;
    Shipment()
    {
        super();
        cost = -1;
    }
    Shipment(double side, double mass, double c)
    {
        super(side, mass);
        cost = c;
    }
    Shipment(double w, double h, double d, double m, double c)
    {
        super(w, h, d, m);
        cost = c;
    }
    Shipment(Shipment obj)
    {
        super(obj);
        this.cost = obj.cost;
    }
}

class MultiIn
{
    public static void main(String[] args)
    {
        Shipment ship1 = new Shipment();
        System.out.println("The volume of the box1 (Ship1) is: " + ship1.volume());
        System.out.println("The mass of the box1 (Ship1) is: " + ship1.mass);
        System.out.println("The cost of Shipment 1 is: " + ship1.cost + "\n");

        Shipment ship2 = new Shipment(10, 100, 900);
        System.out.println("The volume of the box2 (Ship2) is: " + ship2.volume());
        System.out.println("The mass of the box2 (Ship2) is: " + ship2.mass);
        System.out.println("The cost of Shipment 2 is: " + ship2.cost + "\n");

        Shipment ship3 = new Shipment(2, 3, 4, 0.76, 1.28);
        System.out.println("The volume of the box3 (Ship3) is: " + ship3.volume());
        System.out.println("The mass of the box3 (Ship3) is: " + ship3.mass);
        System.out.println("The cost of Shipment 3 is: " + ship3.cost + "\n");

        Shipment ship4 = new Shipment(ship2);
        System.out.println("The volume of the box4 (Ship4) is: " + ship4.volume());
        System.out.println("The mass of the box4 (Ship4) is: " + ship4.mass);
        System.out.println("The cost of Shipment 4 is: " + ship4.cost + "\n");
    }
}
