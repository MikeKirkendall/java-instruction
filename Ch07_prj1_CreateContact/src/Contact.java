
public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String number;
	
	public Contact() {
		super();
	}
	public Contact(String firstName, String lastName, String email, String number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", number=" + number
				+ "]";
	}
	
	// TODO format display of the contact here
	public String displayContact() {
		String str = "------------------------------------------------------\n";
		str += 		"-----------------------Current Contact----------------\n";
		str += "------------------------------------------------------\n";	
		str += "\nName:                   "+firstName+ " " + lastName;
		str += "\nEmail Address:          "+email;
		str += "\nPhone Number:           "+number;
		str += "\n------------------------------------------------------\n";
		return str;
	}
	
	

}
