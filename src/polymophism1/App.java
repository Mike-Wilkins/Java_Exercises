package polymophism1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Mike");
		student1.setId(1234784);

		Teacher teacher1 = new Teacher();
		teacher1.setName("Bob");
		teacher1.setId(156);
		

		ArrayList<User> users = new ArrayList<User>();
		users.add(teacher1);
		users.add(student1);

		for (User u : users) {
			u.sayHello();
		}
		

	}

}
