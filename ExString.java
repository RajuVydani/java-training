class ExString 
{
	
	private static String firstName = "Bhavani";
	private static String lastName = "Bhavani";

	private static int numbers[] = new int[5];
	private static String names[] = new String[]{"prasad", "bhavani", "mani"};

	public static void main(String args[]) 
	{
		System.out.println("Hello String!");

		/*ExString exString = new ExString();

		String uppercaseName = firstName.toUpperCase();

		System.out.println("Name :: " + firstName.concat(lastName));
		System.out.println("Name :: " + lastName.equals(firstName)); */

		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		for(int i=0; i<3; i++) {
			System.out.println("Arrays :: " + names[i]);
		}
		
		System.out.println("Array Size :: " + numbers.length);
		
		

	}
}
