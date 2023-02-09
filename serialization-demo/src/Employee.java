import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private long contactNumber;

	public Employee(String firstName, String lastName, long contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
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

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber + "]";
	}

}
