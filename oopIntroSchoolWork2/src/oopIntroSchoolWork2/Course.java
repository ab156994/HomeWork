package oopIntroSchoolWork2;

public class Course {

	public Course() {
		System.out.println("Kurs içeriði(özelliklerini) tutacak nesne oluþturuldu.");
	}

	public Course(int id, String name, String detail, Instructor instructor) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.instructor = instructor;
	}

	private int id;
	private String name;
	private String detail;
	Instructor instructor;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
