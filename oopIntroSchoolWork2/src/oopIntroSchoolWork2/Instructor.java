package oopIntroSchoolWork2;

public class Instructor extends Person {

	public Instructor() {
		System.out.println("Eðitim verecek eðitmen özellikleri tutacak nesne oluþturuldu.");
	}

	public Instructor(int id, String name, String surName, String mailAdress, String sifre, Course course) {
		super(id, name, surName, mailAdress, sifre);
		this.course = course;
	}

	Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
