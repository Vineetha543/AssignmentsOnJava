package objectmethods;

public class ElectricityBill {
	int meter;
	String name;
	String address;

	public int getMeter() {
		return meter;
	}

	public void setMeter(int meter) {
		this.meter = meter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.meter + this.name + this.address;
	}
    @Override
	public boolean equals(Object obj) {
		ElectricityBill eb = (ElectricityBill) obj;
		if (eb.getMeter() == this.meter) {
			return true;
		} else

		{
			return false;
		}
	}
    @Override
    public int hashCode() {
    	return meter;
    }
}
