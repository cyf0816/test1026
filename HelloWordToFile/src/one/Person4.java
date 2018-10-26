package one;

public class Person4 {
	private Person4() {
	}
	public static class GetPerson4Instance{
		public static final Person4 person4=new Person4();
	}
	public static Person4 getInstance(){
		return  GetPerson4Instance.person4;
	}
}
