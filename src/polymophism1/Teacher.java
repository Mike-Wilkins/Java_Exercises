package polymophism1;

public class Teacher extends User{
	
	@Override
	public void sayHello() {
		System.out.println("Hello my name is " + getName() + " and I am a Teacher" );
		System.out.println("My teacher id is: " + getId());
	}

}
