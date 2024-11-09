class Stack
{
    private int stack[], top;
    Stack()
    {
        stack = new int[10];
        top = -1;
    }
    void push(int ele)
    {
        if(top == stack.length - 1) System.out.println("Stack Overflow occured!");
        else stack[++top] = ele;
    }
    int pop()
    {
        if(top < 0)
        {
            System.out.print("Stack Underflow Occured! ");
            return -100000;
        }
        else return stack[top--];
    }
}

class StackTest
{
    public static void main(String[] args)
    {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        System.out.println("My Stack 1: \nPush Operation:");
        for(int i = 0; i < 11; i++) mystack1.push(i + 1);
        System.out.println("Pop Operation:");
        for(int i = 0; i < 13; i++) System.out.println(mystack1.pop());

        System.out.println("\nMy Stack 2: \nPush Operation:");
        for(int i = 10; i < 25; i++) mystack2.push(i + 1);
        System.out.println("Pop Operation:");
        for(int i = 0; i < 10; i++) System.out.println(mystack2.pop());
    }
}
