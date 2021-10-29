package DTO;

public class DevDTO extends StaffDTO {
	protected int time;
	public DevDTO() {
		super();
		this.time = this.temp;
		this.salary = "";
	}
	public DevDTO(String id, String name, int age,
			String phone, String mail, String basic_salary, int time, int salary) {
		super(id, name, age, phone, mail, basic_salary);
		this.time = time;
		this.salary = (Integer.parseInt(this.basic_salary) + this.time * 200000) + "";
	}
	public DevDTO(DevDTO devDTO) {
		super(devDTO.id, devDTO.name, devDTO.age,
				devDTO.phone, devDTO.mail, devDTO.basic_salary);
		this.time = devDTO.time;
		this.salary = (Integer.parseInt(devDTO.basic_salary) + devDTO.time * 200000) + "";
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
}
