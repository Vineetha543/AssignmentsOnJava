package java8features;

public class ConstructorMappingExe {

	public static void main(String[] args) {
		ConstructorMappingInterface  f1 = s->new ConstructorsMapping(s);
		f1.get("Using Lambdas");
		
		ConstructorMappingInterface  f2 = ConstructorsMapping::new;
		f2.get("Using Constructor Mapping");
	}

}
