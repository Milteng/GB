package gb.seminar_4;

public interface UserController<T extends User> {
	void create(String name, String surname, String fathername);
}
