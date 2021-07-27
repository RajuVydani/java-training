import java.util.*;

class ExList 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		String name = new String("Prasad");

		Vector<Integer> numbers = new Vector<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(4);

		System.out.println(numbers.size());

		int size = numbers.size();

		for(int i=0; i<size; i++) {
			System.out.println("Values :: " + numbers.get(i));
		}


		HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

		uniqueNumbers.add(1);
		uniqueNumbers.add(2);
		uniqueNumbers.add(3);
		uniqueNumbers.add(3);
		uniqueNumbers.add(4);

		System.out.println(uniqueNumbers);

		HashMap<Integer, String> students = new HashMap<Integer, String>();		

		students.put(100, "Bhavani");
		students.put(101, "Prasad");
		students.put(102, "Manikanta");

		System.out.println(students);
		System.out.println(students.get(101));

		TreeMap<String, String> sortedData = new TreeMap<String, String>();
		sortedData.put("+", "103"); 
		sortedData.put("-", "101"); 
		sortedData.put("*", "102"); 

		System.out.println(sortedData);



	}
}
