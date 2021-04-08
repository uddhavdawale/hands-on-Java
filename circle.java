abstract class shapes
{
shapes()
{
System.out.println("Abstract consctrure is invocked ";

}
abstract void draw();

}

classs circle extends shapes 
{
public void draw()
{
System.out.println("Drawing circle");
}
}

class demoabstract 
{
public static void main(String args[])
{

shapes obj=new circle();
obj.draw();

}
}