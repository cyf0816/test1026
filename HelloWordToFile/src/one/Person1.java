package one;

public class Person1 {
	private static Person1 person1 =null;
	private Person1() {
	}
	public static synchronized Person1 getInstance(){
		if(person1 ==null) {
			person1 =new Person1();
		}
		return person1;
	}
}
