package chapter04;

//Instance variables always get s default value
//integers 0 floating points 0.0 booleans false references null
public class PoorDogTestDrive {
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());
	}

}
