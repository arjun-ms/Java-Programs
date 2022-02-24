abstract class Shape{
    double l,b,h;
    public double Length(double l){
        return this.l = l;
    }
    public double Breadth(double b){
        return this.b = b;
    }
    public double Height(double h){
        return this.h = h;
    }
    public abstract void area();
}

class Triangle extends Shape{
    public void area(){
        System.out.println("Area: "+0.5*Breadth(5)*Height(10));
    }
}

class Rectangle extends Shape{
    public void area(){
        System.out.println("Area: "+Length(2)*Breadth(3)*Height(4));
    }
}

public class AbstractDemo{
    public static void main(String args[]){
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.area();
        r.area();
    }
}