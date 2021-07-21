class Student {
	
	private String name;
	private int idNo;
	private static String collegeName;
	private static String city;
	
	{
		//static block
		collegeName = "Abn college";
		city = "Hyderabad";
		if(true) {
			city = "Bangalore";
		}
		
	}
	
	Student(String passedName, int passedIdNo) {
		name = passedName;
		idNo = passedIdNo;
		//collegeName = passedCollegeName;		
	}
	
	Student() {
		name = "Raju";
		idNo = 1;
		//collegeName = "abn college";
	}
	
	public void displayStudentDetails() {
		System.out.println("Student name:: " + name);
		System.out.println("Student idNo:: " + idNo);
		System.out.println("Student collegeName:: " + collegeName);
		System.out.println("Student city:: " + city);
	}
	
	public static void sayHi() {
		System.out.println("Welcome");
	}
}

class StudentTest {
	
	public static void main(String [] args) {
		
		Student st1 = new Student("Prasad", 1);		
		st1.displayStudentDetails();
		
		Student st2 = new Student("Bhavani", 2);		
		st2.displayStudentDetails();
		
		Student.sayHi();
		
		
	}
	
}