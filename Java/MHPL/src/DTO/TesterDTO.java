package DTO;

public class TesterDTO extends StaffDTO {
	protected int errors = this.temp;
	public TesterDTO() {
		super();
		this.errors = this.temp;
		this.salary = "";
	}
	public TesterDTO(String id, String name, int age,
			String phone, String mail, String basic_salary, int errors, int salary) {
		super(id, name, age, phone, mail, basic_salary);
		this.errors = errors;
		this.salary = (Integer.parseInt(this.basic_salary) + this.errors * 50000) + "";
	}
	public TesterDTO(TesterDTO testerDTO) {
		super(testerDTO.id, testerDTO.name, testerDTO.age,
				testerDTO.phone, testerDTO.mail, testerDTO.basic_salary);
		this.errors = testerDTO.errors;
		this.salary = (Integer.parseInt(testerDTO.basic_salary) + testerDTO.errors * 50000) + "";
	}
	public int getErrors() {
		return errors;
	}
	public void setErrors(int errors) {
		this.errors = errors;
	}
	
}
