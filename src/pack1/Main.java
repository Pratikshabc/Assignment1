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




