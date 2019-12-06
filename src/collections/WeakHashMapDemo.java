package collections;

public class WeakHashMapDemo {
	@Override
	public String toString() {
		return "WeakHashMapDemo";
	}
      @Override
    protected void finalize() throws Throwable {
    	System.out.println("finalized called");
    }
}
