/*
--> sometimes we need parent class to just declare the structure and child class should implement it; therefore abstract keyword arrives.
--> In the previous program we saw run time polymorphism (DMD) we will upgrade it with Shape as Abstract class and area() are abstract method. this is because we want that no object should be created of class Shape as Shape is just a class which is like a structure for other classes. we want other classes to inherit from Shape class and override useful methods and no object of class Shape should be created.

NOTE: we cannot create object for Shape class but we can create reference variables of Shape class.
*/

abstract class Shape
{
    float dimension1, dimension2;
    Shape(float dimension1, float dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    abstract float area();
}

class Rectangle extends Shape
{
    Rectangle(float dim1, float dim2)
    {
        super(dim1, dim2);
    }
    float area()
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

class Abstract
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(10.10f, 20.20f);
        RightTriangle rtri = new RightTriangle(10.10f, 20.20f);

        Shape shape;
        shape = rect;
        System.out.println(shape.area());
        shape = rtri;
        System.out.println(shape.area());
    }
}
