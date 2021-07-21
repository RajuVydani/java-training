class ExVariables {
	
	private static int x = 10;
	private int y = 20;

	public static void main(String [] args) {		
		
		System.out.println("Welcome !!!");
		
		int a = 28;
		int b = 50;
		boolean output = a != b;
		
		int divison = a / b;
		int reminder = a % b;

		boolean x = false;
		boolean y = true;
		
		a += 5;
		a *= 5;
		
		System.out.println("Assignment Operator :: " + a);
		
	    String results = a > b ? "good" : "bad";
		
		System.out.println("Terinary Operator :: " + results);
		
		System.out.println("relational operator :: " + output );
		
		//System.out.println("PREFIX ::" +    --a);
		System.out.println("POSTFIX ::" +    a++);
		System.out.println("reminder ::" +    reminder);
		
		
	
	}

}