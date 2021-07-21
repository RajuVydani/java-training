class Cat {
	
	private String name;
	private int weight;
	private String color;
	static String collegeName;
	
	{
		System.out.println("Static Block");		
		collegeName = "vasavi eng college";
		
	}
	
	//constructor - constructs an object	
	Cat(String givenName) {
		System.out.println(givenName);
		name = givenName;
		
	}
	
	Cat(String givenName, int givenWeight) {		
		System.out.println(givenWeight);
		name = givenName;
		weight = givenWeight;		
	}
	
	
	public static void main(String [] args) {
		
		//declaration - initialisation
		Cat meow = new Cat("pussy cat");
		Cat meow2 = new Cat("kitty", 10);
		System.out.println(meow2.name);
		System.out.println(meow2.collegeName);				
	}
}