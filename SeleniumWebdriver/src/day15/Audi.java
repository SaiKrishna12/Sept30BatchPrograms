package day15;

public class Audi  extends Car{

	String model;
	public void stop()
	{
		System.out.println("This is to stop the car");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="Audi";
		a.stop();
		a.price=11111;
		a.start();

	}

}

