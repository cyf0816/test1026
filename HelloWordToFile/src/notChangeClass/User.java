package notChangeClass;

public final class User {
	private final String name;

	public User(String name) {
		this.name = String.copyValueOf(name.toCharArray());
	}
}
