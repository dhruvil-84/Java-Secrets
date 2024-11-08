class RODemo
{
    int a;
    RODemo(int a)
    {
        this.a = a;
    }
    RODemo IncByTen()
    {
        RODemo temp = new RODemo(a + 10);
        return temp;
    }
}

class RO
{
    public static void main(String[] args)
    {
        RODemo obj1 = new RODemo(7);
        RODemo obj2;
        obj2 = obj1.IncByTen();
        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);
        obj2 = obj2.IncByTen();
        System.out.println("now obj2.a: " + obj2.a);
    }
}
