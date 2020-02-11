package polymophism1;

public class Student extends User {

	@Override
	public void sayHello() {
		System.out.println("Hello my name is " + getName() + " and I am a Student" );
		System.out.println("My student id is: " + getId());
		
	}

}
