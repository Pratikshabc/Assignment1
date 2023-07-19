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
        System.out.println("Honda Color: "+n);
    }
    public void wheel (String w)
    {
        System.out.println("Honda wheel: "+w);
    }
    public void engine (String e)
    {
        System.out.println("Honda engine: "+e);
    }
}
class Hyundai extends Car{
    public void color(String n)
    {
        System.out.println("Hyundai Color: "+n);
    }
    public void wheel(String w)
    {
        System.out.println("Hyundai wheel: "+w);
    }
    public void engine(String e)
    {
        System.out.println("Hyundai engine: "+e);
    }

}
class Toyota extends Car{
    public void color(String n)
    {
        System.out.println("Toyota Color: "+n);
    }
    public void wheel(String w)
    {
        System.out.println("Toyota wheel: "+w);
    }
    public void engine(String e)
    {
        System.out.println("Toyota engine: "+e);
    }

}

class Main
{
    public static void main(String[] args)
    {
        Car h=new Honda();
        h.accelerator();
        h.brake();
        h.clutch();
        h.color("White");
        h.wheel("Steel Wheels");
        h.engine("Hybrid engine");
        Car hy=new Hyundai();
        hy.accelerator();
        hy.brake();
        hy.clutch();
        hy.color("Grey");
        hy.wheel("Alloy Wheels");
        hy.engine("Electric engine");
        Car t=new Toyota();
        t.accelerator();
        t.brake();
        t.clutch();
        t.color("Black");
        t.wheel("Alloy Wheels");
        t.engine("Hybrid engine");
    }
}




