package objectmethods;

public class Passenger {

	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	@Override
	public String toString() {
		return "Passenger information is  first name : " + this.firstName + " Last name : " + this.lastName;
	}

	@Override
	public int hashCode() {
        return id;
	}
	@Override
	public boolean equals(Object obj) {
	  Passenger p = (Passenger)obj;
	  if(p.getId()==this.id && p.getFirstName().equals(this.firstName)&& p.getLastName().equals(this.lastName))
	  {
		return true;  
	  }
	  else
	  {
		  return false;
	  }
	}
}
