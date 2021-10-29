package DTO;

public abstract class StaffDTO {
	protected String id;
	protected String name;
	protected int age;
	protected String phone;
	protected String mail;
	protected String basic_salary;
	protected String salary;
	protected int temp;
	public StaffDTO() {
		this.id  = "";
		this.name = "";
		this.age = 0;
		this.phone = "";
		this.mail = "";
		this.basic_salary = "";
	}
	public StaffDTO(String id, String name, int age,
			String phone, String mail, String basic_salary) {
		this.id  = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.mail = mail;
		this.basic_salary = basic_salary;
	}
	public StaffDTO(StaffDTO staffDTO) {
		this.id  = staffDTO.id;
		this.name = staffDTO.name;
		this.age = staffDTO.age;
		this.phone = staffDTO.phone;
		this.mail = staffDTO.mail;
		this.basic_salary = staffDTO.basic_salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBasic_salary() {
		return basic_salary;
	}
	public void setBasic_salary(String basic_salary) {
		this.basic_salary = basic_salary;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
