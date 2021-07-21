class Dogs {
	
	//addition/subtraction/multiplication
	//print the results of add/mul/sub
	//put it in separate files 
	//- Calculations.class/ExecuteCalculations.class
	
	//Members/Fields - state
	private String name = "unknown";//int x = 9
	private String color = "unknown";
	
	//Methods
	public void printDogDetails() {
		
		name = "browny";
		color = "black";
		
		System.out.println("name :: " + name);
		System.out.println("color :: " + color);
	}	
}

public class Dog {
		
	public static void main(String [] args) {
		
		System.out.println("Dog Class");
		
		Dogs browny = new Dogs(); // browny - reference variable			
		browny.printDogDetails();
		
		
	}
}