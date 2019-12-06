package annotations;

public class ChildClass extends ParentClass{

	@Override
	public String greet(String name) {

		return "Hi" + name;
	}

	public static void main(String[] args) 
	{
		ParentClass p = new ParentClass();
		p.greet("Hii");
	}

}
