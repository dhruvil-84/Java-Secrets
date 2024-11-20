/*
--> In overloading methods do not depend on the return type; it depends only on the data type and number of params passed.
--> In overriding methods the overriding method must be exactly same as overridden method.

NOTE: till now we have seen that if parent reference is given to child object then access depends on the reference variable; but in Dynamic method dispatch access depends on the object assigned to the reference variable.
(This is only in case when inheritance and overriding is the scenerio).
*/

class Shape
{
    float dimension1, dimension2;
    Shape()
    {
        dimension1 = dimension2 = 0;
    }
    Shape(float dimension1, float dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    float area()
    {
        System.out.println("Shape not defined yet!");
        return 0;
    }
}

class Rectangle extends Shape
{
    Rectangle(float dim1, float dim2)
    {
        super(dim1, dim2);
    }
    float area() // In method overriding inheritance is must and overriding method must have same return type, same name and same params as the overridden method.
    {
        return dimension1 * dimension2;
    }
}

class RightTriangle extends Shape
{
    RightTriangle(float dim1, float dim2)
    {
        super(dim1, dim2);
    }
    float area()
    {
        return dimension1 * dimension2 / 2;
    }
}

class DMD
{
    public static void main(String[] args)
    {
        Shape shape = new Shape();
        Rectangle rect = new Rectangle(10.10f, 20.20f); // Length and breadth is passed.
        RightTriangle rtri = new RightTriangle(10.10f, 20.20f); // Base and Height is passed.
        shape.area();
        shape = rect;
        System.out.println(shape.area());
        shape = rtri;
        System.out.println(shape.area());
    }
}
