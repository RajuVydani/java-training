class ExControlStatements {
	
	public static void main(String [] args) {
		
		for(int x =1; x<=10; x++) {
			
			if(x == 5) {
				System.out.println("Stopping at 5");
				break;
			}
			
			System.out.println(x);
			
		}
		
		int count = 11;
		
		outer: while(count <= 20) {	//outer - labelling		
			
			if(count == 18) {
				System.out.println("Stopping at 18");
				break outer;
			}
			
			System.out.println(count);

			count++;
		}
		
		int books = 21;
		
		do {
			
			if(books == 28) {
				System.out.println("Skipping at 28");
				books ++;
				continue;
			}
			
			System.out.println(books);
			
			books ++;
			
		} while(books <= 30);
	}
}