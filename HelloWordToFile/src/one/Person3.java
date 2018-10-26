package one;

public class Person3 {
	private static Person3 person3 =null;
	private Person3() {
	}
	public static Person3 getInstance(){
		if(person3 ==null) {
			synchronized (Person3.class){
				if(person3 ==null)
					person3 =new Person3();
			}
		}
		return person3;
	}
}
