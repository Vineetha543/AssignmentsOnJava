package annotations;

import java.util.ArrayList;
import java.util.List;

public class DeprecationExe {

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args)
	{
        Deprecation d = new Deprecation();
        System.out.println(d);
        System.out.println(d.val);
        d.myMethod1();
        d.myMethod2();
        
        List l = new ArrayList();
        System.out.println(l);
	}

}
