class Animal
{
	private String name;
	private String colour;
	private int age;

	public void getVaccine() {
		System.out.println("taking vaccine...");
	}

	public void eatFood() {
		System.out.println("Animal eating...");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		//cat.getVaccine();
		cat.eatFood("Fish", "Evening", "Night");

		/*Dog dog = new Dog();
		dog.eatFood();
		dog.getVaccine();

		//cat IS A Animal
		Animal animal = new Cat();
		//animal.name = "Tom";
		//System.out.println(animal.name + " eating...");
		System.out.println("============");
		animal.eatFood(); */

	}

}

class Cat extends Animal
{
	public void eatFood() {
		System.out.println("cat eating...");
	}

	public void eatFood(String food) {
		System.out.println("cat eating..." + food);
	}

	public void eatFood(String food, String time) {
		System.out.println("cat eating..." + food + " in the " + time);
	}

}


class Dog extends Animal
{
	public void eatFood() {
		System.out.println("dog eating...");
	}

}


