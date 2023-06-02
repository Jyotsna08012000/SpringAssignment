package CollectionList;

import java.util.List;

public class Student {
	private List<Integer> Id;
	private List<String> Fname;
	private List<String> Lname;
	private List<String> Email;
	private List<Long> Mobile;
	public List<Integer> getId() {
		return Id;
	}
	public void setId(List<Integer> id) {
		Id = id;
	}
	public List<String> getFname() {
		return Fname;
	}
	public void setFname(List<String> fname) {
		Fname = fname;
	}
	public List<String> getLname() {
		return Lname;
	}
	public void setLname(List<String> lname) {
		Lname = lname;
	}
	public List<String> getEmail() {
		return Email;
	}
	public void setEmail(List<String> email) {
		Email = email;
	}
	public List<Long> getMobile() {
		return Mobile;
	}
	public void setMobile(List<Long> mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Fname=" + Fname + ", Lname=" + Lname + ", Email=" + Email + ", Mobile=" + Mobile
				+ "]";
	}
	
	
	

}
