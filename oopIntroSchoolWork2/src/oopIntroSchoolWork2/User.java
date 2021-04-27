package oopIntroSchoolWork2;

public class User extends Person {

	public User() {
		System.out.println("Eðitim alacak kisilerin özelliklerini tutacak nesne oluþturuldu.");
	}

	public User(int id, String name, String surName, String mailAdress, String sifre, int kursBitirmeYuzdesi,
			Course course) {
		super(id, name, surName, mailAdress, sifre);
		this.kursBitirmeYuzdesi = kursBitirmeYuzdesi;
		this.course = course;
	}

	private int kursBitirmeYuzdesi;
	Course course;	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getKursBitirmeYuzdesi() {
		return kursBitirmeYuzdesi;
	}

	public void setKursBitirmeYuzdesi(int kursBitirmeYuzdesi) {
		this.kursBitirmeYuzdesi = kursBitirmeYuzdesi;
	}
}
