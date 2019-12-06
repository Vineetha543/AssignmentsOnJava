package jvmArchitecture;

import java.lang.reflect.Method;

public class Class1Exe {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("Class1");
		
		Method[] methods = c.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName());

		}
		System.out.println(methods.length);
	}

}
