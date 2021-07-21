interface Vehicle  
{
	void soundHorn();
	void turnOnLights();
}

interface Insurance
{
	void claims();
}

class Ferrari implements Vehicle, Insurance
{
	public void soundHorn() {
		System.out.println("pee pee...");
	}

	public void turnOnLights() {
		System.out.println("Flassssh....");
	}

	public void claims() {

	}
}

class Bmw implements Vehicle
{
	public void soundHorn() {
		System.out.println("oye oye...");
	}

	public void turnOnLights() {
		System.out.println("flaaaash bmw....");
	}
}

class ExVehicle
{
	public static void main(String [] args) {

		Vehicle vehicle = new Ferrari();
		vehicle.soundHorn();

		Ferrari ferrair = new Ferrari();
		ferrair.soundHorn();


	}
}

