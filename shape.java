abstract class Shape { 
	
	abstract void display();
	
	public void details() {
		
		//functionality
		System.out.println("concrete method");
	}
}

class Traingle extends Shape {
	
	void display(){
		//functionality
		System.out.println("This is Traingle !!!");
	}
}

class Square extends Shape {
	
	void display(){
		//functionality
		System.out.println("This is Square !!!");
	}
}

class ShapeTest {
	
	public static void main(String [] args) {
		
		Shape shape = new Square();
		shape.display();
		
	}	
}