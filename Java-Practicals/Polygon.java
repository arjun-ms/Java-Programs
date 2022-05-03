abstract class Shape{
		abstract void noOfSides();
}

class Triangle extends Shape{
	void noOfSides(){
		System.out.println("Triangle: 3");
	}
}

class Hexagon extends Shape{
	void noOfSides(){
		System.out.println("Hexagon: 6");
	}
}

class Rectangle extends Shape{
	void noOfSides(){
		System.out.println("Rectangle: 4");
	}
}

public class Polygon{
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Hexagon h1 = new Hexagon();
		Rectangle r1 = new Rectangle();
		
		t1.noOfSides();
		h1.noOfSides();
		r1.noOfSides();
	}
}
