package pack1;
abstract class Car {
    final void accelerator()
    {
        System.out.println("Car Accelerator");
    }
    final void brake()
    {
        System.out.println("Car Brake ");
    }
    final void clutch()
    {
        System.out.println("Car Clutch");
    }
    protected abstract void color(String color_name);
    protected abstract void wheel(String wheel);
    protected abstract void engine(String eng);
}

class Honda extends Car{

    public void color (String n)
    {
        System.out.println("Honda Color is: "+n);
    }
    public void wheel (String w)
    {
        System.out.println("Honda wheel is: "+w);
    }
    public void engine (String e)
    {
        System.out.println("Honda engine is: "+e);
    }
}
class Hyundai extends Car{
    public void color(String n)
    {
        System.out.println("Hyundai Color is: "+n);
    }
    public void wheel(String w)
    {
        System.out.println("Hyundai wheel is: "+w);
    }
    public void engine(String e)
    {
        System.out.println("Hyundai engine is: "+e);
    }

}
class Toyota extends Car{
    public void color(String n)
    {
        System.out.println("Hyundai Color is: "+n);
    }
    public void wheel(String w)
    {
        System.out.println("Hyundai wheel is: "+w);
    }
    public void engine(String e)
    {
        System.out.println("Hyundai engine is: "+e);
    }

}





