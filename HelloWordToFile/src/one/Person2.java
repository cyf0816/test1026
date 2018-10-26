package one;

public class Person2 {
	private static Person2 person2 =new Person2();
	private Person2() {
	}
	public static Person2 getInstance(){
		return person2;
	}
}
