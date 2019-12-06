package garbagecollection;

public class GarbageCollection {

	int objId;

	public GarbageCollection(int objId) {
		this.objId = objId;
		System.out.println("created " + objId);
	}

	public static void main(String[] args) {
		new GarbageCollection(1);
		new GarbageCollection(2);
		for (int i = 1; i <= 100; i++) {
			System.gc();
		}

	}

	protected void finalise() {
		System.out.println("finalised " + objId);
	}
}
