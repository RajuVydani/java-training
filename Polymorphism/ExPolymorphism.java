class ExPolymorphism 
{
	public static void main(String[] args) 
	{
		System.out.println("YaY !!! Welcome to Polymorphism !!!");

		Actor actor = null;

		if(args[0].equalsIgnoreCase("Chiru")) {
			
			actor = new Chiru();
			
		} else if (args[0].equalsIgnoreCase("Pawan"))
		{
			actor = new PawanKalyan();

		} else if (args[0].equalsIgnoreCase("Mahesh"))
		{
			actor = new Mahesh();
		}

		printDetails(actor);

	}

	public static void printDetails(Actor actor) {
		
		System.out.println("===============Profile===============>>");
		actor.getProfile();

		System.out.println("===============Movies list ===============");
		actor.movies();

	}
}