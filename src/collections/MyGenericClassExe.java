package collections;

public class MyGenericClassExe {

	public static void main(String[] args) {

		MyGenericClass<String> s = new MyGenericClass<>("Tom");
		s.displayObjDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i = new MyGenericClass<>(123);
		i.displayObjDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> d = new MyGenericClass<>(19.43);
		d.displayObjDetails();
		System.out.println(d.getObject());
	}

}
